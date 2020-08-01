package com.cadastro.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//fix project setup para baixar qualquer dependência

import lombok.Data;

@Data
//passa os dados da classe (getter and setters) para o lombok*

@Entity 
//fala pro mysql que isso aqui se trata de uma entidade

@Table(name = "tabela_clientes")
//define que o mysql precisa criar a tabela abaixo com
//os devidos atributos
public class CadastroM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nomes", nullable = false, length = 90)
	
	private String nome;
	
	
	@Column(name = "emails", nullable = false, unique = true)
	private String email;
	
	@Column(name = "senhas", nullable = false)
	private String senha;
	
}
