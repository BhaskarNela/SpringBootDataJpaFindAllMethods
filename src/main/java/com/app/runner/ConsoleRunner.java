package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		// to fetch the data
		/*
		 * List<Product> list=repo.findAll(); list.forEach(System.out::println);
		 */

		//to fetch data in sorting order
		/*
		 * repo.findAll( Sort.by(Direction.ASC,"prodCode")
		 * ).forEach(System.out::println);
		 */

		//pagination of sorting data of table
		/*
		 * PageRequest p=PageRequest.of(1, 2);
		 * repo.findAll(p).forEach(System.out::println);
		 */
		//

		/*
		 * Product p =new Product(); p.setProdCost(2.2); Example<Product>
		 * e=Example.of(p); repo.findAll(e).forEach(System.out::println);
		 */
		//select row data based on id at time multiple
		repo.findAllById(Arrays.asList(10,12,13)).forEach(System.out::println);
	}

}
