package com.beautifulsoup.permission.dao;

import com.beautifulsoup.permission.dataobject.PerRoleAcl;
import com.beautifulsoup.permission.dataobject.PerRoleAclExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerRoleAclMapper {
    int countByExample(PerRoleAclExample example);

    int deleteByExample(PerRoleAclExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerRoleAcl record);

    int insertSelective(PerRoleAcl record);

    List<PerRoleAcl> selectByExample(PerRoleAclExample example);

    PerRoleAcl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerRoleAcl record, @Param("example") PerRoleAclExample example);

    int updateByExample(@Param("record") PerRoleAcl record, @Param("example") PerRoleAclExample example);

    int updateByPrimaryKeySelective(PerRoleAcl record);

    int updateByPrimaryKey(PerRoleAcl record);
}