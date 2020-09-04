package com.example.base.Dao.service.gongyingshang;

import com.example.base.Dao.mapper.GongyingshangMapper;
import com.example.base.Dao.pojo.Gongyingshang;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class GongyingshangServiceImpl implements GongyingshangService {


    @Resource
    private GongyingshangMapper gongyingshangMapper;

    /**
     * 根据id查询；返回单个对象
     */
    public Gongyingshang getGongyingshangById(Long id) throws Exception {
        return gongyingshangMapper.getGongyingshangById(id);
    }

    /**
     * 根据条件查询；返回多个对象
     */
    public List<Gongyingshang> getGongyingshangListByMap(Map<String, Object> param) throws Exception {
        return gongyingshangMapper.getGongyingshangListByMap(param);
    }

    /**
     * 查询数量：根据传入的条件查询目标数量；返回查询的数量
     */
    public Integer getGongyingshangCountByMap(Map<String, Object> param) throws Exception {
        return gongyingshangMapper.getGongyingshangCountByMap(param);
    }

    /**
     * 添加：根据传入的参数添加信息；返回影响的行数
     */
    public Integer AddGongyingshang(Gongyingshang gongyingshang) throws Exception {
        return gongyingshangMapper.insertGongyingshang(gongyingshang);
    }

    /**
     * 根据id修改：根据传入的参数修改对应的数据库类；返回影响的行数
     */
    public Integer ModifyGongyingshang(Gongyingshang gongyingshang) throws Exception {
        return gongyingshangMapper.updateGongyingshang(gongyingshang);
    }

    /**
     * 删除： 根据map删除对象；返回影响的行数
     */
    public Integer DeleteGongyingshangById(Long id) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("invid", id);
        return gongyingshangMapper.deleteGongyingshangByMap(map);
    }

    /**
     * 根据条件分页查询；返回分页查询后的多个对象
     */
    public PageInfo<Gongyingshang> queryGongyingshangPageByMap(Map<String, Object> param, Integer pageNo, Integer pageSize) throws Exception {
        //设置分页的起始页数和页面容量
        PageHelper.startPage(pageNo, pageSize);
        //正常查询数据库，mybatis拦截器已经把原始sql拦截下来做好了分页
        List<Gongyingshang> gongyingshangList = gongyingshangMapper.getGongyingshangListByMap(param);
        //把查询出来分页好的数据放进插件的分页对象中
        PageInfo<Gongyingshang> info = new PageInfo<Gongyingshang>(gongyingshangList);
        return info;
    }

}
