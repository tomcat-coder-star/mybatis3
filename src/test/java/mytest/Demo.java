package mytest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author :xiaozou
 * @Date : 2022/3/3- 14:20
 **/

public class Demo {
      @Test
      public void test() throws IOException {
        String resource = "resources/mybatis-config.xml";
        // 读取资源
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取sqlSession, 事务自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 查询数据
        List<User> objects = sqlSession.selectList("findAllUser");
        System.out.println("objects = " + objects);
        // 执行添加数据
        int addUser = sqlSession.insert("addUser", new User("77","tom","23","11111@qq.com"));
        System.out.println("addUser = " + addUser);
      }
}
