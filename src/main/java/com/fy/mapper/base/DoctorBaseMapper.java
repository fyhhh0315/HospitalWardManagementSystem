package com.fy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fy.bean.Doctor;
/**
*  @author fy
*/
public interface DoctorBaseMapper {

    int insertDoctor(Doctor object);

    int updateDoctor(Doctor object);

    int update(Doctor.UpdateBuilder object);

    List<Doctor> queryDoctor(Doctor object);

    Doctor queryDoctorLimit1(Doctor object);

}