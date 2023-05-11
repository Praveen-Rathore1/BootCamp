import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.*;

import other.Employee;
import other.XyzEMail;

public class MainApp {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		//ApplicationContext factory = new ClaasPathXMLApplicationContext();

		// We are providing the values 10 and "abcd" dynamically
		Employee s = (Employee) factory.getBean("e");
		s.setMarks(25);
		s.show();
		
		Employee s1 = (Employee) factory.getBean("e");
		s1.setMarks(25);
		s1.show();

		XyzEMail obj = (XyzEMail) factory.getBean("mail");
		obj.sendMail();
		obj.recvMail();

		XyzEMail obj1 = (XyzEMail) factory.getBean("mail");
		obj1.sendMail();

	}
}
