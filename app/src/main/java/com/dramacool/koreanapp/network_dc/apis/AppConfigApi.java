package com.dramacool.koreanapp.network_dc.apis;

import com.dramacool.koreanapp.network_dc.model.AppConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AppConfigApi {

    @GET("get_config")
    Call<AppConfig> getAppConfig(@Query("api_secret_key") String apiKey);

}
