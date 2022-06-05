package com.juniper.emed.repository;

import com.juniper.emed.entity.CallsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallsCategoryRepository extends JpaRepository<CallsCategory,Long> {

}
