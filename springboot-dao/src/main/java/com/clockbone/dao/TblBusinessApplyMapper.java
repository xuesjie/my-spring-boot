package com.clockbone.dao;

import com.clockbone.model.TblBusinessApply;
import com.clockbone.model.TblTaskAssigne;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblBusinessApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblBusinessApply record);

    int insertSelective(TblBusinessApply record);

    TblBusinessApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblBusinessApply record);

    int updateByPrimaryKey(TblBusinessApply record);

    List<TblBusinessApply> selectApplyList(@Param("param") TblBusinessApply param);

    List<TblTaskAssigne> selectTaskAssigne(String taskId);

    TblBusinessApply selectByProcessId(String processId);
}