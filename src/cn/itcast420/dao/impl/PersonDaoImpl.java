package cn.itcast420.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import cn.itcast420.bean.Person;
import cn.itcast420.dao.PersonDao;

@Repository(value="personDao")
public class PersonDaoImpl implements PersonDao{
	@Resource
	private HibernateTemplate hibernateTemplate;
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(person);
	}
	public Person getPersonById(Integer id) {
		// TODO Auto-generated method stub
		return (Person)this.hibernateTemplate.load(Person.class, id);
	}

}
