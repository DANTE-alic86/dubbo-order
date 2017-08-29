package com.gupao.alic.dubbo.order;

/**
 * Created by alic86 on 2017/8/24.
 */
public class OrderServiceImpl implements IOrderService {
    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("曾经来过:"+request);
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("1000");
        response.setMemo("处理成功");
        return response;
    }
}
