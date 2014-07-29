package org.batis.resource;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.batis.entity.Pet;
import org.batis.serviceImpl.PetServiceImpl;

public class PetsResource {

	@Resource
	PetServiceImpl petServiceImpl;
	
	@GET
    @Produces(value={MediaType.APPLICATION_JSON})
	@Path("/pets")
	public List<Pet> petsResources() {

		List<Pet> list = new ArrayList<Pet>();
		for(int i=1; i < 5; i++) {
			list.add(createPet(Long.valueOf(i+1)));
		}
		return list;
	}
	
	@GET
	@Produces(value={MediaType.APPLICATION_XML})
	@Path("/pet/{id}")
	public Pet petResource(@PathParam("id") Long id) {
		return petServiceImpl.getPetById(1l);
	}
	
	public Pet createPet(long id) {
		Pet pet = new Pet();
		pet.setId(id);
		pet.setAge(Integer.valueOf((id+1)+""));
		pet.setAliases("xiaob"+id);
		pet.setName("xb"+id);
		pet.setSex("1");
		return pet;
	}
}
