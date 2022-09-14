package com.edilson.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edilson.bookstore.domain.Livro;

@Repository
public interface CategoriaRepository extends JpaRepository<Livro, Integer> {

}
