package xyz.kwin.yapi.model;

import java.util.List;

/**
 * 批量请求
 *
 * @author kwin
 */
public class BatchRequest {
    /**
     * id true
     */
    private String projectId;

    /**
     * 列表 true
     */
    private List<EntityRequest> requestList;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<EntityRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<EntityRequest> requestList) {
        this.requestList = requestList;
    }
}
