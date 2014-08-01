package org.batis.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.batis.entity.Pet;

@Path("/pets/view")
public class ViewsResources {

	@GET
    @Produces({"text/html", "application/xml"})
	@Path("/{id}")
	public Pet getPet(@PathParam("id") long id) {
		Pet pet = new Pet();
		pet.setAge(1);
		return pet;
	}
	
	@GET
	@Produces(value={MediaType.APPLICATION_XML})
	public Pet getPets() {
		Pet p = new Pet();
		p.setAge(1);
		p.setAliases("hjk");
		return p;
	}
}
