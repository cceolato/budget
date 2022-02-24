package br.com.ceolato.budget.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_BUDGET")
public class Budget {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBudget;
	private String txDescription;
	private LocalDate dtStartDate;
	private LocalDate dtEndDate;
	
	@OneToMany(mappedBy = "budget")
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
	@Override
	public int hashCode() {
		return Objects.hash(idBudget);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Budget other = (Budget) obj;
		return Objects.equals(idBudget, other.idBudget);
	}
	
}
