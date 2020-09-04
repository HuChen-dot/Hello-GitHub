package com.example.base.Dao.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Jiaoyixinxi implements Serializable {
        //
        private Integer id;
        //
        private Integer dingdanid;
        //
        private Integer chanpinid;
        //
        private Integer shuliang;
        //
        private Double zongjiage;
        //get set 方法
            public void setId (Integer  id){
                this.id=id;
            }
            public  Integer getId(){
                return this.id;
            }
            public void setDingdanid (Integer  dingdanid){
                this.dingdanid=dingdanid;
            }
            public  Integer getDingdanid(){
                return this.dingdanid;
            }
            public void setChanpinid (Integer  chanpinid){
                this.chanpinid=chanpinid;
            }
            public  Integer getChanpinid(){
                return this.chanpinid;
            }
            public void setShuliang (Integer  shuliang){
                this.shuliang=shuliang;
            }
            public  Integer getShuliang(){
                return this.shuliang;
            }
            public void setZongjiage (Double  zongjiage){
                this.zongjiage=zongjiage;
            }
            public  Double getZongjiage(){
                return this.zongjiage;
            }
}
