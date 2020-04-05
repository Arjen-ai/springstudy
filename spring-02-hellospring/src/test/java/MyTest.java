import edu.xalead.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我的的对象现在都在spring中管理，要使用直接取出来
        Hello hello =  context.getBean("hello",Hello.class);
        System.out.println(hello.toString());
    }
}
