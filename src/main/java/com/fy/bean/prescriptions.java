package com.fy.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author fy
*/
public class prescriptions implements Serializable {

    private static final long serialVersionUID = 1704887440811L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer PrescriptionID;

    /**
    * 
    * isNullAble:1
    */
    private String DoctorID;

    /**
    * 
    * isNullAble:1
    */
    private String PatientID;

    /**
    * 
    * isNullAble:1
    */
    private String PrescriptionDetails;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDate DateIssued;


    public void setPrescriptionID(Integer PrescriptionID){this.PrescriptionID = PrescriptionID;}

    public Integer getPrescriptionID(){return this.PrescriptionID;}

    public void setDoctorID(String DoctorID){this.DoctorID = DoctorID;}

    public String getDoctorID(){return this.DoctorID;}

    public void setPatientID(String PatientID){this.PatientID = PatientID;}

    public String getPatientID(){return this.PatientID;}

    public void setPrescriptionDetails(String PrescriptionDetails){this.PrescriptionDetails = PrescriptionDetails;}

    public String getPrescriptionDetails(){return this.PrescriptionDetails;}

    public void setDateIssued(java.time.LocalDate DateIssued){this.DateIssued = DateIssued;}

    public java.time.LocalDate getDateIssued(){return this.DateIssued;}
    @Override
    public String toString() {
        return "prescriptions{" +
                "PrescriptionID='" + PrescriptionID + '\'' +
                "DoctorID='" + DoctorID + '\'' +
                "PatientID='" + PatientID + '\'' +
                "PrescriptionDetails='" + PrescriptionDetails + '\'' +
                "DateIssued='" + DateIssued + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private prescriptions set;

        private ConditionBuilder where;

        public UpdateBuilder set(prescriptions set){
            this.set = set;
            return this;
        }

        public prescriptions getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends prescriptions{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> PrescriptionIDList;

        public List<Integer> getPrescriptionIDList(){return this.PrescriptionIDList;}

        private Integer PrescriptionIDSt;

        private Integer PrescriptionIDEd;

        public Integer getPrescriptionIDSt(){return this.PrescriptionIDSt;}

        public Integer getPrescriptionIDEd(){return this.PrescriptionIDEd;}

        private List<String> DoctorIDList;

        public List<String> getDoctorIDList(){return this.DoctorIDList;}


        private List<String> fuzzyDoctorID;

        public List<String> getFuzzyDoctorID(){return this.fuzzyDoctorID;}

        private List<String> rightFuzzyDoctorID;

        public List<String> getRightFuzzyDoctorID(){return this.rightFuzzyDoctorID;}
        private List<String> PatientIDList;

        public List<String> getPatientIDList(){return this.PatientIDList;}


        private List<String> fuzzyPatientID;

        public List<String> getFuzzyPatientID(){return this.fuzzyPatientID;}

        private List<String> rightFuzzyPatientID;

        public List<String> getRightFuzzyPatientID(){return this.rightFuzzyPatientID;}
        private List<String> PrescriptionDetailsList;

        public List<String> getPrescriptionDetailsList(){return this.PrescriptionDetailsList;}


        private List<String> fuzzyPrescriptionDetails;

        public List<String> getFuzzyPrescriptionDetails(){return this.fuzzyPrescriptionDetails;}

        private List<String> rightFuzzyPrescriptionDetails;

        public List<String> getRightFuzzyPrescriptionDetails(){return this.rightFuzzyPrescriptionDetails;}
        private List<java.time.LocalDate> DateIssuedList;

        public List<java.time.LocalDate> getDateIssuedList(){return this.DateIssuedList;}

        private java.time.LocalDate DateIssuedSt;

        private java.time.LocalDate DateIssuedEd;

        public java.time.LocalDate getDateIssuedSt(){return this.DateIssuedSt;}

        public java.time.LocalDate getDateIssuedEd(){return this.DateIssuedEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder PrescriptionIDBetWeen(Integer PrescriptionIDSt,Integer PrescriptionIDEd){
            this.PrescriptionIDSt = PrescriptionIDSt;
            this.PrescriptionIDEd = PrescriptionIDEd;
            return this;
        }

        public QueryBuilder PrescriptionIDGreaterEqThan(Integer PrescriptionIDSt){
            this.PrescriptionIDSt = PrescriptionIDSt;
            return this;
        }
        public QueryBuilder PrescriptionIDLessEqThan(Integer PrescriptionIDEd){
            this.PrescriptionIDEd = PrescriptionIDEd;
            return this;
        }


        public QueryBuilder PrescriptionID(Integer PrescriptionID){
            setPrescriptionID(PrescriptionID);
            return this;
        }

        public QueryBuilder PrescriptionIDList(Integer ... PrescriptionID){
            this.PrescriptionIDList = solveNullList(PrescriptionID);
            return this;
        }

        public QueryBuilder PrescriptionIDList(List<Integer> PrescriptionID){
            this.PrescriptionIDList = PrescriptionID;
            return this;
        }

        public QueryBuilder fetchPrescriptionID(){
            setFetchFields("fetchFields","PrescriptionID");
            return this;
        }

        public QueryBuilder excludePrescriptionID(){
            setFetchFields("excludeFields","PrescriptionID");
            return this;
        }

        public QueryBuilder fuzzyDoctorID (List<String> fuzzyDoctorID){
            this.fuzzyDoctorID = fuzzyDoctorID;
            return this;
        }

        public QueryBuilder fuzzyDoctorID (String ... fuzzyDoctorID){
            this.fuzzyDoctorID = solveNullList(fuzzyDoctorID);
            return this;
        }

        public QueryBuilder rightFuzzyDoctorID (List<String> rightFuzzyDoctorID){
            this.rightFuzzyDoctorID = rightFuzzyDoctorID;
            return this;
        }

        public QueryBuilder rightFuzzyDoctorID (String ... rightFuzzyDoctorID){
            this.rightFuzzyDoctorID = solveNullList(rightFuzzyDoctorID);
            return this;
        }

        public QueryBuilder DoctorID(String DoctorID){
            setDoctorID(DoctorID);
            return this;
        }

        public QueryBuilder DoctorIDList(String ... DoctorID){
            this.DoctorIDList = solveNullList(DoctorID);
            return this;
        }

        public QueryBuilder DoctorIDList(List<String> DoctorID){
            this.DoctorIDList = DoctorID;
            return this;
        }

        public QueryBuilder fetchDoctorID(){
            setFetchFields("fetchFields","DoctorID");
            return this;
        }

        public QueryBuilder excludeDoctorID(){
            setFetchFields("excludeFields","DoctorID");
            return this;
        }

        public QueryBuilder fuzzyPatientID (List<String> fuzzyPatientID){
            this.fuzzyPatientID = fuzzyPatientID;
            return this;
        }

        public QueryBuilder fuzzyPatientID (String ... fuzzyPatientID){
            this.fuzzyPatientID = solveNullList(fuzzyPatientID);
            return this;
        }

        public QueryBuilder rightFuzzyPatientID (List<String> rightFuzzyPatientID){
            this.rightFuzzyPatientID = rightFuzzyPatientID;
            return this;
        }

        public QueryBuilder rightFuzzyPatientID (String ... rightFuzzyPatientID){
            this.rightFuzzyPatientID = solveNullList(rightFuzzyPatientID);
            return this;
        }

        public QueryBuilder PatientID(String PatientID){
            setPatientID(PatientID);
            return this;
        }

        public QueryBuilder PatientIDList(String ... PatientID){
            this.PatientIDList = solveNullList(PatientID);
            return this;
        }

        public QueryBuilder PatientIDList(List<String> PatientID){
            this.PatientIDList = PatientID;
            return this;
        }

        public QueryBuilder fetchPatientID(){
            setFetchFields("fetchFields","PatientID");
            return this;
        }

        public QueryBuilder excludePatientID(){
            setFetchFields("excludeFields","PatientID");
            return this;
        }

        public QueryBuilder fuzzyPrescriptionDetails (List<String> fuzzyPrescriptionDetails){
            this.fuzzyPrescriptionDetails = fuzzyPrescriptionDetails;
            return this;
        }

        public QueryBuilder fuzzyPrescriptionDetails (String ... fuzzyPrescriptionDetails){
            this.fuzzyPrescriptionDetails = solveNullList(fuzzyPrescriptionDetails);
            return this;
        }

        public QueryBuilder rightFuzzyPrescriptionDetails (List<String> rightFuzzyPrescriptionDetails){
            this.rightFuzzyPrescriptionDetails = rightFuzzyPrescriptionDetails;
            return this;
        }

        public QueryBuilder rightFuzzyPrescriptionDetails (String ... rightFuzzyPrescriptionDetails){
            this.rightFuzzyPrescriptionDetails = solveNullList(rightFuzzyPrescriptionDetails);
            return this;
        }

        public QueryBuilder PrescriptionDetails(String PrescriptionDetails){
            setPrescriptionDetails(PrescriptionDetails);
            return this;
        }

        public QueryBuilder PrescriptionDetailsList(String ... PrescriptionDetails){
            this.PrescriptionDetailsList = solveNullList(PrescriptionDetails);
            return this;
        }

        public QueryBuilder PrescriptionDetailsList(List<String> PrescriptionDetails){
            this.PrescriptionDetailsList = PrescriptionDetails;
            return this;
        }

        public QueryBuilder fetchPrescriptionDetails(){
            setFetchFields("fetchFields","PrescriptionDetails");
            return this;
        }

        public QueryBuilder excludePrescriptionDetails(){
            setFetchFields("excludeFields","PrescriptionDetails");
            return this;
        }

        public QueryBuilder DateIssuedBetWeen(java.time.LocalDate DateIssuedSt,java.time.LocalDate DateIssuedEd){
            this.DateIssuedSt = DateIssuedSt;
            this.DateIssuedEd = DateIssuedEd;
            return this;
        }

        public QueryBuilder DateIssuedGreaterEqThan(java.time.LocalDate DateIssuedSt){
            this.DateIssuedSt = DateIssuedSt;
            return this;
        }
        public QueryBuilder DateIssuedLessEqThan(java.time.LocalDate DateIssuedEd){
            this.DateIssuedEd = DateIssuedEd;
            return this;
        }


        public QueryBuilder DateIssued(java.time.LocalDate DateIssued){
            setDateIssued(DateIssued);
            return this;
        }

        public QueryBuilder DateIssuedList(java.time.LocalDate ... DateIssued){
            this.DateIssuedList = solveNullList(DateIssued);
            return this;
        }

        public QueryBuilder DateIssuedList(List<java.time.LocalDate> DateIssued){
            this.DateIssuedList = DateIssued;
            return this;
        }

        public QueryBuilder fetchDateIssued(){
            setFetchFields("fetchFields","DateIssued");
            return this;
        }

        public QueryBuilder excludeDateIssued(){
            setFetchFields("excludeFields","DateIssued");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public prescriptions build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> PrescriptionIDList;

        public List<Integer> getPrescriptionIDList(){return this.PrescriptionIDList;}

        private Integer PrescriptionIDSt;

        private Integer PrescriptionIDEd;

        public Integer getPrescriptionIDSt(){return this.PrescriptionIDSt;}

        public Integer getPrescriptionIDEd(){return this.PrescriptionIDEd;}

        private List<String> DoctorIDList;

        public List<String> getDoctorIDList(){return this.DoctorIDList;}


        private List<String> fuzzyDoctorID;

        public List<String> getFuzzyDoctorID(){return this.fuzzyDoctorID;}

        private List<String> rightFuzzyDoctorID;

        public List<String> getRightFuzzyDoctorID(){return this.rightFuzzyDoctorID;}
        private List<String> PatientIDList;

        public List<String> getPatientIDList(){return this.PatientIDList;}


        private List<String> fuzzyPatientID;

        public List<String> getFuzzyPatientID(){return this.fuzzyPatientID;}

        private List<String> rightFuzzyPatientID;

        public List<String> getRightFuzzyPatientID(){return this.rightFuzzyPatientID;}
        private List<String> PrescriptionDetailsList;

        public List<String> getPrescriptionDetailsList(){return this.PrescriptionDetailsList;}


        private List<String> fuzzyPrescriptionDetails;

        public List<String> getFuzzyPrescriptionDetails(){return this.fuzzyPrescriptionDetails;}

        private List<String> rightFuzzyPrescriptionDetails;

        public List<String> getRightFuzzyPrescriptionDetails(){return this.rightFuzzyPrescriptionDetails;}
        private List<java.time.LocalDate> DateIssuedList;

        public List<java.time.LocalDate> getDateIssuedList(){return this.DateIssuedList;}

        private java.time.LocalDate DateIssuedSt;

        private java.time.LocalDate DateIssuedEd;

        public java.time.LocalDate getDateIssuedSt(){return this.DateIssuedSt;}

        public java.time.LocalDate getDateIssuedEd(){return this.DateIssuedEd;}


        public ConditionBuilder PrescriptionIDBetWeen(Integer PrescriptionIDSt,Integer PrescriptionIDEd){
            this.PrescriptionIDSt = PrescriptionIDSt;
            this.PrescriptionIDEd = PrescriptionIDEd;
            return this;
        }

        public ConditionBuilder PrescriptionIDGreaterEqThan(Integer PrescriptionIDSt){
            this.PrescriptionIDSt = PrescriptionIDSt;
            return this;
        }
        public ConditionBuilder PrescriptionIDLessEqThan(Integer PrescriptionIDEd){
            this.PrescriptionIDEd = PrescriptionIDEd;
            return this;
        }


        public ConditionBuilder PrescriptionIDList(Integer ... PrescriptionID){
            this.PrescriptionIDList = solveNullList(PrescriptionID);
            return this;
        }

        public ConditionBuilder PrescriptionIDList(List<Integer> PrescriptionID){
            this.PrescriptionIDList = PrescriptionID;
            return this;
        }

        public ConditionBuilder fuzzyDoctorID (List<String> fuzzyDoctorID){
            this.fuzzyDoctorID = fuzzyDoctorID;
            return this;
        }

        public ConditionBuilder fuzzyDoctorID (String ... fuzzyDoctorID){
            this.fuzzyDoctorID = solveNullList(fuzzyDoctorID);
            return this;
        }

        public ConditionBuilder rightFuzzyDoctorID (List<String> rightFuzzyDoctorID){
            this.rightFuzzyDoctorID = rightFuzzyDoctorID;
            return this;
        }

        public ConditionBuilder rightFuzzyDoctorID (String ... rightFuzzyDoctorID){
            this.rightFuzzyDoctorID = solveNullList(rightFuzzyDoctorID);
            return this;
        }

        public ConditionBuilder DoctorIDList(String ... DoctorID){
            this.DoctorIDList = solveNullList(DoctorID);
            return this;
        }

        public ConditionBuilder DoctorIDList(List<String> DoctorID){
            this.DoctorIDList = DoctorID;
            return this;
        }

        public ConditionBuilder fuzzyPatientID (List<String> fuzzyPatientID){
            this.fuzzyPatientID = fuzzyPatientID;
            return this;
        }

        public ConditionBuilder fuzzyPatientID (String ... fuzzyPatientID){
            this.fuzzyPatientID = solveNullList(fuzzyPatientID);
            return this;
        }

        public ConditionBuilder rightFuzzyPatientID (List<String> rightFuzzyPatientID){
            this.rightFuzzyPatientID = rightFuzzyPatientID;
            return this;
        }

        public ConditionBuilder rightFuzzyPatientID (String ... rightFuzzyPatientID){
            this.rightFuzzyPatientID = solveNullList(rightFuzzyPatientID);
            return this;
        }

        public ConditionBuilder PatientIDList(String ... PatientID){
            this.PatientIDList = solveNullList(PatientID);
            return this;
        }

        public ConditionBuilder PatientIDList(List<String> PatientID){
            this.PatientIDList = PatientID;
            return this;
        }

        public ConditionBuilder fuzzyPrescriptionDetails (List<String> fuzzyPrescriptionDetails){
            this.fuzzyPrescriptionDetails = fuzzyPrescriptionDetails;
            return this;
        }

        public ConditionBuilder fuzzyPrescriptionDetails (String ... fuzzyPrescriptionDetails){
            this.fuzzyPrescriptionDetails = solveNullList(fuzzyPrescriptionDetails);
            return this;
        }

        public ConditionBuilder rightFuzzyPrescriptionDetails (List<String> rightFuzzyPrescriptionDetails){
            this.rightFuzzyPrescriptionDetails = rightFuzzyPrescriptionDetails;
            return this;
        }

        public ConditionBuilder rightFuzzyPrescriptionDetails (String ... rightFuzzyPrescriptionDetails){
            this.rightFuzzyPrescriptionDetails = solveNullList(rightFuzzyPrescriptionDetails);
            return this;
        }

        public ConditionBuilder PrescriptionDetailsList(String ... PrescriptionDetails){
            this.PrescriptionDetailsList = solveNullList(PrescriptionDetails);
            return this;
        }

        public ConditionBuilder PrescriptionDetailsList(List<String> PrescriptionDetails){
            this.PrescriptionDetailsList = PrescriptionDetails;
            return this;
        }

        public ConditionBuilder DateIssuedBetWeen(java.time.LocalDate DateIssuedSt,java.time.LocalDate DateIssuedEd){
            this.DateIssuedSt = DateIssuedSt;
            this.DateIssuedEd = DateIssuedEd;
            return this;
        }

        public ConditionBuilder DateIssuedGreaterEqThan(java.time.LocalDate DateIssuedSt){
            this.DateIssuedSt = DateIssuedSt;
            return this;
        }
        public ConditionBuilder DateIssuedLessEqThan(java.time.LocalDate DateIssuedEd){
            this.DateIssuedEd = DateIssuedEd;
            return this;
        }


        public ConditionBuilder DateIssuedList(java.time.LocalDate ... DateIssued){
            this.DateIssuedList = solveNullList(DateIssued);
            return this;
        }

        public ConditionBuilder DateIssuedList(List<java.time.LocalDate> DateIssued){
            this.DateIssuedList = DateIssued;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private prescriptions obj;

        public Builder(){
            this.obj = new prescriptions();
        }

        public Builder PrescriptionID(Integer PrescriptionID){
            this.obj.setPrescriptionID(PrescriptionID);
            return this;
        }
        public Builder DoctorID(String DoctorID){
            this.obj.setDoctorID(DoctorID);
            return this;
        }
        public Builder PatientID(String PatientID){
            this.obj.setPatientID(PatientID);
            return this;
        }
        public Builder PrescriptionDetails(String PrescriptionDetails){
            this.obj.setPrescriptionDetails(PrescriptionDetails);
            return this;
        }
        public Builder DateIssued(java.time.LocalDate DateIssued){
            this.obj.setDateIssued(DateIssued);
            return this;
        }
        public prescriptions build(){return obj;}
    }

}
