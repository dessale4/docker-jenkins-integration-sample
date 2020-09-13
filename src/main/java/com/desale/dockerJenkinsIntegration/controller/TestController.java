package com.desale.dockerJenkinsIntegration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/jenkins")
	public String testJenkins() {
		return "Docker-Jenkins-Integration";
	}
}
