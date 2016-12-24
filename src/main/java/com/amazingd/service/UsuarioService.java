package com.amazingd.service;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amazingd.domain.Address;
import com.amazingd.domain.Usuario;
import com.amazingd.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
	
	@Inject
	private UsuarioRepository dao;
	
	public Response createUser(Usuario user) {
		if(user.getNome().isEmpty()){
			return Response.status(204).build();
		} else {
			dao.save(user);
			URI uri = URI.create("/pessoa/" + user.getId());
			return Response.created(uri).build();
		}
	}
	
	public List<Usuario> findAll(){
		return dao.findAll();
	}
	
	public Usuario findById(int id){
		Usuario user = dao.findOne(id);
		return user;
	}
	
//	Always returning 204
	public Response delete(int id) {
		if (dao.exists(id)){
			dao.delete(id);
			return Response.ok().build();
		} else {
			return Response.status(204).build();
		}
	}
	
	public Address getAddressById(int id) {
		Usuario user = dao.findOne(id);
		return user.getAddress();
	}
	
	public Usuario findByName(String name) {
		Usuario user = dao.findByNome(name);
		return user;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
