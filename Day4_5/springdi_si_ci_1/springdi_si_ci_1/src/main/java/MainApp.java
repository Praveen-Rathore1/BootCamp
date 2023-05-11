import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;

import com.other.Employee;
import com.other.XyzEMail;  
  
public class MainApp {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        //We are providing the values 10 and "abcd" dynamically
        //Employee s=(Employee)factory.getBean("e",38,"testingpurpose");  
        //Employee s=(Employee)factory.getBean("e",32,"jhsdfgj"); 
        Employee s=(Employee)factory.getBean("e"); 
        Employee s1=(Employee)factory.getBean("e"); 
        //s.setMarks(25);
        s.show();
        
        
        XyzEMail obj=(XyzEMail)factory.getBean("mail","abc@email.com",36); 
        XyzEMail obj1=(XyzEMail)factory.getBean("mail","xyz@email.com",38); 
        obj.sendMail();
        obj.recvMail();
        
    }  
}
