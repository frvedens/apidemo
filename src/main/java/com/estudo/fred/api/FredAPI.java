package com.estudo.fred.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.fred.domain.DadosRetorno;
import com.estudo.fred.service.FredService;

@RestController
@RequestMapping("/fred/exemplo")
public class FredAPI {

	@Autowired
	FredService dados;

	@GetMapping
	public DadosRetorno getDados() {
		return dados.carregarDados();
	}

}
