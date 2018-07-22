package com.iceneet.dao.mapper;

import com.iceneet.Entity.signup;

import java.util.List;

public interface SignupDao {
    List<signup> selectSignup();
    void insertSignup(signup signup);
    boolean updateSignup(String name);
    boolean deleteSignup(long id);
}
