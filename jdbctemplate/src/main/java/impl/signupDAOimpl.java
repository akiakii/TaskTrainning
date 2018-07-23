package impl;

import com.iceneet.Entity.signup;
import dao.signupDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;

public class signupDAOimpl implements signupDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public signupDAOimpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public signupDAOimpl() {

    }

    public signup FindSignupByName(String name) {
        String sql = "SELECT Id,Name FROM signup WHERE name=?";
        return jdbcTemplate.queryForObject(sql, (ResultSet rs, int rowNumber) -> {
            signup signup =new signup();
            signup.setId(rs.getLong("id"));
            signup.setName(rs.getString("name"));
            return signup;
        },name);
    }

    public int InsertSignup(signup signup) {
        String sql = "INSERT INTO signup(name,qq) VALUE (?,?)";
        return jdbcTemplate.update(sql, signup.getName(),signup.getQq());
    }

    public int DeleteByName(String name){
        String sql = "Delete from WHERE name=?";
        return jdbcTemplate.update(sql,name);
    }
    public int UpdateByName(String name) {
        String sql = "UPDATE signup SET Name='张三' WHERE name=?";
        return jdbcTemplate.update(sql,name);
    }


}
