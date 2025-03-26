package com.entity.vo;

import com.entity.MinshuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 民俗介绍
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("minshu")
public class MinshuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 民俗标题
     */

    @TableField(value = "minshu_name")
    private String minshuName;


    /**
     * 民俗图片
     */

    @TableField(value = "minshu_photo")
    private String minshuPhoto;


    /**
     * 民俗类型
     */

    @TableField(value = "minshu_types")
    private Integer minshuTypes;


    /**
     * 民俗详情
     */

    @TableField(value = "minshu_content")
    private String minshuContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：民俗标题
	 */
    public String getMinshuName() {
        return minshuName;
    }


    /**
	 * 获取：民俗标题
	 */

    public void setMinshuName(String minshuName) {
        this.minshuName = minshuName;
    }
    /**
	 * 设置：民俗图片
	 */
    public String getMinshuPhoto() {
        return minshuPhoto;
    }


    /**
	 * 获取：民俗图片
	 */

    public void setMinshuPhoto(String minshuPhoto) {
        this.minshuPhoto = minshuPhoto;
    }
    /**
	 * 设置：民俗类型
	 */
    public Integer getMinshuTypes() {
        return minshuTypes;
    }


    /**
	 * 获取：民俗类型
	 */

    public void setMinshuTypes(Integer minshuTypes) {
        this.minshuTypes = minshuTypes;
    }
    /**
	 * 设置：民俗详情
	 */
    public String getMinshuContent() {
        return minshuContent;
    }


    /**
	 * 获取：民俗详情
	 */

    public void setMinshuContent(String minshuContent) {
        this.minshuContent = minshuContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
