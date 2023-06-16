package com.suivi_rendezvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suivi_rendezvous.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
