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
public class PatientFeedback implements Serializable {

    private static final long serialVersionUID = 1704887446208L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer FeedbackID;

    /**
    * 
    * isNullAble:1
    */
    private Integer PatientID;

    /**
    * 
    * isNullAble:1
    */
    private String DoctorID;

    /**
    * 
    * isNullAble:1
    */
    private String FeedbackContent;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDate FeedbackDate;


    public void setFeedbackID(Integer FeedbackID){this.FeedbackID = FeedbackID;}

    public Integer getFeedbackID(){return this.FeedbackID;}

    public void setPatientID(Integer PatientID){this.PatientID = PatientID;}

    public Integer getPatientID(){return this.PatientID;}

    public void setDoctorID(String DoctorID){this.DoctorID = DoctorID;}

    public String getDoctorID(){return this.DoctorID;}

    public void setFeedbackContent(String FeedbackContent){this.FeedbackContent = FeedbackContent;}

    public String getFeedbackContent(){return this.FeedbackContent;}

    public void setFeedbackDate(java.time.LocalDate FeedbackDate){this.FeedbackDate = FeedbackDate;}

    public java.time.LocalDate getFeedbackDate(){return this.FeedbackDate;}
    @Override
    public String toString() {
        return "PatientFeedback{" +
                "FeedbackID='" + FeedbackID + '\'' +
                "PatientID='" + PatientID + '\'' +
                "DoctorID='" + DoctorID + '\'' +
                "FeedbackContent='" + FeedbackContent + '\'' +
                "FeedbackDate='" + FeedbackDate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PatientFeedback set;

        private ConditionBuilder where;

        public UpdateBuilder set(PatientFeedback set){
            this.set = set;
            return this;
        }

        public PatientFeedback getSet(){
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

    public static class QueryBuilder extends PatientFeedback{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> FeedbackIDList;

        public List<Integer> getFeedbackIDList(){return this.FeedbackIDList;}

        private Integer FeedbackIDSt;

        private Integer FeedbackIDEd;

        public Integer getFeedbackIDSt(){return this.FeedbackIDSt;}

        public Integer getFeedbackIDEd(){return this.FeedbackIDEd;}

        private List<Integer> PatientIDList;

        public List<Integer> getPatientIDList(){return this.PatientIDList;}

        private Integer PatientIDSt;

        private Integer PatientIDEd;

        public Integer getPatientIDSt(){return this.PatientIDSt;}

        public Integer getPatientIDEd(){return this.PatientIDEd;}

        private List<String> DoctorIDList;

        public List<String> getDoctorIDList(){return this.DoctorIDList;}


        private List<String> fuzzyDoctorID;

        public List<String> getFuzzyDoctorID(){return this.fuzzyDoctorID;}

        private List<String> rightFuzzyDoctorID;

        public List<String> getRightFuzzyDoctorID(){return this.rightFuzzyDoctorID;}
        private List<String> FeedbackContentList;

        public List<String> getFeedbackContentList(){return this.FeedbackContentList;}


        private List<String> fuzzyFeedbackContent;

        public List<String> getFuzzyFeedbackContent(){return this.fuzzyFeedbackContent;}

        private List<String> rightFuzzyFeedbackContent;

        public List<String> getRightFuzzyFeedbackContent(){return this.rightFuzzyFeedbackContent;}
        private List<java.time.LocalDate> FeedbackDateList;

        public List<java.time.LocalDate> getFeedbackDateList(){return this.FeedbackDateList;}

        private java.time.LocalDate FeedbackDateSt;

        private java.time.LocalDate FeedbackDateEd;

        public java.time.LocalDate getFeedbackDateSt(){return this.FeedbackDateSt;}

        public java.time.LocalDate getFeedbackDateEd(){return this.FeedbackDateEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder FeedbackIDBetWeen(Integer FeedbackIDSt,Integer FeedbackIDEd){
            this.FeedbackIDSt = FeedbackIDSt;
            this.FeedbackIDEd = FeedbackIDEd;
            return this;
        }

        public QueryBuilder FeedbackIDGreaterEqThan(Integer FeedbackIDSt){
            this.FeedbackIDSt = FeedbackIDSt;
            return this;
        }
        public QueryBuilder FeedbackIDLessEqThan(Integer FeedbackIDEd){
            this.FeedbackIDEd = FeedbackIDEd;
            return this;
        }


        public QueryBuilder FeedbackID(Integer FeedbackID){
            setFeedbackID(FeedbackID);
            return this;
        }

        public QueryBuilder FeedbackIDList(Integer ... FeedbackID){
            this.FeedbackIDList = solveNullList(FeedbackID);
            return this;
        }

        public QueryBuilder FeedbackIDList(List<Integer> FeedbackID){
            this.FeedbackIDList = FeedbackID;
            return this;
        }

        public QueryBuilder fetchFeedbackID(){
            setFetchFields("fetchFields","FeedbackID");
            return this;
        }

        public QueryBuilder excludeFeedbackID(){
            setFetchFields("excludeFields","FeedbackID");
            return this;
        }

        public QueryBuilder PatientIDBetWeen(Integer PatientIDSt,Integer PatientIDEd){
            this.PatientIDSt = PatientIDSt;
            this.PatientIDEd = PatientIDEd;
            return this;
        }

        public QueryBuilder PatientIDGreaterEqThan(Integer PatientIDSt){
            this.PatientIDSt = PatientIDSt;
            return this;
        }
        public QueryBuilder PatientIDLessEqThan(Integer PatientIDEd){
            this.PatientIDEd = PatientIDEd;
            return this;
        }


        public QueryBuilder PatientID(Integer PatientID){
            setPatientID(PatientID);
            return this;
        }

        public QueryBuilder PatientIDList(Integer ... PatientID){
            this.PatientIDList = solveNullList(PatientID);
            return this;
        }

        public QueryBuilder PatientIDList(List<Integer> PatientID){
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

        public QueryBuilder fuzzyFeedbackContent (List<String> fuzzyFeedbackContent){
            this.fuzzyFeedbackContent = fuzzyFeedbackContent;
            return this;
        }

        public QueryBuilder fuzzyFeedbackContent (String ... fuzzyFeedbackContent){
            this.fuzzyFeedbackContent = solveNullList(fuzzyFeedbackContent);
            return this;
        }

        public QueryBuilder rightFuzzyFeedbackContent (List<String> rightFuzzyFeedbackContent){
            this.rightFuzzyFeedbackContent = rightFuzzyFeedbackContent;
            return this;
        }

        public QueryBuilder rightFuzzyFeedbackContent (String ... rightFuzzyFeedbackContent){
            this.rightFuzzyFeedbackContent = solveNullList(rightFuzzyFeedbackContent);
            return this;
        }

        public QueryBuilder FeedbackContent(String FeedbackContent){
            setFeedbackContent(FeedbackContent);
            return this;
        }

        public QueryBuilder FeedbackContentList(String ... FeedbackContent){
            this.FeedbackContentList = solveNullList(FeedbackContent);
            return this;
        }

        public QueryBuilder FeedbackContentList(List<String> FeedbackContent){
            this.FeedbackContentList = FeedbackContent;
            return this;
        }

        public QueryBuilder fetchFeedbackContent(){
            setFetchFields("fetchFields","FeedbackContent");
            return this;
        }

        public QueryBuilder excludeFeedbackContent(){
            setFetchFields("excludeFields","FeedbackContent");
            return this;
        }

        public QueryBuilder FeedbackDateBetWeen(java.time.LocalDate FeedbackDateSt,java.time.LocalDate FeedbackDateEd){
            this.FeedbackDateSt = FeedbackDateSt;
            this.FeedbackDateEd = FeedbackDateEd;
            return this;
        }

        public QueryBuilder FeedbackDateGreaterEqThan(java.time.LocalDate FeedbackDateSt){
            this.FeedbackDateSt = FeedbackDateSt;
            return this;
        }
        public QueryBuilder FeedbackDateLessEqThan(java.time.LocalDate FeedbackDateEd){
            this.FeedbackDateEd = FeedbackDateEd;
            return this;
        }


        public QueryBuilder FeedbackDate(java.time.LocalDate FeedbackDate){
            setFeedbackDate(FeedbackDate);
            return this;
        }

        public QueryBuilder FeedbackDateList(java.time.LocalDate ... FeedbackDate){
            this.FeedbackDateList = solveNullList(FeedbackDate);
            return this;
        }

        public QueryBuilder FeedbackDateList(List<java.time.LocalDate> FeedbackDate){
            this.FeedbackDateList = FeedbackDate;
            return this;
        }

        public QueryBuilder fetchFeedbackDate(){
            setFetchFields("fetchFields","FeedbackDate");
            return this;
        }

        public QueryBuilder excludeFeedbackDate(){
            setFetchFields("excludeFields","FeedbackDate");
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

        public PatientFeedback build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> FeedbackIDList;

        public List<Integer> getFeedbackIDList(){return this.FeedbackIDList;}

        private Integer FeedbackIDSt;

        private Integer FeedbackIDEd;

        public Integer getFeedbackIDSt(){return this.FeedbackIDSt;}

        public Integer getFeedbackIDEd(){return this.FeedbackIDEd;}

        private List<Integer> PatientIDList;

        public List<Integer> getPatientIDList(){return this.PatientIDList;}

        private Integer PatientIDSt;

        private Integer PatientIDEd;

        public Integer getPatientIDSt(){return this.PatientIDSt;}

        public Integer getPatientIDEd(){return this.PatientIDEd;}

        private List<String> DoctorIDList;

        public List<String> getDoctorIDList(){return this.DoctorIDList;}


        private List<String> fuzzyDoctorID;

        public List<String> getFuzzyDoctorID(){return this.fuzzyDoctorID;}

        private List<String> rightFuzzyDoctorID;

        public List<String> getRightFuzzyDoctorID(){return this.rightFuzzyDoctorID;}
        private List<String> FeedbackContentList;

        public List<String> getFeedbackContentList(){return this.FeedbackContentList;}


        private List<String> fuzzyFeedbackContent;

        public List<String> getFuzzyFeedbackContent(){return this.fuzzyFeedbackContent;}

        private List<String> rightFuzzyFeedbackContent;

        public List<String> getRightFuzzyFeedbackContent(){return this.rightFuzzyFeedbackContent;}
        private List<java.time.LocalDate> FeedbackDateList;

        public List<java.time.LocalDate> getFeedbackDateList(){return this.FeedbackDateList;}

        private java.time.LocalDate FeedbackDateSt;

        private java.time.LocalDate FeedbackDateEd;

        public java.time.LocalDate getFeedbackDateSt(){return this.FeedbackDateSt;}

        public java.time.LocalDate getFeedbackDateEd(){return this.FeedbackDateEd;}


        public ConditionBuilder FeedbackIDBetWeen(Integer FeedbackIDSt,Integer FeedbackIDEd){
            this.FeedbackIDSt = FeedbackIDSt;
            this.FeedbackIDEd = FeedbackIDEd;
            return this;
        }

        public ConditionBuilder FeedbackIDGreaterEqThan(Integer FeedbackIDSt){
            this.FeedbackIDSt = FeedbackIDSt;
            return this;
        }
        public ConditionBuilder FeedbackIDLessEqThan(Integer FeedbackIDEd){
            this.FeedbackIDEd = FeedbackIDEd;
            return this;
        }


        public ConditionBuilder FeedbackIDList(Integer ... FeedbackID){
            this.FeedbackIDList = solveNullList(FeedbackID);
            return this;
        }

        public ConditionBuilder FeedbackIDList(List<Integer> FeedbackID){
            this.FeedbackIDList = FeedbackID;
            return this;
        }

        public ConditionBuilder PatientIDBetWeen(Integer PatientIDSt,Integer PatientIDEd){
            this.PatientIDSt = PatientIDSt;
            this.PatientIDEd = PatientIDEd;
            return this;
        }

        public ConditionBuilder PatientIDGreaterEqThan(Integer PatientIDSt){
            this.PatientIDSt = PatientIDSt;
            return this;
        }
        public ConditionBuilder PatientIDLessEqThan(Integer PatientIDEd){
            this.PatientIDEd = PatientIDEd;
            return this;
        }


        public ConditionBuilder PatientIDList(Integer ... PatientID){
            this.PatientIDList = solveNullList(PatientID);
            return this;
        }

        public ConditionBuilder PatientIDList(List<Integer> PatientID){
            this.PatientIDList = PatientID;
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

        public ConditionBuilder fuzzyFeedbackContent (List<String> fuzzyFeedbackContent){
            this.fuzzyFeedbackContent = fuzzyFeedbackContent;
            return this;
        }

        public ConditionBuilder fuzzyFeedbackContent (String ... fuzzyFeedbackContent){
            this.fuzzyFeedbackContent = solveNullList(fuzzyFeedbackContent);
            return this;
        }

        public ConditionBuilder rightFuzzyFeedbackContent (List<String> rightFuzzyFeedbackContent){
            this.rightFuzzyFeedbackContent = rightFuzzyFeedbackContent;
            return this;
        }

        public ConditionBuilder rightFuzzyFeedbackContent (String ... rightFuzzyFeedbackContent){
            this.rightFuzzyFeedbackContent = solveNullList(rightFuzzyFeedbackContent);
            return this;
        }

        public ConditionBuilder FeedbackContentList(String ... FeedbackContent){
            this.FeedbackContentList = solveNullList(FeedbackContent);
            return this;
        }

        public ConditionBuilder FeedbackContentList(List<String> FeedbackContent){
            this.FeedbackContentList = FeedbackContent;
            return this;
        }

        public ConditionBuilder FeedbackDateBetWeen(java.time.LocalDate FeedbackDateSt,java.time.LocalDate FeedbackDateEd){
            this.FeedbackDateSt = FeedbackDateSt;
            this.FeedbackDateEd = FeedbackDateEd;
            return this;
        }

        public ConditionBuilder FeedbackDateGreaterEqThan(java.time.LocalDate FeedbackDateSt){
            this.FeedbackDateSt = FeedbackDateSt;
            return this;
        }
        public ConditionBuilder FeedbackDateLessEqThan(java.time.LocalDate FeedbackDateEd){
            this.FeedbackDateEd = FeedbackDateEd;
            return this;
        }


        public ConditionBuilder FeedbackDateList(java.time.LocalDate ... FeedbackDate){
            this.FeedbackDateList = solveNullList(FeedbackDate);
            return this;
        }

        public ConditionBuilder FeedbackDateList(List<java.time.LocalDate> FeedbackDate){
            this.FeedbackDateList = FeedbackDate;
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

        private PatientFeedback obj;

        public Builder(){
            this.obj = new PatientFeedback();
        }

        public Builder FeedbackID(Integer FeedbackID){
            this.obj.setFeedbackID(FeedbackID);
            return this;
        }
        public Builder PatientID(Integer PatientID){
            this.obj.setPatientID(PatientID);
            return this;
        }
        public Builder DoctorID(String DoctorID){
            this.obj.setDoctorID(DoctorID);
            return this;
        }
        public Builder FeedbackContent(String FeedbackContent){
            this.obj.setFeedbackContent(FeedbackContent);
            return this;
        }
        public Builder FeedbackDate(java.time.LocalDate FeedbackDate){
            this.obj.setFeedbackDate(FeedbackDate);
            return this;
        }
        public PatientFeedback build(){return obj;}
    }

}
