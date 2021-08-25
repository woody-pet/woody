package com.gemini;

import com.gemini.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

//@RunWith
@SpringBootTest
class WoodyApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() throws Exception {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    void mapper() throws Exception {
        System.out.println(userDao.queryById(1L));
    }

}
