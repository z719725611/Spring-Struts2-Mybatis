package com.zqb.dao;

import com.zqb.bean.Login;
import com.zqb.service.LoginService;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* LoginDao Tester. 
* 
* @author <Authors name> 
* @since <pre>10/25/2016</pre> 
* @version 1.0 
*/ 
public class LoginDaoTest  extends TestCase {
   /* public void testApp02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean_Mybatis.xml");
        System.out.println(ac.getBean("dataSource"));
    }

    public void testApp03() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean_Mybatis.xml");
        System.out.println(ac.getBean("sqlSessionFactory"));
    }*/
  /*  @Test
    public void testApp04() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean_Mybatis.xml");
        System.out.println(ac.getBean("sqlSession"));
    }*/
  /*  @Test
    public void logintest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "bean_Mybatis.xml");
        LoginService ub = (LoginService) ac.getBean("loginServiceImpl");

        Login l=new Login();
        l.setUserid(1);
        String u=ub.getLoginName(l);
        System.out.println(u);
    }*/

} 
