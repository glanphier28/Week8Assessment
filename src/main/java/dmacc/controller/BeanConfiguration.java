/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Car;

/**
 * @author gabel
 *
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Car car() {
		Car bean = new Car("Toyota");
		bean.setMake("Chevy");
		bean.setModel("Impala");
		bean.setYear(2013);
		bean.setColor("White");
		return bean;

	}
	
	@Bean
	public Car car2() {
		Car bean2 = new Car("Lexus");
		bean2.setModel("ES350");
		bean2.setYear(2007);
		bean2.setColor("Silver");
		return bean2;
	}
}
