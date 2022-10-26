package com.test.app.service;

import mu.mns.cibris.online.app.service.request.ApplicationRegistrationRequest;
import mu.mns.cibris.online.app.service.response.ApplicationResponse;
import mu.mns.cibris.online.app.service.response.VerifyApplicantResponse;

/**
 * service interface for MnsRocApplicatService Implementation
 *
 * @author Brume
 */
public interface MnsRocApplicantService {
    /**
     * Method to create company or person application with a list of generic user details
     *
     * @param request
     * @return ApplicationResponse
     */
    ApplicationResponse createApplicant(String ipAddress, ApplicationRegistrationRequest request);

    /**
     * to check if applicant exists by companyFileNo or Nid/Passport
     *
     * @param applicantType
     * @param fileNoOrNidPassport
     * @return VerifyApplicantResponse
     */
    VerifyApplicantResponse existsByCompanyFileOrNidPassport(String applicantType, String fileNoOrNidPassport);
}
