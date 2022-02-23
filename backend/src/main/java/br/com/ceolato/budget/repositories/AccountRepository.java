package br.com.ceolato.budget.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ceolato.budget.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
