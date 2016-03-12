package cn.itcast420.struts2.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast420.bean.Person;
import cn.itcast420.service.PersonService;

import com.opensymphony.xwork2.ActionSupport;

/*
 * @Controller用于控制层
 * @Scope：因为现在的action是由spring来管理的，所以在spring容器的默认机制下，只产生一个实例，所以
 * 			需要@Scope(value="prototype")注解，让action产生多个实例
 */
@Controller(value="personAction")
@Scope(value="prototype")
public class PersonAction extends ActionSupport{
	/*
	 * 测试生成的是一个实例还是多个实例的方法
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
