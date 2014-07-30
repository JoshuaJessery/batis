package org.batis.serviceImpl;

import javax.annotation.Resource;

import org.batis.entity.Pet;
import org.batis.mapper.PetsMapper;
import org.batis.service.PetService;
import org.springframework.stereotype.Service;
/**
 * 
 * @author joshua
 * @date 2014-7-29
 * @version
 */
@Service
public class PetServiceImpl implements PetService{

	@Resource
	private PetsMapper petRepository;
	
	public Pet getPetById(Long id) {
		return petRepository.findPetById(id);
	}
	
	public Pet  addPet(Pet pet) {
		/*long i = petRepository.addPet(pet.getAge(),pet.getName(),pet.getSex(),pet.getAliases());*/
		long i = petRepository.addPetByPojo(pet);
		return petRepository.findPetById(i);
	}
}
