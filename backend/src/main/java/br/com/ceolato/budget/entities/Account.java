package br.com.ceolato.budget.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ACCOUNT")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAccount;
	
	@ManyToOne
	@JoinColumn(name = "id_budget")
	private Budget budget;
	private String txDescription;

	@OneToMany(mappedBy = "account")
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

	@Override
	public int hashCode() {
		return Objects.hash(idAccount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(idAccount, other.idAccount);
	}
	
}
