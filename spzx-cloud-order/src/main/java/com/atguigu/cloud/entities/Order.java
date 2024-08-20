package com.atguigu.cloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName t_order
 */
@TableName(value ="t_order")
public class Order implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userid;

    /**
     * 订单名
     */
    private String name;

    /**
     * 金额
     */
    private Integer price;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 额外信息说明
     */
    private String extrainfo;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户id
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 用户id
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 订单名
     */
    public String getName() {
        return name;
    }

    /**
     * 订单名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 金额
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 金额
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 额外信息说明
     */
    public String getExtrainfo() {
        return extrainfo;
    }

    /**
     * 额外信息说明
     */
    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getExtrainfo() == null ? other.getExtrainfo() == null : this.getExtrainfo().equals(other.getExtrainfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getExtrainfo() == null) ? 0 : getExtrainfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", extrainfo=").append(extrainfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}