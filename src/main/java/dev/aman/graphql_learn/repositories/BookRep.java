package dev.aman.graphql_learn.repositories;

import dev.aman.graphql_learn.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRep extends JpaRepository<Book, Integer> {
}
