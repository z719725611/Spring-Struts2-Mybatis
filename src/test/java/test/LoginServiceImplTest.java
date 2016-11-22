package test;

import com.zqb.bean.Login;
import com.zqb.service.LoginService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class LoginServiceImplTest {
    @Test
    public void add(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "bean_Mybatis.xml");
        LoginService ub = (LoginService) ac.getBean("loginServiceImpl");

        Login l=new Login();
        l.setUserid(1);
        l.setUsername("qqq");
        ub.getLoginName(l);
    }


}