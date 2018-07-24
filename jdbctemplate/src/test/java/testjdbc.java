import Entity.Signup;
import dao.signupDAO;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class testjdbc {
//    private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
//    private signupDAO signupDao = (signupDAO) ctx.getBean("signupDAO");

    @Autowired
    private signupDAO signupDao;
    //日志
    Logger logger = Logger.getLogger(testjdbc.class);

    //查
    @Test
    public void selectTest(){
        logger.info(signupDao.FindSignupByID((long) 1));
    }
    //增
    @Test
    public void InsertTest(){
        Signup signup = new Signup();
        signup.setName("test");
        signup.setQq(9999999);
        try {
            logger.info("JDBC插入\t姓名为"+signup.getName());
            signupDao.InsertSignup(signup);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //改
    @Test
    public void UpdateTest(){
        try {
            logger.info("修改名为大大：");
            signupDao.UpdateByName("小王");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //删
    @Test
    public void DeleteTest(){
        try {
            logger.info("删除操作：");
            signupDao.DeleteByName("赵六");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
