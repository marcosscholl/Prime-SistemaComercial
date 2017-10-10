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
@Table(name = "unidade", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "Unidade.findAll", query = "SELECT u FROM Unidade u"), @NamedQuery(name = "Unidade.findByCodUnidade", query = "SELECT u FROM Unidade u WHERE u.codUnidade = :codUnidade"), @NamedQuery(name = "Unidade.findByDescricaoUnidade", query = "SELECT u FROM Unidade u WHERE u.descricaoUnidade = :descricaoUnidade")})
public class Unidade implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_UNIDADE")
    private Integer codUnidade;
    @Column(name = "DESCRICAO_UNIDADE")
    private String descricaoUnidade;

    public Unidade() {
    }

    public Unidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        Integer oldCodUnidade = this.codUnidade;
        this.codUnidade = codUnidade;
        changeSupport.firePropertyChange("codUnidade", oldCodUnidade, codUnidade);
    }

    public String getDescricaoUnidade() {
        return descricaoUnidade;
    }

    public void setDescricaoUnidade(String descricaoUnidade) {
        String oldDescricaoUnidade = this.descricaoUnidade;
        this.descricaoUnidade = descricaoUnidade;
        changeSupport.firePropertyChange("descricaoUnidade", oldDescricaoUnidade, descricaoUnidade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUnidade != null ? codUnidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidade)) {
            return false;
        }
        Unidade other = (Unidade) object;
        if ((this.codUnidade == null && other.codUnidade != null) || (this.codUnidade != null && !this.codUnidade.equals(other.codUnidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.Unidade[codUnidade=" + codUnidade + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
