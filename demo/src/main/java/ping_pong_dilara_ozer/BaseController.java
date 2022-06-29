package ping_pong_dilara_ozer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping("/ping")
	public String pongMethod() {
		return "pong";
	}
	
}
