package xyz.kwin.yapi.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.kwin.yapi.model.*;

/**
 * Spring Controller
 *
 * @author kwin
 * @since 2022/1/1 7:54 PM
 */
@RestController
@RequestMapping("/basePath")
public interface SpringController {

    /**
     * （Spring Controller）根据id获取树信息
     *
     * @param context 网关上下文 true
     * @param id      树id true
     * @return 树信息
     */
    @RequestMapping(method = RequestMethod.GET, value = "/spring/getById/{id}")
    Tree getById(GatewayContext context, @PathVariable String id);

    /**
     * （Spring Controller）批量请求树
     *
     * @param context      网关上下文 true
     * @param batchRequest 批量请求信息 true
     * @return 树信息列表
     */
    @RequestMapping(method = RequestMethod.POST, value = "/spring/batchQuery")
    PaginationData<TreeList> getTreeList(GatewayContext context, BatchRequest batchRequest);

}
