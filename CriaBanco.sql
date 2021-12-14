use db_bluebank;

show tables;

create table cliente (
       id bigint not null auto_increment,
        cpf varchar(11) not null,
        data_nascimento datetime,
        email varchar(60) not null,
        nome varchar(60) not null,
        senha varchar(255),
        sobrenome varchar(60) not null,
        telefone integer not null,
        token varchar(255),
        endereco_id_fk bigint not null,
        primary key (id)
    ) engine=MyISAM;
   
create table conta (
       id bigint not null auto_increment,
        agencia integer not null,
        conta bigint,
        saldo double precision not null,
        cliente_id_fk bigint not null,
        primary key (id)
    ) engine=MyISAM;

create table endereco (
       id bigint not null auto_increment,
        bairro varchar(255) not null,
        cep varchar(255) not null,
        cidade varchar(255) not null,
        complemento varchar(255),
        logradouro varchar(255) not null,
        numero varchar(255) not null,
        uf varchar(2) not null,
        primary key (id)
    ) engine=MyISAM;

create table movimentacoes (
       id bigint not null auto_increment,
        data datetime,
        saldo_final double precision,
        saldo_inicial double precision,
        tipo_movimentacao integer not null,
        valor double precision not null,
        conta_id_fk bigint not null,
        primary key (id)
    ) engine=MyISAM;
   

alter table cliente 
       add constraint UK_cmxo70m08n43599l3h0h07cc6 unique (email);
  
alter table cliente 
       add constraint UK_r1u8010d60num5vc8fp0q1j2a unique (cpf);
   
alter table cliente 
       add constraint FK45yfh6c2tecmc3h1e2672l7t6 
       foreign key (endereco_id_fk) 
       references endereco (id);
      
alter table conta 
       add constraint FKktq8apge26yhcw60mc2oqyi0q 
       foreign key (cliente_id_fk) 
       references cliente (id);

alter table movimentacoes 
       add constraint FKhk6n4g4xevanmpml0ns7qeo95 
       foreign key (conta_id_fk) 
       references conta (id);      

   

   
   

    
    