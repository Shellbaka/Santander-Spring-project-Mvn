package DIO.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_adm")
@Getter @Setter
public class Adm extends User {
    private String nivelAcesso; // Exemplo: "FULL_ACCESS"
}
