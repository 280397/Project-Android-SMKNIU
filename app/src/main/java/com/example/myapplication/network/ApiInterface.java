package com.example.myapplication.network;

import com.example.myapplication.model.ResponseAdd;
import com.example.myapplication.model.ResponseData;
import com.example.myapplication.model.ResponseLogin;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("api/auth")
    Call<ResponseLogin> getUser(@Field("username") String username,
                                @Field("password") String password
    );
    @GET("api/barang")
    Call<ResponseData> getDatabarang();

    @GET("api/barang")
    Call<ResponseData> getSearch(
    );
    @GET("api/pinjam")
    Call<ResponseData> getPinjam(
            @Query("barcode") String barcode
            );
    @GET("api/pinjam/ambil")
    Call<ResponseAdd> getAddList(
            @Query("id_user_pjm") String id_user_pjm
    );
    @GET("api/pinjam/list")
    Call<ResponseAdd> getList(
            @Query("id_user_pjm") String id_user_pjm
    );
    @DELETE("api/pinjam/{id}")
    Call<ResponseAdd> delAddList(
            @Path("id") String id
    );
    @FormUrlEncoded
    @PUT("api/pinjam/{id}")
    Call<ResponseAdd> putData(
            @Path("id") String id_user_pjm,
            @Field("tgl_kembali") String tgl_kembali,
            @Field("id_user") String id_user,
            @Field("keperluan") String keperluan
    );
    @FormUrlEncoded
    @POST("api/pinjam")
    Call<ResponseData> postPinjamSe(
            @Field("id_user_pjm") String id_user_pjm,
            @Field("barcode") String barcode,
            @Field("id_barang") String id_barang
    );
}
