package mavesa.jornada20220729.repo;

import mavesa.jornada20220729.entidad.Vehiculo;
import mavesa.jornada20220729.valueobject.AgruparVehiculos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IVehiculoRepo extends CrudRepository <Vehiculo,Integer> {

//    @Query("select new mavesa.jornada20220729.valueobject.AgruparVehiculos"+
//            "from Vehiculo V group by V.marcaVe"+
//            "COUNT(V.nombreVe)"
//            )

    @Query("select new mavesa.jornada20220729.valueobject."+
            "AgruparVehiculos((V.marcaVe.nombre),COUNT(V.nombreVe))" +
            "from Vehiculo V group by V.marcaVe.nombre")
    public List<AgruparVehiculos> agrupar();
}
