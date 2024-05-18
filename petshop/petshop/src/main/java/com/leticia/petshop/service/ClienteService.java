package com.leticia.petshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leticia.petshop.models.Cliente;
import com.leticia.petshop.repository.ClienteRepository;

@Service
public class ClienteService {

	
@Autowired
private ClienteRepository clienteRepository; 

public Cliente criarCliente(Cliente cliente) { 
return clienteRepository.save(cliente); 
}

public List<Cliente>listarClientes(){ 
	return clienteRepository.findAll();
}

public Cliente atualizarCliente (Long id, Cliente cliente) {
cliente.setIdCliente(id);
return clienteRepository.save(cliente); 
}

public void excluirCliente(Long id) { 
	clienteRepository.deleteById(id);
	System.out.println("Excluidno cliente de ID: "+ id);
}
}
