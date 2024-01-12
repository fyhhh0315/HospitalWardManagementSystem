package com.fy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fy.bean.Bed;
/**
*  @author fy
*/
public interface BedBaseMapper {

    int insertBed(Bed object);

    int updateBed(Bed object);

    int update(Bed.UpdateBuilder object);

    List<Bed> queryBed(Bed object);

    Bed queryBedLimit1(Bed object);


}