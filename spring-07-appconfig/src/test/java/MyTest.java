import edu.xalead.config.UserConfig;
import edu.xalead.pojo.Blog;
import edu.xalead.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
//        User user = context.getBean("getUser",User.class);
//        System.out.println(user.getName());
        Blog blog = context.getBean("getBlog",Blog.class);
        System.out.println(blog.getId());
    }
}
