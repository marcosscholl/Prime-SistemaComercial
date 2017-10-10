/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prime.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "departamento", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d"), @NamedQuery(name = "Departamento.findByCodDepartamento", query = "SELECT d FROM Departamento d WHERE d.codDepartamento = :codDepartamento"), @NamedQuery(name = "Departamento.findByNomeDepartamento", query = "SELECT d FROM Departamento d WHERE d.nomeDepartamento = :nomeDepartamento")})
public class Departamento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_DEPARTAMENTO")
    private Integer codDepartamento;
    @Column(name = "NOME_DEPARTAMENTO")
    private String nomeDepartamento;

    public Departamento() {
    }

    public Departamento(Integer codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public Integer getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(Integer codDepartamento) {
        Integer oldCodDepartamento = this.codDepartamento;
        this.codDepartamento = codDepartamento;
        changeSupport.firePropertyChange("codDepartamento", oldCodDepartamento, codDepartamento);
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        String oldNomeDepartamento = this.nomeDepartamento;
        this.nomeDepartamento = nomeDepartamento;
        changeSupport.firePropertyChange("nomeDepartamento", oldNomeDepartamento, nomeDepartamento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDepartamento != null ? codDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.codDepartamento == null && other.codDepartamento != null) || (this.codDepartamento != null && !this.codDepartamento.equals(other.codDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.Departamento[codDepartamento=" + codDepartamento + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
