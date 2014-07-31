package org.batis.resource;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.batis.entity.Pet;

@Path("pets/view")
public class ViewsResources {

	@Path("/{id}")
	@Produces
	public Pet getPet() {
		return null;
	}
}
