package com.advanceJava.Assignment5.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.advanceJava.Assignment5.entity.Lib;
import com.advanceJava.Assignment5.repository.LibRepo;
@Service
public class LibService {
	@Autowired
	private LibRepo repo;

	public void addLib1(Lib l) {
		repo.save(l);
	}

	public List<Lib> getAllLib() {
		return repo.findAll();
	}

	public Lib getLibById1(int id) {
		Optional<Lib> e = repo.findById(id);
		if (e.isPresent()) {
			return e.get();
		}
		return null;
	}

	public void deleteLib(int id) {
		repo.deleteById(id);
	}

	public Page<Lib> getLibByPaginate(int currentPage, int size) {
		Pageable p = PageRequest.of(currentPage, size);
		return repo.findAll(p);
	}

	public Lib getLibById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addLib(Lib l) {
		// TODO Auto-generated method stub
		
	}

}


