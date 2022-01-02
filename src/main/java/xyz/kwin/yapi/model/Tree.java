package xyz.kwin.yapi.model;

import java.util.List;

/**
 * 树节点
 *
 * @author kwin
 */
public class Tree extends BaseVO {
    /**
     * id true
     */
    private Long id;
    /**
     * 图片信息 true
     */
    private Image pointLocation;
    /**
     * 数量 true
     */
    private Integer count;
    /**
     * 是否选中 true
     */
    private Boolean checked;
    /**
     * 子列表 false
     */
    private List<Tree> rooms;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Image getPointLocation() {
        return pointLocation;
    }

    public void setPointLocation(Image pointLocation) {
        this.pointLocation = pointLocation;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public List<Tree> getRooms() {
        return rooms;
    }

    public void setRooms(List<Tree> rooms) {
        this.rooms = rooms;
    }
}
