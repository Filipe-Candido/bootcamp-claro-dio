# Simulação de Banco em Java

Este é um projeto simples em Java que simula o funcionamento de um banco. O sistema possui funcionalidades para gerenciar **clientes**, **contas bancárias** (Conta Corrente e Conta Poupança), além de realizar operações básicas como **depósitos**, **saques** e **transferências** entre contas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- **Cliente**: Representa um cliente do banco com nome e CPF.
- **Conta (abstract)**: Classe base para todas as contas, possuindo métodos para realizar operações bancárias básicas.
- **ContaCorrente**: Herda de `Conta` e permite saques com uso de um limite de crédito.
- **ContaPoupanca**: Herda de `Conta` e permite o cálculo e aplicação de rendimentos com base em uma taxa de juros.
- **Banco**: Responsável por gerenciar todas as contas dos clientes e realizar operações entre elas.

## Funcionalidades

### Cliente
- Armazena informações básicas do cliente (nome e CPF).

### Conta (Classe Abstrata)
- **Depositar**: Adiciona um valor ao saldo da conta.
- **Sacar**: Retira um valor do saldo (se houver saldo suficiente).
- **Transferir**: Transfere um valor entre contas, respeitando os saldos disponíveis.

### Conta Corrente
- Permite saques além do saldo, até um limite definido.

### Conta Poupança
- Aplica rendimento ao saldo da conta com base em uma taxa de juros pré-definida.

### Banco
- Armazena as contas e permite operações de busca de contas pelo número.



### Requisitos

- JDK 8 ou superior instalado.
