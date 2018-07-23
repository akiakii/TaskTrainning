import impl.signupDAOimpl;
import org.junit.Test;

public class testjdbc {
    @Test
    public void selectTest(){
        signupDAOimpl s = new signupDAOimpl();
        s.FindSignupByName("王五");
    }
    @Test
    public void test1(){
        System.out.println("123");
    }
}
