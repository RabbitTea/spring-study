import com.sandra.pojo.Student;
import com.sandra.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
    }


    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");

        //后面注明类型就不用强转了
        User user = context.getBean("user", User.class);

        System.out.println(user.toString());
    }
}
