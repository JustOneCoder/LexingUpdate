package com.lexing360.app.lexingupdate;

import com.lexing360.app.lexingupdate.model.LayoutModel;
import com.lexing360.app.lexingupdate.model.ResponseModel;

import org.reactivestreams.Subscriber;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

/**
 * Created by fenglingfeng on 2018/2/2.
 */

public class Api {

    //当前版本
    public static String CURRENRT_VERSION = "";
    //升级到的版本
    public static String UPDATE_VERSION = "1.2.0";
    //渠道名称
    public static String CHANNEL = "app";

    public static final String URL_BASE = "http://gateway-dev.lexing360.com/";

    //获取JWT
    public static final String URL_GET_JWT = URL_BASE + "v1/vendors/auth-by-password";

    //更新升级
    public static final String URL_BASE_UPDATE = URL_BASE + "v1/app/versions/";

    //推送更新升级
    //public static final String URL_PUT_UPDATE = URL_BASE + "v1/app/versions/";

    //更新会话推送布局
    public static final String URL_GET_LAYOUT = URL_BASE + "v1/messageSettings";


    public static void subscribe(Flowable flowable, Subscriber subscriber){
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    public interface ApiServices {

        @PUT("v1/messageSettings")
        @Headers("Content-Type: application/json")
        Flowable<ResponseModel> putXmlInfo(@Body LayoutModel.DataBean s);

        @GET("v1/messageSettings")
        Call<LayoutModel> getXmlInfo();

    }

}
