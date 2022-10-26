package com.test.app.request;

import lombok.Data;

/**
 * @author Brume
 **/
@Data
public class GenericUserDetailsList{
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String email;
    private boolean passport;
    private String telephone;
    private String fax;
    private String filePath;
    private boolean systemAdminProfile;
    private boolean contactPersonProfile;
    private boolean userProfile;
    private boolean mainContact;
}