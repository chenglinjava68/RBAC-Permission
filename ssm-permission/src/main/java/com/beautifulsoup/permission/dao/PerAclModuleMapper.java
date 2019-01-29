package com.beautifulsoup.permission.dao;

import com.beautifulsoup.permission.dataobject.PerAclModule;
import com.beautifulsoup.permission.dataobject.PerAclModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerAclModuleMapper {
    int countByExample(PerAclModuleExample example);

    int deleteByExample(PerAclModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerAclModule record);

    int insertSelective(PerAclModule record);

    List<PerAclModule> selectByExample(PerAclModuleExample example);

    PerAclModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerAclModule record, @Param("example") PerAclModuleExample example);

    int updateByExample(@Param("record") PerAclModule record, @Param("example") PerAclModuleExample example);

    int updateByPrimaryKeySelective(PerAclModule record);

    int updateByPrimaryKey(PerAclModule record);
}