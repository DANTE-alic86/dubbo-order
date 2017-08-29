package com.gupao.alic.dubbo.order;

/**
 * Created by alic86 on 2017/8/24.
 */
public interface IOrderService {
    /**
     *
     * @param 下单
     * @return
     */
    DoOrderResponse doOrder(DoOrderRequest request);
}
