package com.design_pattern.behavioral_pattern.template_mathod;

public abstract class StudyAbroad {
    public  void ApplyForVisa(){
        System.out.println("申请签证");
    }
    public  void ReadyGoAbroad(){
        System.out.println("准备出国");
    }
    public abstract void ApplyForEnrol();
    public abstract void LookingForSchool();
    public abstract void Arriving();
    public void TemplateMethod() //模板方法
    {
        LookingForSchool(); //索取学校资料
        ApplyForEnrol();    //入学申请
        ApplyForVisa();     //申请签证
        ReadyGoAbroad();    //体检、订机票、准备行装
        Arriving();         //抵达
    }
}
