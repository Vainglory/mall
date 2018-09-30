package vg.service;

import vg.bean.PaymentInfo;

import java.util.Map;

public interface PaymentService {
    void savePayment(PaymentInfo paymentInfo);

    void updatePaymentSuccess(PaymentInfo paymentInfo);
    
    void sendPaymentSuccessQueue(String out_trade_no, String trackingNo);

    void sendDelaPaymentResult(String outTradeNo, int i);

    Map<String, String> checkAlipayPayment(String outTradeNo);

    boolean checkStatus(String outTradeNo);

    void updatePayment(PaymentInfo paymentInfo);
}

