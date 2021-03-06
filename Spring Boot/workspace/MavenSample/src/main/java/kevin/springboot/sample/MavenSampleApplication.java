package kevin.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MavenSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSampleApplication.class, args);
	}

}
