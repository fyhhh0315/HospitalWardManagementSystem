package com.fy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fy.model.prescriptions;
/**
*  @author fy
*/
public interface prescriptionsBaseMapper {

    int insertprescriptions(prescriptions object);

    int updateprescriptions(prescriptions object);

    int update(prescriptions.UpdateBuilder object);

    List<prescriptions> queryprescriptions(prescriptions object);

    prescriptions queryprescriptionsLimit1(prescriptions object);

}