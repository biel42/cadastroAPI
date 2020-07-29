package com.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.demo.model.CadastroM;
import com.cadastro.demo.repository.CadastroR;

import lombok.RequiredArgsConstructor;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class CadastroC {
	
	@Autowired
	private final CadastroR repository;
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/cadastro")
	public ResponseEntity<List<CadastroM>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//criar cadastro método post
	@PostMapping
	public ResponseEntity<CadastroM> Post(@RequestBody CadastroM email){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(email));
	}

}
