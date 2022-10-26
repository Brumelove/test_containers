package com.test.app.service.impl;

import com.test.app.entity.embeddedid.RocApplicantsAdmId;
import com.test.app.entity.embeddedid.RocApplicantsAttachId;
import com.test.app.entity.embeddedid.RocApplicantsContactId;
import com.test.app.entity.embeddedid.RocApplicantsUserId;
import com.test.app.enums.ApplicantType;
import com.test.app.enums.StatusType;
import com.test.app.mapper.ApplicantMapper;
import com.test.app.service.MnsRocApplicantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mu.mns.cibris.online.app.service.entity.*;
import mu.mns.cibris.online.app.service.repository.*;
import mu.mns.cibris.online.app.service.request.ApplicationRegistrationRequest;
import mu.mns.cibris.online.app.service.request.GenericUserDetailsList;
import mu.mns.cibris.online.app.service.response.ApplicationResponse;
import mu.mns.cibris.online.app.service.response.VerifyApplicantResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Brume
 * Service Implementaion of MnsRocApplicantService interface.
 **/
@Slf4j
@Service
@RequiredArgsConstructor
public class MnsRocApplicantServiceImpl implements MnsRocApplicantService {
    private final ApplicantMapper mapper;
    private final MnsRocApplicantRepository repository;
    private final MnsRocApplicantAttachRepository mnsRocApplicantAttachRepository;
    private final MnsRocApplicantAdminRepository adminRepository;
    private final MnsRocApplicantUserRepository userRepository;
    private final MnsRocApplicantContactRepository contactRepository;
    private final MnsRocCompanyRepository companyRepository;

    @Override
    @Transactional()
    public ApplicationResponse createApplicant(String ipAddress, ApplicationRegistrationRequest request) {
        if (request == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, " Request can not be null");
        String applicationNo = repository.generateApplicationNo();

        MnsRocApplicant applicant = mapper.mapToRocApplicant(request);
        applicant.setId(applicationNo);
        applicant.setStatus(StatusType.S.name());
        applicant.setScentreFlag('N');
        applicant.setOthers(request.getType());
        applicant.setCreateDate(LocalDate.now());
        applicant.setLastUpdateDate(LocalDate.now());
        applicant.setLastUpdatedBy(request.getEmail());
        applicant.setIpAddress(ipAddress);

        List<GenericUserDetailsList> genericUserDetailsList = request.getGenericUserDetailsList();
        List<MnsRocApplicantsContact> contacts = new ArrayList<>();
        List<MnsRocApplicantsUser> userDtsList = new ArrayList<>();
        List<MnsRocApplicantsAdm> adminList = new ArrayList<>();
        List<MnsRocApplicantsAttach> attachList = new ArrayList<>();
        int count = 0;

        RocApplicantsContactId mnsRocApplicantsContactId = new RocApplicantsContactId();
        RocApplicantsUserId rocApplicantsUserId = new RocApplicantsUserId();
        RocApplicantsAdmId rocApplicantsAdmId = new RocApplicantsAdmId();
        RocApplicantsAttachId rocApplicantsAttachId = new RocApplicantsAttachId();

        for (int i = 0; i < genericUserDetailsList.size(); i++) {
            count++;
            GenericUserDetailsList userDts = genericUserDetailsList.get(i);

            if (userDts.isMainContact()) {
                contacts = mapper.mapToRocApplicantContactList(genericUserDetailsList);
                mnsRocApplicantsContactId.setRacApplicationNo(applicationNo);
                mnsRocApplicantsContactId.setRacSerialNo(String.valueOf(count));

                contacts.get(i).setId(mnsRocApplicantsContactId);
                contacts.get(i).setRacNid(request.getNidOrPassport());
                contacts.get(i).setRacApplicationNo(applicant);
            }
            if (userDts.isUserProfile()) {
                userDtsList = mapper.mapToRocApplicantUserList(genericUserDetailsList);
                rocApplicantsUserId.setRauApplicationNo(applicationNo);
                rocApplicantsUserId.setRauSerialNo(String.valueOf(count));

                userDtsList.get(i).setId(rocApplicantsUserId);
                userDtsList.get(i).setRauApplicationNo(applicant);

            }
            if (userDts.isSystemAdminProfile()) {
                adminList = mapper.mapToRocApplicantAdminList(genericUserDetailsList);
                rocApplicantsAdmId.setRaaApplicationNo(applicationNo);
                rocApplicantsAdmId.setRaaSerialNo(String.valueOf(count));

                adminList.get(i).setId(rocApplicantsAdmId);
                adminList.get(i).setRaaApplicationNo(applicant);

            }
            attachList = mapper.mapToRocApplicantAttachList(genericUserDetailsList);
            rocApplicantsAttachId.setRaaApplicationNo(applicationNo);
            rocApplicantsAttachId.setRaaSerialNo(String.valueOf(count));

            attachList.get(i).setId(rocApplicantsAttachId);
            attachList.get(i).setRaaDtUploaded(LocalDate.now());
            attachList.get(i).setRaaOrgFname(request.getCompanyNamePersonName());
        }
        repository.save(applicant);

        mnsRocApplicantAttachRepository.saveAll(attachList);
        contactRepository.saveAll(contacts);
        userRepository.saveAll(userDtsList);
        adminRepository.saveAll(adminList);

        log.info("APPLICATION NO ::: ::: " + applicationNo);
        return ApplicationResponse.builder().applicationNo(applicationNo).serialNo(String.valueOf(count)).build();
    }

    @Override
    public VerifyApplicantResponse existsByCompanyFileOrNidPassport(String applicantType, String fileNoOrNidPassport) {
        boolean isExists = false;
        String message = "Account Already exists. Please contact customer service";

        if (ApplicantType.COMPANY.name().equalsIgnoreCase(applicantType)) {
            isExists = companyRepository.existsByCompId(fileNoOrNidPassport);
        } else if (ApplicantType.PERSON.name().equalsIgnoreCase(applicantType)) {
            isExists = companyRepository.existsByNidPassport(fileNoOrNidPassport);
        } else {
            message = null;
        }
        return VerifyApplicantResponse.builder().recordExists(isExists).message(message).build();
    }
}
