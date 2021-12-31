package com.design_pattern.behavioral_pattern.template_mathod;

public class StudyAmerica extends StudyAbroad {
    @Override
    public void ApplyForEnrol() {
        System.out.println("准备美国大学入学申请");
    }

    @Override
    public void LookingForSchool() {
        System.out.println("寻找学校");
    }

    @Override
    public void Arriving() {
        System.out.println("抵达学校");
    }
}
