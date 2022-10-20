package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Car;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.CarRepository;

@SpringBootApplication
public class Week8AssessmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8AssessmentApplication.class, args);
	}
	
	@Autowired
	CarRepository repo;


		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			
			Car c = appContext.getBean("car", Car.class);
			c.setColor("Gold");
			repo.save(c);
			
			Car b = appContext.getBean("car2", Car.class);
			repo.save(b);
			
			List<Car> allMyCars = repo.findAll();
			for(Car cars: allMyCars) {
				System.out.println(cars.toString());
			}
			
			((AbstractApplicationContext) appContext).close();
			
		}
		
	

}
