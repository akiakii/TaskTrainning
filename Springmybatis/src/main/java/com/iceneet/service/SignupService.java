package com.iceneet.service;


import com.iceneet.Entity.signup;
import com.iceneet.dao.SignupDao;
import org.springframework.beans.factory.annotation.Autowired;

public class SignupService {
    @Autowired
    private SignupDao signupDao;

    public signup SelectById(Long id){
        signup signup = signupDao.selectSignup(id);
        return signup;
    }

    public void InsertSignup(signup signup){
        signupDao.insertSignup(signup);
    }
    public boolean UpdateSignup(String name){
        return signupDao.updateSignup(name);
    }
    public boolean DeleteSignupById(Long id){
        return signupDao.deleteSignup(id);
    }
}
