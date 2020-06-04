package br.com.rafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafael.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}