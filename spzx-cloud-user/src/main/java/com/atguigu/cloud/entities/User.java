package com.atguigu.cloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @TableName t_user
 */
@TableName(value = "t_user")
public class User implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户地址
     */
    private String address;

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
     * 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 用户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 用户地址
     */
    public void setAddress(String address) {
        this.address = address;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
                && (this.getExtrainfo() == null ? other.getExtrainfo() == null : this.getExtrainfo().equals(other.getExtrainfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
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
        sb.append(", username=").append(username);
        sb.append(", address=").append(address);
        sb.append(", extrainfo=").append(extrainfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}