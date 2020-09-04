package com.example.base.Dao.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Chanpin implements Serializable {
        //
        private Integer id;
        //
        private String name;
        //
        private Integer gongyinid;
        //
        private Double jiage;
        //
        private String miaoshu;
        //get set 方法
            public void setId (Integer  id){
                this.id=id;
            }
            public  Integer getId(){
                return this.id;
            }
            public void setName (String  name){
                this.name=name;
            }
            public  String getName(){
                return this.name;
            }
            public void setGongyinid (Integer  gongyinid){
                this.gongyinid=gongyinid;
            }
            public  Integer getGongyinid(){
                return this.gongyinid;
            }
            public void setJiage (Double  jiage){
                this.jiage=jiage;
            }
            public  Double getJiage(){
                return this.jiage;
            }
            public void setMiaoshu (String  miaoshu){
                this.miaoshu=miaoshu;
            }
            public  String getMiaoshu(){
                return this.miaoshu;
            }
}
