package com.fy.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author fy
*/
public class Patient implements Serializable {

    private static final long serialVersionUID = 1704610038369L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String Pno;

    /**
    * 
    * isNullAble:0
    */
    private String Pname;

    /**
    * 
    * isNullAble:0
    */
    private String Psex;

    /**
    * 
    * isNullAble:0
    */
    private String Pdiagnose;

    /**
    * 
    * isNullAble:0
    */
    private String Wno;

    /**
    * 
    * isNullAble:0
    */
    private String Bno;

    /**
    * 
    * isNullAble:0
    */
    private String Dno;

    /**
    * 
    * isNullAble:0
    */
    private String Ptel;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDate Pindate;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDate Poutdate;


    public void setPno(String Pno){this.Pno = Pno;}

    public String getPno(){return this.Pno;}

    public void setPname(String Pname){this.Pname = Pname;}

    public String getPname(){return this.Pname;}

    public void setPsex(String Psex){this.Psex = Psex;}

    public String getPsex(){return this.Psex;}

    public void setPdiagnose(String Pdiagnose){this.Pdiagnose = Pdiagnose;}

    public String getPdiagnose(){return this.Pdiagnose;}

    public void setWno(String Wno){this.Wno = Wno;}

    public String getWno(){return this.Wno;}

    public void setBno(String Bno){this.Bno = Bno;}

    public String getBno(){return this.Bno;}

    public void setDno(String Dno){this.Dno = Dno;}

    public String getDno(){return this.Dno;}

    public void setPtel(String Ptel){this.Ptel = Ptel;}

    public String getPtel(){return this.Ptel;}

    public void setPindate(java.time.LocalDate Pindate){this.Pindate = Pindate;}

    public java.time.LocalDate getPindate(){return this.Pindate;}

    public void setPoutdate(java.time.LocalDate Poutdate){this.Poutdate = Poutdate;}

    public java.time.LocalDate getPoutdate(){return this.Poutdate;}
    @Override
    public String toString() {
        return "Patient{" +
                "Pno='" + Pno + '\'' +
                "Pname='" + Pname + '\'' +
                "Psex='" + Psex + '\'' +
                "Pdiagnose='" + Pdiagnose + '\'' +
                "Wno='" + Wno + '\'' +
                "Bno='" + Bno + '\'' +
                "Dno='" + Dno + '\'' +
                "Ptel='" + Ptel + '\'' +
                "Pindate='" + Pindate + '\'' +
                "Poutdate='" + Poutdate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Patient set;

        private ConditionBuilder where;

        public UpdateBuilder set(Patient set){
            this.set = set;
            return this;
        }

        public Patient getSet(){
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

    public static class QueryBuilder extends Patient{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> PnoList;

        public List<String> getPnoList(){return this.PnoList;}


        private List<String> fuzzyPno;

        public List<String> getFuzzyPno(){return this.fuzzyPno;}

        private List<String> rightFuzzyPno;

        public List<String> getRightFuzzyPno(){return this.rightFuzzyPno;}
        private List<String> PnameList;

        public List<String> getPnameList(){return this.PnameList;}


        private List<String> fuzzyPname;

        public List<String> getFuzzyPname(){return this.fuzzyPname;}

        private List<String> rightFuzzyPname;

        public List<String> getRightFuzzyPname(){return this.rightFuzzyPname;}
        private List<String> PsexList;

        public List<String> getPsexList(){return this.PsexList;}


        private List<String> fuzzyPsex;

        public List<String> getFuzzyPsex(){return this.fuzzyPsex;}

        private List<String> rightFuzzyPsex;

        public List<String> getRightFuzzyPsex(){return this.rightFuzzyPsex;}
        private List<String> PdiagnoseList;

        public List<String> getPdiagnoseList(){return this.PdiagnoseList;}


        private List<String> fuzzyPdiagnose;

        public List<String> getFuzzyPdiagnose(){return this.fuzzyPdiagnose;}

        private List<String> rightFuzzyPdiagnose;

        public List<String> getRightFuzzyPdiagnose(){return this.rightFuzzyPdiagnose;}
        private List<String> WnoList;

        public List<String> getWnoList(){return this.WnoList;}


        private List<String> fuzzyWno;

        public List<String> getFuzzyWno(){return this.fuzzyWno;}

        private List<String> rightFuzzyWno;

        public List<String> getRightFuzzyWno(){return this.rightFuzzyWno;}
        private List<String> BnoList;

        public List<String> getBnoList(){return this.BnoList;}


        private List<String> fuzzyBno;

        public List<String> getFuzzyBno(){return this.fuzzyBno;}

        private List<String> rightFuzzyBno;

        public List<String> getRightFuzzyBno(){return this.rightFuzzyBno;}
        private List<String> DnoList;

        public List<String> getDnoList(){return this.DnoList;}


        private List<String> fuzzyDno;

        public List<String> getFuzzyDno(){return this.fuzzyDno;}

        private List<String> rightFuzzyDno;

        public List<String> getRightFuzzyDno(){return this.rightFuzzyDno;}
        private List<String> PtelList;

        public List<String> getPtelList(){return this.PtelList;}


        private List<String> fuzzyPtel;

        public List<String> getFuzzyPtel(){return this.fuzzyPtel;}

        private List<String> rightFuzzyPtel;

        public List<String> getRightFuzzyPtel(){return this.rightFuzzyPtel;}
        private List<java.time.LocalDate> PindateList;

        public List<java.time.LocalDate> getPindateList(){return this.PindateList;}

        private java.time.LocalDate PindateSt;

        private java.time.LocalDate PindateEd;

        public java.time.LocalDate getPindateSt(){return this.PindateSt;}

        public java.time.LocalDate getPindateEd(){return this.PindateEd;}

        private List<java.time.LocalDate> PoutdateList;

        public List<java.time.LocalDate> getPoutdateList(){return this.PoutdateList;}

        private java.time.LocalDate PoutdateSt;

        private java.time.LocalDate PoutdateEd;

        public java.time.LocalDate getPoutdateSt(){return this.PoutdateSt;}

        public java.time.LocalDate getPoutdateEd(){return this.PoutdateEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyPno (List<String> fuzzyPno){
            this.fuzzyPno = fuzzyPno;
            return this;
        }

        public QueryBuilder fuzzyPno (String ... fuzzyPno){
            this.fuzzyPno = solveNullList(fuzzyPno);
            return this;
        }

        public QueryBuilder rightFuzzyPno (List<String> rightFuzzyPno){
            this.rightFuzzyPno = rightFuzzyPno;
            return this;
        }

        public QueryBuilder rightFuzzyPno (String ... rightFuzzyPno){
            this.rightFuzzyPno = solveNullList(rightFuzzyPno);
            return this;
        }

        public QueryBuilder Pno(String Pno){
            setPno(Pno);
            return this;
        }

        public QueryBuilder PnoList(String ... Pno){
            this.PnoList = solveNullList(Pno);
            return this;
        }

        public QueryBuilder PnoList(List<String> Pno){
            this.PnoList = Pno;
            return this;
        }

        public QueryBuilder fetchPno(){
            setFetchFields("fetchFields","Pno");
            return this;
        }

        public QueryBuilder excludePno(){
            setFetchFields("excludeFields","Pno");
            return this;
        }

        public QueryBuilder fuzzyPname (List<String> fuzzyPname){
            this.fuzzyPname = fuzzyPname;
            return this;
        }

        public QueryBuilder fuzzyPname (String ... fuzzyPname){
            this.fuzzyPname = solveNullList(fuzzyPname);
            return this;
        }

        public QueryBuilder rightFuzzyPname (List<String> rightFuzzyPname){
            this.rightFuzzyPname = rightFuzzyPname;
            return this;
        }

        public QueryBuilder rightFuzzyPname (String ... rightFuzzyPname){
            this.rightFuzzyPname = solveNullList(rightFuzzyPname);
            return this;
        }

        public QueryBuilder Pname(String Pname){
            setPname(Pname);
            return this;
        }

        public QueryBuilder PnameList(String ... Pname){
            this.PnameList = solveNullList(Pname);
            return this;
        }

        public QueryBuilder PnameList(List<String> Pname){
            this.PnameList = Pname;
            return this;
        }

        public QueryBuilder fetchPname(){
            setFetchFields("fetchFields","Pname");
            return this;
        }

        public QueryBuilder excludePname(){
            setFetchFields("excludeFields","Pname");
            return this;
        }

        public QueryBuilder fuzzyPsex (List<String> fuzzyPsex){
            this.fuzzyPsex = fuzzyPsex;
            return this;
        }

        public QueryBuilder fuzzyPsex (String ... fuzzyPsex){
            this.fuzzyPsex = solveNullList(fuzzyPsex);
            return this;
        }

        public QueryBuilder rightFuzzyPsex (List<String> rightFuzzyPsex){
            this.rightFuzzyPsex = rightFuzzyPsex;
            return this;
        }

        public QueryBuilder rightFuzzyPsex (String ... rightFuzzyPsex){
            this.rightFuzzyPsex = solveNullList(rightFuzzyPsex);
            return this;
        }

        public QueryBuilder Psex(String Psex){
            setPsex(Psex);
            return this;
        }

        public QueryBuilder PsexList(String ... Psex){
            this.PsexList = solveNullList(Psex);
            return this;
        }

        public QueryBuilder PsexList(List<String> Psex){
            this.PsexList = Psex;
            return this;
        }

        public QueryBuilder fetchPsex(){
            setFetchFields("fetchFields","Psex");
            return this;
        }

        public QueryBuilder excludePsex(){
            setFetchFields("excludeFields","Psex");
            return this;
        }

        public QueryBuilder fuzzyPdiagnose (List<String> fuzzyPdiagnose){
            this.fuzzyPdiagnose = fuzzyPdiagnose;
            return this;
        }

        public QueryBuilder fuzzyPdiagnose (String ... fuzzyPdiagnose){
            this.fuzzyPdiagnose = solveNullList(fuzzyPdiagnose);
            return this;
        }

        public QueryBuilder rightFuzzyPdiagnose (List<String> rightFuzzyPdiagnose){
            this.rightFuzzyPdiagnose = rightFuzzyPdiagnose;
            return this;
        }

        public QueryBuilder rightFuzzyPdiagnose (String ... rightFuzzyPdiagnose){
            this.rightFuzzyPdiagnose = solveNullList(rightFuzzyPdiagnose);
            return this;
        }

        public QueryBuilder Pdiagnose(String Pdiagnose){
            setPdiagnose(Pdiagnose);
            return this;
        }

        public QueryBuilder PdiagnoseList(String ... Pdiagnose){
            this.PdiagnoseList = solveNullList(Pdiagnose);
            return this;
        }

        public QueryBuilder PdiagnoseList(List<String> Pdiagnose){
            this.PdiagnoseList = Pdiagnose;
            return this;
        }

        public QueryBuilder fetchPdiagnose(){
            setFetchFields("fetchFields","Pdiagnose");
            return this;
        }

        public QueryBuilder excludePdiagnose(){
            setFetchFields("excludeFields","Pdiagnose");
            return this;
        }

        public QueryBuilder fuzzyWno (List<String> fuzzyWno){
            this.fuzzyWno = fuzzyWno;
            return this;
        }

        public QueryBuilder fuzzyWno (String ... fuzzyWno){
            this.fuzzyWno = solveNullList(fuzzyWno);
            return this;
        }

        public QueryBuilder rightFuzzyWno (List<String> rightFuzzyWno){
            this.rightFuzzyWno = rightFuzzyWno;
            return this;
        }

        public QueryBuilder rightFuzzyWno (String ... rightFuzzyWno){
            this.rightFuzzyWno = solveNullList(rightFuzzyWno);
            return this;
        }

        public QueryBuilder Wno(String Wno){
            setWno(Wno);
            return this;
        }

        public QueryBuilder WnoList(String ... Wno){
            this.WnoList = solveNullList(Wno);
            return this;
        }

        public QueryBuilder WnoList(List<String> Wno){
            this.WnoList = Wno;
            return this;
        }

        public QueryBuilder fetchWno(){
            setFetchFields("fetchFields","Wno");
            return this;
        }

        public QueryBuilder excludeWno(){
            setFetchFields("excludeFields","Wno");
            return this;
        }

        public QueryBuilder fuzzyBno (List<String> fuzzyBno){
            this.fuzzyBno = fuzzyBno;
            return this;
        }

        public QueryBuilder fuzzyBno (String ... fuzzyBno){
            this.fuzzyBno = solveNullList(fuzzyBno);
            return this;
        }

        public QueryBuilder rightFuzzyBno (List<String> rightFuzzyBno){
            this.rightFuzzyBno = rightFuzzyBno;
            return this;
        }

        public QueryBuilder rightFuzzyBno (String ... rightFuzzyBno){
            this.rightFuzzyBno = solveNullList(rightFuzzyBno);
            return this;
        }

        public QueryBuilder Bno(String Bno){
            setBno(Bno);
            return this;
        }

        public QueryBuilder BnoList(String ... Bno){
            this.BnoList = solveNullList(Bno);
            return this;
        }

        public QueryBuilder BnoList(List<String> Bno){
            this.BnoList = Bno;
            return this;
        }

        public QueryBuilder fetchBno(){
            setFetchFields("fetchFields","Bno");
            return this;
        }

        public QueryBuilder excludeBno(){
            setFetchFields("excludeFields","Bno");
            return this;
        }

        public QueryBuilder fuzzyDno (List<String> fuzzyDno){
            this.fuzzyDno = fuzzyDno;
            return this;
        }

        public QueryBuilder fuzzyDno (String ... fuzzyDno){
            this.fuzzyDno = solveNullList(fuzzyDno);
            return this;
        }

        public QueryBuilder rightFuzzyDno (List<String> rightFuzzyDno){
            this.rightFuzzyDno = rightFuzzyDno;
            return this;
        }

        public QueryBuilder rightFuzzyDno (String ... rightFuzzyDno){
            this.rightFuzzyDno = solveNullList(rightFuzzyDno);
            return this;
        }

        public QueryBuilder Dno(String Dno){
            setDno(Dno);
            return this;
        }

        public QueryBuilder DnoList(String ... Dno){
            this.DnoList = solveNullList(Dno);
            return this;
        }

        public QueryBuilder DnoList(List<String> Dno){
            this.DnoList = Dno;
            return this;
        }

        public QueryBuilder fetchDno(){
            setFetchFields("fetchFields","Dno");
            return this;
        }

        public QueryBuilder excludeDno(){
            setFetchFields("excludeFields","Dno");
            return this;
        }

        public QueryBuilder fuzzyPtel (List<String> fuzzyPtel){
            this.fuzzyPtel = fuzzyPtel;
            return this;
        }

        public QueryBuilder fuzzyPtel (String ... fuzzyPtel){
            this.fuzzyPtel = solveNullList(fuzzyPtel);
            return this;
        }

        public QueryBuilder rightFuzzyPtel (List<String> rightFuzzyPtel){
            this.rightFuzzyPtel = rightFuzzyPtel;
            return this;
        }

        public QueryBuilder rightFuzzyPtel (String ... rightFuzzyPtel){
            this.rightFuzzyPtel = solveNullList(rightFuzzyPtel);
            return this;
        }

        public QueryBuilder Ptel(String Ptel){
            setPtel(Ptel);
            return this;
        }

        public QueryBuilder PtelList(String ... Ptel){
            this.PtelList = solveNullList(Ptel);
            return this;
        }

        public QueryBuilder PtelList(List<String> Ptel){
            this.PtelList = Ptel;
            return this;
        }

        public QueryBuilder fetchPtel(){
            setFetchFields("fetchFields","Ptel");
            return this;
        }

        public QueryBuilder excludePtel(){
            setFetchFields("excludeFields","Ptel");
            return this;
        }

        public QueryBuilder PindateBetWeen(java.time.LocalDate PindateSt,java.time.LocalDate PindateEd){
            this.PindateSt = PindateSt;
            this.PindateEd = PindateEd;
            return this;
        }

        public QueryBuilder PindateGreaterEqThan(java.time.LocalDate PindateSt){
            this.PindateSt = PindateSt;
            return this;
        }
        public QueryBuilder PindateLessEqThan(java.time.LocalDate PindateEd){
            this.PindateEd = PindateEd;
            return this;
        }


        public QueryBuilder Pindate(java.time.LocalDate Pindate){
            setPindate(Pindate);
            return this;
        }

        public QueryBuilder PindateList(java.time.LocalDate ... Pindate){
            this.PindateList = solveNullList(Pindate);
            return this;
        }

        public QueryBuilder PindateList(List<java.time.LocalDate> Pindate){
            this.PindateList = Pindate;
            return this;
        }

        public QueryBuilder fetchPindate(){
            setFetchFields("fetchFields","Pindate");
            return this;
        }

        public QueryBuilder excludePindate(){
            setFetchFields("excludeFields","Pindate");
            return this;
        }

        public QueryBuilder PoutdateBetWeen(java.time.LocalDate PoutdateSt,java.time.LocalDate PoutdateEd){
            this.PoutdateSt = PoutdateSt;
            this.PoutdateEd = PoutdateEd;
            return this;
        }

        public QueryBuilder PoutdateGreaterEqThan(java.time.LocalDate PoutdateSt){
            this.PoutdateSt = PoutdateSt;
            return this;
        }
        public QueryBuilder PoutdateLessEqThan(java.time.LocalDate PoutdateEd){
            this.PoutdateEd = PoutdateEd;
            return this;
        }


        public QueryBuilder Poutdate(java.time.LocalDate Poutdate){
            setPoutdate(Poutdate);
            return this;
        }

        public QueryBuilder PoutdateList(java.time.LocalDate ... Poutdate){
            this.PoutdateList = solveNullList(Poutdate);
            return this;
        }

        public QueryBuilder PoutdateList(List<java.time.LocalDate> Poutdate){
            this.PoutdateList = Poutdate;
            return this;
        }

        public QueryBuilder fetchPoutdate(){
            setFetchFields("fetchFields","Poutdate");
            return this;
        }

        public QueryBuilder excludePoutdate(){
            setFetchFields("excludeFields","Poutdate");
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

        public Patient build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> PnoList;

        public List<String> getPnoList(){return this.PnoList;}


        private List<String> fuzzyPno;

        public List<String> getFuzzyPno(){return this.fuzzyPno;}

        private List<String> rightFuzzyPno;

        public List<String> getRightFuzzyPno(){return this.rightFuzzyPno;}
        private List<String> PnameList;

        public List<String> getPnameList(){return this.PnameList;}


        private List<String> fuzzyPname;

        public List<String> getFuzzyPname(){return this.fuzzyPname;}

        private List<String> rightFuzzyPname;

        public List<String> getRightFuzzyPname(){return this.rightFuzzyPname;}
        private List<String> PsexList;

        public List<String> getPsexList(){return this.PsexList;}


        private List<String> fuzzyPsex;

        public List<String> getFuzzyPsex(){return this.fuzzyPsex;}

        private List<String> rightFuzzyPsex;

        public List<String> getRightFuzzyPsex(){return this.rightFuzzyPsex;}
        private List<String> PdiagnoseList;

        public List<String> getPdiagnoseList(){return this.PdiagnoseList;}


        private List<String> fuzzyPdiagnose;

        public List<String> getFuzzyPdiagnose(){return this.fuzzyPdiagnose;}

        private List<String> rightFuzzyPdiagnose;

        public List<String> getRightFuzzyPdiagnose(){return this.rightFuzzyPdiagnose;}
        private List<String> WnoList;

        public List<String> getWnoList(){return this.WnoList;}


        private List<String> fuzzyWno;

        public List<String> getFuzzyWno(){return this.fuzzyWno;}

        private List<String> rightFuzzyWno;

        public List<String> getRightFuzzyWno(){return this.rightFuzzyWno;}
        private List<String> BnoList;

        public List<String> getBnoList(){return this.BnoList;}


        private List<String> fuzzyBno;

        public List<String> getFuzzyBno(){return this.fuzzyBno;}

        private List<String> rightFuzzyBno;

        public List<String> getRightFuzzyBno(){return this.rightFuzzyBno;}
        private List<String> DnoList;

        public List<String> getDnoList(){return this.DnoList;}


        private List<String> fuzzyDno;

        public List<String> getFuzzyDno(){return this.fuzzyDno;}

        private List<String> rightFuzzyDno;

        public List<String> getRightFuzzyDno(){return this.rightFuzzyDno;}
        private List<String> PtelList;

        public List<String> getPtelList(){return this.PtelList;}


        private List<String> fuzzyPtel;

        public List<String> getFuzzyPtel(){return this.fuzzyPtel;}

        private List<String> rightFuzzyPtel;

        public List<String> getRightFuzzyPtel(){return this.rightFuzzyPtel;}
        private List<java.time.LocalDate> PindateList;

        public List<java.time.LocalDate> getPindateList(){return this.PindateList;}

        private java.time.LocalDate PindateSt;

        private java.time.LocalDate PindateEd;

        public java.time.LocalDate getPindateSt(){return this.PindateSt;}

        public java.time.LocalDate getPindateEd(){return this.PindateEd;}

        private List<java.time.LocalDate> PoutdateList;

        public List<java.time.LocalDate> getPoutdateList(){return this.PoutdateList;}

        private java.time.LocalDate PoutdateSt;

        private java.time.LocalDate PoutdateEd;

        public java.time.LocalDate getPoutdateSt(){return this.PoutdateSt;}

        public java.time.LocalDate getPoutdateEd(){return this.PoutdateEd;}


        public ConditionBuilder fuzzyPno (List<String> fuzzyPno){
            this.fuzzyPno = fuzzyPno;
            return this;
        }

        public ConditionBuilder fuzzyPno (String ... fuzzyPno){
            this.fuzzyPno = solveNullList(fuzzyPno);
            return this;
        }

        public ConditionBuilder rightFuzzyPno (List<String> rightFuzzyPno){
            this.rightFuzzyPno = rightFuzzyPno;
            return this;
        }

        public ConditionBuilder rightFuzzyPno (String ... rightFuzzyPno){
            this.rightFuzzyPno = solveNullList(rightFuzzyPno);
            return this;
        }

        public ConditionBuilder PnoList(String ... Pno){
            this.PnoList = solveNullList(Pno);
            return this;
        }

        public ConditionBuilder PnoList(List<String> Pno){
            this.PnoList = Pno;
            return this;
        }

        public ConditionBuilder fuzzyPname (List<String> fuzzyPname){
            this.fuzzyPname = fuzzyPname;
            return this;
        }

        public ConditionBuilder fuzzyPname (String ... fuzzyPname){
            this.fuzzyPname = solveNullList(fuzzyPname);
            return this;
        }

        public ConditionBuilder rightFuzzyPname (List<String> rightFuzzyPname){
            this.rightFuzzyPname = rightFuzzyPname;
            return this;
        }

        public ConditionBuilder rightFuzzyPname (String ... rightFuzzyPname){
            this.rightFuzzyPname = solveNullList(rightFuzzyPname);
            return this;
        }

        public ConditionBuilder PnameList(String ... Pname){
            this.PnameList = solveNullList(Pname);
            return this;
        }

        public ConditionBuilder PnameList(List<String> Pname){
            this.PnameList = Pname;
            return this;
        }

        public ConditionBuilder fuzzyPsex (List<String> fuzzyPsex){
            this.fuzzyPsex = fuzzyPsex;
            return this;
        }

        public ConditionBuilder fuzzyPsex (String ... fuzzyPsex){
            this.fuzzyPsex = solveNullList(fuzzyPsex);
            return this;
        }

        public ConditionBuilder rightFuzzyPsex (List<String> rightFuzzyPsex){
            this.rightFuzzyPsex = rightFuzzyPsex;
            return this;
        }

        public ConditionBuilder rightFuzzyPsex (String ... rightFuzzyPsex){
            this.rightFuzzyPsex = solveNullList(rightFuzzyPsex);
            return this;
        }

        public ConditionBuilder PsexList(String ... Psex){
            this.PsexList = solveNullList(Psex);
            return this;
        }

        public ConditionBuilder PsexList(List<String> Psex){
            this.PsexList = Psex;
            return this;
        }

        public ConditionBuilder fuzzyPdiagnose (List<String> fuzzyPdiagnose){
            this.fuzzyPdiagnose = fuzzyPdiagnose;
            return this;
        }

        public ConditionBuilder fuzzyPdiagnose (String ... fuzzyPdiagnose){
            this.fuzzyPdiagnose = solveNullList(fuzzyPdiagnose);
            return this;
        }

        public ConditionBuilder rightFuzzyPdiagnose (List<String> rightFuzzyPdiagnose){
            this.rightFuzzyPdiagnose = rightFuzzyPdiagnose;
            return this;
        }

        public ConditionBuilder rightFuzzyPdiagnose (String ... rightFuzzyPdiagnose){
            this.rightFuzzyPdiagnose = solveNullList(rightFuzzyPdiagnose);
            return this;
        }

        public ConditionBuilder PdiagnoseList(String ... Pdiagnose){
            this.PdiagnoseList = solveNullList(Pdiagnose);
            return this;
        }

        public ConditionBuilder PdiagnoseList(List<String> Pdiagnose){
            this.PdiagnoseList = Pdiagnose;
            return this;
        }

        public ConditionBuilder fuzzyWno (List<String> fuzzyWno){
            this.fuzzyWno = fuzzyWno;
            return this;
        }

        public ConditionBuilder fuzzyWno (String ... fuzzyWno){
            this.fuzzyWno = solveNullList(fuzzyWno);
            return this;
        }

        public ConditionBuilder rightFuzzyWno (List<String> rightFuzzyWno){
            this.rightFuzzyWno = rightFuzzyWno;
            return this;
        }

        public ConditionBuilder rightFuzzyWno (String ... rightFuzzyWno){
            this.rightFuzzyWno = solveNullList(rightFuzzyWno);
            return this;
        }

        public ConditionBuilder WnoList(String ... Wno){
            this.WnoList = solveNullList(Wno);
            return this;
        }

        public ConditionBuilder WnoList(List<String> Wno){
            this.WnoList = Wno;
            return this;
        }

        public ConditionBuilder fuzzyBno (List<String> fuzzyBno){
            this.fuzzyBno = fuzzyBno;
            return this;
        }

        public ConditionBuilder fuzzyBno (String ... fuzzyBno){
            this.fuzzyBno = solveNullList(fuzzyBno);
            return this;
        }

        public ConditionBuilder rightFuzzyBno (List<String> rightFuzzyBno){
            this.rightFuzzyBno = rightFuzzyBno;
            return this;
        }

        public ConditionBuilder rightFuzzyBno (String ... rightFuzzyBno){
            this.rightFuzzyBno = solveNullList(rightFuzzyBno);
            return this;
        }

        public ConditionBuilder BnoList(String ... Bno){
            this.BnoList = solveNullList(Bno);
            return this;
        }

        public ConditionBuilder BnoList(List<String> Bno){
            this.BnoList = Bno;
            return this;
        }

        public ConditionBuilder fuzzyDno (List<String> fuzzyDno){
            this.fuzzyDno = fuzzyDno;
            return this;
        }

        public ConditionBuilder fuzzyDno (String ... fuzzyDno){
            this.fuzzyDno = solveNullList(fuzzyDno);
            return this;
        }

        public ConditionBuilder rightFuzzyDno (List<String> rightFuzzyDno){
            this.rightFuzzyDno = rightFuzzyDno;
            return this;
        }

        public ConditionBuilder rightFuzzyDno (String ... rightFuzzyDno){
            this.rightFuzzyDno = solveNullList(rightFuzzyDno);
            return this;
        }

        public ConditionBuilder DnoList(String ... Dno){
            this.DnoList = solveNullList(Dno);
            return this;
        }

        public ConditionBuilder DnoList(List<String> Dno){
            this.DnoList = Dno;
            return this;
        }

        public ConditionBuilder fuzzyPtel (List<String> fuzzyPtel){
            this.fuzzyPtel = fuzzyPtel;
            return this;
        }

        public ConditionBuilder fuzzyPtel (String ... fuzzyPtel){
            this.fuzzyPtel = solveNullList(fuzzyPtel);
            return this;
        }

        public ConditionBuilder rightFuzzyPtel (List<String> rightFuzzyPtel){
            this.rightFuzzyPtel = rightFuzzyPtel;
            return this;
        }

        public ConditionBuilder rightFuzzyPtel (String ... rightFuzzyPtel){
            this.rightFuzzyPtel = solveNullList(rightFuzzyPtel);
            return this;
        }

        public ConditionBuilder PtelList(String ... Ptel){
            this.PtelList = solveNullList(Ptel);
            return this;
        }

        public ConditionBuilder PtelList(List<String> Ptel){
            this.PtelList = Ptel;
            return this;
        }

        public ConditionBuilder PindateBetWeen(java.time.LocalDate PindateSt,java.time.LocalDate PindateEd){
            this.PindateSt = PindateSt;
            this.PindateEd = PindateEd;
            return this;
        }

        public ConditionBuilder PindateGreaterEqThan(java.time.LocalDate PindateSt){
            this.PindateSt = PindateSt;
            return this;
        }
        public ConditionBuilder PindateLessEqThan(java.time.LocalDate PindateEd){
            this.PindateEd = PindateEd;
            return this;
        }


        public ConditionBuilder PindateList(java.time.LocalDate ... Pindate){
            this.PindateList = solveNullList(Pindate);
            return this;
        }

        public ConditionBuilder PindateList(List<java.time.LocalDate> Pindate){
            this.PindateList = Pindate;
            return this;
        }

        public ConditionBuilder PoutdateBetWeen(java.time.LocalDate PoutdateSt,java.time.LocalDate PoutdateEd){
            this.PoutdateSt = PoutdateSt;
            this.PoutdateEd = PoutdateEd;
            return this;
        }

        public ConditionBuilder PoutdateGreaterEqThan(java.time.LocalDate PoutdateSt){
            this.PoutdateSt = PoutdateSt;
            return this;
        }
        public ConditionBuilder PoutdateLessEqThan(java.time.LocalDate PoutdateEd){
            this.PoutdateEd = PoutdateEd;
            return this;
        }


        public ConditionBuilder PoutdateList(java.time.LocalDate ... Poutdate){
            this.PoutdateList = solveNullList(Poutdate);
            return this;
        }

        public ConditionBuilder PoutdateList(List<java.time.LocalDate> Poutdate){
            this.PoutdateList = Poutdate;
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

        private Patient obj;

        public Builder(){
            this.obj = new Patient();
        }

        public Builder Pno(String Pno){
            this.obj.setPno(Pno);
            return this;
        }
        public Builder Pname(String Pname){
            this.obj.setPname(Pname);
            return this;
        }
        public Builder Psex(String Psex){
            this.obj.setPsex(Psex);
            return this;
        }
        public Builder Pdiagnose(String Pdiagnose){
            this.obj.setPdiagnose(Pdiagnose);
            return this;
        }
        public Builder Wno(String Wno){
            this.obj.setWno(Wno);
            return this;
        }
        public Builder Bno(String Bno){
            this.obj.setBno(Bno);
            return this;
        }
        public Builder Dno(String Dno){
            this.obj.setDno(Dno);
            return this;
        }
        public Builder Ptel(String Ptel){
            this.obj.setPtel(Ptel);
            return this;
        }
        public Builder Pindate(java.time.LocalDate Pindate){
            this.obj.setPindate(Pindate);
            return this;
        }
        public Builder Poutdate(java.time.LocalDate Poutdate){
            this.obj.setPoutdate(Poutdate);
            return this;
        }
        public Patient build(){return obj;}
    }

}
