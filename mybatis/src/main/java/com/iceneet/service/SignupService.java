package service;

import Entity.Signup;
import dao.mapper.SignupMapper;

import javax.annotation.Resource;

public class SignupService{
    @Resource
    private SignupMapper signupMapper;

    public void save(Signup signup){
        signupMapper.save(signup);
    }

    public Signup getSignupPerson(String name) {
        return signupMapper.getSignupPerson(name);
    }

    public boolean updateSignup(String name){
        return signupMapper.updateSignup(name);
    }

    public boolean deleteSignup(String name){
        return signupMapper.deleteSignup(name);
    }

}
