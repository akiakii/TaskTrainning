//package com.iceneet.dao.mapper;
//
//import com.iceneet.Entity.signup;
//import org.apache.ibatis.annotations.*;
//
//
//public interface SignupMapper {
//    //查
//    @Select("select * from signup where name = #{name}")
//    signup getSignupPerson(@Param("name") String name);
//    //改
//    @Update("update signup set name=#{name} where name ='张三'")
//    boolean updateSignup(@Param("name") String name);
//    //删
//    @Delete("delete from signup where id = #{id}")
//    boolean deleteSignup(@Param("id") Long id);
//    //增
//    @Insert("INSERT INTO signup(name,qq) VALUES(#{name}, #{qq})")
//    void save(signup signup);
//}
