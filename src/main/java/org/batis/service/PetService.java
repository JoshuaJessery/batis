package org.batis.service;

import org.batis.entity.Pet;

public interface PetService {

	/**
	 * 根据ID获得指定宠物
	 * @return
	 */
	Pet getPetById(Long id);
}
