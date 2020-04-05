import edu.xalead.config.Config;
import edu.xalead.dao.UserDaoImp;
import edu.xalead.dao.UserDaoMySqlImp;
import edu.xalead.service.UserServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        //获取容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手天下我有
        UserServiceImp userServiceImp =  context.getBean("UserServiceImpl",UserServiceImp.class);
        userServiceImp.getUser();
    }
    @Test
    public void test1(){
        UserServiceImp userServiceImp = new UserServiceImp();
        userServiceImp.setUserDao(new UserDaoImp());
        userServiceImp.getUser();
    }
    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserServiceImp getUserServiceImp = context.getBean("getUserServiceImp", UserServiceImp.class);
        UserDaoMySqlImp daoImpMySqlImp = context.getBean("getUserDaoImpMySqlImp", UserDaoMySqlImp.class);
        getUserServiceImp.setUserDao(daoImpMySqlImp);
        getUserServiceImp.getUser();
        System.out.println(daoImpMySqlImp.getName());
    }
}
