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
@Table(name = "fornecedor", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"), @NamedQuery(name = "Fornecedor.findByCodFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.codFornecedor = :codFornecedor"), @NamedQuery(name = "Fornecedor.findByNomeFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.nomeFornecedor = :nomeFornecedor"), @NamedQuery(name = "Fornecedor.findByCpfFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cpfFornecedor = :cpfFornecedor"), @NamedQuery(name = "Fornecedor.findByRgFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.rgFornecedor = :rgFornecedor"), @NamedQuery(name = "Fornecedor.findByOrgaoRgFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.orgaoRgFornecedor = :orgaoRgFornecedor"), @NamedQuery(name = "Fornecedor.findByCnpjFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cnpjFornecedor = :cnpjFornecedor"), @NamedQuery(name = "Fornecedor.findByTipoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.tipoFornecedor = :tipoFornecedor"), @NamedQuery(name = "Fornecedor.findByEnderecoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.enderecoFornecedor = :enderecoFornecedor"), @NamedQuery(name = "Fornecedor.findByBairroFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.bairroFornecedor = :bairroFornecedor"), @NamedQuery(name = "Fornecedor.findByCidadeFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cidadeFornecedor = :cidadeFornecedor"), @NamedQuery(name = "Fornecedor.findByUfFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.ufFornecedor = :ufFornecedor"), @NamedQuery(name = "Fornecedor.findByCepFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cepFornecedor = :cepFornecedor"), @NamedQuery(name = "Fornecedor.findByEmailFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.emailFornecedor = :emailFornecedor"), @NamedQuery(name = "Fornecedor.findBySiteFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.siteFornecedor = :siteFornecedor"), @NamedQuery(name = "Fornecedor.findByFoneFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.foneFornecedor = :foneFornecedor"), @NamedQuery(name = "Fornecedor.findByCelularFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.celularFornecedor = :celularFornecedor"), @NamedQuery(name = "Fornecedor.findByFaxFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.faxFornecedor = :faxFornecedor"), @NamedQuery(name = "Fornecedor.findByContatoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.contatoFornecedor = :contatoFornecedor")})
public class Fornecedor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)   
    @Basic(optional = false)
    @Column(name = "COD_FORNECEDOR")
    private Integer codFornecedor;
    @Column(name = "NOME_FORNECEDOR")
    private String nomeFornecedor;
    @Column(name = "CPF_FORNECEDOR")
    private String cpfFornecedor;
    @Column(name = "RG_FORNECEDOR")
    private String rgFornecedor;
    @Column(name = "ORGAO_RG_FORNECEDOR")
    private String orgaoRgFornecedor;
    @Column(name = "CNPJ_FORNECEDOR")
    private String cnpjFornecedor;
    @Column(name = "TIPO_FORNECEDOR")
    private Character tipoFornecedor;
    @Column(name = "ENDERECO_FORNECEDOR")
    private String enderecoFornecedor;
    @Column(name = "BAIRRO_FORNECEDOR")
    private String bairroFornecedor;
    @Column(name = "CIDADE_FORNECEDOR")
    private String cidadeFornecedor;
    @Column(name = "UF_FORNECEDOR")
    private String ufFornecedor;
    @Column(name = "CEP_FORNECEDOR")
    private String cepFornecedor;
    @Column(name = "EMAIL_FORNECEDOR")
    private String emailFornecedor;
    @Column(name = "SITE_FORNECEDOR")
    private String siteFornecedor;
    @Column(name = "FONE_FORNECEDOR")
    private String foneFornecedor;
    @Column(name = "CELULAR_FORNECEDOR")
    private String celularFornecedor;
    @Column(name = "FAX_FORNECEDOR")
    private String faxFornecedor;
    @Column(name = "CONTATO_FORNECEDOR")
    private String contatoFornecedor;

    public Fornecedor() {
    }

    public Fornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        Integer oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        String oldNomeFornecedor = this.nomeFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        changeSupport.firePropertyChange("nomeFornecedor", oldNomeFornecedor, nomeFornecedor);
    }

    public String getCpfFornecedor() {
        return cpfFornecedor;
    }

    public void setCpfFornecedor(String cpfFornecedor) {
        String oldCpfFornecedor = this.cpfFornecedor;
        this.cpfFornecedor = cpfFornecedor;
        changeSupport.firePropertyChange("cpfFornecedor", oldCpfFornecedor, cpfFornecedor);
    }

    public String getRgFornecedor() {
        return rgFornecedor;
    }

    public void setRgFornecedor(String rgFornecedor) {
        String oldRgFornecedor = this.rgFornecedor;
        this.rgFornecedor = rgFornecedor;
        changeSupport.firePropertyChange("rgFornecedor", oldRgFornecedor, rgFornecedor);
    }

    public String getOrgaoRgFornecedor() {
        return orgaoRgFornecedor;
    }

    public void setOrgaoRgFornecedor(String orgaoRgFornecedor) {
        String oldOrgaoRgFornecedor = this.orgaoRgFornecedor;
        this.orgaoRgFornecedor = orgaoRgFornecedor;
        changeSupport.firePropertyChange("orgaoRgFornecedor", oldOrgaoRgFornecedor, orgaoRgFornecedor);
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        String oldCnpjFornecedor = this.cnpjFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        changeSupport.firePropertyChange("cnpjFornecedor", oldCnpjFornecedor, cnpjFornecedor);
    }

    public Character getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(Character tipoFornecedor) {
        Character oldTipoFornecedor = this.tipoFornecedor;
        this.tipoFornecedor = tipoFornecedor;
        changeSupport.firePropertyChange("tipoFornecedor", oldTipoFornecedor, tipoFornecedor);
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        String oldEnderecoFornecedor = this.enderecoFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        changeSupport.firePropertyChange("enderecoFornecedor", oldEnderecoFornecedor, enderecoFornecedor);
    }

    public String getBairroFornecedor() {
        return bairroFornecedor;
    }

    public void setBairroFornecedor(String bairroFornecedor) {
        String oldBairroFornecedor = this.bairroFornecedor;
        this.bairroFornecedor = bairroFornecedor;
        changeSupport.firePropertyChange("bairroFornecedor", oldBairroFornecedor, bairroFornecedor);
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        String oldCidadeFornecedor = this.cidadeFornecedor;
        this.cidadeFornecedor = cidadeFornecedor;
        changeSupport.firePropertyChange("cidadeFornecedor", oldCidadeFornecedor, cidadeFornecedor);
    }

    public String getUfFornecedor() {
        return ufFornecedor;
    }

    public void setUfFornecedor(String ufFornecedor) {
        String oldUfFornecedor = this.ufFornecedor;
        this.ufFornecedor = ufFornecedor;
        changeSupport.firePropertyChange("ufFornecedor", oldUfFornecedor, ufFornecedor);
    }

    public String getCepFornecedor() {
        return cepFornecedor;
    }

    public void setCepFornecedor(String cepFornecedor) {
        String oldCepFornecedor = this.cepFornecedor;
        this.cepFornecedor = cepFornecedor;
        changeSupport.firePropertyChange("cepFornecedor", oldCepFornecedor, cepFornecedor);
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        String oldEmailFornecedor = this.emailFornecedor;
        this.emailFornecedor = emailFornecedor;
        changeSupport.firePropertyChange("emailFornecedor", oldEmailFornecedor, emailFornecedor);
    }

    public String getSiteFornecedor() {
        return siteFornecedor;
    }

    public void setSiteFornecedor(String siteFornecedor) {
        String oldSiteFornecedor = this.siteFornecedor;
        this.siteFornecedor = siteFornecedor;
        changeSupport.firePropertyChange("siteFornecedor", oldSiteFornecedor, siteFornecedor);
    }

    public String getFoneFornecedor() {
        return foneFornecedor;
    }

    public void setFoneFornecedor(String foneFornecedor) {
        String oldFoneFornecedor = this.foneFornecedor;
        this.foneFornecedor = foneFornecedor;
        changeSupport.firePropertyChange("foneFornecedor", oldFoneFornecedor, foneFornecedor);
    }

    public String getCelularFornecedor() {
        return celularFornecedor;
    }

    public void setCelularFornecedor(String celularFornecedor) {
        String oldCelularFornecedor = this.celularFornecedor;
        this.celularFornecedor = celularFornecedor;
        changeSupport.firePropertyChange("celularFornecedor", oldCelularFornecedor, celularFornecedor);
    }

    public String getFaxFornecedor() {
        return faxFornecedor;
    }

    public void setFaxFornecedor(String faxFornecedor) {
        String oldFaxFornecedor = this.faxFornecedor;
        this.faxFornecedor = faxFornecedor;
        changeSupport.firePropertyChange("faxFornecedor", oldFaxFornecedor, faxFornecedor);
    }

    public String getContatoFornecedor() {
        return contatoFornecedor;
    }

    public void setContatoFornecedor(String contatoFornecedor) {
        String oldContatoFornecedor = this.contatoFornecedor;
        this.contatoFornecedor = contatoFornecedor;
        changeSupport.firePropertyChange("contatoFornecedor", oldContatoFornecedor, contatoFornecedor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFornecedor != null ? codFornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.codFornecedor == null && other.codFornecedor != null) || (this.codFornecedor != null && !this.codFornecedor.equals(other.codFornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.Fornecedor[codFornecedor=" + codFornecedor + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
