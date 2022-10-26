package com.test.app.repository;

import com.test.app.entity.RocApplicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Brume
 *
 * Repository interface for MnsRocApplicant class
 **/
public interface MnsRocApplicantRepository extends JpaRepository<RocApplicant, String> {
    /**
     * Generate application No
     */
    @Query(value = "SELECT  TO_CHAR( SYSDATE, 'yymmdd')|| 'ROCAPP' || LPAD( MNS_SEQ_ROC_APPL.NEXTVAL, 5, '0') FROM DUAL", nativeQuery = true)
    String generateApplicationNo();

    boolean existsByCompanyFileOrNidPassport(String companyFile, String nidPassport);
}
