package com.br.ribeiro.resource;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserResource {
	
	@GetMapping
	public String index(Model model, Principal principal) {
		model.addAttribute("loggedInUser", principal.getName());
		return "index";
	}
}
