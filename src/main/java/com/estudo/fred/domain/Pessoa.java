package com.estudo.fred.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoPessoa;
	@Column(length = 150)
	private String nome;
	@Column(length = 50)
	private String sobreNome;
	@Column(length = 14, unique = true)
	private String cpf;
}
