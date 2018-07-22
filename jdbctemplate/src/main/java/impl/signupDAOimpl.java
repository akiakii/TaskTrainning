package impl;

import Entity.Signup;
import dao.signupDAO;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;

public class signupDAPimpl implements signupDAO {
    private JdbcTemplate jdbcTemplate;

    public Signup FindSignupByName(String name) {
        String sql = "SELECT Id,Name FROM signup WHERE name=?";
        return jdbcTemplate.queryForObject(sql, (ResultSet rs, int rowNumber) -> {
            Signup signup = new Signup();
            signup.setId(rs.getLong("id"));
            signup.setName(rs.getString("name"));
            return signup;
        },name);
    }

    public int InsertSignup(Signup signup) {
        String sql = "INSERT INTO signup(name,qq) VALUE (?,?)";
        return jdbcTemplate.update(sql, signup.getName(),signup.getQq());
    }

    public int DeleteByName(String name){
        String sql = "Delete from WHERE name=?";
        return jdbcTemplate.update(sql,"张三");
    }

    public int UpdateByName(String name) {
        String sql = "UPDATE signup SET Name='张三' WHERE name=?";
        return jdbcTemplate.update(sql,name);
    }

}
