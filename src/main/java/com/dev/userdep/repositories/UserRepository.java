package com.dev.userdep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.userdep.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
