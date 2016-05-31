package com.didiincubator.Beans;

import java.io.Serializable;

/**
 * Created by 枫叶1 on 2016/5/24.
 * 孵化器信息表对象
 */
public class DidiBean implements Serializable{
    private static final long serialVersionUID = 5192843888413143548L;
    private int id;
    private String name;//名称
    private String sketch;//简述
    private int detail_id;//详细介绍id
    private int Station_id;//工位情况id
    private float coordinateX;
    private float coordinateY;//位置坐标
    private String type_didi;//孵化器项目类型
    private String phonenumber;//联系电话
    private String headPortrait;//头像

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    public int getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(int detail_id) {
        this.detail_id = detail_id;
    }

    public int getStation_id() {
        return Station_id;
    }

    public void setStation_id(int station_id) {
        Station_id = station_id;
    }

    public String getType_didi() {
        return type_didi;
    }

    public void setType_didi(String type_didi) {
        this.type_didi = type_didi;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public float getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(float coordinateX) {
        this.coordinateX = coordinateX;
    }

    public float getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(float coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public DidiBean() {
    }

    public DidiBean(int id, String name, String sketch, int detail_id, int station_id, float coordinateX, float coordinateY, String type_didi, String phonenumber, String headPortrait) {
        this.id = id;
        this.name = name;
        this.sketch = sketch;
        this.detail_id = detail_id;
        Station_id = station_id;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type_didi = type_didi;
        this.phonenumber = phonenumber;
        this.headPortrait = headPortrait;
    }


    @Override
    public String toString() {
        return "DidiBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sketch='" + sketch + '\'' +
                ", detail_id=" + detail_id +
                ", Station_id=" + Station_id +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", type_didi='" + type_didi + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", headPortrait='" + headPortrait + '\'' +
                '}';
    }
}
