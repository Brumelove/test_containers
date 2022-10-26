package com.test.app.util;

import mu.mns.cibris.online.app.service.request.ApplicationRegistrationRequest;

/**
 * @author Brume
 **/
public class ApplicationTestRequest {
    public static ApplicationRegistrationRequest asApplicationRequestObjectString() {
        return StringToObject.asObjectString("{\n" +
                "    \"country\": \"MU\",\n" +
                "    \"companyNamePersonName\": \"Y5555 Company\",\n" +
                "    \"address\": \"This is my address test\",\n" +
                "    \"townVillage\": \"Union Vale\",\n" +
                "    \"telephone\" : \"4556221\",\n" +
                "    \"fax\" : \"4556256\",\n" +
                "    \"email\" : \"5555@gmail.com\",\n" +
                "    \"genericUserDetailsList\": [{\n" +
                "        \"firstName\": \"Sam\",\n" +
                "        \"lastName\": \"Smith\",\n" +
                "        \"jobTitle\": \"Software Engineer\",\n" +
                "        \"email\": \"123@gmail.com\",\n" +
                "        \"passport\" : false,\n" +
                "        \"telephone\" : \"523235669\",\n" +
                "        \"fax\": \"523235669\",\n" +
                "        \"systemAdminProfile\": true,\n" +
                "        \"contactPersonProfile\": true,\n" +
                "        \"userProfile\": true,\n" +
                "        \"mainContact\": true\n" +
                "    }],\n" +
                "    \"capacity\": \"Entrepreneur\",\n" +
                "    \"street\": \"Adams Street\",\n" +
                "    \"companyFirm\": false,\n" +
                "    \"companyFileNo\": \"1235\",\n" +
                "    \"nidOrPassport\": \"4546465465456\",\n" +
                "    \"portalUsername\" : \"SYSTEM_ADM\"\n" +
                "}");
    }
}
