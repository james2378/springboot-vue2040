package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MinshuEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 民俗介绍 服务类
 */
public interface MinshuService extends IService<MinshuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}