package ec.edu.espe.arquitectura.escolastico.persona.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "per_tipo_discapacidad")
public class TipoDiscapacidad implements Serializable {

    private static final long serialVersionUID = 15875875L;
    @Id
    @Column(name = "cod_tipo_discapacidad", nullable = false, length = 8)
    private String codTipoDiscapacidad;
    @Column(name = "nombre", nullable = false, length = 64)
    private String nombre;
    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;
    @Column(name = "aud_fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFecha;
    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;
    @Column(name = "version", nullable = false)
    private Integer version;

    public TipoDiscapacidad() {
    }

    public TipoDiscapacidad(String codTipoDiscapacidad) {
        this.codTipoDiscapacidad = codTipoDiscapacidad;
    }

    public String getCodTipoDiscapacidad() {
        return codTipoDiscapacidad;
    }

    public void setCodTipoDiscapacidad(String codTipoDiscapacidad) {
        this.codTipoDiscapacidad = codTipoDiscapacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAudUsuario() {
        return audUsuario;
    }

    public void setAudUsuario(String audUsuario) {
        this.audUsuario = audUsuario;
    }

    public Date getAudFecha() {
        return audFecha;
    }

    public void setAudFecha(Date audFecha) {
        this.audFecha = audFecha;
    }

    public String getAudIp() {
        return audIp;
    }

    public void setAudIp(String audIp) {
        this.audIp = audIp;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.codTipoDiscapacidad);
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
        final TipoDiscapacidad other = (TipoDiscapacidad) obj;
        if (!Objects.equals(this.codTipoDiscapacidad, other.codTipoDiscapacidad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.escolastico.model.PerTipoDiscapacidad[ codTipoDiscapacidad=" + codTipoDiscapacidad + " ]";
    }

}
