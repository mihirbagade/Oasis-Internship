package com.NimapRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NimapEntity.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

	
}
