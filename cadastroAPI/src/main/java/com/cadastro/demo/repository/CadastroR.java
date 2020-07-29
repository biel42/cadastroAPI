package com.cadastro.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.demo.model.CadastroM;

@Repository
public interface CadastroR extends JpaRepository<CadastroM, Long>{
	public List<CadastroM> findAllByEmailContainingIgnoreCase(String email);
	
}
