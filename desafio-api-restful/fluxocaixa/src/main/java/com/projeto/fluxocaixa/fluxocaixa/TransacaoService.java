package com.projeto.fluxocaixa.fluxocaixa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRopository transacaoRepository;  // Nome corrigido e repositório injetado corretamente

    // Obter todas as transações
    public List<Transacao> obterTodasTransacoes() {
        return transacaoRepository.findAll();
    }

    // Salvar nova transação
    public Transacao salvarTransacao(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    // Calcular saldo baseado nas transações
    public BigDecimal calcularSaldo() {
        List<Transacao> todasTransacoes = transacaoRepository.findAll();  // Usar o repositório injetado corretamente
        BigDecimal saldo = BigDecimal.ZERO;

        // Lógica para calcular saldo
        for (Transacao t : todasTransacoes) {
            if ("ENTRADA".equals(t.getTipo())) {
                saldo = saldo.add(t.getValor());
            } else if ("SAIDA".equals(t.getTipo())) {
                saldo = saldo.subtract(t.getValor());
            }
        }
        return saldo;
    }
}