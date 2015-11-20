package com.ede.stcl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.xml.ws.soap.Addressing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ede.stcl.soap.client.GetCityForecastByZIPResponse;
import com.fasterxml.jackson.annotation.JacksonInject;
@SpringBootApplication
@RestController
public class UiApplication {
	
	GetCityForecastByZIPResponse response;
	
	
    @RequestMapping("/resource")
	public Map<String,Object> home() {
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("id",response.getGetCityForecastByZIPResult());
		model.put("content", "Hello World");
		return model;
	}
    
	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}
	
	@Bean
	CommandLineRunner lookup(final WeatherClient weatherClient) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				String zipCode = "94304";

				if (args.length > 0) {
					zipCode = args[0];
				}
				response = weatherClient.getCityForecastByZip(zipCode);
			}
		};
	}


}
