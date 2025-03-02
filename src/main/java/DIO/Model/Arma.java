package DIO.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_arma")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Herança no banco
@DiscriminatorColumn(name = "tipo_arma")
@Getter
@Setter
public abstract class Arma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
}
