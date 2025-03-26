package com.example.faturas.repository;

import com.example.faturas.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {}