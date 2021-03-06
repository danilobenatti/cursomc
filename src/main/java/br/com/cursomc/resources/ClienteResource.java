package br.com.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursomc.domain.Cliente;
import br.com.cursomc.services.ClienteService;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		Cliente cliente = service.buscar(id);
		return ResponseEntity.ok().body(cliente);
	}

}
