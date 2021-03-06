package com.clockbone.dao;

import com.clockbone.model.TblBusiness;

public interface TblBusinessMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblBusiness record);

    int insertSelective(TblBusiness record);

    TblBusiness selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblBusiness record);

    int updateByPrimaryKey(TblBusiness record);
}