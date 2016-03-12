package cn.itcast420.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast420.bean.Person;

import cn.itcast420.service.PersonService;

public class PersonTest {
	@Test
	public void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService = (PersonService)applicationContext.getBean("personService");
		Person person = new Person();
		person.setName("ui");
		personService.savePerson(person);
	}
}
