package com.beautifulsoup.permission.dao;

import com.beautifulsoup.permission.dataobject.PerLog;
import com.beautifulsoup.permission.dataobject.PerLogExample;
import com.beautifulsoup.permission.dataobject.PerLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerLogMapper {
    int countByExample(PerLogExample example);

    int deleteByExample(PerLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerLogWithBLOBs record);

    int insertSelective(PerLogWithBLOBs record);

    List<PerLogWithBLOBs> selectByExampleWithBLOBs(PerLogExample example);

    List<PerLog> selectByExample(PerLogExample example);

    PerLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerLogWithBLOBs record, @Param("example") PerLogExample example);

    int updateByExampleWithBLOBs(@Param("record") PerLogWithBLOBs record, @Param("example") PerLogExample example);

    int updateByExample(@Param("record") PerLog record, @Param("example") PerLogExample example);

    int updateByPrimaryKeySelective(PerLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PerLogWithBLOBs record);

    int updateByPrimaryKey(PerLog record);
}