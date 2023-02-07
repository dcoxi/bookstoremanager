package co.ao.bookstoremanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivroEntidade {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true,length = 355)
  private String nome;

  @Column(nullable = false)
  private Integer paginas;

  @Column(nullable = false)
  private Integer capitulos;

  @Column(nullable = false, length = 100)
  private String isbn;

    @Column(name = "nome_publicacao",nullable = false, unique = true)
    private String nomePublicacao;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "autor_id")
    private AutorEntidade autor;
}
