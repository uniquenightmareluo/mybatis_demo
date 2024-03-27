package com.dao.test;

import com.dao.entity.User;
import com.dao.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream cof = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(cof);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User();
//        user1.setId(3);
//        user1.setName("罗文磊");
//        user1.setAddress("西安");
//        user1.setSex("男");
//        mapper.updateUser(user1);
//        mapper.deleteUser(3);
        sqlSession.commit();
        List<User> list = mapper.selectAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
