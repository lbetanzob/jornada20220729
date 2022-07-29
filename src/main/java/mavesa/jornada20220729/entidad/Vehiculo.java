package mavesa.jornada20220729.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Vehiculo {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idVe;
    private String nombreVe;
    @ManyToOne
    private MarcaVehiculo marcaVe;
}
