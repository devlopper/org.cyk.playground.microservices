package org.cyk.playground.microservices.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public String get() {
		return "<html><p>Hi! Microservices from <h1>Spring Boot</h1> at " + new java.util.Date() + "</p></html>";
	}

}
