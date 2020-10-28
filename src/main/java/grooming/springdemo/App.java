package grooming.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/* Employee emp = new Employee(new Train()); */

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Employee emp1 = (Employee) beanFactory.getBean("employee1");
		emp1.travels();
		System.out.println(emp1.getAge());
		Employee emp2 = (Employee) beanFactory.getBean("employee2");
		emp2.travels();
		System.out.println(emp2.getAge());

	}
}
