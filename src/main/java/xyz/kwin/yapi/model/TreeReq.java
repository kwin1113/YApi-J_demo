package xyz.kwin.yapi.model;

import java.io.Serializable;

/**
 * 树请求
 *
 * @author kwin
 */
public class TreeReq implements Serializable {
    /**
     * id true
     */
    private String id;
    /**
     * 是否添加区域 false
     */
    private Boolean addArea;
    /**
     * 是否添加公共数据 false
     */
    private Boolean addPublic;
    /**
     * 是否添加状态 false
     */
    private Boolean addStatus;
    /**
     * 是否添加信息数据 false
     */
    private Boolean addInfo;
    /**
     * 是否添加配置 false
     */
    private Boolean addChart;

}
