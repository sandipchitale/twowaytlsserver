package sandipchitale.twowaytlsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TwowaytlsserverApplication {

	@RestController
	public static class IndexController {
		@GetMapping("/")
		public String index() {
			return "Hello World!";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(TwowaytlsserverApplication.class, args);
	}

}
