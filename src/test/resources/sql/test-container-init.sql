CREATE
    USER brume IDENTIFIED BY pwd;
GRANT DBA TO brume;

CREATE TABLE "APP"."ROC_APPLICANTS"
(
    "APPLICATION_NO"     VARCHAR2(20) not null,
    "PERSON"             CHAR,
    "TITLE"              VARCHAR2(35),
    "TITLE_DESCRIPTION"  VARCHAR2(50),
    "NAME"               VARCHAR2(80),
    "OTHER_NAMES"        VARCHAR2(30),
    "CONTACT_NAME"       VARCHAR2(80),
    "CONTACT_JOB_TITLE"  VARCHAR2(80),
    "CITIZEN"            CHAR,
    "ID_TYPE"            VARCHAR2(5),
    "ID_DESCRIPTION"     VARCHAR2(50),
    "CTY_CODE"           VARCHAR2(5),
    "ID_NO"              VARCHAR2(30),
    "ADDRESS1"           VARCHAR2(50),
    "ADDRESS2"           VARCHAR2(50),
    "ADDRESS3"           VARCHAR2(50),
    "ADDRESS4"           VARCHAR2(50),
    "ADDRESS5"           VARCHAR2(8),
    "TEL"                VARCHAR2(25),
    "FAX"                VARCHAR2(25),
    "EMAIL"              VARCHAR2(60) not null,
    "SCENTRE_FLAG"       CHAR         not null,
    "SCENTRE_TYPE"       VARCHAR2(50),
    "STATUS"             VARCHAR2(2)  not null,
    "REMARKS"            VARCHAR2(500),
    "IP_ADDRESS"         VARCHAR2(20) not null,
    "CREATE_DATE"        DATE         not null,
    "LAST_UPDATED_BY"    VARCHAR2(20) not null,
    "LAST_UPDATE_DATE"   DATE         not null,
    "FIRSTNAME"          VARCHAR2(80),
    "NATURE_OF_BUSINESS" VARCHAR2(3),
    "TYPE"               VARCHAR2(4),
    "OTHERS"             VARCHAR2(80),
    "COMPANY_FILE"       VARCHAR2(20),
    "ID"                 VARCHAR2(2),
    "NID_PASSPORT"       VARCHAR2(25),
    constraint "PK_ROC_APPL"
        primary key("APPLICATION_NO")
);

create table "APP"."ROC_APPLICANTS_ATTACH"
(
    "RAA_APPLICATION_NO" VARCHAR2(23) not null,
    "RAA_SERIAL_NO"      VARCHAR2(3)  not null,
    "RAA_LOCAL_FNAME"    VARCHAR2(1024),
    "RAA_ORG_FNAME"      VARCHAR2(1024),
    "RAA_FILE_PATH"      VARCHAR2(2048),
    "RAA_DT_UPLOADED"    DATE,
    constraint ROC_APPLICANTS_ATTACH_PK
        primary key ("RAA_APPLICATION_NO", "RAA_SERIAL_NO")
);

create table "APP"."ROC_APPLICANTS_USER"
(
    RAU_APPLICATION_NO VARCHAR2(20) not null ,
    "RAU_SERIAL_NO"      VARCHAR2(3)  not null,
    "RAU_FNAME"          VARCHAR2(40),
    "RAU_LNAME"          VARCHAR2(80),
    "RAU_JOBTITLE"       VARCHAR2(100),
    "RAU_DEPT"           VARCHAR2(100),
    "RAU_TEL"            VARCHAR2(25),
    "RAU_FAX"            VARCHAR2(25),
    "RAU_EMAIL"          VARCHAR2(60),
    "RAU_MAIN"           VARCHAR2(1),
    constraint ROC_APPLICANTS_USER_PK
        primary key ("RAU_APPLICATION_NO", "RAU_SERIAL_NO")
);

create table "APP"."ROC_APPLICANTS_ADM"
(
    "RAA_APPLICATION_NO" VARCHAR2(20) not null,
    "RAA_SERIAL_NO"      VARCHAR2(3)  not null,
    "RAA_FNAME"          VARCHAR2(40),
    "RAA_LNAME"          VARCHAR2(80),
    "RAA_JOBTITLE"       VARCHAR2(100),
    "RAA_DEPT"           VARCHAR2(100),
    "RAA_TEL"            VARCHAR2(25),
    "RAA_FAX"            VARCHAR2(25),
    "RAA_EMAIL"          VARCHAR2(60),
    "RAA_MAIN"           VARCHAR2(1),
    constraint ROC_APPLICANTS_ADM_PK
        primary key ("RAA_APPLICATION_NO", "RAA_SERIAL_NO")
);

create table "APP"."ROC_APPLICANTS_CONTACT"
(
    "RAC_APPLICATION_NO" VARCHAR2(20) not null,
    "RAC_SERIAL_NO"      VARCHAR2(3)  not null,
    "RAC_FNAME"          VARCHAR2(40),
    "RAC_LNAME"          VARCHAR2(80),
    "RAC_JOBTITLE"       VARCHAR2(100),
    "RAC_NID"            VARCHAR2(20),
    "RAC_TEL"            VARCHAR2(25),
    "RAC_FAX"            VARCHAR2(25),
    "RAC_EMAIL"          VARCHAR2(60),
    "RAC_MAIN"           VARCHAR2(1),
    constraint ROC_APPLICANTS_CONTAC_PK
        primary key ("RAC_APPLICATION_NO", "RAC_SERIAL_NO")
);

-- auto-generated definition
create table "APP"."ROC_COMPANIES"
(
    "SUBSCRIBER_ID"      VARCHAR2(10) not null,
    "COMP_ID"            VARCHAR2(10),
    "NAME"               VARCHAR2(80),
    "ADDRESS1"           VARCHAR2(50),
    "ADDRESS2"           VARCHAR2(50),
    "ADDRESS3"           VARCHAR2(50),
    "ADDRESS4"           VARCHAR2(50),
    "ADDRESS5"           VARCHAR2(8),
    "TEL"                VARCHAR2(25),
    "FAX"                VARCHAR2(25),
    "EMAIL"              VARCHAR2(35),
    "COMPANY_CATEGORY"   VARCHAR2(5),
    "BUSINESS_CATEGORY"  VARCHAR2(5),
    "INCORPORATION_DATE" DATE,
    "BRN_FLAG"           CHAR,
    "ROC_FLAG"           CHAR,
    "BUSINESS_NUMBER"    VARCHAR2(20),
    "COMPANY_NUMBER"     VARCHAR2(20),
    "CREATE_DT"          DATE,
    "MODIFIED_DT"        DATE,
    "COMPANY_TYPE"       VARCHAR2(10),
    "ID_TYPE"            VARCHAR2(3),
    "NID_PASSPORT"       VARCHAR2(20),
    "PERSON_NAME"        VARCHAR2(40),
    "ROCP_ID"            NUMBER       not null
        constraint PK_ROCP_ID
            primary key
)


