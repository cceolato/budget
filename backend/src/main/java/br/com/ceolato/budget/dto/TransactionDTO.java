package br.com.ceolato.budget.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.ceolato.budget.entities.Account;
import br.com.ceolato.budget.entities.TypeEnum;

public class TransactionDTO {

	private Long idTransaction;
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
	
}
