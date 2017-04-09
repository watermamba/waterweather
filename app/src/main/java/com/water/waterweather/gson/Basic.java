package com.water.waterweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by water on 2017/4/9.
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
