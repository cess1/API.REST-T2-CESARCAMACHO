package pe.edu.cibertec.api_rest_t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_rest_t2.model.bd.Autor;


@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
