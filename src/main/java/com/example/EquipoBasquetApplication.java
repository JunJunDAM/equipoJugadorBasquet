package com.example;

import com.example.service.EquipoService;
import com.example.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
		basePackageClasses = {EquipoBasquetApplication.class, Jsr310JpaConverters.class}
)

@SpringBootApplication
public class EquipoBasquetApplication {

	public static void main(String[] args) {

		SpringApplication.run(EquipoBasquetApplication.class, args);
		ConfigurableApplicationContext context= SpringApplication.run(EquipoBasquetApplication.class, args);

		context.getBean(EquipoService.class).equipos();
		context.getBean(JugadorService.class).jugadores();

	}
}
