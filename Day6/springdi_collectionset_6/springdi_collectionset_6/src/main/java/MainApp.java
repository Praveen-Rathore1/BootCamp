import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MainApp {
 
    public static void main(String a[]){
        String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context 
                = new ClassPathXmlApplicationContext(confFile);
        TechnicalDirectors filmDir = (TechnicalDirectors) context.getBean("tDirectors");
        filmDir.printDirectors();
    }
}