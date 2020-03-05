package com.estudo.fred.service;

import org.springframework.stereotype.Service;

import com.estudo.fred.domain.DadosRetorno;

@Service
public class FredService {

	public DadosRetorno carregarDados() {
		DadosRetorno retorno = new DadosRetorno();
		retorno.setDescricao("Primeira api do Fredao");
		retorno.setNome("Fred");
		return retorno;
	}
}
