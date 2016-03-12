package cn.itcast420.struts2.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast420.bean.Person;
import cn.itcast420.service.PersonService;

import com.opensymphony.xwork2.ActionSupport;

/*
 * @Controller���ڿ��Ʋ�
 * @Scope����Ϊ���ڵ�action����spring������ģ�������spring������Ĭ�ϻ����£�ֻ����һ��ʵ��������
 * 			��Ҫ@Scope(value="prototype")ע�⣬��action�������ʵ��
 */
@Controller(value="personAction")
@Scope(value="prototype")
public class PersonAction extends ActionSupport{
	/*
	 * �������ɵ���һ��ʵ�����Ƕ��ʵ���ķ���
	 */
	public PersonAction(){
		System.out.println("aaaaaa");
	}
	@Resource
	private PersonService personService;
	public String savePerson(){
		Person person = new Person();
		person.setName("czbk");
		this.personService.savePerson(person);
		return null;
	}
	
	public String getPerson(){
		Person p = this.personService.getPersonById(1);
		ServletActionContext.getRequest().setAttribute("person", p);
		return "index";
	}
}
