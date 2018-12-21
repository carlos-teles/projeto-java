DROP DATABASE IF EXISTS InfoNote;
CREATE DATABASE InfoNote;

USE InfoNote;

create table usuario (
login varchar(15) primary key,
senha varchar(15) not null,
tipo int not null);
create table cliente (
codigocliente varchar(15) primary key,
nome varchar(255) not null,
email varchar(255),
telefone varchar(30),
fklogin varchar(15) not null,
constraint fk foreign key(fklogin) references
usuario(login));
create table endereco (
logradouro varchar(255),
numero varchar(50),
complemento varchar(100),
bairro varchar(150),
cidade varchar(150),
estado varchar(2),
cep varchar(9),
fkcodigocliente varchar(15) not null,
constraint fk2 foreign key(fkcodigocliente) references
cliente(codigocliente));
create table funcionario (
matricula varchar(15) primary key,
fklogin varchar(15) not null,
constraint fk3 foreign key (fklogin) references
usuario(login));
create table notebook (
serialnote varchar(40) primary key,
modelo varchar(255) not null,
descricao varchar(255) not null,
estoque int not null,
precoUnitario decimal (10,2) not null,
figura varchar(255) not null,
dataCadastro varchar(10) not null);
