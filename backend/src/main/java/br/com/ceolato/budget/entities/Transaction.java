package br.com.ceolato.budget.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_TRANSACTION")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTransaction;
	
	@ManyToOne
	@JoinColumn(name = "id_account")
	private Account account;
	
	private TypeEnum txType;
	private LocalDate dtDate;
	private String txDescription;
	private long qtItemAmount;
	private BigDecimal vlUnitAmount;
	private BigDecimal vlTotalAmount;
	private String txTag;
	
	public Long getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(Long idTransaction) {
		this.idTransaction = idTransaction;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public TypeEnum getTxType() {
		return txType;
	}
	public void setTxType(TypeEnum txType) {
		this.txType = txType;
	}
	public LocalDate getDtDate() {
		return dtDate;
	}
	public void setDtDate(LocalDate dtDate) {
		this.dtDate = dtDate;
	}
	public String getTxDescription() {
		return txDescription;
	}
	public void setTxDescription(String txDescription) {
		this.txDescription = txDescription;
	}
	public long getQtItemAmount() {
		return qtItemAmount;
	}
	public void setQtItemAmount(long qtItemAmount) {
		this.qtItemAmount = qtItemAmount;
	}
	public BigDecimal getVlUnitAmount() {
		return vlUnitAmount;
	}
	public void setVlUnitAmount(BigDecimal vlUnitAmount) {
		this.vlUnitAmount = vlUnitAmount;
	}
	public BigDecimal getVlTotalAmount() {
		return vlTotalAmount;
	}
	public void setVlTotalAmount(BigDecimal vlTotalAmount) {
		this.vlTotalAmount = vlTotalAmount;
	}
	public String getTxTag() {
		return txTag;
	}
	public void setTxTag(String txTag) {
		this.txTag = txTag;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idTransaction);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(idTransaction, other.idTransaction);
	}
	
	
}
