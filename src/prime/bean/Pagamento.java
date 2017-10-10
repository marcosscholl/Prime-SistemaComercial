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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "pagamento", catalog = "siscomjava", schema = "")
@NamedQueries
({
    @NamedQuery(name = "Pagamento.findByCodPagamento", query = "SELECT p FROM Pagamento p WHERE p.codPagamento = :codPagamento"), 
    @NamedQuery(name = "Pagamento.findByCodPlanoConta", query = "SELECT p FROM Pagamento p WHERE p.codPlanoConta = :codPlanoConta"), 
    @NamedQuery(name = "Pagamento.findByCodTipoPgto", query = "SELECT p FROM Pagamento p WHERE p.codTipoPgto = :codTipoPgto"), 
    @NamedQuery(name = "Pagamento.findByCodBanco", query = "SELECT p FROM Pagamento p WHERE p.codBanco = :codBanco"), 
    @NamedQuery(name = "Pagamento.findByCodFornecedor", query = "SELECT p FROM Pagamento p WHERE p.codFornecedor = :codFornecedor"), 
    @NamedQuery(name = "Pagamento.findByNumDocPagamento", query = "SELECT p FROM Pagamento p WHERE p.numDocPagamento = :numDocPagamento"), 
    @NamedQuery(name = "Pagamento.findByVlrTotalPagamento", query = "SELECT p FROM Pagamento p WHERE p.vlrTotalPagamento = :vlrTotalPagamento"), 
    @NamedQuery(name = "Pagamento.findByVlrJuroPagamento", query = "SELECT p FROM Pagamento p WHERE p.vlrJuroPagamento = :vlrJuroPagamento"), 
    @NamedQuery(name = "Pagamento.findByVlrMultaPagamento", query = "SELECT p FROM Pagamento p WHERE p.vlrMultaPagamento = :vlrMultaPagamento"), 
    @NamedQuery(name = "Pagamento.findByVlrDescontoPagamento", query = "SELECT p FROM Pagamento p WHERE p.vlrDescontoPagamento = :vlrDescontoPagamento"), 
    @NamedQuery(name = "Pagamento.findByVlrPagoPagamento", query = "SELECT p FROM Pagamento p WHERE p.vlrPagoPagamento = :vlrPagoPagamento"), 
    @NamedQuery(name = "Pagamento.findByNumChequePagamento", query = "SELECT p FROM Pagamento p WHERE p.numChequePagamento = :numChequePagamento"), 
    @NamedQuery(name = "Pagamento.findByNominalPagamento", query = "SELECT p FROM Pagamento p WHERE p.nominalPagamento = :nominalPagamento"), 
    @NamedQuery(name = "Pagamento.findByEmissaoPagamento", query = "SELECT p FROM Pagamento p WHERE p.emissaoPagamento = :emissaoPagamento"), 
    @NamedQuery(name = "Pagamento.findByLancamentoPagamento", query = "SELECT p FROM Pagamento p WHERE p.lancamentoPagamento = :lancamentoPagamento"), 
    @NamedQuery(name = "Pagamento.findByVencimentoPagamento", query = "SELECT p FROM Pagamento p WHERE p.vencimentoPagamento = :vencimentoPagamento"), 
    @NamedQuery(name = "Pagamento.findByDataPagamento", query = "SELECT p FROM Pagamento p WHERE p.dataPagamento = :dataPagamento"), 
    @NamedQuery(name = "Pagamento.findByDataChequePagamento", query = "SELECT p FROM Pagamento p WHERE p.dataChequePagamento = :dataChequePagamento"),
    @NamedQuery(name = "Pagamento.findBetweenVencimento", query = "SELECT p FROM Pagamento p WHERE p.vencimentoPagamento BETWEEN :dataIni AND :dataFim"),
    @NamedQuery(name = "Pagamento.pagas",  query = "SELECT p FROM Pagamento p WHERE p.dataPagamento is not null and p.vencimentoPagamento BETWEEN :dataIni AND :dataFim"),
    @NamedQuery(name = "Pagamento.apagar", query = "SELECT p FROM Pagamento p WHERE p.dataPagamento is null and p.vencimentoPagamento BETWEEN :dataIni AND :dataFim")
})
public class Pagamento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "COD_PAGAMENTO", nullable = false)
    private Integer codPagamento;
    @Column(name = "COD_PLANO_CONTA")
    private Integer codPlanoConta;
    @Column(name = "COD_TIPO_PGTO")
    private Integer codTipoPgto;
    @Column(name = "COD_BANCO")
    private Integer codBanco;
    @Column(name = "COD_FORNECEDOR")
    private Integer codFornecedor;
    @Column(name = "NUM_DOC_PAGAMENTO")
    private String numDocPagamento;
    @Column(name = "VLR_TOTAL_PAGAMENTO")
    private Double vlrTotalPagamento;
    @Column(name = "VLR_JURO_PAGAMENTO")
    private Double vlrJuroPagamento;
    @Column(name = "VLR_MULTA_PAGAMENTO")
    private Double vlrMultaPagamento;
    @Column(name = "VLR_DESCONTO_PAGAMENTO")
    private Double vlrDescontoPagamento;
    @Column(name = "VLR_PAGO_PAGAMENTO")
    private Double vlrPagoPagamento;
    @Column(name = "NUM_CHEQUE_PAGAMENTO")
    private Integer numChequePagamento;
    @Column(name = "NOMINAL_PAGAMENTO")
    private String nominalPagamento;
    @Column(name = "EMISSAO_PAGAMENTO")
    @Temporal(TemporalType.DATE)
    private Date emissaoPagamento;
    @Column(name = "LANCAMENTO_PAGAMENTO")
    @Temporal(TemporalType.DATE)
    private Date lancamentoPagamento;
    @Column(name = "VENCIMENTO_PAGAMENTO")
    @Temporal(TemporalType.DATE)
    private Date vencimentoPagamento;
    @Column(name = "DATA_PAGAMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @Column(name = "DATA_CHEQUE_PAGAMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataChequePagamento;

    public Pagamento() {
    }

    public Pagamento(Integer codPagamento) {
        this.codPagamento = codPagamento;
    }

    public Integer getCodPagamento() {
        return codPagamento;
    }

    public void setCodPagamento(Integer codPagamento) {
        Integer oldCodPagamento = this.codPagamento;
        this.codPagamento = codPagamento;
        changeSupport.firePropertyChange("codPagamento", oldCodPagamento, codPagamento);
    }

    public Integer getCodPlanoConta() {
        return codPlanoConta;
    }

    public void setCodPlanoConta(Integer codPlanoConta) {
        Integer oldCodPlanoConta = this.codPlanoConta;
        this.codPlanoConta = codPlanoConta;
        changeSupport.firePropertyChange("codPlanoConta", oldCodPlanoConta, codPlanoConta);
    }

    public Integer getCodTipoPgto() {
        return codTipoPgto;
    }

    public void setCodTipoPgto(Integer codTipoPgto) {
        Integer oldCodTipoPgto = this.codTipoPgto;
        this.codTipoPgto = codTipoPgto;
        changeSupport.firePropertyChange("codTipoPgto", oldCodTipoPgto, codTipoPgto);
    }

    public Integer getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(Integer codBanco) {
        Integer oldCodBanco = this.codBanco;
        this.codBanco = codBanco;
        changeSupport.firePropertyChange("codBanco", oldCodBanco, codBanco);
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        Integer oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    public String getNumDocPagamento() {
        return numDocPagamento;
    }

    public void setNumDocPagamento(String numDocPagamento) {
        String oldNumDocPagamento = this.numDocPagamento;
        this.numDocPagamento = numDocPagamento;
        changeSupport.firePropertyChange("numDocPagamento", oldNumDocPagamento, numDocPagamento);
    }

    public Double getVlrTotalPagamento() {
        return vlrTotalPagamento;
    }

    public void setVlrTotalPagamento(Double vlrTotalPagamento) {
        Double oldVlrTotalPagamento = this.vlrTotalPagamento;
        this.vlrTotalPagamento = vlrTotalPagamento;
        changeSupport.firePropertyChange("vlrTotalPagamento", oldVlrTotalPagamento, vlrTotalPagamento);
    }

    public Double getVlrJuroPagamento() {
        return vlrJuroPagamento;
    }

    public void setVlrJuroPagamento(Double vlrJuroPagamento) {
        Double oldVlrJuroPagamento = this.vlrJuroPagamento;
        this.vlrJuroPagamento = vlrJuroPagamento;
        changeSupport.firePropertyChange("vlrJuroPagamento", oldVlrJuroPagamento, vlrJuroPagamento);
    }

    public Double getVlrMultaPagamento() {
        return vlrMultaPagamento;
    }

    public void setVlrMultaPagamento(Double vlrMultaPagamento) {
        Double oldVlrMultaPagamento = this.vlrMultaPagamento;
        this.vlrMultaPagamento = vlrMultaPagamento;
        changeSupport.firePropertyChange("vlrMultaPagamento", oldVlrMultaPagamento, vlrMultaPagamento);
    }

    public Double getVlrDescontoPagamento() {
        return vlrDescontoPagamento;
    }

    public void setVlrDescontoPagamento(Double vlrDescontoPagamento) {
        Double oldVlrDescontoPagamento = this.vlrDescontoPagamento;
        this.vlrDescontoPagamento = vlrDescontoPagamento;
        changeSupport.firePropertyChange("vlrDescontoPagamento", oldVlrDescontoPagamento, vlrDescontoPagamento);
    }

    public Double getVlrPagoPagamento() {
        return vlrPagoPagamento;
    }

    public void setVlrPagoPagamento(Double vlrPagoPagamento) {
        Double oldVlrPagoPagamento = this.vlrPagoPagamento;
        this.vlrPagoPagamento = vlrPagoPagamento;
        changeSupport.firePropertyChange("vlrPagoPagamento", oldVlrPagoPagamento, vlrPagoPagamento);
    }

    public Integer getNumChequePagamento() {
        return numChequePagamento;
    }

    public void setNumChequePagamento(Integer numChequePagamento) {
        Integer oldNumChequePagamento = this.numChequePagamento;
        this.numChequePagamento = numChequePagamento;
        changeSupport.firePropertyChange("numChequePagamento", oldNumChequePagamento, numChequePagamento);
    }

    public String getNominalPagamento() {
        return nominalPagamento;
    }

    public void setNominalPagamento(String nominalPagamento) {
        String oldNominalPagamento = this.nominalPagamento;
        this.nominalPagamento = nominalPagamento;
        changeSupport.firePropertyChange("nominalPagamento", oldNominalPagamento, nominalPagamento);
    }

    public Date getEmissaoPagamento() {
        return emissaoPagamento;
    }

    public void setEmissaoPagamento(Date emissaoPagamento) {
        Date oldEmissaoPagamento = this.emissaoPagamento;
        this.emissaoPagamento = emissaoPagamento;
        changeSupport.firePropertyChange("emissaoPagamento", oldEmissaoPagamento, emissaoPagamento);
    }

    public Date getLancamentoPagamento() {
        return lancamentoPagamento;
    }

    public void setLancamentoPagamento(Date lancamentoPagamento) {
        Date oldLancamentoPagamento = this.lancamentoPagamento;
        this.lancamentoPagamento = lancamentoPagamento;
        changeSupport.firePropertyChange("lancamentoPagamento", oldLancamentoPagamento, lancamentoPagamento);
    }

    public Date getVencimentoPagamento() {
        return vencimentoPagamento;
    }

    public void setVencimentoPagamento(Date vencimentoPagamento) {
        Date oldVencimentoPagamento = this.vencimentoPagamento;
        this.vencimentoPagamento = vencimentoPagamento;
        changeSupport.firePropertyChange("vencimentoPagamento", oldVencimentoPagamento, vencimentoPagamento);
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        Date oldDataPagamento = this.dataPagamento;
        this.dataPagamento = dataPagamento;
        changeSupport.firePropertyChange("dataPagamento", oldDataPagamento, dataPagamento);
    }

    public Date getDataChequePagamento() {
        return dataChequePagamento;
    }

    public void setDataChequePagamento(Date dataChequePagamento) {
        Date oldDataChequePagamento = this.dataChequePagamento;
        this.dataChequePagamento = dataChequePagamento;
        changeSupport.firePropertyChange("dataChequePagamento", oldDataChequePagamento, dataChequePagamento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPagamento != null ? codPagamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagamento)) {
            return false;
        }
        Pagamento other = (Pagamento) object;
        if ((this.codPagamento == null && other.codPagamento != null) || (this.codPagamento != null && !this.codPagamento.equals(other.codPagamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.financeiro.Pagamento[codPagamento=" + codPagamento + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
