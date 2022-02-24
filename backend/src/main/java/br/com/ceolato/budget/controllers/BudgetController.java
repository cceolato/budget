package br.com.ceolato.budget.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ceolato.budget.dto.BudgetDTO;
import br.com.ceolato.budget.services.BudgetService;
import br.com.ceolato.budget.services.exception.NotFoundException;

@RestController
@RequestMapping("/budget")
public class BudgetController {

	@Autowired
	private BudgetService budgetService;
	
	@GetMapping
	public ResponseEntity<List<BudgetDTO>> listAll() {
		List<BudgetDTO> listBudget = budgetService.list();
		return ResponseEntity.ok(listBudget);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> listOne(@PathVariable long id){
		try{
			BudgetDTO dto = budgetService.find(id);
			return ResponseEntity.ok(dto);
		} catch (NotFoundException nf) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<BudgetDTO> create(@RequestBody BudgetDTO dto) {
		BudgetDTO budget = budgetService.save(dto);
		return ResponseEntity.ok(budget);
	}
	
	@PutMapping
	public ResponseEntity<BudgetDTO> save(@RequestBody BudgetDTO dto) {
		BudgetDTO budget = budgetService.save(dto);
		return ResponseEntity.ok(budget);
	}
	
	
}
