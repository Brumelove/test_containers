package com.test.app.repository;

import com.test.app.entity.RocApplicantsUser;
import com.test.app.entity.embeddedid.RocApplicantsUserId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Brume
 **/
public interface MnsRocApplicantUserRepository extends JpaRepository<RocApplicantsUser, RocApplicantsUserId> {
}
