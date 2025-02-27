package com.entity.model;

import com.entity.ZhanneiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 站内信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhanneiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 站内信息名称
     */
    private String zhanneiName;


    /**
     * 站内信息图片
     */
    private String zhanneiPhoto;


    /**
     * 站内信息时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 站内信息详情
     */
    private String zhanneiContent;


    /**
     * 创建时间 show1 nameShow
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
	 * 获取：站内信息名称
	 */
    public String getZhanneiName() {
        return zhanneiName;
    }


    /**
	 * 设置：站内信息名称
	 */
    public void setZhanneiName(String zhanneiName) {
        this.zhanneiName = zhanneiName;
    }
    /**
	 * 获取：站内信息图片
	 */
    public String getZhanneiPhoto() {
        return zhanneiPhoto;
    }


    /**
	 * 设置：站内信息图片
	 */
    public void setZhanneiPhoto(String zhanneiPhoto) {
        this.zhanneiPhoto = zhanneiPhoto;
    }
    /**
	 * 获取：站内信息时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：站内信息时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：站内信息详情
	 */
    public String getZhanneiContent() {
        return zhanneiContent;
    }


    /**
	 * 设置：站内信息详情
	 */
    public void setZhanneiContent(String zhanneiContent) {
        this.zhanneiContent = zhanneiContent;
    }
    /**
	 * 获取：创建时间 show1 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
