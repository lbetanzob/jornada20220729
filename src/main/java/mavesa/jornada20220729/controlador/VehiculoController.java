package mavesa.jornada20220729.controlador;

import mavesa.jornada20220729.entidad.Vehiculo;
import mavesa.jornada20220729.repo.IVehiculoRepo;
import mavesa.jornada20220729.valueobject.AgruparVehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Vehiculos")
public class VehiculoController {
    @Autowired
    private IVehiculoRepo iverepo;

    @GetMapping("/listavehiculos")
    public Iterable<Vehiculo> listave (){
        Iterable<Vehiculo> resultado=iverepo.findAll();
        return resultado;
    }
    @PostMapping("/ingresarvehiculo")
    public Vehiculo crear(@RequestBody Vehiculo ve) {
        String resultado="";
        iverepo.save(ve);
        return ve;
    }

    @GetMapping("/agrupar")
    public List<AgruparVehiculos> agrupadomarca () {
        return iverepo.agrupar();
    }



}
