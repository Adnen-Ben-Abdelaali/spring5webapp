package guru.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String isbn;
    private String publisher;

    @ManyToMany
    @JoinTable(name="author_book",
                joinColumns=@JoinColumn(name="book_id"),
                inverseJoinColumns =@JoinColumn(name="author_id") )
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", authors=" + authors +
                '}';
    }
}
