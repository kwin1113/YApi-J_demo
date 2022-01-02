package xyz.kwin.yapi.model;

import java.io.Serializable;

/**
 * 基础类
 *
 * @author kwin
 */
public class BaseVO implements Serializable {
    /**
     * 类型 true
     */
    private Integer type;
    /**
     * 地址 true
     */
    private String address;
    /**
     * 经度 true
     */
    private Double longitude;
    /**
     * 纬度 true
     */
    private Double latitude;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
