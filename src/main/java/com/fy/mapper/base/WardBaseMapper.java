package com.fy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fy.bean.Ward;
/**
*  @author fy
*/
public interface WardBaseMapper {

    int insertWard(Ward object);

    int updateWard(Ward object);

    int update(Ward.UpdateBuilder object);

    List<Ward> queryWard(Ward object);

    Ward queryWardLimit1(Ward object);

}