/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prime.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Albert
 */
@Entity
@Table(name = "recebimento", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "Recebimento.findByCodRecebimento", query = "SELECT r FROM Recebimento r WHERE r.codRecebimento = :codRecebimento"), @NamedQuery(name = "Recebimento.findByCodBanco", query = "SELECT r FROM Recebimento r WHERE r.codBanco = :codBanco"), @NamedQuery(name = "Recebimento.findByCodTipoPgto", query = "SELECT r FROM Recebimento r WHERE r.codTipoPgto = :codTipoPgto"), @NamedQuery(name = "Recebimento.findByCodCliente", query = "SELECT r FROM Recebimento r WHERE r.codCliente = :codCliente"), @NamedQuery(name = "Recebimento.findByNumDocumento", query = "SELECT r FROM Recebimento r WHERE r.numDocumento = :numDocumento"), @NamedQuery(name = "Recebimento.findByVlrTotalRecebimento", query = "SELECT r FROM Recebimento r WHERE r.vlrTotalRecebimento = :vlrTotalRecebimento"), @NamedQuery(name = "Recebimento.findByVlrJuroRecebimento", query = "SELECT r FROM Recebimento r WHERE r.vlrJuroRecebimento = :vlrJuroRecebimento"), @NamedQuery(name = "Recebimento.findByVlrMultaRecebimento", query = "SELECT r FROM Recebimento r WHERE r.vlrMultaRecebimento = :vlrMultaRecebimento"), @NamedQuery(name = "Recebimento.findByVlrDescontoRecebimento", query = "SELECT r FROM Recebimento r WHERE r.vlrDescontoRecebimento = :vlrDescontoRecebimento"), @NamedQuery(name = "Recebimento.findByVlrRecebido", query = "SELECT r FROM Recebimento r WHERE r.vlrRecebido = :vlrRecebido"), @NamedQuery(name = "Recebimento.findByEmissaoRecebimento", query = "SELECT r FROM Recebimento r WHERE r.emissaoRecebimento = :emissaoRecebimento"), @NamedQuery(name = "Recebimento.findByLancamentoRecebimento", query = "SELECT r FROM Recebimento r WHERE r.lancamentoRecebimento = :lancamentoRecebimento"), @NamedQuery(name = "Recebimento.findByVencimentoRecebimento", query = "SELECT r FROM Recebimento r WHERE r.vencimentoRecebimento = :vencimentoRecebimento"), @NamedQuery(name = "Recebimento.findByDataRecebimento", query = "SELECT r FROM Recebimento r WHERE r.dataRecebimento = :dataRecebimento")})
public class Recebimento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_RECEBIMENTO", nullable = false)
    private Integer codRecebimento;
    @Column(name = "COD_BANCO")
    private Integer codBanco;
    @Column(name = "COD_TIPO_PGTO")
    private Integer codTipoPgto;
    @Column(name = "COD_CLIENTE")
    private Integer codCliente;
    @Column(name = "NUM_DOCUMENTO")
    private String numDocumento;
    @Column(name = "VLR_TOTAL_RECEBIMENTO")
    private Double vlrTotalRecebimento;
    @Column(name = "VLR_JURO_RECEBIMENTO")
    private Double vlrJuroRecebimento;
    @Column(name = "VLR_MULTA_RECEBIMENTO")
    private Double vlrMultaRecebimento;
    @Column(name = "VLR_DESCONTO_RECEBIMENTO")
    private Double vlrDescontoRecebimento;
    @Column(name = "VLR_RECEBIDO")
    private Double vlrRecebido;
    @Column(name = "EMISSAO_RECEBIMENTO")
    @Temporal(TemporalType.DATE)
    private Date emissaoRecebimento;
    @Column(name = "LANCAMENTO_RECEBIMENTO")
    @Temporal(TemporalType.DATE)
    private Date lancamentoRecebimento;
    @Column(name = "VENCIMENTO_RECEBIMENTO")
    @Temporal(TemporalType.DATE)
    private Date vencimentoRecebimento;
    @Column(name = "DATA_RECEBIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataRecebimento;

    public Recebimento() {
    }

    public Recebimento(Integer codRecebimento) {
        this.codRecebimento = codRecebimento;
    }

    public Integer getCodRecebimento() {
        return codRecebimento;
    }

    public void setCodRecebimento(Integer codRecebimento) {
        Integer oldCodRecebimento = this.codRecebimento;
        this.codRecebimento = codRecebimento;
        changeSupport.firePropertyChange("codRecebimento", oldCodRecebimento, codRecebimento);
    }

    public Integer getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(Integer codBanco) {
        Integer oldCodBanco = this.codBanco;
        this.codBanco = codBanco;
        changeSupport.firePropertyChange("codBanco", oldCodBanco, codBanco);
    }

    public Integer getCodTipoPgto() {
        return codTipoPgto;
    }

    public void setCodTipoPgto(Integer codTipoPgto) {
        Integer oldCodTipoPgto = this.codTipoPgto;
        this.codTipoPgto = codTipoPgto;
        changeSupport.firePropertyChange("codTipoPgto", oldCodTipoPgto, codTipoPgto);
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        Integer oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        String oldNumDocumento = this.numDocumento;
        this.numDocumento = numDocumento;
        changeSupport.firePropertyChange("numDocumento", oldNumDocumento, numDocumento);
    }

    public Double getVlrTotalRecebimento() {
        return vlrTotalRecebimento;
    }

    public void setVlrTotalRecebimento(Double vlrTotalRecebimento) {
        Double oldVlrTotalRecebimento = this.vlrTotalRecebimento;
        this.vlrTotalRecebimento = vlrTotalRecebimento;
        changeSupport.firePropertyChange("vlrTotalRecebimento", oldVlrTotalRecebimento, vlrTotalRecebimento);
    }

    public Double getVlrJuroRecebimento() {
        return vlrJuroRecebimento;
    }

    public void setVlrJuroRecebimento(Double vlrJuroRecebimento) {
        Double oldVlrJuroRecebimento = this.vlrJuroRecebimento;
        this.vlrJuroRecebimento = vlrJuroRecebimento;
        changeSupport.firePropertyChange("vlrJuroRecebimento", oldVlrJuroRecebimento, vlrJuroRecebimento);
    }

    public Double getVlrMultaRecebimento() {
        return vlrMultaRecebimento;
    }

    public void setVlrMultaRecebimento(Double vlrMultaRecebimento) {
        Double oldVlrMultaRecebimento = this.vlrMultaRecebimento;
        this.vlrMultaRecebimento = vlrMultaRecebimento;
        changeSupport.firePropertyChange("vlrMultaRecebimento", oldVlrMultaRecebimento, vlrMultaRecebimento);
    }

    public Double getVlrDescontoRecebimento() {
        return vlrDescontoRecebimento;
    }

    public void setVlrDescontoRecebimento(Double vlrDescontoRecebimento) {
        Double oldVlrDescontoRecebimento = this.vlrDescontoRecebimento;
        this.vlrDescontoRecebimento = vlrDescontoRecebimento;
        changeSupport.firePropertyChange("vlrDescontoRecebimento", oldVlrDescontoRecebimento, vlrDescontoRecebimento);
    }

    public Double getVlrRecebido() {
        return vlrRecebido;
    }

    public void setVlrRecebido(Double vlrRecebido) {
        Double oldVlrRecebido = this.vlrRecebido;
        this.vlrRecebido = vlrRecebido;
        changeSupport.firePropertyChange("vlrRecebido", oldVlrRecebido, vlrRecebido);
    }

    public Date getEmissaoRecebimento() {
        return emissaoRecebimento;
    }

    public void setEmissaoRecebimento(Date emissaoRecebimento) {
        Date oldEmissaoRecebimento = this.emissaoRecebimento;
        this.emissaoRecebimento = emissaoRecebimento;
        changeSupport.firePropertyChange("emissaoRecebimento", oldEmissaoRecebimento, emissaoRecebimento);
    }

    public Date getLancamentoRecebimento() {
        return lancamentoRecebimento;
    }

    public void setLancamentoRecebimento(Date lancamentoRecebimento) {
        Date oldLancamentoRecebimento = this.lancamentoRecebimento;
        this.lancamentoRecebimento = lancamentoRecebimento;
        changeSupport.firePropertyChange("lancamentoRecebimento", oldLancamentoRecebimento, lancamentoRecebimento);
    }

    public Date getVencimentoRecebimento() {
        return vencimentoRecebimento;
    }

    public void setVencimentoRecebimento(Date vencimentoRecebimento) {
        Date oldVencimentoRecebimento = this.vencimentoRecebimento;
        this.vencimentoRecebimento = vencimentoRecebimento;
        changeSupport.firePropertyChange("vencimentoRecebimento", oldVencimentoRecebimento, vencimentoRecebimento);
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        Date oldDataRecebimento = this.dataRecebimento;
        this.dataRecebimento = dataRecebimento;
        changeSupport.firePropertyChange("dataRecebimento", oldDataRecebimento, dataRecebimento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRecebimento != null ? codRecebimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recebimento)) {
            return false;
        }
        Recebimento other = (Recebimento) object;
        if ((this.codRecebimento == null && other.codRecebimento != null) || (this.codRecebimento != null && !this.codRecebimento.equals(other.codRecebimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.financeiro.Recebimento[codRecebimento=" + codRecebimento + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
