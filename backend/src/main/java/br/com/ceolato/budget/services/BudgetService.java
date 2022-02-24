package br.com.ceolato.budget.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ceolato.budget.dto.BudgetDTO;
import br.com.ceolato.budget.entities.Budget;
import br.com.ceolato.budget.repositories.BudgetRepository;
import br.com.ceolato.budget.services.exception.NotFoundException;

@Service
public class BudgetService {

	@Autowired
	private BudgetRepository budgetRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	public List<BudgetDTO> list(){
		List<Budget> budgets = budgetRepository.findAll();
		return mapper.map(budgets, new TypeToken<List<Budget>>() {}.getType());
	}
	
	public BudgetDTO save(BudgetDTO dto) {
		Budget budget;
		if(dto.getIdBudget() != null) {
			budget = budgetRepository.findById(dto.getIdBudget()).get(); 
		} else {
			budget = new Budget();
		}
		budget = mapper.map(dto, Budget.class);
		budget = budgetRepository.save(budget);
		dto.setIdBudget(budget.getIdBudget());
		return dto;
	}

	public BudgetDTO find(long id) {
		Budget budget = budgetRepository.findById(id).orElseThrow(
				() -> new NotFoundException("Budget não encontrado!")); 
		return mapper.map(budget, BudgetDTO.class);
	}
}
