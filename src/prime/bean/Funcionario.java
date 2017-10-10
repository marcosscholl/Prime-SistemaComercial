/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prime.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
//import java.util.Date;
import javax.persistence.Basic;
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
@Table(name = "funcionario", catalog = "siscomjava", schema = "")
//@NamedQueries({@NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"), @NamedQuery(name = "Funcionario.findByCodFuncionario", query = "SELECT f FROM Funcionario f WHERE f.codFuncionario = :codFuncionario"), @NamedQuery(name = "Funcionario.findByCodDepartamento", query = "SELECT f FROM Funcionario f WHERE f.codDepartamento = :codDepartamento"), @NamedQuery(name = "Funcionario.findByNomeFuncionario", query = "SELECT f FROM Funcionario f WHERE f.nomeFuncionario = :nomeFuncionario"), @NamedQuery(name = "Funcionario.findByFuncaoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.funcaoFuncionario = :funcaoFuncionario"), @NamedQuery(name = "Funcionario.findByLoginFuncionario", query = "SELECT f FROM Funcionario f WHERE f.loginFuncionario = :loginFuncionario"), @NamedQuery(name = "Funcionario.findBySenhaFuncionario", query = "SELECT f FROM Funcionario f WHERE f.senhaFuncionario = :senhaFuncionario"), @NamedQuery(name = "Funcionario.findByAdmissaoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.admissaoFuncionario = :admissaoFuncionario"), @NamedQuery(name = "Funcionario.findByAcessoTotal", query = "SELECT f FROM Funcionario f WHERE f.acessoTotal = :acessoTotal")})
  @NamedQueries({@NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"), 
  @NamedQuery(name = "Funcionario.findByCodFuncionario", query = "SELECT f FROM Funcionario f WHERE f.codFuncionario = :codFuncionario"),
  @NamedQuery(name = "Funcionario.findByCodDepartamento", query = "SELECT f FROM Funcionario f WHERE f.codDepartamento = :codDepartamento"),
  @NamedQuery(name = "Funcionario.findByNomeFuncionario", query = "SELECT f FROM Funcionario f WHERE f.nomeFuncionario = :nomeFuncionario"),
  @NamedQuery(name = "Funcionario.findByFuncaoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.funcaoFuncionario = :funcaoFuncionario"),
  @NamedQuery(name = "Funcionario.findByLoginFuncionario", query = "SELECT f FROM Funcionario f WHERE f.loginFuncionario = :loginFuncionario"),
  @NamedQuery(name = "Funcionario.findBySenhaFuncionario", query = "SELECT f FROM Funcionario f WHERE f.senhaFuncionario = :senhaFuncionario"),
  @NamedQuery(name = "Funcionario.findByAdmissaoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.admissaoFuncionario = :admissaoFuncionario"),

  @NamedQuery(name = "Funcionario.verificaLogin", query = "SELECT f FROM Funcionario f WHERE f.loginFuncionario = :loginFuncionario and f.senhaFuncionario = :senhaFuncionario"),

  @NamedQuery(name = "Funcionario.findByAcessoTotal", query = "SELECT f FROM Funcionario f WHERE f.acessoTotal = :acessoTotal")})

public class Funcionario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_FUNCIONARIO")
    private Integer codFuncionario;

    @JoinColumn(name = "COD_DEPARTAMENTO", referencedColumnName = "COD_DEPARTAMENTO")
    @ManyToOne
    private Departamento codDepartamento;

    

    @Column(name = "NOME_FUNCIONARIO")
    private String nomeFuncionario;
    @Column(name = "FUNCAO_FUNCIONARIO")
    private String funcaoFuncionario;
    @Column(name = "LOGIN_FUNCIONARIO")
    private String loginFuncionario;
    @Column(name = "SENHA_FUNCIONARIO")
    private String senhaFuncionario;
    @Column(name = "ADMISSAO_FUNCIONARIO")
   //@Temporal(TemporalType.DATE)
   // private Date admissaoFuncionario;
    private String admissaoFuncionario;
    @Column(name = "ACESSO_TOTAL")
    private Character acessoTotal;

    public Funcionario() {
    }

    public Funcionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        Integer oldCodFuncionario = this.codFuncionario;
        this.codFuncionario = codFuncionario;
        changeSupport.firePropertyChange("codFuncionario", oldCodFuncionario, codFuncionario);
    }

    public Departamento getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(Departamento codDepartamento) {
        Departamento oldCodDepartamento = this.codDepartamento;
        this.codDepartamento = codDepartamento;
        changeSupport.firePropertyChange("codDepartamento", oldCodDepartamento, codDepartamento);
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        String oldNomeFuncionario = this.nomeFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        changeSupport.firePropertyChange("nomeFuncionario", oldNomeFuncionario, nomeFuncionario);
    }

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        String oldFuncaoFuncionario = this.funcaoFuncionario;
        this.funcaoFuncionario = funcaoFuncionario;
        changeSupport.firePropertyChange("funcaoFuncionario", oldFuncaoFuncionario, funcaoFuncionario);
    }

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        String oldLoginFuncionario = this.loginFuncionario;
        this.loginFuncionario = loginFuncionario;
        changeSupport.firePropertyChange("loginFuncionario", oldLoginFuncionario, loginFuncionario);
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        String oldSenhaFuncionario = this.senhaFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        changeSupport.firePropertyChange("senhaFuncionario", oldSenhaFuncionario, senhaFuncionario);
    }

  //  public Date getAdmissaoFuncionario() {
  //      return admissaoFuncionario;
  //  }

      public String getAdmissaoFuncionario() {
        return admissaoFuncionario;
      }

    //public void setAdmissaoFuncionario(Date admissaoFuncionario) {
    //    Date oldAdmissaoFuncionario = this.admissaoFuncionario;
    //    this.admissaoFuncionario = admissaoFuncionario;
    //    changeSupport.firePropertyChange("admissaoFuncionario", oldAdmissaoFuncionario, admissaoFuncionario);
    //}

      public void setAdmissaoFuncionario(String admissaoFuncionario) {
        String oldAdmissaoFuncionario = this.admissaoFuncionario;
        this.admissaoFuncionario = admissaoFuncionario;
        changeSupport.firePropertyChange("admissaoFuncionario", oldAdmissaoFuncionario, admissaoFuncionario);
    }
    public Character getAcessoTotal() {
        return acessoTotal;
    }

    public void setAcessoTotal(Character acessoTotal) {
        Character oldAcessoTotal = this.acessoTotal;
        this.acessoTotal = acessoTotal;
        changeSupport.firePropertyChange("acessoTotal", oldAcessoTotal, acessoTotal);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFuncionario != null ? codFuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.codFuncionario == null && other.codFuncionario != null) || (this.codFuncionario != null && !this.codFuncionario.equals(other.codFuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.Funcionario[codFuncionario=" + codFuncionario + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
