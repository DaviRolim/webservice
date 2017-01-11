package com.amazingd.resource;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.amazingd.domain.Address;
import com.amazingd.domain.Usuario;
import com.amazingd.service.UsuarioService;


@Path("pessoa")
@Produces(MediaType.APPLICATION_JSON)
public class PessoaController {
	
//	@Inject
//	private UsuarioRepository usuarioRepository;
	
	@Inject
	private UsuarioService service;
	
	
	@GET
	public List<Usuario> all() {
		return service.findAll();
	}
	
	@POST
	public void save(Usuario usuario) {
		service.createUser(usuario);
		
	}
	
	@GET
	@Path("{id}")
	public Usuario get(@PathParam("id") Integer id) {
		return service.findById(id);
	}
	
	@GET
	@Path("address/{id}")
	public Address getAddress(@PathParam("id") Integer id) {
		return service.getAddressById(id);
	}

////	Throwing error 500 perguntar bonfim
	@GET
	@Path("name/{name}")
	public Usuario getByName(@PathParam("name") String name) {
		return service.findByName(name);
	}

	@DELETE
	@Path("{id}")
	public void delete(@PathParam("id") int id){
		service.delete(id);
	}

//	
//	/**
//	 * 
//	 * @param usuario
//	 * @return status created, não sei ql é o codigo de updated
//	 * Não precisa utilizar o PUT, utilizando o POST colocando o id do usuario na requisição
//	 * caso o usuario tenha id, ele faz o update.
//	 */
//	@PUT
////	@Path("{id}")
//	public Response update(Usuario usuario) {
////		Usuario usuario = usuarioRepository.findOne(id);
//		usuarioRepository.save(usuario);
//		URI uri = URI.create("/pessoa/" + usuario.getId());
//		return Response.created(uri).build();
//		
//	}
	

}
