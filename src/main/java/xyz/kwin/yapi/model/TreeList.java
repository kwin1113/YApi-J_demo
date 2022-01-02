package xyz.kwin.yapi.model;

import java.io.Serializable;
import java.util.List;

/**
 * 树列表
 *
 * @author kwin
 */
public class TreeList implements Serializable {

    /**
     * 数量 true
     */
    private Integer count;

    /**
     * 树节点 false
     */
    private List<Tree> list;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Tree> getList() {
        return list;
    }

    public void setList(List<Tree> list) {
        this.list = list;
    }
}
