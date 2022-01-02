package xyz.kwin.yapi.custom_2;

import xyz.kwin.yapi.model.*;

/**
 * 自定义注册_2 Controller
 *
 * @author kwin
 */
public interface Custom2Controller {

    /**
     * （自定义注册_2）根据id获取树信息
     *
     * @param context 网关上下文 true
     * @param id      树id true
     * @return 树信息
     * @clientApi custom.get.by.id
     * @clientVersion 1.0
     */
    Tree getById(GatewayContext context, String id);

    /**
     * （自定义注册_2）批量请求树
     *
     * @param context      网关上下文 true
     * @param batchRequest 批量请求信息 true
     * @return 树信息列表
     * @clientApi custom.get.tree
     * @clientVersion 1.0
     */
    PaginationData<TreeList> getTreeList(GatewayContext context, BatchRequest batchRequest);
}
