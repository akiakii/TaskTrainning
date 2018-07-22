import com.iceneet.Entity.signup;
import com.iceneet.dao.mapper.SignupDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;

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
    public void TestUpdate(){
        SqlSession session = sqlSessionFactory.openSession();

    }
    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            SignupDao signupDao = session.getMapper(SignupDao.class);
            signup SN = new signup();
            SN.setName("王五");
            SN.setQq(651368888);
            signupDao.selectSignup("万鹏");
        }finally {
            session.close();
        }
    }
}
