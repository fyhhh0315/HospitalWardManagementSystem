import com.fy.bean.Doctor;
import com.fy.builder.DoctorMybatisBuilder;
import com.fy.builder.SqlSessionBuilder;
import com.fy.config.MyBatisConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class test {
    @Before
    public  void init(){
        new MyBatisConfig();
        SqlSessionBuilder.Init(MyBatisConfig.getSqlSessionFactory());

    }
    @Test
         public void asdfsd(){

        List<Doctor> doctors = DoctorMybatisBuilder.getDoctorBaseMapper().queryDoctor(Doctor.Build().build());
        System.out.println("doctor count :" +doctors.size());
        int i =0;
        for (Doctor doctor : doctors) {
            System.out.println( "name"+i+++doctor.getDname());
        }

    }
}
