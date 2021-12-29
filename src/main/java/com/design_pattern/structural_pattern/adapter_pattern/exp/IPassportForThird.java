package com.design_pattern.structural_pattern.adapter_pattern.exp;

public interface IPassportForThird {
    ResultMsg loginForTel(String telphone,String code);
    ResultMsg loginForWechat(String id);
    ResultMsg loginForResist(String userName,String passwd);
}
