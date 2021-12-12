package api.spring.bluebank.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.spring.bluebank.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

	@Query(value = "SELECT * FROM conta c WHERE c.conta = :conta ", nativeQuery = true)
	List<Conta> findByConta( Conta conta);
	
	@Query(value = "SELECT * FROM conta c WHERE c.conta = :conta ", nativeQuery = true)
	List<Conta> findByContaDestino( Long conta);

	@Query(value = "SELECT c.saldo, c.id  FROM conta c WHERE c.id = :id", nativeQuery = true)
	Optional<Conta> findSaldoById(Long id);
}
