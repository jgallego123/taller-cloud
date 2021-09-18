package co.com.cloud.movies.servicemovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMovieApplication.class, args);
	}

}
