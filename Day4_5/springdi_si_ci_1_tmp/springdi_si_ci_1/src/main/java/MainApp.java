import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;

import com.eg.XyzEMail;  
  
public class MainApp {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext1.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        //We are providing the values 10 and "abcd" dynamically
        //Employee s=(Employee)factory.getBean("e",38,"testingpurpose");  
        /*Employee s=(Employee)factory.getBean("e", "address99", "name99", 333); 
        //s.setMarks(25);
        s.show();
        
        //Employee s1=(Employee)factory.getBean("e"); 
        */

        XyzEMail obj=(XyzEMail)factory.getBean("mail"); 
        obj.sendMail();
        obj.recvMail();
        
        
    }  
}
