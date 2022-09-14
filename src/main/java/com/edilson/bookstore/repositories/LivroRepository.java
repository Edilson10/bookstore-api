package com.edilson.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edilson.bookstore.domain.Categoria;

@Repository
public interface LivroRepository extends JpaRepository<Categoria, Integer> {

}
