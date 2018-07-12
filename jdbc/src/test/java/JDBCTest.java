import org.junit.Test;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;


public class JDBCTest {
    //查询测试
    @Test
    public void TestJDBC() throws ClassNotFoundException, SQLException {
        Connection conn = JDBC.getConnection("xiuzhen","root","root");
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st=conn.createStatement();
        //sql语句
        ResultSet rs = st.executeQuery("SELECT * FROM signup");
        while(rs.next()){
            System.out.println(rs.getString("name")+" "
                    +rs.getString("qq"));
        }
        //关闭资源
        rs.close();
        st.close();
        conn.close();
    }
    //插入测试
    @Test
    public void InsertTest() throws SQLException {
        Connection conn = JDBC.getConnection("xiuzhen","root","root");
        Statement st=conn.createStatement();
        String sql="insert into signup(name,qq) values('张三','123456')";
        try {
            //执行 SQL 语句并返回结果
            int result = st.executeUpdate(sql);
            if (result != 0) {
                System.out.println("操作成功,受影响" + result + "行");
            }

        } catch (SQLException e) {
            System.out.println("操作失败");
        } finally {
            st.close();
            conn.close();
        }
    }
    //更新测试
    @Test
    public void Update() throws SQLException {
        Connection conn = JDBC.getConnection("xiuzhen","root","root");
        Statement st=conn.createStatement();
        String sql = "UPDATE signup SET name = '李四' WHERE name = '张三'";
        try {
            //执行 SQL 语句并返回结果
            int result = st.executeUpdate(sql);
            if (result != 0) {
                System.out.println("操作成功,受影响" + result + "行");
            }

        } catch (SQLException e) {
            System.out.println("操作失败");
        } finally {
            st.close();
            conn.close();
        }
    }
    //删除测试
    @Test
    public void Delete() throws SQLException {
        Connection conn = JDBC.getConnection("xiuzhen","root","8891960");
        Statement st = conn.createStatement();
        String sql = "DELETE FROM signup WHERE name = '张三'";
        try {
            //执行 SQL 语句并返回结果
            int result = st.executeUpdate(sql);
            if (result != 0) {
                System.out.println("操作成功,受影响" + result + "行");
            }

        } catch (SQLException e) {
            System.out.println("操作失败");
        } finally {
            st.close();
            conn.close();
        }
    }
}
