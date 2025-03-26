package com.entity.view;

import com.entity.MinshuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 民俗介绍
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("minshu")
public class MinshuView extends MinshuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 民俗类型的值
		*/
		private String minshuValue;



	public MinshuView() {

	}

	public MinshuView(MinshuEntity minshuEntity) {
		try {
			BeanUtils.copyProperties(this, minshuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 民俗类型的值
			*/
			public String getMinshuValue() {
				return minshuValue;
			}
			/**
			* 设置： 民俗类型的值
			*/
			public void setMinshuValue(String minshuValue) {
				this.minshuValue = minshuValue;
			}













}
