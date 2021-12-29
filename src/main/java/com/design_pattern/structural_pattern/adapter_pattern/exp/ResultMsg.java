package com.design_pattern.structural_pattern.adapter_pattern.exp;

import lombok.Data;

@Data
public class ResultMsg {
    private Integer code;
    private String msg;
    private Object data;

    public ResultMsg(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
