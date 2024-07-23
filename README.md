# CRUD de Farmácia

Este projeto envolve o desenvolvimento de um sistema CRUD (Create, Read, Update, Delete) para gerenciamento de produtos de uma farmácia. O backend é desenvolvido em Java utilizando o framework Spring, com ênfase na organização modular e seguindo o paradigma da programação orientada a objetos.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 2.5.0
- Spring Data JPA
- MySQL (como database)
- Maven

## Funcionalidades

- Cadastro de novos produtos
- Listagem de produtos
- Atualização de informações dos produtos
- Remoção de produtos
- Endpoints protegidos com autenticação básica

## Estrutura do Projeto

  - `controller`: Controladores REST para gerenciar produtos
  - `model`: Entidades JPA representando os produtos
  - `repository`: Interfaces de repositórios JPA para acesso ao banco de dados
  - `service`: Serviços de negócio

## Configuração

### 1. Clonar o repositório

```bash
git clone https://github.com/julooch/farmacia-crud.git
cd farmacia-crud
