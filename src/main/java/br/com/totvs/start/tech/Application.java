package br.com.totvs.start.tech;

import br.com.totvs.start.tech.entity.Linha;
import br.com.totvs.start.tech.entity.Onibus;
import br.com.totvs.start.tech.service.LinhaServiceImpl;
import br.com.totvs.start.tech.service.OnibusServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		List<Linha>	listLinhas = new ArrayList<Linha>();
		List<Onibus> listOnibus = new ArrayList<Onibus>();

		LinhaServiceImpl linhaService = new LinhaServiceImpl();
		OnibusServiceImpl onibusService = new OnibusServiceImpl();

		Linha linha01 = linhaService.criar(01, "Santana", "Tatuapé", LocalTime.of(8,00), LocalTime.of(21,00));
		listLinhas.add(linha01);

		Onibus onibus01 = onibusService.criar(01, "192T-10", "Estadual", 2010, linha01);
		listOnibus.add(onibus01);

		Onibus onibus02 = onibusService.criar(02, "192T-11", "Estadual", 2018, linha01);
		listOnibus.add(onibus02);


	}

}
