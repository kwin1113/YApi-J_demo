package xyz.kwin.yapi.custom_1;

import xyz.kwin.yapi.model.*;

/**
 * 自定义注册_1 Controller
 *
 * @author kwin
 */
public interface Custom1Controller {

    /**
     * （自定义注册_1）根据id获取树信息
     *
     * @param context 网关上下文 true
     * @param id      树id true
     * @return 树信息
     */
    @PathMapping(method = CustomRequestMethod.GET, value = "/custom_1/getById/{id}")
    Tree getById(GatewayContext context, String id);

    /**
     * （自定义注册_1）批量请求树
     *
     * @param context      网关上下文 true
     * @param batchRequest 批量请求信息 true
     * @return 树信息列表
     */
    @PathMapping(method = CustomRequestMethod.GET, value = "/custom_1/batchQuery")
    PaginationData<TreeList> getTreeList(GatewayContext context, BatchRequest batchRequest);
}
