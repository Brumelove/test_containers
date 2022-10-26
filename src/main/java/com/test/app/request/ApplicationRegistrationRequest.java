package com.test.app.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author Brume
 **/
@Getter
@Setter
public class ApplicationRegistrationRequest {
    @NotBlank(message = "{country.required}")
    private String country;
    @NotBlank(message = "{companyNamePersonName.required}")
    private String companyNamePersonName;
    @NotBlank(message = "{address.required}")
    private String address;
    private String townVillage;
    @NotBlank(message = "{type.required}")
    @Size(message = "{type.size}", max = 4)
    private String type;
    @NotBlank(message = "{telephone.required}")
    private String telephone;
    private String fax;
    @NotBlank(message = "{email.required}")
    private String email;
    private List<GenericUserDetailsList> genericUserDetailsList;
    private String capacity;
    private String street;
    private boolean companyFirm;
    @NotBlank(message = "{companyFileNo.required}")
    private String companyFileNo;
    @NotBlank(message = "{nidOrPassport.required}")
    @NotBlank(message = "{nidOrPassport.size}")
    private String nidOrPassport;
    @NotBlank(message = "{portalUsername.required}")
    private String portalUsername;
}
