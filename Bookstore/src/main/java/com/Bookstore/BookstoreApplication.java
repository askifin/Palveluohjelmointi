package com.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Bookstore.domain.Book;
import com.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			log.info("Save couple of books");
			repository.save(new Book("Taskukirja","Aku Ankka","1934","ISBN 978-951-32-4845-1","5"));
			repository.save(new Book("Taskukirja2","Roope McAnkka","1934","ISBN 978-951-32-4845-2","10"));
			
			log.info("nouda kaikki kirjat");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
		};
	}
}
//