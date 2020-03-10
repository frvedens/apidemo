package com.estudo.fred.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.fred.domain.DadosRetorno;
import com.estudo.fred.domain.Pessoa;
import com.estudo.fred.dto.PessoaDTO;
import com.estudo.fred.repository.FredRepo;

@Service
public class FredService {

	@Autowired
	FredRepo fredRepo;
	
	public DadosRetorno carregarDados() {
		DadosRetorno retorno = new DadosRetorno();
		retorno.setDescricao("Primeira api do Fredao");
		retorno.setNome("Fred");
		return retorno;
	}
	
	public PessoaDTO gravarPessoa(PessoaDTO pessoa) {
		Pessoa p = new Pessoa();
		
		p.setCpf(pessoa.getCpf());
		p.setNome(pessoa.getNome());
		p.setSobreNome(pessoa.getSobreNome());
		
		Pessoa pessoaSalva = fredRepo.save(p);
		
		pessoa.setCodigoPessoa(pessoaSalva.getCodigoPessoa());
		
		return pessoa;
	}
	
	public PessoaDTO atualizarPessoa(PessoaDTO pessoa, Integer codigoPessoa) {
		
		Optional<Pessoa> p  = fredRepo.findById(codigoPessoa);
			if(p.isPresent()) {
				Pessoa p2 = p.get();
				p2.setCpf(pessoa.getCpf());
				p2.setNome(pessoa.getNome());
				p2.setSobreNome(pessoa.getSobreNome());
				fredRepo.save(p2);

				pessoa.setCodigoPessoa(p2.getCodigoPessoa());
			}
		return pessoa;
				
	}
	
}
