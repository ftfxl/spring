package cn.edu.scujcc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hellocontroller {

	@GetMapping
	public Map<String,Object> sayHello() {
		Map<String,Object> result = new HashMap<>();
		result.put("message", "hello184020276¿Ó”Í∫Ω");
		return result;
	}
}
