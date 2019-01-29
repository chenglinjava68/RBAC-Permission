package com.beautifulsoup.permission.dao;

import com.beautifulsoup.permission.dataobject.PerRoleUser;
import com.beautifulsoup.permission.dataobject.PerRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerRoleUserMapper {
    int countByExample(PerRoleUserExample example);

    int deleteByExample(PerRoleUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerRoleUser record);

    int insertSelective(PerRoleUser record);

    List<PerRoleUser> selectByExample(PerRoleUserExample example);

    PerRoleUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerRoleUser record, @Param("example") PerRoleUserExample example);

    int updateByExample(@Param("record") PerRoleUser record, @Param("example") PerRoleUserExample example);

    int updateByPrimaryKeySelective(PerRoleUser record);

    int updateByPrimaryKey(PerRoleUser record);
}