package com.liuyao.model;
import java.sql.Timestamp;
/**
 * @program: web
 * @description: member
 * @author: LiuB
 * @create: 2018-09-27 20:39
 **/
public class Member {
    private Long id;
    private String mid;
    private String mname;
    private Timestamp createtime;
    private Timestamp updatetime;
    private String sex;
    private String pwd;
    private String agroup;
    private String department;
    private String sign;

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", mid='" + mid + '\'' +
                ", mname='" + mname + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", sex='" + sex + '\'' +
                ", pwd='" + pwd + '\'' +
                ", agroup='" + agroup + '\'' +
                ", department='" + department + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAgroup() {
        return agroup;
    }

    public void setAgroup(String agroup) {
        this.agroup = agroup;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
