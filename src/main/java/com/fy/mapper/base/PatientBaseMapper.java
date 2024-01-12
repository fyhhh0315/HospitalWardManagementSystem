package com.fy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fy.bean.Patient;
/**
*  @author fy
*/
public interface PatientBaseMapper {

    int insertPatient(Patient object);

    int updatePatient(Patient object);

    int update(Patient.UpdateBuilder object);

    List<Patient> queryPatient(Patient object);

    Patient queryPatientLimit1(Patient object);

}