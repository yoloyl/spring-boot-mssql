package com.easement.mes.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByUserName(String userName);
}