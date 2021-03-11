package com.uniovi.services;

import org.springframework.stereotype.Service;

@Service
public class RolesService {
	static final String[] roles = { "ROLE_USER", "ROLE_ADMIN" };

	public static String[] getRoles() {
		return roles;
	}
}