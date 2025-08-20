package com.example.CadastroDeNinjas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@SpringBootApplication
public class CadastroDeNinjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDeNinjasApplication.class, args);
	}

	// Adicionar ninja (Create)
	@PostMapping("/criar")
	public String criarNinja(){
		return "Ninja criado";
	}

}
