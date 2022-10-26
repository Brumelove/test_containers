package com.test.app.mapper;

import com.test.app.util.ApplicationTestRequest;
import lombok.RequiredArgsConstructor;
import mu.mns.cibris.online.app.service.config.ApplicantTestConfig;
import mu.mns.cibris.online.app.service.request.ApplicationRegistrationRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import static com.test.app.mapper.ApplicantMapper.booleanToString;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Brume
 **/
@ActiveProfiles("test")
@RequiredArgsConstructor
@ContextConfiguration(classes = {ApplicantTestConfig.class})
class ApplicantMapperTest {
    @Autowired
     ApplicantMapper mapper;

    @Test
    void mapToRocApplicant() {
        ApplicationRegistrationRequest request = ApplicationTestRequest.asApplicationRequestObjectString();
        var mnsRocApplicant = ApplicantMapper.getApplicantMapper().mapToRocApplicant(request);

        assertNotNull(mnsRocApplicant);
        assertEquals(request.getFax(), mnsRocApplicant.getFax());
        assertEquals(request.getEmail(), mnsRocApplicant.getEmail());
        assertEquals(request.getTelephone(), mnsRocApplicant.getTelephone());
        assertEquals(request.getCountry(), mnsRocApplicant.getCtyCode());
        assertEquals(request.getAddress(), mnsRocApplicant.getAddress1());
        assertEquals(request.getTownVillage(), mnsRocApplicant.getAddress2());
        assertEquals(request.getCapacity(), mnsRocApplicant.getTitle());
        assertEquals(request.getStreet(), mnsRocApplicant.getAddress3());
        assertEquals(request.getCompanyFileNo(), mnsRocApplicant.getCompanyFile());
        assertEquals(request.getCompanyNamePersonName(), mnsRocApplicant.getName());
        assertEquals(request.isCompanyFirm(), mnsRocApplicant.getPerson());
    }

    @Test
    void mapToRocApplicantContact() {
        var request = ApplicationTestRequest.asApplicationRequestObjectString().getGenericUserDetailsList().get(0);
        var mnsRocApplicantContact = ApplicantMapper.getApplicantMapper().mapToRocApplicantContact(request);

        assertNotNull(mnsRocApplicantContact);
        assertEquals(request.getFax(), mnsRocApplicantContact.getRacFax());
        assertEquals(request.getFirstName(), mnsRocApplicantContact.getRacFname());
        assertEquals(request.getTelephone(), mnsRocApplicantContact.getRacTel());
        assertEquals(request.getLastName(), mnsRocApplicantContact.getRacLname());
        assertEquals(request.getJobTitle(), mnsRocApplicantContact.getRacJobTitle());
        assertEquals(request.getEmail(), mnsRocApplicantContact.getRacEmail());
        assertEquals(booleanToString(request.isMainContact()), mnsRocApplicantContact.getRacMain());
    }

    @Test
    void mapToRocApplicantAdmin() {
        var request = ApplicationTestRequest.asApplicationRequestObjectString().getGenericUserDetailsList().get(0);
        var mnsRocApplicantAdmin = ApplicantMapper.getApplicantMapper().mapToRocApplicantAdmin(request);

        assertNotNull(mnsRocApplicantAdmin);
        assertEquals(request.getFax(), mnsRocApplicantAdmin.getRaaFax());
        assertEquals(request.getFirstName(), mnsRocApplicantAdmin.getRaaFname());
        assertEquals(request.getTelephone(), mnsRocApplicantAdmin.getRaaTel());
        assertEquals(request.getLastName(), mnsRocApplicantAdmin.getRaaLname());
        assertEquals(request.getJobTitle(), mnsRocApplicantAdmin.getRaaJobTitle());
        assertEquals(request.getEmail(), mnsRocApplicantAdmin.getRaaEmail());
        assertEquals(booleanToString(request.isMainContact()),  mnsRocApplicantAdmin.getRaaMain());
    }

    @Test
    void mapToRocApplicantUser() {
        var request = ApplicationTestRequest.asApplicationRequestObjectString().getGenericUserDetailsList().get(0);
        var mnsRocApplicantsUser = ApplicantMapper.getApplicantMapper().mapToRocApplicantUser(request);

        assertNotNull(mnsRocApplicantsUser);
        assertEquals(request.getFax(), mnsRocApplicantsUser.getRauFax());
        assertEquals(request.getFirstName(), mnsRocApplicantsUser.getRauFname());
        assertEquals(request.getTelephone(), mnsRocApplicantsUser.getRauTel());
        assertEquals(request.getLastName(), mnsRocApplicantsUser.getRauLname());
        assertEquals(request.getJobTitle(), mnsRocApplicantsUser.getRauJobTitle());
        assertEquals(request.getEmail(), mnsRocApplicantsUser.getRauEmail());
        assertEquals(booleanToString(request.isMainContact()),  mnsRocApplicantsUser.getRauMain());
    }

    @Test
    void mapToRocApplicantAttach() {
        var request = ApplicationTestRequest.asApplicationRequestObjectString().getGenericUserDetailsList().get(0);
        var mnsRocApplicantsAttach = ApplicantMapper.getApplicantMapper().mapToRocApplicantAttach(request);

        assertNotNull(mnsRocApplicantsAttach);
        assertEquals(request.getFilePath(), mnsRocApplicantsAttach.getRaaFilePath());
        assertEquals(request.getFirstName(), mnsRocApplicantsAttach.getRaaLocalFname());
    }
}