package com.test.app.service.impl;

import com.test.app.mapper.ApplicantMapper;
import com.test.app.util.ApplicationTestRequest;
import mu.mns.cibris.online.app.service.entity.*;
import mu.mns.cibris.online.app.service.repository.*;
import mu.mns.cibris.online.app.service.request.ApplicationRegistrationRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author Brume
 **/
@ExtendWith(MockitoExtension.class)
class MnsRocApplicantServiceImplTest  {
    @Mock
    private  ApplicantMapper mapper;
    @Mock
    private  MnsRocApplicantRepository repository;
    @Mock
    private  MnsRocApplicantAttachRepository mnsRocApplicantAttachRepository;
    @Mock
    private  MnsRocApplicantAdminRepository adminRepository;
    @Mock
    private  MnsRocApplicantUserRepository userRepository;
    @Mock
    private  MnsRocApplicantContactRepository contactRepository;
    @InjectMocks
    private MnsRocApplicantServiceImpl mnsRocApplicantService;

    @Test
    void createApplicant() {
        var applicationNo = RandomStringUtils.randomAlphanumeric(7);
        ApplicationRegistrationRequest request = ApplicationTestRequest.asApplicationRequestObjectString();

        var mnsRocApplicant= new MnsRocApplicant();
        mnsRocApplicant.setAddress1(request.getAddress());
        mnsRocApplicant.setFax(request.getFax());
        mnsRocApplicant.setEmail(request.getEmail());
        mnsRocApplicant.setId(applicationNo);


        var rocAdm = new MnsRocApplicantsAdm();
        rocAdm.setRaaEmail(request.getEmail());
        rocAdm.setRaaApplicationNo(mnsRocApplicant);

        var rocContact = new MnsRocApplicantsContact();
        rocContact.setRacEmail(request.getEmail());
        rocContact.setRacApplicationNo(mnsRocApplicant);

        var rocUser = new MnsRocApplicantsUser();
        rocUser.setRauEmail(request.getEmail());
        rocUser.setRauApplicationNo(mnsRocApplicant);

        var rocAttach = new MnsRocApplicantsAttach();
        rocAttach.setRaaOrgFname(request.getCompanyNamePersonName());

        when(repository.generateApplicationNo()).thenReturn(applicationNo);
        when(mapper.mapToRocApplicant(request)).thenReturn(mnsRocApplicant);
        List<MnsRocApplicantsAdm> mnsRocApplicantsAdmList = List.of(rocAdm);
        when(mapper.mapToRocApplicantAdminList(request.getGenericUserDetailsList())).thenReturn(mnsRocApplicantsAdmList);
        List<MnsRocApplicantsUser> mnsRocApplicantsUserList = List.of(rocUser);
        when(mapper.mapToRocApplicantUserList(request.getGenericUserDetailsList())).thenReturn(mnsRocApplicantsUserList);
        List<MnsRocApplicantsAttach> mnsRocApplicantsAttachList = List.of(rocAttach);
        when(mapper.mapToRocApplicantAttachList(request.getGenericUserDetailsList())).thenReturn(mnsRocApplicantsAttachList);
        List<MnsRocApplicantsContact> mnsRocApplicantsContacts = List.of(rocContact);
        when(mapper.mapToRocApplicantContactList(request.getGenericUserDetailsList())).thenReturn(mnsRocApplicantsContacts);

        var response = mnsRocApplicantService.createApplicant("127.0.0.1", request);

        verify(repository, times(1)).save(mnsRocApplicant);
        verify(mnsRocApplicantAttachRepository, times(1)).saveAll(mnsRocApplicantsAttachList);
        verify(contactRepository, times(1)).saveAll(mnsRocApplicantsContacts);
        verify(userRepository, times(1)).saveAll(mnsRocApplicantsUserList);
        verify(adminRepository, times(1)).saveAll(mnsRocApplicantsAdmList);

        assertEquals(String.valueOf(1), response.getSerialNo());
    }




}