package br.com.rafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafael.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}