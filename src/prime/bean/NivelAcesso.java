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
@Table(name = "nivel_acesso", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "NivelAcesso.findAll", query = "SELECT n FROM NivelAcesso n"),
@NamedQuery(name = "NivelAcesso.findByCodFunc", query = "SELECT n FROM NivelAcesso n WHERE n.codFunc = :codFunc"),
@NamedQuery(name = "NivelAcesso.findByNomeModulo", query = "SELECT n FROM NivelAcesso n WHERE n.nomeModulo = :nomeModulo"),
@NamedQuery(name = "NivelAcesso.verifique", query = "SELECT n FROM NivelAcesso n WHERE n.codFunc = :codFunc and n.nomeModulo = :nomeModulo"),
@NamedQuery(name = "NivelAcesso.findByCodigo", query = "SELECT n FROM NivelAcesso n WHERE n.codigo = :codigo")})
public class NivelAcesso implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "COD_FUNC")
    private Integer codFunc;
    @Column(name = "NOME_MODULO")
    private String nomeModulo;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;

    public NivelAcesso() {
    }

    public NivelAcesso(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(Integer codFunc) {
        Integer oldCodFunc = this.codFunc;
        this.codFunc = codFunc;
        changeSupport.firePropertyChange("codFunc", oldCodFunc, codFunc);
    }

    public String getNomeModulo() {
        return nomeModulo;
    }

    public void setNomeModulo(String nomeModulo) {
        String oldNomeModulo = this.nomeModulo;
        this.nomeModulo = nomeModulo;
        changeSupport.firePropertyChange("nomeModulo", oldNomeModulo, nomeModulo);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelAcesso)) {
            return false;
        }
        NivelAcesso other = (NivelAcesso) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.NivelAcesso[codigo=" + codigo + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
