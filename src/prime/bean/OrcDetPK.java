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
public class OrcDetPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COD_ORC_CAB")
    private int codOrcCab;
    @Basic(optional = false)
    @Column(name = "COD_PRODUTO")
    private String codProduto;

    public OrcDetPK() {
    }

    public OrcDetPK(int codOrcCab, String codProduto) {
        this.codOrcCab = codOrcCab;
        this.codProduto = codProduto;
    }

    public int getCodOrcCab() {
        return codOrcCab;
    }

    public void setCodOrcCab(int codOrcCab) {
        this.codOrcCab = codOrcCab;
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
        hash += (int) codOrcCab;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrcDetPK)) {
            return false;
        }
        OrcDetPK other = (OrcDetPK) object;
        if (this.codOrcCab != other.codOrcCab) {
            return false;
        }
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.OrcDetPK[codOrcCab=" + codOrcCab + ", codProduto=" + codProduto + "]";
    }

}
