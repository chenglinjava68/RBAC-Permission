package com.beautifulsoup.permission.dataobject;

import java.util.Date;

public class PerDept {
    private Integer id;

    private String name;

    private Integer parentId;

    private String level;

    private Integer seq;

    private String remark;

    private String oprator;

    private Date oprateTime;

    private String oprateIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOprator() {
        return oprator;
    }

    public void setOprator(String oprator) {
        this.oprator = oprator == null ? null : oprator.trim();
    }

    public Date getOprateTime() {
        return oprateTime;
    }

    public void setOprateTime(Date oprateTime) {
        this.oprateTime = oprateTime;
    }

    public String getOprateIp() {
        return oprateIp;
    }

    public void setOprateIp(String oprateIp) {
        this.oprateIp = oprateIp == null ? null : oprateIp.trim();
    }
}