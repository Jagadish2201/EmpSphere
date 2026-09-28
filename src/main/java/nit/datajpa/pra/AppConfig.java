package nit.datajpa.pra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student stu() {
		return new Student();
	}
	@Bean
	public City city() {
		return new City();
	}
	
	public Address add() {
		return new Address();
	}
}
