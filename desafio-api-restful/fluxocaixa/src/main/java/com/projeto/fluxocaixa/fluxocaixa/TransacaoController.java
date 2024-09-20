package com.projeto.fluxocaixa.fluxocaixa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    // Listar todas as transações
    @GetMapping
    public List<Transacao> listarTransacoes() {
        return transacaoService.obterTodasTransacoes();
    }

    // Criar uma nova transação
    @PostMapping
    public ResponseEntity<Transacao> criarTransacao(@RequestBody Transacao transacao) {
        Transacao novaTransacao = transacaoService.salvarTransacao(transacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaTransacao);
    }

    // Obter o saldo de todas as transações
    @GetMapping("/saldo")
    public BigDecimal obterSaldo() {
        return transacaoService.calcularSaldo();
    }
}