package dev.aman.graphql_learn;

import dev.aman.graphql_learn.entities.Book;
import dev.aman.graphql_learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlLearnApplication implements CommandLineRunner {
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("For learning java");
		b1.setPages(1000);
		b1.setPrice(3000);
		b1.setAuthor("Aman");

		Book b2 = new Book();
		b2.setTitle("Think java");
		b2.setDesc("For learning java");
		b2.setPages(2000);
		b2.setPrice(4000);
		b2.setAuthor("John");

		this.bookService.create(b1);
		this.bookService.create(b2);
	}
}
