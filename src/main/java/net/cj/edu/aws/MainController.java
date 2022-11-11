package net.cj.edu.aws;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	public String home() {
		return "<h1>hello world</h1>";
	}
}
