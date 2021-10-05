/******************** Funcionario ***************************/
create database gerenciamento;
use gerenciamento;
create table endereco_fun(
id_endereco_fun int auto_increment primary key,
ponto_referencia text(100) null,
logradouro varchar(50) not null,
cep varchar(10) not null,
numeracao int null,
bairro  varchar(20) not null,
complemento varchar(20) null,
cidade varchar(30) not null,
estado varchar(10) not null,
id_funcionario int
);

create table funcionario(
id_funcionario int auto_increment primary key,
nome varchar(50) not null,
data_admissao timestamp default current_timestamp(),
telefone varchar(12) null,
periodo varchar(20) not null,
cpf numeric(11) not null unique,
nascimento date not null,
sexo varchar(20) not null,
login varchar(50) not null,
senha varchar(50) not null
);

create table ocorrencia(
protocolo int auto_increment primary key,
data_ocorrencia date not null,
assunto text(50) null,
descricao text(400) null,
resposta text(400) null,
id_funcionario int
);
/******************** Clientes***************************/
create table cliente(
id_cliente int auto_increment primary key,
nome varchar(50) not null,
cpf varchar(20) not null unique,
rg varchar(15) not null,
orgao varchar(40) not null,
sexo varchar(20) not null,
nascimento date not null,
estado_civil varchar(15) not null,
salario decimal(10,2) not null,
logradouro varchar(50) not null,
cep varchar(15) not null,
numeracao int null,
bairro varchar(20) not null,
complemento varchar(20) not null,
cidade varchar(30) not null,
estado varchar(20) not null,
ponto_referencia text(100) null,
telefone varchar(15) not null,
telefone2 varchar(15) null,
celular varchar(16) not null,
conhecido varchar(20) null
);

create table cartao(
id_cartao int auto_increment primary key,
numero varchar(20) not null,
cvv int not null,
vencimento date not null,
data_emissao date not null,
limite decimal(10,3) not null,
saldo_devedor decimal(10,3) null,
id_cliente int
);

/******************** Produtos ***************************/
create table fornecedores(
id_fornecedores int auto_increment primary key,
razaosocial varchar(50) not null,
nomeConsultor varchar(50) not null,
telefone varchar(12) not null,
celular varchar(12) null,
cnpj varchar(50) not null,
cidade varchar(50) not null,
email varchar(40) not null
);

create table produto(
cod_barras varchar(50) null primary key,
nomeproduto varchar(30) not null,
validade date not null,
cod_barras_estoque varchar(50) not null, 
quantidade int not null,
encam_not varchar(10) null,
qtd_not varchar(10) null,
data_cadastramento timestamp default current_timestamp(),
preco_uni decimal(10,2) not null,
preco_venda decimal(10,2) not null,
lucro decimal(10,4) null,
id_fornecedores int
);

create table ranking(
id_ranking int auto_increment primary key,
qtd_vendas int,
cod_barras varchar(50)
);

/******************** Caixa ***************************/
create table compra(
id_compra int auto_increment primary key,
quantidade int null,
valor_final decimal(10,3)null,
id_cliente int null,
id_funcionario int,
cod_barras varchar(50),
auxiliador varchar(10) null
);

create table pagamento(
id_pagamento int auto_increment primary key,
parcelas int null,
data_pagamento date,
forma_pagamento varchar(20) null,
valor_compra decimal(10,2) null,
id_compra int,
fk_id_cliente int,
foreign key (fk_id_cliente) references cliente(id_cliente)
);

create table detalhes_compra(
id_detalhes int auto_increment primary key,
nome_produto varchar(50) not null,
preco_unitario decimal(10,2),
quantidade int null,
valor_total decimal(10,2),
id_compra int,
foreign key (id_compra) references compra(id_compra)
);
/*                                                     LEMBRETE
AS LINHAS ABAIXO DE FOREIGN KEY DEVEM SER EXECUTADAS DEPOIS DE TODAS AS TABELAS DO BANCO DE DADOS SEREM CRIADAS
*/
/***************** Criando a foreign key das tabelas: endereco_fun, funcionario, ocorrencia  ********************/
alter table endereco_fun add constraint fk_id_endereco_fun foreign key (id_funcionario) references funcionario (id_funcionario);
alter table ocorrencia add constraint fk_id_ocorrencia_fun foreign key (id_funcionario) references funcionario (id_funcionario);

/***************** Criando a foreign key das tabelas: cartao- cliente  ********************/
alter table cartao add constraint fk_id_cartao_cli foreign key (id_cliente) references cliente (id_cliente);

/***************** Criando a foreign key das tabelas: produto, ranking  ********************/
alter table produto add constraint fk_id_produto_fornecedores foreign key (id_fornecedores) references fornecedores (id_fornecedores);
alter table ranking add constraint fk_rank_cod_barras foreign key (cod_barras) references produto (cod_barras);

/***************** Criando a foreign key das tabelas: compra,pagamento  ********************/
alter table compra add constraint fk_id_compra_cli foreign key (id_cliente) references cliente (id_cliente);
alter table compra add constraint fk_id__compra_fun foreign key (id_funcionario) references funcionario (id_funcionario);
alter table compra add constraint fk_compra_cod_barras foreign key (cod_barras) references produto (cod_barras);
alter table pagamento add constraint fk_id_pag_compra foreign key (id_compra) references compra (id_compra);

/******************** Inserindo os dados nas tabelas *****************************/
insert into funcionario(nome,periodo,cpf,nascimento,sexo,login,senha) values 
('Samuel Lo','Manhã',11122223333, '1999-07-20','Masculino','sammy_lo123','programmer'),
('Gabriel Felipe','Manhã',33311122222, '1997-04-21','Masculino','Biel_Felipe','busy'),
('Gustavo Gomes','Tarde',44442113333, '1999-08-10','Masculino','Gusta_Gomes','Gusta913'),
('Alex Yudy','Tarde',22211221222, '1998-10-04','Masculino','Yudy_Kitahara','YudKita');

insert into endereco_fun(logradouro,cep,bairro,cidade,estado,id_funcionario) values 
('Alameda',2222-111,'Vila Mascote','São Paulo', 'São Paulo',1), 
('Avenida',3333-222, 'Itaquera', 'São Paulo', 'São Paulo',2),
('Distrito',4444-333, 'José Bonifácio', 'São Paulo', 'São Paulo',4),
('Condomínio',5555-444, 'Cidade Tiradentes', 'São Paulo', 'São Paulo',3);

insert into ocorrencia(data_ocorrencia,assunto,id_funcionario) values 
('2020-01-15', 'Compra realizada com sucesso',2),
('2020-01-22', 'Estorno de créditos',3),
('2020-03-11', 'Cancelamento de compra',4),
('2020-03-19', 'Cadastro de cliente',1);

insert into fornecedores(razaosocial,nomeConsultor,telefone,celular,cnpj,cidade,email) values 
('Coca Cola Indústrias LTDA','Roberto Ferreira','1111-1111','1199281-2291','22938827322000198','Rio de Janeiro','cocacola@hotmail.com'),
('Microempreendedor Individual','Jessica Fraindenberg','3456-5433','1223355-4455','22938823322000198','Rio de Janeiro','PedroEmpreendimentos@hotmail.com'),
('Empresa Individual de Responsabilidade Limitada','Victor Amaral','4388-3392','1199281-2291','22938827322000198','São Paulo','Limitada@gmail.com');

insert into produto(cod_barras,nomeproduto,validade,cod_barras_estoque,quantidade,preco_uni,preco_venda,lucro,id_fornecedores) values
('11111111','Coca-Cola Água gaseificada','2021-04-24','12221122','50','3.00','4.00','1.00',1),
('22222222','QUERO Molho de Tomate','2021-06-23','112222122','30','2.50','3.50','1.00',3),
('33333333','Colgate Pasta de Dente','2022-04-24','332223332','60','1.50','3.00','1.50',2),
('44444444','Nescau Leite com Chocolate','2020-12-24','333344','250','3.00','4.00','1.00',2);

insert into ranking(qtd_vendas,cod_barras) values 
('4',11111111),
('6',22222222),
('7',33333333),
('8',44444444);

/*INSERÇÃO NOVA: TABELA CLIENTE */
insert into cliente
(nome, cpf, rg, orgao, sexo, nascimento, estado_civil, salario, logradouro, cep, numeracao, bairro, complemento, cidade, estado, ponto_referencia, telefone, telefone2, celular, conhecido)   VALUES
('Gabriel', '000.000.000-00','123456789','SSP','Masculino','1998-01-23','Solteiro','1500','Rua das Naçoes','12333-000','123','Jd.Oligarquia','Casa','São Paulo','SP','Proximo a rua Lacuna','110000-0000','110000-5555','1190000-0000','Amanda'),
('Ana', '236.000.842-00','123456789','SSO','Feminino','1988-04-30','Solteira','1700','Rua das Flores','12543-111','923','Jd.Amora','Casa','São Paulo','SP','Proximo ao McDonalds','113232-0000','115454-5599','1190110-0000','Jose');

insert into compra(quantidade,valor_final,id_cliente,id_funcionario,cod_barras) values 
(7,17.0,1,4,11111111),
(10,62.2,2,2,22222222),
(8,36.8,1,1,33333333),
(5,36.5,2,3,44444444);

insert into cartao(numero,cvv,vencimento,data_emissao,limite,saldo_devedor,id_cliente) values 
('4444-7777-5555-8888','913','2027-11-23','2016-12-19','1.000','00.00',1),
('1111-0000-2222-1111','577','2025-06-18','2012-07-03','1.000','00.00',2);

insert into pagamento(parcelas,forma_pagamento,valor_compra,data_pagamento,id_compra,fk_id_cliente) values 
(0,'cartao loja',41.3,'2020-11-30',1,1),
(0,'cartao loja',36.8,'2020-11-30',3,1),
(2,'cartao',62.2,'2020-11-12',2,2),
(1,'cartao loja',36.5,'2020-06-13',4,2);