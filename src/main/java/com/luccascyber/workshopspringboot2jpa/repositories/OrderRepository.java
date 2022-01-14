package com.luccascyber.workshopspringboot2jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccascyber.workshopspringboot2jpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
