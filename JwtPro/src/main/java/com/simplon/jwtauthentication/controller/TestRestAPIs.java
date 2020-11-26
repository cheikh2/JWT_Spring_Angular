package com.simplon.jwtauthentication.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {
	
	@GetMapping("/api/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String userAccess() {
		return ">>> User Contenu  Les « JSON Web Token » ou JWT sont des jetons générés par " +
				"un serveur lors de l’authentification d’un utilisateur sur une application Web, " +
				"et qui sont ensuite transmis au client.!";
	}

	@GetMapping("/api/test/pm")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
	public String projectManagementAccess() {
		return ">>> Project Management Board";
	}
	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> Admin Contenu  Les jetons JWT peuvent être utilisés principalement de deux manières côté client : stocké dans un cookie ou dans le sessionStorage (ou le localStorage) du navigateur. " +
				"Chacune de ces solutions présente des avantages et des inconvénients en termes de sécurité et de fonctionnalité.";
	}
}