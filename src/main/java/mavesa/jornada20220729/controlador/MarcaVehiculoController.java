package mavesa.jornada20220729.controlador;

import mavesa.jornada20220729.entidad.MarcaVehiculo;
import mavesa.jornada20220729.repo.IMarcaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Marcas")
public class MarcaVehiculoController {
    @Autowired
    private IMarcaRepo imarrepo;

    @GetMapping("/listamarcas")
    public Iterable<MarcaVehiculo> listamarca (){
            Iterable<MarcaVehiculo> resultado=imarrepo.findAll();
            return resultado;
    }
}
