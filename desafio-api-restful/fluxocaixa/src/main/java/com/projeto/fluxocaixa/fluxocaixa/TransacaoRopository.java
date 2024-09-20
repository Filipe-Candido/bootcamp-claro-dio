package com.projeto.fluxocaixa.fluxocaixa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRopository extends JpaRepository <Transacao, Long> {


    List<Transacao> findByTipo(String tipo);
}
