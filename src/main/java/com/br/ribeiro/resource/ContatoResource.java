package com.br.ribeiro.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.ribeiro.model.Contato;
import com.br.ribeiro.repository.ContatoRepository;

@RestController
@RequestMapping("/contatos")
public class ContatoResource {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping
	public List<Contato> listar() {
		return contatoRepository.findAll();
	}
}
