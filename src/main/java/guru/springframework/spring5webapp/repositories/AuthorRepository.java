package guru.springframework.spring5webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
