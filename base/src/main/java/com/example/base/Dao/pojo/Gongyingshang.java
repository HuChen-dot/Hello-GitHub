package com.example.base.Dao.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Gongyingshang implements Serializable {
        //
        private Integer id;
        //
        private String name;
        //
        private String form;
        //
        private String dianhua;
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
            public void setForm (String  form){
                this.form=form;
            }
            public  String getForm(){
                return this.form;
            }
            public void setDianhua (String  dianhua){
                this.dianhua=dianhua;
            }
            public  String getDianhua(){
                return this.dianhua;
            }
}
