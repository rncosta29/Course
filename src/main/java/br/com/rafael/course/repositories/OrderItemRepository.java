package br.com.rafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafael.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}