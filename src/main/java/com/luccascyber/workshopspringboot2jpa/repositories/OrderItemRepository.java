package com.luccascyber.workshopspringboot2jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccascyber.workshopspringboot2jpa.entities.OrderItem;
import com.luccascyber.workshopspringboot2jpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
