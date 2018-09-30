package vg.service;

import vg.bean.OrderInfo;

public interface OrderService {

    void saveOrder(OrderInfo orderInfo);

    String getTradeCode(String userId);

    boolean checkTradeCode(String userId, String tradeCode);

    OrderInfo getOrderinfoByOutTradeNo(String out_trade_no);

    OrderInfo updateOrder(OrderInfo orderInfo);

    void sendOrderResultQueue(OrderInfo orderInfo);
}
