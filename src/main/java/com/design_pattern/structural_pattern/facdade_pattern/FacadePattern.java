package com.design_pattern.structural_pattern.facdade_pattern;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class FacadePattern {
    /*
    大部分工具类 整个api都是外观模式
     */
}
class FacesUtils{
    public String getTime(){
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }
    public String getA(){
        return "Q";
    }
}
