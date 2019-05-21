package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountName(){
        return countName;
    }
    public void setCountName(String countName){
        this.countName=countName;
    }
    public String getweatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.cityId=cityId;
    }
    public int  getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }

}
