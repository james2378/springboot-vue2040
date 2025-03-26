package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 民俗介绍
 *
 * @author 
 * @email
 */
@TableName("minshu")
public class MinshuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MinshuEntity() {

	}

	public MinshuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Minshu{" +
            "id=" + id +
            ", minshuName=" + minshuName +
            ", minshuPhoto=" + minshuPhoto +
            ", minshuTypes=" + minshuTypes +
            ", minshuContent=" + minshuContent +
            ", createTime=" + createTime +
        "}";
    }
}
