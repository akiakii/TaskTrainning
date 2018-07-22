package dao;

import Entity.Signup;

public interface signupDAO {
    //
    Signup FindSignupByName(String name);
    int InsertSignup(Signup signup);
    int DeleteByName(String name);
    int UpdateByName(String name);
}
