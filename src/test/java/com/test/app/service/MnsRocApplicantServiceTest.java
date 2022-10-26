package com.test.app.service;

import com.test.app.config.AbstractTest;
import com.test.app.mapper.ApplicantMapper;
import com.test.app.repository.MnsRocApplicantAttachRepository;
import com.test.app.repository.MnsRocApplicantRepository;
import com.test.app.repository.MnsRocCompanyRepository;
import com.test.app.util.ApplicationTestRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Brume
 **/
class MnsRocApplicantServiceTest extends AbstractTest {
    @Autowired
    ApplicantMapper mapper;
    @Autowired
    MnsRocApplicantRepository repository;
    @Autowired
    MnsRocApplicantAttachRepository mnsRocApplicantAttachRepository;
    @Autowired
    MnsRocCompanyRepository mnsRocCompanyRepository;
    @Autowired
    MnsRocApplicantService mnsRocApplicantService;

    /**
     * check create Applicant
     */
    @Test
    @Sql(value = {"classpath:/sql/clean_roc_applicants.sql", "classpath:/sql/insert_roc_applicants.sql", "classpath:/sql/insert_roc_applicants_attach.sql", "classpath:/sql/insert_roc_applicants_admin.sql", "classpath:/sql/insert_roc_applicants_contact.sql", "classpath:/sql/insert_roc_applicants_user.sql"})
    void createApplicant() {
        var response = mnsRocApplicantService.createApplicant("127.0.0.1", ApplicationTestRequest.asApplicationRequestObjectString());
        assertNotNull(response);
    }

    @Test
    @Sql(value = {"classpath:/sql/clean_roc_applicants.sql", "classpath:/sql/insert_roc_company.sql"})
    void existsByCompanyFileOrNidPassport() {
        var response = mnsRocApplicantService.existsByCompanyFileOrNidPassport("COMPANY", "90808");
        assertNotNull(response);
        assertFalse(response.isRecordExists());
        assertNotNull(response.getMessage());
    }

    @Test
    @Sql(value = {"classpath:/sql/clean_roc_applicants.sql", "classpath:/sql/insert_roc_company.sql"})
    void existsNidPassport() {
        var response = mnsRocApplicantService.existsByCompanyFileOrNidPassport("PERSON", "ROOO90202");
        assertNotNull(response);
        assertTrue(response.isRecordExists());
        assertEquals("Account Already exists. Please contact customer service", response.getMessage());
    }
}
