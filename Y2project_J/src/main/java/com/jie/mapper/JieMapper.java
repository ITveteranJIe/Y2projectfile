package com.jie.mapper;
import com.jie.pojo.Projectdata.userList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/221:39     Mapper 接口      JieMapper
 * -♥---J
 */
@Mapper
@Repository
public interface JieMapper {
   /**userTableSelect【Disco Fox Classics】*/
   List<userList> selectAll();
}
