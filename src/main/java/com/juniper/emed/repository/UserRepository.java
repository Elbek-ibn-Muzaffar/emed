package com.juniper.emed.repository;

import com.juniper.emed.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    boolean existsByPhone(String name);

    Users findByPhone(String phone);

    @Query("select  u from Users u where u.name= ':name'")
    Optional<Users> findByNames(@Param("name") String names);

}
