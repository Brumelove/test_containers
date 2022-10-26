package com.test.app.mapper;

import mu.mns.cibris.online.app.service.entity.*;
import mu.mns.cibris.online.app.service.request.ApplicationRegistrationRequest;
import mu.mns.cibris.online.app.service.request.GenericUserDetailsList;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Brume
 **/
@Mapper(componentModel = "spring")
public interface ApplicantMapper {

    static ApplicantMapper getApplicantMapper() {
        return Mappers.getMapper(ApplicantMapper.class);
    }

     static  String booleanToString(boolean value){
        return value ? "Y" : "N";
    }

    @Mapping(source = "address", target = "address1")
    @Mapping(source = "townVillage", target = "address2")
    @Mapping(source = "capacity", target = "title")
    @Mapping(source = "street", target = "address3")
    @Mapping(source = "companyFileNo", target = "companyFile")
    @Mapping(source = "companyNamePersonName", target = "name")
    @Mapping(source = "companyFirm", target = "person")
    @Mapping(source = "country", target = "ctyCode")
    RocApplicant mapToRocApplicant(ApplicationRegistrationRequest source);

    @Mapping(source = "firstName", target = "racFname")
    @Mapping(source = "lastName", target = "racLname")
    @Mapping(source = "jobTitle", target = "racJobTitle")
    @Mapping(source = "email", target = "racEmail")
    @Mapping(source = "telephone", target = "racTel")
    @Mapping(source = "fax", target = "racFax")
    @Mapping(target = "racMain", expression="java(ApplicantMapper.booleanToString(source.isMainContact()))")
    RocApplicantsContact mapToRocApplicantContact(GenericUserDetailsList source);

    @Mapping(source = "firstName", target = "raaFname")
    @Mapping(source = "lastName", target = "raaLname")
    @Mapping(source = "jobTitle", target = "raaJobTitle")
    @Mapping(source = "email", target = "raaEmail")
    @Mapping(source = "telephone", target = "raaTel")
    @Mapping(source = "fax", target = "raaFax")
    @Mapping(target = "raaMain", expression="java(ApplicantMapper.booleanToString(source.isMainContact()))")
    RocApplicantsAdm mapToRocApplicantAdmin(GenericUserDetailsList source);

    @Mapping(source = "firstName", target = "rauFname")
    @Mapping(source = "lastName", target = "rauLname")
    @Mapping(source = "jobTitle", target = "rauJobTitle")
    @Mapping(source = "email", target = "rauEmail")
    @Mapping(source = "telephone", target = "rauTel")
    @Mapping(source = "fax", target = "rauFax")
    @Mapping(target = "rauMain", expression="java(ApplicantMapper.booleanToString(source.isMainContact()))")
    RocApplicantsUser mapToRocApplicantUser(GenericUserDetailsList source);

    @Mapping(source = "filePath", target = "raaFilePath")
    @Mapping(source = "firstName", target = "raaLocalFname")
    MnsRocApplicantsAttach mapToRocApplicantAttach(GenericUserDetailsList source);

    List<MnsRocApplicantsContact> mapToRocApplicantContactList(List<GenericUserDetailsList> source);

    List<MnsRocApplicantsAdm> mapToRocApplicantAdminList(List<GenericUserDetailsList> source);

    List<MnsRocApplicantsUser> mapToRocApplicantUserList(List<GenericUserDetailsList> source);

    List<MnsRocApplicantsAttach> mapToRocApplicantAttachList(List<GenericUserDetailsList> source);

}
