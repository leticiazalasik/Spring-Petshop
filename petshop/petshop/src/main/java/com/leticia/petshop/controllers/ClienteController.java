package com.leticia.petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leticia.petshop.models.Cliente;
import com.leticia.petshop.service.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {

@Autowired
ClienteService clienteService; 

@GetMapping("/clientes")
public List<Cliente>listarClientes(){
return clienteService.listarClientes(); 
}

@PostMapping("/clientes")
public ResponseEntity<Cliente>cadastrarCliente(@RequestBody Cliente cliente){
return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.criarCliente(cliente));	
}

@PutMapping("/clientes/{id}")
public ResponseEntity<Cliente>atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente){
return ResponseEntity.status(HttpStatus.OK).body(clienteService.atualizarCliente(id, cliente));	
}
@DeleteMapping("/clientes/{id}")
public ResponseEntity<Object> excluirCliente(@PathVariable Long id ){
	clienteService.excluirCliente(id);
	return ResponseEntity.status(HttpStatus.OK).body("Cliente excluído com sucesso");	
}
	
}
