package com.juniper.emed.repository;

import com.juniper.emed.entity.Calls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallsRepository extends JpaRepository<Calls,Long> {
}
