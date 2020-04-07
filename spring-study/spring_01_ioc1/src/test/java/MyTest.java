import com.sandra.dao.UserDao;
import com.sandra.dao.UserDaoImpl;
import com.sandra.dao.UserDaoMysqlImpl;
import com.sandra.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        /**
         * 用户实际调用的是业务层，其不需要接触dao层；这里也就只实例化Service的对象
         * 那么问题来了：
         *   如果UserDao接口多了一个实现类UserDaoMysqlImpl，但是这里的UserServiceImpl里面只实例化了UserDaoImpl，调用其getUser()方法；
         *   UserDaoMysqlImpl中重写的同样方法getUser()如何调用呢？
         *   传统的方式不得不去UserServiceImpl中去修改实例化的Dao层对象; 那如果又多了一个实现类UserDaoOracleImpl呢？
         *   这在Dao接口的实现类增多时非常不利！
         */
        //UserServiceImpl userService = new UserServiceImpl();
        //userService.setUserDao(new UserDaoMysqlImpl());

        //userService.getUser();

        /**
         * 使用Spring的方式；
         * 不需要new对象；
         */
        //拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl)context.getBean("serviceImpl");
        userService.getUser();
    }
}
