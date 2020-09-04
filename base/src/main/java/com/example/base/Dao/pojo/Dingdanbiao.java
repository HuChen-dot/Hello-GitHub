package com.example.base.Dao.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Dingdanbiao implements Serializable {
        //
        private Integer id;
        //
        private Date riqi;
        //
        private Integer gukeid;
        //get set 方法
            public void setId (Integer  id){
                this.id=id;
            }
            public  Integer getId(){
                return this.id;
            }
            public void setRiqi (Date  riqi){
                this.riqi=riqi;
            }
            public  Date getRiqi(){
                return this.riqi;
            }
            public void setGukeid (Integer  gukeid){
                this.gukeid=gukeid;
            }
            public  Integer getGukeid(){
                return this.gukeid;
            }
}
