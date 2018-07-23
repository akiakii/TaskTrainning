import com.iceneet.Entity.signup;
import com.iceneet.dao.SignupDao;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMybatisTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    SignupDao signupDao = (SignupDao) context.getBean("SignupDao");
    signup signup = new signup();
    Logger logger = Logger.getLogger(SpringMybatisTest.class);
    @Test
    public void DeleteTest(){
        boolean b = signupDao.deleteSignup(88);
        logger.info("删除操作："+b);
    }
    @Test
    public void UpdateTest(){
        boolean b = signupDao.updateSignup("小王");
        logger.info("更新操作"+b);
    }
    @Test
    public void InsertTest(){
        signup s = new signup();
        s.setName("小小");
        s.setQq(655555);
        signupDao.insertSignup(s);
    }
    @Test
    public void SelectTest(){
        signup s = signupDao.selectSignup((long) 1);
        logger.info(s);
    }
}
