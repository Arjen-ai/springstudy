import edu.xalead.dao.UserMapper;
import edu.xalead.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        for (User user : mapper.getUser()) {
            System.out.println(user);
        }
    }
}
