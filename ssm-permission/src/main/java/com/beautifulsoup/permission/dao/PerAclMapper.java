package com.beautifulsoup.permission.dao;

import com.beautifulsoup.permission.dataobject.PerAcl;
import com.beautifulsoup.permission.dataobject.PerAclExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerAclMapper {
    int countByExample(PerAclExample example);

    int deleteByExample(PerAclExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerAcl record);

    int insertSelective(PerAcl record);

    List<PerAcl> selectByExample(PerAclExample example);

    PerAcl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerAcl record, @Param("example") PerAclExample example);

    int updateByExample(@Param("record") PerAcl record, @Param("example") PerAclExample example);

    int updateByPrimaryKeySelective(PerAcl record);

    int updateByPrimaryKey(PerAcl record);
}