package com.example.base.Dao.pojo;

import java.io.Serializable;
import java.util.Date;

/***
 *
 */
public class Guke implements Serializable {
    //
    private Integer id;
    //
    private String name;
    //
    private String dianhua;
    //
    private String mima;
    //
    private String dizhi;
    //
    private Double yue;

    //get set 方法
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDianhua(String dianhua) {
        this.dianhua = dianhua;
    }

    public String getDianhua() {
        return this.dianhua;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public String getMima() {
        return this.mima;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    public String getDizhi() {
        return this.dizhi;
    }

    public void setYue(Double yue) {
        this.yue = yue;
    }

    public Double getYue() {
        return this.yue;
    }

    @Override
    public String toString() {
        return "Guke{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dianhua='" + dianhua + '\'' +
                ", mima='" + mima + '\'' +
                ", dizhi='" + dizhi + '\'' +
                ", yue=" + yue +
                '}';
    }
}
