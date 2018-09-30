package vg.service;

import vg.bean.UserAddress;
import vg.bean.UserInfo;

import java.util.List;

public interface UserService {

    public List<UserInfo> getUserList();

    UserInfo login(UserInfo userInfo);

    List<UserAddress> getAddressListByUserId(String userId);

    UserAddress getAddressListById(String addressId);

}


