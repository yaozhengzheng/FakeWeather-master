package com.liyu.fakeweather.http;

import com.liyu.fakeweather.model.JiandanXXOO;

import java.util.List;

/**
 * Created by liyu on 2016/10/31.
 */

public class BaseJiandanResponse {
    public String status;
    public int current_page;
    public int total_comments;
    public int page_count;
    public int count;
    public List<JiandanXXOO> comments;
}
