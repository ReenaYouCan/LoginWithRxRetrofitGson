package com.reena.loginpoc.retrofit;

/**
 * Created by RA on 5/5/2017.
 */

public class ApiUtils {
    private ApiUtils() {
    }

    private static final String BASE_URL = "Your Base URL";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
