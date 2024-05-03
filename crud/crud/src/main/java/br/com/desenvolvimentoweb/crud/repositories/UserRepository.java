package br.com.desenvolvimentoweb.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desenvolvimentoweb.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
