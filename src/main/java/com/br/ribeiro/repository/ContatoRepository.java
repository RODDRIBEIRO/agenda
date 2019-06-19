package com.br.ribeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ribeiro.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
