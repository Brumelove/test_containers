package com.test.app.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Brume
 **/
@Getter
@Setter
public class VerifyApplicantRequest {
    @NotBlank(message = "applicantType.required")
    @Size(message = "applicantType.sie", max = 7, min = 6)
    private String applicantType;
    @NotBlank(message = "companyFileNoOrNidPassport.required")
    @Size(message = "companyFileNoOrNidPassport.size", max = 20)
    private String companyFileNoOrNidPassport;
}
