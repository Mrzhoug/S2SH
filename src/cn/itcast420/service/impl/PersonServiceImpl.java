package cn.itcast420.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast420.bean.Person;
import cn.itcast420.dao.PersonDao;
import cn.itcast420.service.PersonService;

@Service(value="personService")
public class PersonServiceImpl implements PersonService{
	@Resource
	private PersonDao personDao;

	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDao.savePerson(person);
	}

	public Person getPersonById(Integer id) {
		// TODO Auto-generated method stub
		return this.personDao.getPersonById(id);
	}
}
