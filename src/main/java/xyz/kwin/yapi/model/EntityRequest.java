package xyz.kwin.yapi.model;

/**
 * 实体请求
 *
 * @author kwin
 */
public class EntityRequest {
    /**
     * 名称 true
     */
    private String name;
    /**
     * 项目id true
     */
    private String projectId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
