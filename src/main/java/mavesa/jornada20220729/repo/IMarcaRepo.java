package mavesa.jornada20220729.repo;

import mavesa.jornada20220729.entidad.MarcaVehiculo;
import org.springframework.data.repository.CrudRepository;

public interface IMarcaRepo extends CrudRepository<MarcaVehiculo,Integer> {
}
