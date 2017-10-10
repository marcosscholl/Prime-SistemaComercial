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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "cliente_endereco")
@NamedQueries({@NamedQuery(name = "ClienteEndereco.findByCodEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.codEndereco = :codEndereco"), @NamedQuery(name = "ClienteEndereco.findByLogradouroEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.logradouroEndereco = :logradouroEndereco"), @NamedQuery(name = "ClienteEndereco.findByComplementoEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.complementoEndereco = :complementoEndereco"), @NamedQuery(name = "ClienteEndereco.findByCepEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.cepEndereco = :cepEndereco"), @NamedQuery(name = "ClienteEndereco.findByBairroEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.bairroEndereco = :bairroEndereco"), @NamedQuery(name = "ClienteEndereco.findByCidadeEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.cidadeEndereco = :cidadeEndereco"), @NamedQuery(name = "ClienteEndereco.findByUfEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.ufEndereco = :ufEndereco")})
public class ClienteEndereco implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "COD_ENDERECO", nullable = false)
    private Integer codEndereco;
    @Column(name = "LOGRADOURO_ENDERECO")
    private String logradouroEndereco;
    @Column(name = "COMPLEMENTO_ENDERECO")
    private String complementoEndereco;
    @Column(name = "CEP_ENDERECO")
    private String cepEndereco;
    @Column(name = "BAIRRO_ENDERECO")
    private String bairroEndereco;
    @Column(name = "CIDADE_ENDERECO")
    private String cidadeEndereco;
    @Column(name = "UF_ENDERECO")
    private String ufEndereco;
    @JoinColumn(name = "COD_CLIENTE", referencedColumnName = "COD_CLIENTE")
    @ManyToOne
    private Cliente codCliente;

    public ClienteEndereco() {
    }

    public ClienteEndereco(Integer codEndereco) {
        this.codEndereco = codEndereco;
    }

    public Integer getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(Integer codEndereco) {
        Integer oldCodEndereco = this.codEndereco;
        this.codEndereco = codEndereco;
        changeSupport.firePropertyChange("codEndereco", oldCodEndereco, codEndereco);
    }

    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        String oldLogradouroEndereco = this.logradouroEndereco;
        this.logradouroEndereco = logradouroEndereco;
        changeSupport.firePropertyChange("logradouroEndereco", oldLogradouroEndereco, logradouroEndereco);
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        String oldComplementoEndereco = this.complementoEndereco;
        this.complementoEndereco = complementoEndereco;
        changeSupport.firePropertyChange("complementoEndereco", oldComplementoEndereco, complementoEndereco);
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        String oldCepEndereco = this.cepEndereco;
        this.cepEndereco = cepEndereco;
        changeSupport.firePropertyChange("cepEndereco", oldCepEndereco, cepEndereco);
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        String oldBairroEndereco = this.bairroEndereco;
        this.bairroEndereco = bairroEndereco;
        changeSupport.firePropertyChange("bairroEndereco", oldBairroEndereco, bairroEndereco);
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        String oldCidadeEndereco = this.cidadeEndereco;
        this.cidadeEndereco = cidadeEndereco;
        changeSupport.firePropertyChange("cidadeEndereco", oldCidadeEndereco, cidadeEndereco);
    }

    public String getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(String ufEndereco) {
        String oldUfEndereco = this.ufEndereco;
        this.ufEndereco = ufEndereco;
        changeSupport.firePropertyChange("ufEndereco", oldUfEndereco, ufEndereco);
    }

    public Cliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Cliente codCliente) {
        Cliente oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEndereco != null ? codEndereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteEndereco)) {
            return false;
        }
        ClienteEndereco other = (ClienteEndereco) object;
        if ((this.codEndereco == null && other.codEndereco != null) || (this.codEndereco != null && !this.codEndereco.equals(other.codEndereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.ClienteEndereco[codEndereco=" + codEndereco + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

}
