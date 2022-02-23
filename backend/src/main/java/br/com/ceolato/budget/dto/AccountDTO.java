package br.com.ceolato.budget.dto;

import java.util.List;

import br.com.ceolato.budget.entities.Budget;
import br.com.ceolato.budget.entities.Transaction;

public class AccountDTO {

	private Long idAccount;
	private Budget budget;
	private String txDescription;
	private List<Transaction> transactions;
	public Long getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}
	public Budget getBudget() {
		return budget;
	}
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	public String getTxDescription() {
		return txDescription;
	}
	public void setTxDescription(String txDescription) {
		this.txDescription = txDescription;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	
}
