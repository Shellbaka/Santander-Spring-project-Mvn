package DIO.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_armaMedioAlcance")
@DiscriminatorValue("MEDIO")
@Getter
@Setter
public class ArmaMedioAlcance extends Arma {
    private String tipo = "Médio Alcance";
}
