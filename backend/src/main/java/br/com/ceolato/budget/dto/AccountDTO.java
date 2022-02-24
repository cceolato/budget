package br.com.ceolato.budget.dto;

import java.util.List;

public class AccountDTO {

	private Long idAccount;
	private BudgetDTO budget;
	private String txDescription;
	private List<TransactionDTO> transactions;
	public Long getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}
	public BudgetDTO getBudgetDTO() {
		return budget;
	}
	public void setBudgetDTO(BudgetDTO budget) {
		this.budget = budget;
	}
	public String getTxDescription() {
		return txDescription;
	}
	public void setTxDescription(String txDescription) {
		this.txDescription = txDescription;
	}
	public List<TransactionDTO> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<TransactionDTO> transactions) {
		this.transactions = transactions;
	}

	
}
