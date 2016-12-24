package com.amazingd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazingd.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	public Usuario findByNome(String nome);
	
}