package br.com.ceolato.budget.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ceolato.budget.dto.AccountDTO;
import br.com.ceolato.budget.dto.BudgetDTO;
import br.com.ceolato.budget.entities.Account;
import br.com.ceolato.budget.repositories.AccountRepository;
import br.com.ceolato.budget.services.exception.NotFoundException;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired 
	private BudgetService budgetService;
	
	@Autowired
	private ModelMapper mapper;
	
	public List<AccountDTO> list(long idBudget) {
		List<Account> accounts = accountRepository.findAllByIdBudget(idBudget);
		return mapper.map(accounts, new TypeToken<List<Account>>() {}.getType());
	}

	public AccountDTO find(long id) {
		Account account = accountRepository.findById(id).orElseThrow(
				() -> new NotFoundException("Account não encontrado!")); 
		return mapper.map(account, AccountDTO.class);
	}

	public AccountDTO save(Long idBudget, AccountDTO dto) {
		BudgetDTO budgetDTO = budgetService.find(idBudget);
		Account account;
		if(dto.getIdAccount() != null) {
			account = accountRepository.findById(dto.getIdAccount()).get(); 
		} else {
			account = new Account();
		}
		dto.setBudgetDTO(budgetDTO);
		account = mapper.map(dto, Account.class);
		account = accountRepository.save(account);
		dto.setIdAccount(account.getIdAccount());
		return dto;
	}

}
