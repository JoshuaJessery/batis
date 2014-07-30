package org.batis.mapper;

import org.apache.ibatis.annotations.Param;
import org.batis.entity.Pet;
import org.springframework.stereotype.Repository;

@Repository(value = "petsMapper")
public interface PetsMapper {
	/**
	 * 根据ID 查询宠物
	 * @param id
	 * @return
	 */
	Pet findPetById(@Param("id") Long id);
	
	/**
	 * 插入 Pet
	 * @param pet
	 * @return
	 */
	long  addPet(@Param("age") int age,@Param("name") String name,@Param("sex") String sex,@Param("aliases") String aliases);
	
	/**
	 * 插入 Pet
	 * @param pet
	 * @return
	 */
	long addPetByPojo(Pet pet);
}
