package ec.edu.espe.arquitectura.escolastico.educacion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "edu_materia")
public class Materia implements Serializable {

    private static final long serialVersionUID = 1478565L;
    @EmbeddedId
    private MateriaPK pk;
    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;
    @Column(name = "creditos", nullable = false, precision = 4, scale = 2)
    private BigDecimal creditos;
    @Column(name = "horas", nullable = false, precision = 4, scale = 2)
    private BigDecimal horas;
    @Column(name = "ponderacion", nullable = false, precision = 5, scale = 2)
    private BigDecimal ponderacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materia")
    @JsonManagedReference(value = "malla-materia")
    private List<Prerequisito> prerequisito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materia")
    @JsonManagedReference(value = "malla-materia-prerquisito")
    private List<Prerequisito> materia;
    @JoinColumn(name = "cod_departamento", referencedColumnName = "cod_departamento", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    @JsonBackReference(value = "departameto-materias")
    private Departamento departamento;

    public Materia() {
    }

    public Materia(MateriaPK eduMateriaPK) {
        this.pk = eduMateriaPK;
    }

    public Materia(int codMateria, int codDepartamento) {
        this.pk = new MateriaPK(codMateria, codDepartamento);
    }

    public MateriaPK getPk() {
        return pk;
    }

    public void setPk(MateriaPK pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getCreditos() {
        return creditos;
    }

    public void setCreditos(BigDecimal creditos) {
        this.creditos = creditos;
    }

    public BigDecimal getHoras() {
        return horas;
    }

    public void setHoras(BigDecimal horas) {
        this.horas = horas;
    }

    public BigDecimal getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(BigDecimal ponderacion) {
        this.ponderacion = ponderacion;
    }

    public List<Prerequisito> getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(List<Prerequisito> prerequisito) {
        this.prerequisito = prerequisito;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pk != null ? pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Materia)) {
            return false;
        }
        Materia other = (Materia) object;
        if ((this.pk == null && other.pk != null) || (this.pk != null && !this.pk.equals(other.pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Materia [creditos=" + creditos + ", departamento=" + departamento + ", horas=" + horas + ", materia="
                + materia + ", nombre=" + nombre + ", pk=" + pk + ", ponderacion=" + ponderacion + ", prerequisito="
                + prerequisito + "]";
    }

}
