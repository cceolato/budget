package br.com.ceolato.budget.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.ceolato.budget.entities.Account;

@JsonInclude(Include.NON_EMPTY)
public class BudgetDTO {

	private Long idBudget;
	private String txDescription;
	private LocalDate dtStartDate;
	private LocalDate dtEndDate;
	private List<Account> accounts;
	
	public Long getIdBudget() {
		return idBudget;
	}
	public void setIdBudget(Long idBudget) {
		this.idBudget = idBudget;
	}
	public String getTxDescription() {
		return txDescription;
	}
	public void setTxDescription(String txDescription) {
		this.txDescription = txDescription;
	}
	public LocalDate getDtStartDate() {
		return dtStartDate;
	}
	public void setDtStartDate(LocalDate dtStartDate) {
		this.dtStartDate = dtStartDate;
	}
	public LocalDate getDtEndDate() {
		return dtEndDate;
	}
	public void setDtEndDate(LocalDate dtEndDate) {
		this.dtEndDate = dtEndDate;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}
