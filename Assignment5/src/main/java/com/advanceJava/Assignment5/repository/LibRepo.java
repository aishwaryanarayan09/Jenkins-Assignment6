package com.advanceJava.Assignment5.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import com.advanceJava.Assignment5.entity.Lib;
@Repository
public interface LibRepo extends JpaRepository<Lib, Integer> {

	void save(Lib l);

	List<Lib> findAll();

	Optional<Lib> findById(int id);

	void deleteById(int id);

	Page<Lib> findAll(Pageable p);
	
	

}
