package com.design_pattern.structural_pattern.adapter_pattern.exp;

public class PassportForThirdAdapter extends SignInService implements IPassportForThird {
    @Override
    public ResultMsg loginForTel(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForResist(String userName, String passwd) {
        super.regist(userName,passwd);
        return super.login(userName,passwd);
    }
    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter loginAdapter = clazz.newInstance();
            if(loginAdapter.support(loginAdapter)){
                return loginAdapter.login(key,loginAdapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
      return null;
    }
}
