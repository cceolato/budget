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

import br.com.ceolato.budget.dto.AccountDTO;
import br.com.ceolato.budget.services.AccountService;
import br.com.ceolato.budget.services.exception.NotFoundException;

@RestController
@RequestMapping("/budget/{idBudget}/account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public ResponseEntity<List<AccountDTO>> listAll(long idBudget) {
		List<AccountDTO> listAccount = accountService.list(idBudget);
		return ResponseEntity.ok(listAccount);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> listOne(@PathVariable long id){
		try{
			AccountDTO dto = accountService.find(id);
			return ResponseEntity.ok(dto);
		} catch (NotFoundException nf) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	@PutMapping
	public ResponseEntity<AccountDTO> create(@RequestBody AccountDTO dto, @PathVariable long idBudget) {
		try {
			AccountDTO account = accountService.save(idBudget, dto);
			return ResponseEntity.ok(account);
		} catch (NotFoundException nf) {
			return ResponseEntity.notFound().build();
		}
	}
	
	
}
