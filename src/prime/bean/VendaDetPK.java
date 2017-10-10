/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prime.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrador
 */
@Embeddable
public class VendaDetPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COD_VENDA_CAB")
    private int codVendaCab;
    @Basic(optional = false)
    @Column(name = "COD_PRODUTO")
    private String codProduto;

    public VendaDetPK() {
    }

    public VendaDetPK(int codVendaCab, String codProduto) {
        this.codVendaCab = codVendaCab;
        this.codProduto = codProduto;
    }

    public int getCodVendaCab() {
        return codVendaCab;
    }

    public void setCodVendaCab(int codVendaCab) {
        this.codVendaCab = codVendaCab;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codVendaCab;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendaDetPK)) {
            return false;
        }
        VendaDetPK other = (VendaDetPK) object;
        if (this.codVendaCab != other.codVendaCab) {
            return false;
        }
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.VendaDetPK[codVendaCab=" + codVendaCab + ", codProduto=" + codProduto + "]";
    }

}
