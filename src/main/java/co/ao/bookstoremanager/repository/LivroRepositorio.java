package co.ao.bookstoremanager.repository;

import co.ao.bookstoremanager.entity.LivroEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepositorio extends JpaRepository<LivroEntidade, Long> {
}
