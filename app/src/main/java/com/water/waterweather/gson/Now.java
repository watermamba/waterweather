package com.water.waterweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by water on 2017/4/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
