import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;

import com.eg.XyzEMail;  
  
public class MainApp2 {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext1.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        
        XyzEMail obj1=(XyzEMail)factory.getBean("mail"); 
        obj1.sendMail();
        obj1.recvMail();
        
        XyzEMail obj2=(XyzEMail)factory.getBean("mail"); 
        

        Employee s=(Employee)factory.getBean("e", 2555, "xyzzzzz"); 
        s.show();   

    }  
}
