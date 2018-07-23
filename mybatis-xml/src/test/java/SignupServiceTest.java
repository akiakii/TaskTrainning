import com.iceneet.Entity.signup;
import com.iceneet.dao.mapper.SignupDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

public class SignupServiceTest {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }

    @Test
    public void TestSelect(){
        SqlSession session = sqlSessionFactory.openSession();
        SignupDao signupDao = session.getMapper(SignupDao.class);
        List<signup> list= signupDao.selectSignup();
        for (signup sn :list){
            System.out.println(sn.getName()+"\t"+sn.getQq()+"\t");
        }
    }
    @Test
    public void Testupdate(){
        SqlSession session = sqlSessionFactory.openSession();
        SignupDao signupDao = session.getMapper(SignupDao.class);
        signup SN = new signup();
        SN.setName("王五1");
        SN.setQq(651368888);
        signupDao.updateSignup("赵茜");
        session.commit();
    }
    @Test
    public void Testinsert(){
        SqlSession session = sqlSessionFactory.openSession();
        SignupDao signupDao = session.getMapper(SignupDao.class);
        signup SN = new signup();
        SN.setName("66");
        SN.setQq(651368888);
        signupDao.insertSignup(SN);
        session.commit();
    }
    @Test
    public void TestDelete(){
        SqlSession session = sqlSessionFactory.openSession();
        SignupDao signupDao = session.getMapper(SignupDao.class);
        signup SN = new signup();
        SN.setName("66");
        SN.setQq(651368888);
        signupDao.deleteSignup(75);
        session.commit();
    }
}
