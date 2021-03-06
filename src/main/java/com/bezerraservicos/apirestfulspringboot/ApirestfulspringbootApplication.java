package com.bezerraservicos.apirestfulspringboot;

import com.bezerraservicos.apirestfulspringboot.domain.Categoria;
import com.bezerraservicos.apirestfulspringboot.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ApirestfulspringbootApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApirestfulspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(0, "Informática");
		Categoria cat2 = new Categoria(0, "Escritório");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));

	}
}
