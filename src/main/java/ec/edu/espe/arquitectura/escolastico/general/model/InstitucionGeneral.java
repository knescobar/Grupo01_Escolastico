package ec.edu.espe.arquitectura.escolastico.general.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gen_institucion")
public class InstitucionGeneral implements Serializable {

    private static final long serialVersionUID = 7854841L;
    @Id
    @Column(name = "ruc", nullable = false, length = 13)
    private String ruc;
    @Column(name = "razon_social", nullable = false, length = 128)
    private String razonSocial;
    @Column(name = "nombre_comercial", nullable = false, length = 128)
    private String nombreComercial;
    @Column(name = "direccion", nullable = false, length = 255)
    private String direccion;
    @Column(name = "dominio", nullable = false, length = 64)
    private String dominio;
    @Column(name = "url_info", length = 128)
    private String urlInfo;
    @Column(name = "url_sistema", nullable = false, length = 128)
    private String urlSistema;
    @Column(name = "version", nullable = false)
    private Integer version;
    @JoinColumn(name = "cod_ubicacion_geo_int", referencedColumnName = "cod_ubicacion_geo_int", insertable = false, updatable = false)
    @ManyToOne
    private UbicacionGeografica ubicacionGeo;

    public InstitucionGeneral() {
    }

    public InstitucionGeneral(String ruc) {
        this.ruc = ruc;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getUrlInfo() {
        return urlInfo;
    }

    public void setUrlInfo(String urlInfo) {
        this.urlInfo = urlInfo;
    }

    public String getUrlSistema() {
        return urlSistema;
    }

    public void setUrlSistema(String urlSistema) {
        this.urlSistema = urlSistema;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UbicacionGeografica getUbicacionGeo() {
        return ubicacionGeo;
    }

    public void setUbicacionGeo(UbicacionGeografica ubicacionGeo) {
        this.ubicacionGeo = ubicacionGeo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ruc != null ? ruc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof InstitucionGeneral)) {
            return false;
        }
        InstitucionGeneral other = (InstitucionGeneral) object;
        if ((this.ruc == null && other.ruc != null) || (this.ruc != null && !this.ruc.equals(other.ruc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.escolastico.model.GenInstitucion[ ruc=" + ruc + " ]";
    }

}
