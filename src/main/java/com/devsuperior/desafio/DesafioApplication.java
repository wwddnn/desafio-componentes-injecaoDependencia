package com.devsuperior.desafio;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(001,220.0, 0.0);

		System.out.println("Saida: ");
		System.out.println("Pedido código: " + order.getCode() );
		System.out.println("Valor total: R$ " + orderService.total(order));





	}
}
