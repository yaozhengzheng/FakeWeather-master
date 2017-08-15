package com.liyu.fakeweather.http.api;

import com.liyu.fakeweather.http.BaseBusResponse;
import com.liyu.fakeweather.model.BusLineDetail;
import com.liyu.fakeweather.model.BusLineNearby;
import com.liyu.fakeweather.model.BusLineSearch;
import com.liyu.fakeweather.model.BusLineStation;
import com.liyu.fakeweather.model.BusNotice;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 公交查询的接口
 * Created by liyu on 2016/10/31.
 */

public interface BusController {

    String uid = "0";

    String deviceID = "12345678";

    String sign = "539f272911d2bb23117ea6211cce1bb5";

    @GET("http://content.2500city.com/api18/bus/searchLine")
    Observable<BaseBusResponse<BusLineSearch>> searchLine(@Query("name") String name);

    @GET("http://content.2500city.com/api18/bus/getLineInfo")
    Observable<BaseBusResponse<BusLineDetail>> getLineInfo(@QueryMap Map<String, String> options);

    @GET("http://content.2500city.com/api18/bus/getVicinity")
    Observable<BaseBusResponse<BusLineNearby>> getVicinity(@QueryMap Map<String, String> options);

    @GET("http://content.2500city.com/api18/bus/getStationInfo")
    Observable<BaseBusResponse<BusLineStation>> getStationInfo(@QueryMap Map<String, String> options);

    @GET("http://bus.wisesz.mobi/v3/api/bus/tabMenu")
    Observable<BusNotice> getBusNotices();

}
