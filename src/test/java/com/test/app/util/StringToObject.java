package com.test.app.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import mu.mns.cibris.online.app.service.request.ApplicationRegistrationRequest;
import mu.mns.cibris.online.app.service.request.VerifyApplicantRequest;

/**
 * @author Brume
 **/
public class StringToObject {
    public static ApplicationRegistrationRequest asObjectString(String s) {
        try {
            return new ObjectMapper().readValue(s, ApplicationRegistrationRequest.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static VerifyApplicantRequest asVerifyObjectString(String s) {
        try {
            return new ObjectMapper().readValue(s, VerifyApplicantRequest.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
