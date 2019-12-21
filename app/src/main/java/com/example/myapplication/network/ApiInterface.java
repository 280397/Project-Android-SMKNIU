package com.example.myapplication.network;

import com.example.myapplication.model.ResponseAdd;
import com.example.myapplication.model.ResponseAdmin;
import com.example.myapplication.model.ResponseData;
import com.example.myapplication.model.ResponseKembali;
import com.example.myapplication.model.ResponseLogin;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
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

    @GET("api/Aju_pinjam")
    Call<ResponseAdmin> getAdmin(
            @Query("id_admin") String id_admin
    );

//    pengembalian
@GET("api/barang")
Call<ResponseKembali> getDatapinjam();

    @DELETE("api/pinjam/{id}")
    Call<ResponseAdd> delAddList(
            @Path("id") String id
    );
    @FormUrlEncoded
    @POST("api/Aju_pinjam/{id_user_pjm}")
    Call<ResponseAdd> putData(
            @Path("id_user_pjm") String id_user_pjm,
//            @Field("kode") String kode,
//            @Field("id_user_pjm") String id_user_pjm,
//            @Field("tgl_pinjam") String tgl_pinjam,
            @Field("tgl_kembali") String tgl_kembali,
            @Field("id_admin") String id_admin,
            @Field("keperluan") String keperluan
    );
    @FormUrlEncoded
    @POST("api/pinjam/sekian")
    Call<ResponseData> postPinjamSe(
//            @Field("kode") String kode,
            @Field("id_user_pjm") String id_user_pjm,

            @Field("barcode") String barcode
//            @Field("tgl_pinjam") String tgl_pinjam,
//            @Field("tgl_kembali") String tgl_kembali,
//            @Field("keperluan") String keperluan,
//            @Field("id_user") String id_user,
//            @Field("status") String status
    );

//    get admin add

}
