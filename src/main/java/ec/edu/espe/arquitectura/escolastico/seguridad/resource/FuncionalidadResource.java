package ec.edu.espe.arquitectura.escolastico.seguridad.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.escolastico.seguridad.model.Funcionalidad;
import ec.edu.espe.arquitectura.escolastico.seguridad.service.FuncionalidadService;

@RestController
@RequestMapping(path = "/funcionalidad")
public class FuncionalidadResource {

    private FuncionalidadService funcionalidadService;

    public FuncionalidadResource(FuncionalidadService funcionalidadService) {
        this.funcionalidadService = funcionalidadService;
    }

    @GetMapping
    public ResponseEntity<List<Funcionalidad>> getFuncionalidadesActivas() {
        return ResponseEntity.ok(this.funcionalidadService.listarFuncionalidadesActivas());
    }

    @PostMapping
    public ResponseEntity<String> crear(@RequestBody Funcionalidad funcionalidad) {
        this.funcionalidadService.crear(funcionalidad);
        return ResponseEntity.ok("Funcionalidad creada");
    }

    @PutMapping
    public ResponseEntity<Funcionalidad> modificar(@RequestBody Funcionalidad funcionalidad) {
        try {
            this.funcionalidadService.modificar(funcionalidad);
            funcionalidad = this.funcionalidadService.obtenerPorCodigo(funcionalidad.getCodFuncionalidad());
            return ResponseEntity.ok(funcionalidad);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
