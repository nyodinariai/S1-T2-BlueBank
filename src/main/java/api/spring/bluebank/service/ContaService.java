package api.spring.bluebank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import api.spring.bluebank.exception.NaoEcontrado;
import api.spring.bluebank.model.Conta;
import api.spring.bluebank.repository.ContaRepository;
import api.spring.bluebank.repository.MovimentacoesRepository;

@Service
public class ContaService {
	@Autowired
	private ContaRepository repository;
	
//	public ResponseEntity<Conta> saldoPorId(Conta conta){
//		List<Conta> contaExiste = repository.findByConta(conta.getId());
//	}
	
	
	
}

