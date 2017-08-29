package com.gupao.alic.dubbo.order;

import java.io.Serializable;

/**
 * Created by alic86 on 2017/8/24.
 */
public class DoOrderRequest implements Serializable {
    private static final long serialVersionUID = 3061574816503574883L;
    private String name;
    private String code;
    private String memo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
