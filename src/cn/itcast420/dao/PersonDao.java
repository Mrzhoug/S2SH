package cn.itcast420.dao;

import java.util.List;

import cn.itcast420.bean.Person;

public interface PersonDao {
	public void savePerson(Person person);
	
	public Person getPersonById(Integer id);
}
