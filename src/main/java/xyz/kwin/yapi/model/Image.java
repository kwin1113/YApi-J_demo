package xyz.kwin.yapi.model;

import java.io.Serializable;

/**
 * 图片
 */
public class Image implements Serializable {
    /**
     * 名称 true
     */
    private String name;
    /**
     * 图片地址 true
     */
    private String url;
    /**
     * 图片的长度，单位像素
     */
    private Integer length;
    /**
     * 图片的宽度，单位像素
     */
    private Integer width;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
