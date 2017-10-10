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
public class CotDetPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COD_COT_CAB")
    private int codCotCab;
    @Basic(optional = false)
    @Column(name = "COD_PRODUTO")
    private String codProduto;
    @Basic(optional = false)
    @Column(name = "COD_REQ_CAB")
    private int codReqCab;

    public CotDetPK() {
    }

    public CotDetPK(int codCotCab, String codProduto, int codReqCab) {
        this.codCotCab = codCotCab;
        this.codProduto = codProduto;
        this.codReqCab = codReqCab;
    }

    public int getCodCotCab() {
        return codCotCab;
    }

    public void setCodCotCab(int codCotCab) {
        this.codCotCab = codCotCab;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public int getCodReqCab() {
        return codReqCab;
    }

    public void setCodReqCab(int codReqCab) {
        this.codReqCab = codReqCab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codCotCab;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        hash += (int) codReqCab;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotDetPK)) {
            return false;
        }
        CotDetPK other = (CotDetPK) object;
        if (this.codCotCab != other.codCotCab) {
            return false;
        }
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        if (this.codReqCab != other.codReqCab) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.compras.CotDetPK[codCotCab=" + codCotCab + ", codProduto=" + codProduto + ", codReqCab=" + codReqCab + "]";
    }

}
