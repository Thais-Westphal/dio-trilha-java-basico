# Projeto Banco

Este projeto é uma implementação simples de um sistema bancário em Java. Ele permite a criação de contas correntes e contas poupança, bem como a realização de operações básicas como depósito, saque e transferência. 

## Funcionalidades

- Criação de clientes
- Criação de contas correntes e poupança
- Depósito de valores em contas
- Saque de valores em contas
- Transferência de valores entre contas
- Impressão de extratos de contas
- Impressão de informações gerais do banco

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- `Banco`: Representa o banco e armazena uma lista de contas.
- `Cliente`: Representa um cliente do banco.
- `Conta`: Classe abstrata que define os métodos básicos de uma conta bancária.
- `ContaCorrente`: Extende `Conta` e representa uma conta corrente.
- `ContaPoupanca`: Extende `Conta` e representa uma conta poupança.
- `IConta`: Interface que define os métodos básicos que uma conta deve implementar.
- `Main`: Classe principal que contém o método `main` para execução do programa.
