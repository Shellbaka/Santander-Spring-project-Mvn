package DIO.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_armaCurtoAlcance")
@DiscriminatorValue("CURTO")
@Getter
@Setter
public class ArmaCurtoAlcance extends Arma {
    private String tipo = "Curto Alcance";
}
