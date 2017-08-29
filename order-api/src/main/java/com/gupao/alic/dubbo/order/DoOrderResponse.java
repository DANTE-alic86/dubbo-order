package com.gupao.alic.dubbo.order;

import java.io.Serializable;

/**
 * Created by alic86 on 2017/8/24.
 */
public class DoOrderResponse implements Serializable {
    private static final long serialVersionUID = -4555892649005559527L;
    private Object data;
    private String code;
    private String memo;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
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
