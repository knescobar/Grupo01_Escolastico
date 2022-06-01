package ec.edu.espe.arquitectura.escolastico.seguridad.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "seg_registro_sesion")
public class RegistroSesion implements Serializable {

    private static final long serialVersionUID = 848516546L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "secuencia", nullable = false)
    private Integer secuencia;
    @Column(name = "cod_usuario", nullable = false, length = 32)
    private String codUsuario;
    @Column(name = "fecha_conexion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConexion;
    @Column(name = "ip_conexion", nullable = false, length = 30)
    private String ipConexion;
    @Column(name = "resultado", nullable = false, length = 3)
    private String resultado;
    @Column(name = "error", length = 5)
    private String error;

    public RegistroSesion() {
    }

    public RegistroSesion(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Date getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(Date fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public String getIpConexion() {
        return ipConexion;
    }

    public void setIpConexion(String ipConexion) {
        this.ipConexion = ipConexion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.secuencia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistroSesion other = (RegistroSesion) obj;
        if (!Objects.equals(this.secuencia, other.secuencia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.escolastico.model.SegRegistroSesion[ secuencia=" + secuencia + " ]";
    }

}
