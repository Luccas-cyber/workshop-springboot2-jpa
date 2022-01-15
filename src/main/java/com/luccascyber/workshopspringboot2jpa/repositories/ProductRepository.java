package com.luccascyber.workshopspringboot2jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccascyber.workshopspringboot2jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
