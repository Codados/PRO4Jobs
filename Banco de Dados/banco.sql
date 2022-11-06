create database banco;
use banco;

create table candidato(
cpf varchar(14) not null,
nome_completo varchar(50) not null,
data_nascimento date not null,
email varchar(30) not null,
telefone bigint not null,
endereco varchar(60) null,
pretencao_salarial numeric(7,2) null,
senha varchar(3000) not null,
primary key (cpf)
);

create table vaga(
id_vaga int auto_increment not null,
nome_vaga varchar (30) not null,
descricao_vaga varchar (200) not null,
pretencao_salarial numeric(7,2) null,
cargo varchar(30),
experiencia_profissional_necessaria varchar (120) not null,
quantidade_candidatos int,    
primary key (id_vaga)
);

create table rh(
cpf varchar(14) not null, 
nome_completo varchar (30) not null,
email varchar (30) not null,
perfil varchar (20) not null,
senha varchar (3000) not null,
primary key (cpf)
);

create table candidato_vaga (
fk_cpf varchar(14),
fk_id_vaga int,
status_vaga varchar (30),
primary key (fk_cpf, fk_id_vaga),
foreign key (fk_cpf) references candidato (cpf),
foreign key (fk_id_vaga) references vaga (id_vaga)
);

create table cargo_interesse(
    id_cargo int auto_increment not null,
    nome varchar(20),
    primary key(id_cargo)
); 

create table candidato_cargo(
    fk_cpf varchar(14),
    fk_cargo int,
    descricao varchar(120) unique,
    primary key (fk_cpf, fk_cargo),
    foreign key (fk_cpf) references candidato(cpf),
    foreign key (fk_cargo) references Cargo_Interesse(id_cargo)
);

create table experiencia_profissional(
    id_experiencia int auto_increment,
    descricao varchar(100),
    fk_cpf varchar(14),
    primary key (id_experiencia),
    foreign key (fk_cpf) references candidato(cpf)
);

create table formacao_academica(
    id_formacao int auto_increment,
    descricao varchar(120),
    fk_cpf varchar(14),
    primary key (id_formacao),
    foreign key (fk_cpf) references candidato(cpf)
);
