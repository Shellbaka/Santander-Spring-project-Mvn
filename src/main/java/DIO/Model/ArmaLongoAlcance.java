package DIO.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_armaLongoAlcance")
@DiscriminatorValue("LONGO")
@Getter
@Setter
public class ArmaLongoAlcance extends Arma {
    private String tipo = "Longo Alcance";
}
