package com.dao.test;



import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;
import java.sql.Connection;

public class JdbcTest {

    @Test
    public void jdbcall() throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动类
        String url="jdbc:mysql://localhost:3306/mybaits_demo?verifyServerCertificate=false&useSSL=false";
        String username="root";
        String password="lwj092356";
        Connection conn=DriverManager.getConnection(url,username,password);//用参数得到连接对象
        System.out.println("连接成功！");
        System.out.println(conn);
    }
}
