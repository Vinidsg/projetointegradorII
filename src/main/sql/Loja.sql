create database lojainstrumentomusical;

use lojainstrumentomusical;

CREATE TABLE Produto (
    cod_produto int PRIMARY KEY,
    nome varchar(30),
    valor Double,
    marca varchar(30),
    descricao varchar(30),
    data_compra date,
    fornecedor varchar(30),
    categoria varchar(30),
    prateleira varchar(30),
    qtd_produto int
);

CREATE TABLE cliente (
	cod_cliente int primary key auto_increment,
    nome varchar(60),
    cpf varchar(30),
    data_de_nascimento date,
    email varchar(60),
    estado_civil varchar(30),
    telefone varchar(30),
    sexo varchar(30),
    endereco varchar(50),
    numero varchar(30),
    cep varchar(30),
    bairro varchar(30),
    UF varchar(2),
    cidade varchar(30)
);

    CREATE TABLE Venda (
    cod_venda int not null auto_increment,
    valor double not null,
    cpf varchar(30),
	data_venda date,
    nome varchar(60),
    primary key (cod_venda)
);

CREATE TABLE itemVenda (
    idItemVenda int not null auto_increment,
    cod_produto int,
    valor double not null,
    qtd int,
    nome varchar(60),
    data_compra date,
    nome_produto varchar(60)
);

select * from Venda;
select * from cliente;
select * from Produto;
select * from itemVenda;

UPDATE Produto SET qtd_produto = qtd_produto - ? WHERE cod_produto = ?;

select * from Venda where data_venda = "2022-11-09" and nome = "Mateus Felipe";

select nome, data_compra, cod_produto, nome_produto, qtd, valor from itemvenda where nome = "Mateus Felipe";

