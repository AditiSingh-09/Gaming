package com.mine.my_first.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessCalculationService{
	DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}

@Configuration
@ComponentScan("com.mine.my_first.examples.a1")
public class BusinessLauncherApplication {
	public static void main() {
		try(var context = new AnnotationConfigApplicationContext(BusinessLauncherApplication.class)){
			System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
			int x = context.getBean(BusinessCalculationService.class).findMax();
			System.out.println(x);
		}
	}
	}
	
