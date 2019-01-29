package com.beautifulsoup.permission.dao;

import com.beautifulsoup.permission.dataobject.PerDept;
import com.beautifulsoup.permission.dataobject.PerDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerDeptMapper {
    int countByExample(PerDeptExample example);

    int deleteByExample(PerDeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerDept record);

    int insertSelective(PerDept record);

    List<PerDept> selectByExample(PerDeptExample example);

    PerDept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerDept record, @Param("example") PerDeptExample example);

    int updateByExample(@Param("record") PerDept record, @Param("example") PerDeptExample example);

    int updateByPrimaryKeySelective(PerDept record);

    int updateByPrimaryKey(PerDept record);
}