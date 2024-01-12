package com.fy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fy.model.PatientFeedback;
/**
*  @author fy
*/
public interface PatientFeedbackBaseMapper {

    int insertPatientFeedback(PatientFeedback object);

    int updatePatientFeedback(PatientFeedback object);

    int update(PatientFeedback.UpdateBuilder object);

    List<PatientFeedback> queryPatientFeedback(PatientFeedback object);

    PatientFeedback queryPatientFeedbackLimit1(PatientFeedback object);

}