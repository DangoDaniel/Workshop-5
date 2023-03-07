package pl.coderslab.beans;

import org.springframework.stereotype.Component;

import java.util.List;


public interface BookService {
    List<Book> getBooks();
}
