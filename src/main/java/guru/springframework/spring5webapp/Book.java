package guru.springframework.spring5webapp;

import java.util.HashSet;
import java.util.Set;

public class Book {

    /*
        title
        isbn
        publisher
        set of authors
     */

    private String title;
    private String isbn;
    private String publisher;
    private Set<Author> authors = new HashSet<>();

    public Book() {}

    public Book(String title, String isbn, String publisher, Set<Author> authors) {

        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
    }

    /* setters and getters */

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
