import com.sandra.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yitang
 * @date 2020/03/29
 */
public class MyTest {

    public static void main(String[] args) {

        /**
         * 用xml方式加载Bean (必写)；
         * 入参：配置文件地址，可以传多值；
         * 获取Spring的上下文对象
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        /**
         * 我们的对象都在Spring中管理了，使用时从中取出来即可；
         */
        Hello hello = (Hello)context.getBean("hello");

        System.out.println(hello.toString());

    }

}
