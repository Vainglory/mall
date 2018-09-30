package vg.service;

import vg.bean.CartInfo;

import java.util.List;

public interface CartService {
    CartInfo ifCartExits(CartInfo cartInfo);

    void updateCart(CartInfo cartInfoDb);

    void insertCart(CartInfo cartInfo);

    void flushCartCartCacheByUsrId(String userId);

    List<CartInfo> getCartInfosFromCacheByUserId(String userId);

    void updateCartByUserId(CartInfo cartInfo);

    void combine(String userId, String listCartCookie);

    void deleteCart(String join, String userId);
}
