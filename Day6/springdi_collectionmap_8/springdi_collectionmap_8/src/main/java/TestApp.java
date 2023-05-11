import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class TestApp{
 
	public static void main(String[] args)
	{
		ApplicationContext res = new FileSystemXmlApplicationContext("F:\\eclipse-workspace\\springdi_collectionmap\\src\\main\\java\\spconfig.xml");
		//ApplicationContext res = new ClassPathXmlApplicationContext("spconfig.xml");
		//BeanFactory factory = new XmlBeanFactory(res);
 
		Object o = res.getBean("id1");
		NewClass wb = (NewClass)o;
 
		wb.show();
 
	}
 
}