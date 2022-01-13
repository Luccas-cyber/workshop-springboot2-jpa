package com.luccascyber.workshopspringboot2jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccascyber.workshopspringboot2jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
