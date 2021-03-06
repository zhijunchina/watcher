package com.will.watcher.yaml.model;

import java.io.Serializable;

/**
 * Created by tong on 2014/6/17.
 */
public class ServiceData implements Serializable {
    private String service;
    private String query;
    private String json;
    private String desc;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public String getDesc() {
        return desc==null?"":desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
