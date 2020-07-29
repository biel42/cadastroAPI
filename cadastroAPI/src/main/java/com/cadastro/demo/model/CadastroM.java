package com.cadastro.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

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
	@Min(2)
	private String nome;
	
	@Email
	@Column(name = "emails", nullable = false, unique = true)
	private String email;
	
	@Column(name = "senhas", nullable = false)
	@Size(min = 6, max = 50)
	private String senha;
	
}
