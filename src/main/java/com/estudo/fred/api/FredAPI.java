package com.estudo.fred.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.fred.domain.DadosRetorno;
import com.estudo.fred.dto.PessoaDTO;
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

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PessoaDTO gravarPessoa(@RequestBody PessoaDTO pessoa) {
		return dados.gravarPessoa(pessoa);
	}

	@PutMapping(value = "/{codigoPessoa}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PessoaDTO atualizarPessoa(@RequestBody PessoaDTO pessoa, @PathVariable("codigoPessoa") Integer codigoPessoa) {
		return dados.atualizarPessoa(pessoa, codigoPessoa);
	}
// Agora está no git
	// segundo comentário
}
