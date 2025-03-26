package com.example.faturas.service;

import com.example.faturas.model.Fatura;
import com.example.faturas.repository.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    @Autowired
    private final FaturaRepository faturaRepository;

    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public List<Fatura> getFaturas() {
        return faturaRepository.findAll();
    }

    public Fatura save(Fatura fatura) {
        return faturaRepository.save(fatura);
    }
}
