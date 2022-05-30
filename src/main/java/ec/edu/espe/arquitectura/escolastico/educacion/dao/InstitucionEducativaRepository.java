package ec.edu.espe.arquitectura.escolastico.educacion.dao;

import ec.edu.espe.arquitectura.escolastico.educacion.model.InstitucionEducativa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitucionEducativaRepository extends JpaRepository<InstitucionEducativa, Integer>{
    
    List<InstitucionEducativa> findByNombreLike (String nombrePattern);
    
    List<InstitucionEducativa> findByTipo (String tipo);
    
}
