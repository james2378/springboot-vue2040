package com.dao;

import com.entity.MinshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MinshuView;

/**
 * 民俗介绍 Dao 接口
 *
 * @author 
 */
public interface MinshuDao extends BaseMapper<MinshuEntity> {

   List<MinshuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
