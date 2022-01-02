package xyz.kwin.yapi.model;

import java.io.Serializable;
import java.util.List;

/**
 * 列表实体类
 *
 * @author kwin
 */
public class PaginationData<T> implements Serializable {

    /**
     * 总数
     */
    private Integer total;

    /**
     * 实体列表
     */
    private List<T> list;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
