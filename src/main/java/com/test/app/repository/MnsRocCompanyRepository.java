package com.test.app.repository;

import com.test.app.entity.RocCompany;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Brume
 * <p>
 * Repository interface for MnsRocCompany class
 **/
public interface MnsRocCompanyRepository extends JpaRepository<RocCompany, String> {

    boolean existsByCompId(String companyFile);

    boolean existsByNidPassport(String nidPassport);
}
