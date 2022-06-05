package com.juniper.emed.repository;

import com.juniper.emed.entity.CaseCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseCategoryRepository extends JpaRepository<CaseCategory, Long> {

}
