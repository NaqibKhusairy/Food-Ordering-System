package com.order.foododeringsystem;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface NetworkService {
    @FormUrlEncoded
    @POST("register.php")
    Call<RegistrationResponseModel> register(@FieldMap HashMap<String, String> params);

    @FormUrlEncoded
    @POST("login.php")
    Call<LoginResponseModel> login(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("cart.php")
    Call<CartResponseModel> cart(@FieldMap HashMap<String, String> params);

    @FormUrlEncoded
    @POST("editUserProfil.php")
    Call<editUserProfilResponseModel> editUserProfil(@FieldMap HashMap<String, String> params);

    @FormUrlEncoded
    @POST("deleteUserProfil.php")
    Call<DeleteUserResponseModel> deleteUser(@FieldMap HashMap<String, String> params);
}
