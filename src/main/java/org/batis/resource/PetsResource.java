package org.batis.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.batis.entity.Pet;
import org.batis.service.PetService;

public class PetsResource {

	@Resource
	PetService petService;
	
	@GET
    @Produces(value={MediaType.APPLICATION_JSON})
	@Path("/pets")
	public List<Pet> petsResources() {

		List<Pet> list = new ArrayList<Pet>();
		return list;
	}
	
	@GET
	@Produces(value={MediaType.APPLICATION_XML})
	@Path("/pet/{id}")
	public Pet petResource(@PathParam("id") Long id) {
		return petService.getPetById(id);
	}
	
	@GET
	@Produces(value={MediaType.APPLICATION_XML})
	@Path("/pet/add")
	public Pet addPetResource() {
		Pet pet = new Pet();
		pet.setAge(3);
		pet.setAliases("xh");
		pet.setName("hh");
		pet.setSex("男");
		return petService.addPet(pet);
	}
	
	@GET
	@Produces(value={MediaType.TEXT_HTML})
	@Path("/petsl")
	public Response petView() {
		try {
			return Response.created(new URI("./pet_list.jsp")).build();
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}
}
