import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.sandra.dao.UserMapper;
import com.sandra.dao.UserMapperImpl;
import com.sandra.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void testMybatis() throws IOException {

        String resoureces = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resoureces);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        // 设为true表示自动提交事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUsers();

        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testSpringMybatis() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);

        for (User user : userMapper.getUsers()) {
            System.out.println(user);
        }
    }
}
