package com.lfxf.licq.http;


import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by lcq on 2016/9/13.
 * 网络请求的接口都在这里
 */

public interface HttpService {
    /**
     * 测试接口
     *
     * @return
     */
    @POST("phone/ugm4_ugcCates.xhtml")
    Call<String> query();

}
