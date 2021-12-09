package api.spring.bluebank.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import api.spring.bluebank.model.Cliente;
import api.spring.bluebank.repository.ClienteRepository;

@Service
public class UserDetailsServiceImplements implements UserDetailsService {
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional <Cliente> clienteExistente = repository.findByEmail(userName);
		clienteExistente.orElseThrow(() -> new UsernameNotFoundException(userName + "Não encontrado."));
		
		return clienteExistente.map(UserDetailsImplements::new).get();
	}
}
