package cn.itcast420.service;

import cn.itcast420.bean.Person;

public interface PersonService {
	public void savePerson(Person person);
	
	public Person getPersonById(Integer id);
}
