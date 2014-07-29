package org.batis.mapper;

import org.apache.ibatis.annotations.Param;
import org.batis.entity.Pet;
import org.springframework.stereotype.Repository;

@Repository(value = "petsMapper")
public interface PetsMapper {
	Pet findById(@Param("id") Long id);
}
