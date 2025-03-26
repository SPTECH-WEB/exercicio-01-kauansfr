package com.example.faturas.controller;

import com.example.faturas.model.Fatura;
import com.example.faturas.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/faturas")
public class FaturaController {
    private final FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @GetMapping
    public List<Fatura> getFaturas() {
        return faturaService.getFaturas();
    }

    @PostMapping
    public ResponseEntity<Fatura> save(@Valid @RequestBody Fatura fatura) {
        Fatura novaFatura = faturaService.save(fatura);

        return ResponseEntity.ok(novaFatura);
    }
}
