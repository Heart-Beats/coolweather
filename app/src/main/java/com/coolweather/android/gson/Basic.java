package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 淡然爱汝不离 on 2017/12/19 0019.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
