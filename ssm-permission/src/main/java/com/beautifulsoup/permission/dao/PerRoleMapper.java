package com.beautifulsoup.permission.dao;

import com.beautifulsoup.permission.dataobject.PerRole;
import com.beautifulsoup.permission.dataobject.PerRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerRoleMapper {
    int countByExample(PerRoleExample example);

    int deleteByExample(PerRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerRole record);

    int insertSelective(PerRole record);

    List<PerRole> selectByExample(PerRoleExample example);

    PerRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerRole record, @Param("example") PerRoleExample example);

    int updateByExample(@Param("record") PerRole record, @Param("example") PerRoleExample example);

    int updateByPrimaryKeySelective(PerRole record);

    int updateByPrimaryKey(PerRole record);
}