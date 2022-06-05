package com.juniper.emed.repository;

import com.juniper.emed.entity.Deseases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeseasesRepository extends JpaRepository<Deseases,Long> {
    List<Deseases> findAllByCaseCategoryId(Long id);
}
