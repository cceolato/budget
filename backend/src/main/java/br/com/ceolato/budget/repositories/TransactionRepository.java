package br.com.ceolato.budget.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ceolato.budget.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
