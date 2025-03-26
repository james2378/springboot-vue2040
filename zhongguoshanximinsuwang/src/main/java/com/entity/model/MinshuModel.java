package com.entity.model;

import com.entity.MinshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 民俗介绍
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MinshuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 民俗标题
     */
    private String minshuName;


    /**
     * 民俗图片
     */
    private String minshuPhoto;


    /**
     * 民俗类型
     */
    private Integer minshuTypes;


    /**
     * 民俗详情
     */
    private String minshuContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：民俗标题
	 */
    public String getMinshuName() {
        return minshuName;
    }


    /**
	 * 设置：民俗标题
	 */
    public void setMinshuName(String minshuName) {
        this.minshuName = minshuName;
    }
    /**
	 * 获取：民俗图片
	 */
    public String getMinshuPhoto() {
        return minshuPhoto;
    }


    /**
	 * 设置：民俗图片
	 */
    public void setMinshuPhoto(String minshuPhoto) {
        this.minshuPhoto = minshuPhoto;
    }
    /**
	 * 获取：民俗类型
	 */
    public Integer getMinshuTypes() {
        return minshuTypes;
    }


    /**
	 * 设置：民俗类型
	 */
    public void setMinshuTypes(Integer minshuTypes) {
        this.minshuTypes = minshuTypes;
    }
    /**
	 * 获取：民俗详情
	 */
    public String getMinshuContent() {
        return minshuContent;
    }


    /**
	 * 设置：民俗详情
	 */
    public void setMinshuContent(String minshuContent) {
        this.minshuContent = minshuContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
