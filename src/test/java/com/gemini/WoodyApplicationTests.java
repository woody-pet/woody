package com.gemini;

import com.gemini.service.UserService;
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
    UserService userService;

    @Test
    void contextLoads() throws Exception {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    void mapper() throws Exception {
        System.out.println(userService.queryById(2L));
    }

}
