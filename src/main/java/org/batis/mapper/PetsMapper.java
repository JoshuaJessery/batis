package org.batis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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
	 * 利用注解的方式进行查询
	 * @param id
	 * @return
	 */
	@Select("SELECT * from t_pet where id=#{id}")
	Pet getPetById(long id);
	
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
	
	/**
	 * 更新Pet
	 * @param pet
	 * @return
	 */
	long updatePet(Pet pet);
}
