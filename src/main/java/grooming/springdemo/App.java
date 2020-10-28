package grooming.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/* Employee emp = new Employee(new Train()); */

		/*
		 * BeanFactory beanFactory = new XmlBeanFactory(new
		 * ClassPathResource("spring.xml"));
		 */

		/*
		 * ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		/* Employee emp1 = (Employee) beanFactory.getBean("employee1"); */
		/* Employee emp1 = beanFactory.getBean(Employee.class); */
		Employee emp1 = context.getBean("emp", Employee.class);
		emp1.travels();
		/*
		 * Employee emp2 = (Employee) context.getBean("employee2"); emp2.travels();
		 * System.out.println(emp2.getAge());
		 */

	}
}
