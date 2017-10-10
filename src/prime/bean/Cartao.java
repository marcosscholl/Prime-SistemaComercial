/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prime.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "cartao", schema = "")
@NamedQueries({@NamedQuery(name = "Cartao.findByCodCartao", query = "SELECT c FROM Cartao c WHERE c.codCartao = :codCartao"), @NamedQuery(name = "Cartao.findByNomeCartao", query = "SELECT c FROM Cartao c WHERE c.nomeCartao = :nomeCartao"), @NamedQuery(name = "Cartao.findByTaxaCartao", query = "SELECT c FROM Cartao c WHERE c.taxaCartao = :taxaCartao")})
public class Cartao implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "COD_CARTAO", nullable = false)
    private Integer codCartao;
    @Column(name = "NOME_CARTAO")
    private String nomeCartao;
    @Column(name = "TAXA_CARTAO")
    private Double taxaCartao;

    public Cartao() {
    }

    public Cartao(Integer codCartao) {
        this.codCartao = codCartao;
    }

    public Integer getCodCartao() {
        return codCartao;
    }

    public void setCodCartao(Integer codCartao) {
        Integer oldCodCartao = this.codCartao;
        this.codCartao = codCartao;
        changeSupport.firePropertyChange("codCartao", oldCodCartao, codCartao);
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        String oldNomeCartao = this.nomeCartao;
        this.nomeCartao = nomeCartao;
        changeSupport.firePropertyChange("nomeCartao", oldNomeCartao, nomeCartao);
    }

    public Double getTaxaCartao() {
        return taxaCartao;
    }

    public void setTaxaCartao(Double taxaCartao) {
        Double oldTaxaCartao = this.taxaCartao;
        this.taxaCartao = taxaCartao;
        changeSupport.firePropertyChange("taxaCartao", oldTaxaCartao, taxaCartao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCartao != null ? codCartao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartao)) {
            return false;
        }
        Cartao other = (Cartao) object;
        if ((this.codCartao == null && other.codCartao != null) || (this.codCartao != null && !this.codCartao.equals(other.codCartao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.Cartao[codCartao=" + codCartao + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

}
