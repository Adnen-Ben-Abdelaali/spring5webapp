package guru.springframework.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String isbn;
    private String publisher;

    private Set<Author> authors = new HashSet<>();

    public Book() {}

    public Book(String title, String isbn, String publisher) {

        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }


    public Book(String title, String isbn, String publisher, Set<Author> authors) {

        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
    }

    /* setters and getters */

    public long getId() {

        return this.id;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getTitle() {

        return this.title;
    }

    public void setIsbn(String isbn) {

        this.isbn = isbn;
    }

    public String getIsbn() {

        return this.isbn;
    }

    public void setAuthors(Set<Author> authors) {

        this.authors = authors;
    }

    public Set<Author> getAuthors() {

        return this.authors;
    }

}
