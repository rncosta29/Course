package br.com.rafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafael.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}