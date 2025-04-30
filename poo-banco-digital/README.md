# Banco Digital - Projeto em Java

## Descrição Geral
Este projeto é uma simulação de um banco digital, desenvolvido em Java, que permite a criação e gerenciamento de contas bancárias. Ele foi projetado para demonstrar conceitos de **Programação Orientada a Objetos (POO)**, como herança, polimorfismo, encapsulamento e abstração. O sistema suporta operações básicas de contas bancárias, como depósitos, saques, transferências e impressão de extratos.

## Estrutura do Projeto
O projeto está organizado da seguinte forma:

- **Main.java**: Classe principal que executa o programa.
- **IConta.java**: Interface que define as operações de uma conta.
- **Conta.java**: Classe abstrata base para contas bancárias.
- **ContaCorrente.java**: Classe que representa uma conta corrente.
- **ContaPoupanca.java**: Classe que representa uma conta poupança.
- **Cliente.java**: Classe que representa um cliente do banco.
- **Banco.java**: Classe que gerencia as contas e clientes do banco.

## Funcionalidades
O sistema oferece as seguintes funcionalidades:

- **Criação de contas**: Conta Corrente e Conta Poupança.
- **Operações bancárias**:
  - Depósito
  - Saque
  - Transferência entre contas
- **Impressão de extratos**: Exibe o histórico de transações de uma conta.
- **Gerenciamento de clientes**: Listagem de clientes e suas contas.

## Objetivo do Projeto
O objetivo principal deste projeto é aplicar os conceitos de POO em um cenário prático, simulando um sistema bancário simples. Ele também serve como base para estudos e aprimoramento de habilidades em Java.

## Configuração do Ambiente
Siga os passos abaixo para configurar o ambiente, compilar e executar o projeto:

1. Clone o repositório utilizando o comando `git clone` e navegue até o diretório do projeto.
2. Certifique-se de que o **Java Development Kit (JDK) 8** ou superior está instalado e configurado no `PATH` do sistema operacional.
3. Compile os arquivos Java utilizando o comando `javac` no diretório onde os arquivos `.java` estão localizados.
4. Execute o programa utilizando o comando `java Main`.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir **issues** ou enviar **pull requests** para melhorias no projeto.

## Licença
Este projeto é de uso livre para fins educacionais e está sob a licença **MIT**.