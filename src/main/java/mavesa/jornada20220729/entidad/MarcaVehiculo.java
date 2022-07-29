package mavesa.jornada20220729.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class MarcaVehiculo {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idMarca;
    private String nombre;
}
