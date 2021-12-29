package com.design_pattern.structural_pattern.adapter_pattern.exp;

public class SignInService {
    public ResultMsg regist(String userName,String passwd){
        return new ResultMsg(200,"注册成功",new Member());
    }
    public ResultMsg login(String userName,String passwd){
        return null;
    }
}
