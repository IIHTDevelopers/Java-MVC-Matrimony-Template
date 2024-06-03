package com.yaksha.training.matrimony.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.matrimony.entity.Matrimony;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/matrimony", "/" })
public class MatrimonyController {

	@GetMapping(value = { "/list", "/" })
	public String listMatrimonys(@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/addMatrimonyForm")
	public String showFormForAdd(Model model) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveMatrimony")
	public String saveMatrimony(@Valid @ModelAttribute("matrimony") Matrimony matrimony, BindingResult bindingResult) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateMatrimonyForm")
	public String showFormForUpdate(@RequestParam("matrimonyId") Long id, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/delete")
	public String deleteMatrimony(@RequestParam("matrimonyId") Long id) {
		// write your logic here
		return "";
	}

	@RequestMapping("/search")
	public String searchMatrimonys(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {

		// write your logic here
		return "";
	}

	@GetMapping("/updateMatchFound")
	public String updateStatus(@RequestParam("id") Long id) {
		// write your logic here
		return "";
	}
}
