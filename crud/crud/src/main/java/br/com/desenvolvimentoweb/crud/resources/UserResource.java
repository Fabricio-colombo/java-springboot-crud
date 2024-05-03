package br.com.desenvolvimentoweb.crud.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desenvolvimentoweb.crud.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll () {
		
		User usuario = new User (1L, "fabricio", "fabriciocolombo0096@gmail.com", "48999643332", "12345");
		
		return ResponseEntity.ok().body(usuario);
	}
	
}
