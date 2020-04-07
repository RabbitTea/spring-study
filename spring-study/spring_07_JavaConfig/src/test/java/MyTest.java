import com.sandra.config.AppConfig;
import com.sandra.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        /**
         * 通过Java代码配置注解的方式；替换了原来的xml
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /**
         * Java配置代码中的方法名就是bean的名字；一般方法写成类的首字母小写
         */
        User user = context.getBean("getUser", User.class);

        System.out.println(user);
    }
}
