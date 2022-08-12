package com.advanceJava.Assignment5.contoller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.advanceJava.Assignment5.entity.Lib;
import com.advanceJava.Assignment5.service.LibService;

@Controller

public class LibController {
	private static final Object Liblist = null;
	@Autowired
	private LibService service;

	@GetMapping("/")
	public String home(Model m) {
		return findPaginated(0, m);
	}

	@GetMapping("/addeLib")
	public String addLibForm() { 
		return "addLib";
	}

	@PostMapping("/register")
	public String empRegister(@ModelAttribute Lib l, HttpSession session) {
		service.addLib(l);
		session.setAttribute("msg", "Book Added Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Lib l = service.getLibById(id);
		m.addAttribute("Lib", l);
		return "edit";
	}

	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Lib l, HttpSession session) {
		service.addLib(l);
		session.setAttribute("msg", "book Data Updated Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deleteLib(@PathVariable int id, HttpSession session) {

		service.deleteLib(id);
		session.setAttribute("msg", "Book Data Deleted Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/page/{pageno}")
	public String findPaginated(@PathVariable int pageno, Model m) {

		Page<Lib> liblist = service.getLibByPaginate(pageno, 2);
		m.addAttribute("Lib", Liblist);
		m.addAttribute("currentPage", pageno);
		m.addAttribute("totalPages", ((Page<Lib>) Liblist).getTotalPages());
		m.addAttribute("totalItem", ((Page<Lib>) Liblist).getTotalElements());
		return "index";
	}

}

	

