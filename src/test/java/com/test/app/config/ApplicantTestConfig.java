package com.test.app.config;

import com.test.app.entity.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * This class contains basic spring configuration in order to run an integration test successfully
 *
 * @author Brume
 */
@ComponentScan(basePackages = {"com.test.app"})
@EnableJpaRepositories(basePackages = "com.test.app)
@EntityScan(basePackageClasses = {RocApplicant.class, RocApplicantsAttach.class, RocApplicantsAdm.class, RocApplicantsUser.class, RocApplicantsContact.class, })
//@EntityScan(basePackages = "com.test.app.entity")
public class ApplicantTestConfig {

}

