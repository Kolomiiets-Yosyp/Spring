package com.example.spring.boootstrap;

import com.example.spring.repositories.AuthorRepository;
import com.example.spring.repositories.BookReository;
import com.example.spring.some.Author;
import com.example.spring.some.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private  final BookReository bookReository;

    public BootStrapData(AuthorRepository authorRepository, BookReository bookReository) {
        this.authorRepository = authorRepository;
        this.bookReository = bookReository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("some Book", "132123");
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);

        authorRepository.save(eric);
        bookReository.save(ddd);

        Author rod= new Author("Rod","Jonson");
        Book noEJB= new Book("dsfnkaldn ", "321321321");
        rod.getBooks().add(noEJB);
        noEJB.getAuthor().add(rod);
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books"+ bookReository.count());
    }
}
