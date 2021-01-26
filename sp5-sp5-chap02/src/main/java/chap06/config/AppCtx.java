package chap06.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap06.Client;

@Configuration
public class AppCtx {

	
	@Bean
	public Client client() {
		Client client = new Client();
		client.setHost("host");
		return client;
	}
}
