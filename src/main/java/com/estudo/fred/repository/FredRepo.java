package com.estudo.fred.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.fred.domain.Pessoa;

@Repository
public interface FredRepo extends JpaRepository<Pessoa, Integer>  {

}
