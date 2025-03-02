package DIO.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_fichaPersonagem")
@Getter @Setter
public class FichaPersonagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePersonagem;

    @OneToOne
    @JoinColumn(name = "user_id") // Cada usuário tem uma ficha
    private User user;

    @ManyToOne
    @JoinColumn(name = "arma_id")
    private Arma arma;

    @ManyToOne
    @JoinColumn(name = "raca_id")
    private Racas raca;

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private classePersonagem classe;
}