package com.iceneet.dao;

import com.iceneet.Entity.signup;

public interface SignupDao {
    signup selectSignup(Long id);
    void insertSignup(signup signup);
    boolean updateSignup(String name);
    boolean deleteSignup(long id);
}
