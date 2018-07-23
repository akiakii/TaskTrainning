package dao;

import com.iceneet.Entity.signup;

public interface signupDAO {
    //
    signup FindSignupByName(String name);
    int InsertSignup(signup signup);
    int DeleteByName(String name);
    int UpdateByName(String name);
}
