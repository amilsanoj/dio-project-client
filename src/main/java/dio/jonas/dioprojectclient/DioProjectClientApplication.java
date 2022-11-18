package dio.jonas.dioprojectclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioProjectClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioProjectClientApplication.class, args);
	}

}
