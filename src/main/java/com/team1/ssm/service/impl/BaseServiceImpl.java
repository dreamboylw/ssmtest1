package com.team1.ssm.service.impl;

import com.team1.ssm.service.BaseService;
import com.team1.ssm.util.MyMapper;
import lombok.Data;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/4/27.
 */
@Data
@Service
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired(required = false)
    private MyMapper<T> myMapper;
    @Override
    public T selectByPrimaryKey(Object key) {
        return myMapper.selectByPrimaryKey(key);
    }

    @Override
    public List<T> select(T t) {
        return myMapper.select(t);
    }

    @Override
    public List<T> selectAll() {
        return myMapper.selectAll();
    }

    @Override
    public T selectOne(T t) {
        return myMapper.selectOne(t);
    }

    @Override
    public int selectCount(T t) {
        return myMapper.selectCount(t);
    }

    @Override
    public int insert(T t) {
        return myMapper.insert(t);
    }

    @Override
    public int insertSelective(T t) {
        return myMapper.insertSelective(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return myMapper.updateByPrimaryKey(t);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return myMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public int delete(T t) {
        return myMapper.delete(t);
    }

    @Override
    public int deleteByPrimaryKey(Object key) {
        return myMapper.deleteByPrimaryKey(key);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return myMapper.selectByExample(example);
    }

    @Override
    public int selectCountByExample(Object example) {
        return myMapper.selectCountByExample(example);
    }

    @Override
    public int updateByExample(T record, Object example) {
        return myMapper.updateByExample(record,example);
    }

    @Override
    public int updateByExampleSelective(T record, Object example) {
        return myMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int deleteByExample(Object example) {
        return myMapper.deleteByExample(example);
    }

    @Override
    public List<T> selectByRowBounds(T t, RowBounds rowBounds) {
        return myMapper.selectByRowBounds(t,rowBounds);
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return myMapper.selectByExampleAndRowBounds(example,rowBounds);
    }

    @Override
    public int insertList(List<T> recordList) {
        return myMapper.insertList(recordList);
    }

    @Override
    public int insertUseGeneratedKeys(T t) {
        return myMapper.insertUseGeneratedKeys(t);
    }

    @Override
    public List<T> selectByIds(String ids) {
        return myMapper.selectByIds(ids);
    }

    @Override
    public int deleteByIds(String ids) {
        return myMapper.deleteByIds(ids);
    }
}
