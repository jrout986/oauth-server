package com.test.oauthserver;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	@GetMapping("/test")
	public Principal testMe(Principal principal) {
		return principal;
	}
}
