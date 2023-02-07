package co.ao.bookstoremanager.repositorio;

import co.ao.bookstoremanager.entidade.LivroEntidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepositorio extends JpaRepository<LivroEntidade, Long> {
}
