package br.com.ceolato.budget.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ceolato.budget.entities.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {

}
