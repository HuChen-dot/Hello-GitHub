package com.example.base.Dao.service.chanpin;

import com.example.base.Dao.pojo.Chanpin;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * Founder : 泽宇
 */
public interface ChanpinService {

    /**
     * 根据id查询；返回单个对象
     */
    public Chanpin getChanpinById(Long id) throws Exception;

    /**
     * 根据条件查询；返回多个对象
     */
    public List<Chanpin> getChanpinListByMap(Map<String, Object> param) throws Exception;

    /**
     * 查询数量：根据传入的条件查询目标数量；返回查询的数量
     */
    public Integer getChanpinCountByMap(Map<String, Object> param) throws Exception;

    /**
     * 添加：根据传入的参数添加信息；返回影响的行数
     */
    public Integer AddChanpin(Chanpin chanpin) throws Exception;

    /**
     * 根据id修改：根据传入的参数修改对应的数据库类；返回影响的行数
     */
    public Integer ModifyChanpin(Chanpin chanpin) throws Exception;

    /**
     * 删除： 根据id删除对象；返回影响的行数
     */
    public Integer DeleteChanpinById(Long id) throws Exception;

    /**
     * 根据条件分页查询；返回分页查询后的多个对象
     */
    public PageInfo<Chanpin> queryChanpinPageByMap(Map<String, Object> param, Integer pageNo, Integer pageSize) throws Exception;
}
