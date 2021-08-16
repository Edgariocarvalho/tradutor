package com.edgario.tradutro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgario.tradutro.domain.Categoria;

@Repository
public interface LivroRepository extends JpaRepository<Categoria, Integer> {

}
