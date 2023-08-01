package com.order.foododeringsystem;

import com.google.gson.annotations.SerializedName;

public class ProfilResponseModel {

    @SerializedName("success")
    private String success;

    @SerializedName("phone_num")
    private String phone_num;

    @SerializedName("user_details")
    private UserDetailModel userDetailObject;

    public UserDetailModel getUserDetailObject() {
        return userDetailObject;
    }

    public String getSuccess() {
        return success;
    }

    public String getPhoneNumber() {
        return phone_num;
    }
}
