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
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1704610033299L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String Dno;

    /**
    * 
    * isNullAble:0
    */
    private String Dpassword;

    /**
    * 
    * isNullAble:0
    */
    private String Dname;

    /**
    * 
    * isNullAble:0
    */
    private String Dsex;

    /**
    * 
    * isNullAble:0
    */
    private String Dtitle;

    /**
    * 
    * isNullAble:0
    */
    private Integer Dage;

    /**
    * 
    * isNullAble:0
    */
    private String Dtel;

    /**
    * 
    * isNullAble:0
    */
    private String Deptname;


    public void setDno(String Dno){this.Dno = Dno;}

    public String getDno(){return this.Dno;}

    public void setDpassword(String Dpassword){this.Dpassword = Dpassword;}

    public String getDpassword(){return this.Dpassword;}

    public void setDname(String Dname){this.Dname = Dname;}

    public String getDname(){return this.Dname;}

    public void setDsex(String Dsex){this.Dsex = Dsex;}

    public String getDsex(){return this.Dsex;}

    public void setDtitle(String Dtitle){this.Dtitle = Dtitle;}

    public String getDtitle(){return this.Dtitle;}

    public void setDage(Integer Dage){this.Dage = Dage;}

    public Integer getDage(){return this.Dage;}

    public void setDtel(String Dtel){this.Dtel = Dtel;}

    public String getDtel(){return this.Dtel;}

    public void setDeptname(String Deptname){this.Deptname = Deptname;}

    public String getDeptname(){return this.Deptname;}
    @Override
    public String toString() {
        return "Doctor{" +
                "Dno='" + Dno + '\'' +
                "Dpassword='" + Dpassword + '\'' +
                "Dname='" + Dname + '\'' +
                "Dsex='" + Dsex + '\'' +
                "Dtitle='" + Dtitle + '\'' +
                "Dage='" + Dage + '\'' +
                "Dtel='" + Dtel + '\'' +
                "Deptname='" + Deptname + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Doctor set;

        private ConditionBuilder where;

        public UpdateBuilder set(Doctor set){
            this.set = set;
            return this;
        }

        public Doctor getSet(){
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

    public static class QueryBuilder extends Doctor{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> DnoList;

        public List<String> getDnoList(){return this.DnoList;}


        private List<String> fuzzyDno;

        public List<String> getFuzzyDno(){return this.fuzzyDno;}

        private List<String> rightFuzzyDno;

        public List<String> getRightFuzzyDno(){return this.rightFuzzyDno;}
        private List<String> DpasswordList;

        public List<String> getDpasswordList(){return this.DpasswordList;}


        private List<String> fuzzyDpassword;

        public List<String> getFuzzyDpassword(){return this.fuzzyDpassword;}

        private List<String> rightFuzzyDpassword;

        public List<String> getRightFuzzyDpassword(){return this.rightFuzzyDpassword;}
        private List<String> DnameList;

        public List<String> getDnameList(){return this.DnameList;}


        private List<String> fuzzyDname;

        public List<String> getFuzzyDname(){return this.fuzzyDname;}

        private List<String> rightFuzzyDname;

        public List<String> getRightFuzzyDname(){return this.rightFuzzyDname;}
        private List<String> DsexList;

        public List<String> getDsexList(){return this.DsexList;}


        private List<String> fuzzyDsex;

        public List<String> getFuzzyDsex(){return this.fuzzyDsex;}

        private List<String> rightFuzzyDsex;

        public List<String> getRightFuzzyDsex(){return this.rightFuzzyDsex;}
        private List<String> DtitleList;

        public List<String> getDtitleList(){return this.DtitleList;}


        private List<String> fuzzyDtitle;

        public List<String> getFuzzyDtitle(){return this.fuzzyDtitle;}

        private List<String> rightFuzzyDtitle;

        public List<String> getRightFuzzyDtitle(){return this.rightFuzzyDtitle;}
        private List<Integer> DageList;

        public List<Integer> getDageList(){return this.DageList;}

        private Integer DageSt;

        private Integer DageEd;

        public Integer getDageSt(){return this.DageSt;}

        public Integer getDageEd(){return this.DageEd;}

        private List<String> DtelList;

        public List<String> getDtelList(){return this.DtelList;}


        private List<String> fuzzyDtel;

        public List<String> getFuzzyDtel(){return this.fuzzyDtel;}

        private List<String> rightFuzzyDtel;

        public List<String> getRightFuzzyDtel(){return this.rightFuzzyDtel;}
        private List<String> DeptnameList;

        public List<String> getDeptnameList(){return this.DeptnameList;}


        private List<String> fuzzyDeptname;

        public List<String> getFuzzyDeptname(){return this.fuzzyDeptname;}

        private List<String> rightFuzzyDeptname;

        public List<String> getRightFuzzyDeptname(){return this.rightFuzzyDeptname;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyDpassword (List<String> fuzzyDpassword){
            this.fuzzyDpassword = fuzzyDpassword;
            return this;
        }

        public QueryBuilder fuzzyDpassword (String ... fuzzyDpassword){
            this.fuzzyDpassword = solveNullList(fuzzyDpassword);
            return this;
        }

        public QueryBuilder rightFuzzyDpassword (List<String> rightFuzzyDpassword){
            this.rightFuzzyDpassword = rightFuzzyDpassword;
            return this;
        }

        public QueryBuilder rightFuzzyDpassword (String ... rightFuzzyDpassword){
            this.rightFuzzyDpassword = solveNullList(rightFuzzyDpassword);
            return this;
        }

        public QueryBuilder Dpassword(String Dpassword){
            setDpassword(Dpassword);
            return this;
        }

        public QueryBuilder DpasswordList(String ... Dpassword){
            this.DpasswordList = solveNullList(Dpassword);
            return this;
        }

        public QueryBuilder DpasswordList(List<String> Dpassword){
            this.DpasswordList = Dpassword;
            return this;
        }

        public QueryBuilder fetchDpassword(){
            setFetchFields("fetchFields","Dpassword");
            return this;
        }

        public QueryBuilder excludeDpassword(){
            setFetchFields("excludeFields","Dpassword");
            return this;
        }

        public QueryBuilder fuzzyDname (List<String> fuzzyDname){
            this.fuzzyDname = fuzzyDname;
            return this;
        }

        public QueryBuilder fuzzyDname (String ... fuzzyDname){
            this.fuzzyDname = solveNullList(fuzzyDname);
            return this;
        }

        public QueryBuilder rightFuzzyDname (List<String> rightFuzzyDname){
            this.rightFuzzyDname = rightFuzzyDname;
            return this;
        }

        public QueryBuilder rightFuzzyDname (String ... rightFuzzyDname){
            this.rightFuzzyDname = solveNullList(rightFuzzyDname);
            return this;
        }

        public QueryBuilder Dname(String Dname){
            setDname(Dname);
            return this;
        }

        public QueryBuilder DnameList(String ... Dname){
            this.DnameList = solveNullList(Dname);
            return this;
        }

        public QueryBuilder DnameList(List<String> Dname){
            this.DnameList = Dname;
            return this;
        }

        public QueryBuilder fetchDname(){
            setFetchFields("fetchFields","Dname");
            return this;
        }

        public QueryBuilder excludeDname(){
            setFetchFields("excludeFields","Dname");
            return this;
        }

        public QueryBuilder fuzzyDsex (List<String> fuzzyDsex){
            this.fuzzyDsex = fuzzyDsex;
            return this;
        }

        public QueryBuilder fuzzyDsex (String ... fuzzyDsex){
            this.fuzzyDsex = solveNullList(fuzzyDsex);
            return this;
        }

        public QueryBuilder rightFuzzyDsex (List<String> rightFuzzyDsex){
            this.rightFuzzyDsex = rightFuzzyDsex;
            return this;
        }

        public QueryBuilder rightFuzzyDsex (String ... rightFuzzyDsex){
            this.rightFuzzyDsex = solveNullList(rightFuzzyDsex);
            return this;
        }

        public QueryBuilder Dsex(String Dsex){
            setDsex(Dsex);
            return this;
        }

        public QueryBuilder DsexList(String ... Dsex){
            this.DsexList = solveNullList(Dsex);
            return this;
        }

        public QueryBuilder DsexList(List<String> Dsex){
            this.DsexList = Dsex;
            return this;
        }

        public QueryBuilder fetchDsex(){
            setFetchFields("fetchFields","Dsex");
            return this;
        }

        public QueryBuilder excludeDsex(){
            setFetchFields("excludeFields","Dsex");
            return this;
        }

        public QueryBuilder fuzzyDtitle (List<String> fuzzyDtitle){
            this.fuzzyDtitle = fuzzyDtitle;
            return this;
        }

        public QueryBuilder fuzzyDtitle (String ... fuzzyDtitle){
            this.fuzzyDtitle = solveNullList(fuzzyDtitle);
            return this;
        }

        public QueryBuilder rightFuzzyDtitle (List<String> rightFuzzyDtitle){
            this.rightFuzzyDtitle = rightFuzzyDtitle;
            return this;
        }

        public QueryBuilder rightFuzzyDtitle (String ... rightFuzzyDtitle){
            this.rightFuzzyDtitle = solveNullList(rightFuzzyDtitle);
            return this;
        }

        public QueryBuilder Dtitle(String Dtitle){
            setDtitle(Dtitle);
            return this;
        }

        public QueryBuilder DtitleList(String ... Dtitle){
            this.DtitleList = solveNullList(Dtitle);
            return this;
        }

        public QueryBuilder DtitleList(List<String> Dtitle){
            this.DtitleList = Dtitle;
            return this;
        }

        public QueryBuilder fetchDtitle(){
            setFetchFields("fetchFields","Dtitle");
            return this;
        }

        public QueryBuilder excludeDtitle(){
            setFetchFields("excludeFields","Dtitle");
            return this;
        }

        public QueryBuilder DageBetWeen(Integer DageSt,Integer DageEd){
            this.DageSt = DageSt;
            this.DageEd = DageEd;
            return this;
        }

        public QueryBuilder DageGreaterEqThan(Integer DageSt){
            this.DageSt = DageSt;
            return this;
        }
        public QueryBuilder DageLessEqThan(Integer DageEd){
            this.DageEd = DageEd;
            return this;
        }


        public QueryBuilder Dage(Integer Dage){
            setDage(Dage);
            return this;
        }

        public QueryBuilder DageList(Integer ... Dage){
            this.DageList = solveNullList(Dage);
            return this;
        }

        public QueryBuilder DageList(List<Integer> Dage){
            this.DageList = Dage;
            return this;
        }

        public QueryBuilder fetchDage(){
            setFetchFields("fetchFields","Dage");
            return this;
        }

        public QueryBuilder excludeDage(){
            setFetchFields("excludeFields","Dage");
            return this;
        }

        public QueryBuilder fuzzyDtel (List<String> fuzzyDtel){
            this.fuzzyDtel = fuzzyDtel;
            return this;
        }

        public QueryBuilder fuzzyDtel (String ... fuzzyDtel){
            this.fuzzyDtel = solveNullList(fuzzyDtel);
            return this;
        }

        public QueryBuilder rightFuzzyDtel (List<String> rightFuzzyDtel){
            this.rightFuzzyDtel = rightFuzzyDtel;
            return this;
        }

        public QueryBuilder rightFuzzyDtel (String ... rightFuzzyDtel){
            this.rightFuzzyDtel = solveNullList(rightFuzzyDtel);
            return this;
        }

        public QueryBuilder Dtel(String Dtel){
            setDtel(Dtel);
            return this;
        }

        public QueryBuilder DtelList(String ... Dtel){
            this.DtelList = solveNullList(Dtel);
            return this;
        }

        public QueryBuilder DtelList(List<String> Dtel){
            this.DtelList = Dtel;
            return this;
        }

        public QueryBuilder fetchDtel(){
            setFetchFields("fetchFields","Dtel");
            return this;
        }

        public QueryBuilder excludeDtel(){
            setFetchFields("excludeFields","Dtel");
            return this;
        }

        public QueryBuilder fuzzyDeptname (List<String> fuzzyDeptname){
            this.fuzzyDeptname = fuzzyDeptname;
            return this;
        }

        public QueryBuilder fuzzyDeptname (String ... fuzzyDeptname){
            this.fuzzyDeptname = solveNullList(fuzzyDeptname);
            return this;
        }

        public QueryBuilder rightFuzzyDeptname (List<String> rightFuzzyDeptname){
            this.rightFuzzyDeptname = rightFuzzyDeptname;
            return this;
        }

        public QueryBuilder rightFuzzyDeptname (String ... rightFuzzyDeptname){
            this.rightFuzzyDeptname = solveNullList(rightFuzzyDeptname);
            return this;
        }

        public QueryBuilder Deptname(String Deptname){
            setDeptname(Deptname);
            return this;
        }

        public QueryBuilder DeptnameList(String ... Deptname){
            this.DeptnameList = solveNullList(Deptname);
            return this;
        }

        public QueryBuilder DeptnameList(List<String> Deptname){
            this.DeptnameList = Deptname;
            return this;
        }

        public QueryBuilder fetchDeptname(){
            setFetchFields("fetchFields","Deptname");
            return this;
        }

        public QueryBuilder excludeDeptname(){
            setFetchFields("excludeFields","Deptname");
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

        public Doctor build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> DnoList;

        public List<String> getDnoList(){return this.DnoList;}


        private List<String> fuzzyDno;

        public List<String> getFuzzyDno(){return this.fuzzyDno;}

        private List<String> rightFuzzyDno;

        public List<String> getRightFuzzyDno(){return this.rightFuzzyDno;}
        private List<String> DpasswordList;

        public List<String> getDpasswordList(){return this.DpasswordList;}


        private List<String> fuzzyDpassword;

        public List<String> getFuzzyDpassword(){return this.fuzzyDpassword;}

        private List<String> rightFuzzyDpassword;

        public List<String> getRightFuzzyDpassword(){return this.rightFuzzyDpassword;}
        private List<String> DnameList;

        public List<String> getDnameList(){return this.DnameList;}


        private List<String> fuzzyDname;

        public List<String> getFuzzyDname(){return this.fuzzyDname;}

        private List<String> rightFuzzyDname;

        public List<String> getRightFuzzyDname(){return this.rightFuzzyDname;}
        private List<String> DsexList;

        public List<String> getDsexList(){return this.DsexList;}


        private List<String> fuzzyDsex;

        public List<String> getFuzzyDsex(){return this.fuzzyDsex;}

        private List<String> rightFuzzyDsex;

        public List<String> getRightFuzzyDsex(){return this.rightFuzzyDsex;}
        private List<String> DtitleList;

        public List<String> getDtitleList(){return this.DtitleList;}


        private List<String> fuzzyDtitle;

        public List<String> getFuzzyDtitle(){return this.fuzzyDtitle;}

        private List<String> rightFuzzyDtitle;

        public List<String> getRightFuzzyDtitle(){return this.rightFuzzyDtitle;}
        private List<Integer> DageList;

        public List<Integer> getDageList(){return this.DageList;}

        private Integer DageSt;

        private Integer DageEd;

        public Integer getDageSt(){return this.DageSt;}

        public Integer getDageEd(){return this.DageEd;}

        private List<String> DtelList;

        public List<String> getDtelList(){return this.DtelList;}


        private List<String> fuzzyDtel;

        public List<String> getFuzzyDtel(){return this.fuzzyDtel;}

        private List<String> rightFuzzyDtel;

        public List<String> getRightFuzzyDtel(){return this.rightFuzzyDtel;}
        private List<String> DeptnameList;

        public List<String> getDeptnameList(){return this.DeptnameList;}


        private List<String> fuzzyDeptname;

        public List<String> getFuzzyDeptname(){return this.fuzzyDeptname;}

        private List<String> rightFuzzyDeptname;

        public List<String> getRightFuzzyDeptname(){return this.rightFuzzyDeptname;}

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

        public ConditionBuilder fuzzyDpassword (List<String> fuzzyDpassword){
            this.fuzzyDpassword = fuzzyDpassword;
            return this;
        }

        public ConditionBuilder fuzzyDpassword (String ... fuzzyDpassword){
            this.fuzzyDpassword = solveNullList(fuzzyDpassword);
            return this;
        }

        public ConditionBuilder rightFuzzyDpassword (List<String> rightFuzzyDpassword){
            this.rightFuzzyDpassword = rightFuzzyDpassword;
            return this;
        }

        public ConditionBuilder rightFuzzyDpassword (String ... rightFuzzyDpassword){
            this.rightFuzzyDpassword = solveNullList(rightFuzzyDpassword);
            return this;
        }

        public ConditionBuilder DpasswordList(String ... Dpassword){
            this.DpasswordList = solveNullList(Dpassword);
            return this;
        }

        public ConditionBuilder DpasswordList(List<String> Dpassword){
            this.DpasswordList = Dpassword;
            return this;
        }

        public ConditionBuilder fuzzyDname (List<String> fuzzyDname){
            this.fuzzyDname = fuzzyDname;
            return this;
        }

        public ConditionBuilder fuzzyDname (String ... fuzzyDname){
            this.fuzzyDname = solveNullList(fuzzyDname);
            return this;
        }

        public ConditionBuilder rightFuzzyDname (List<String> rightFuzzyDname){
            this.rightFuzzyDname = rightFuzzyDname;
            return this;
        }

        public ConditionBuilder rightFuzzyDname (String ... rightFuzzyDname){
            this.rightFuzzyDname = solveNullList(rightFuzzyDname);
            return this;
        }

        public ConditionBuilder DnameList(String ... Dname){
            this.DnameList = solveNullList(Dname);
            return this;
        }

        public ConditionBuilder DnameList(List<String> Dname){
            this.DnameList = Dname;
            return this;
        }

        public ConditionBuilder fuzzyDsex (List<String> fuzzyDsex){
            this.fuzzyDsex = fuzzyDsex;
            return this;
        }

        public ConditionBuilder fuzzyDsex (String ... fuzzyDsex){
            this.fuzzyDsex = solveNullList(fuzzyDsex);
            return this;
        }

        public ConditionBuilder rightFuzzyDsex (List<String> rightFuzzyDsex){
            this.rightFuzzyDsex = rightFuzzyDsex;
            return this;
        }

        public ConditionBuilder rightFuzzyDsex (String ... rightFuzzyDsex){
            this.rightFuzzyDsex = solveNullList(rightFuzzyDsex);
            return this;
        }

        public ConditionBuilder DsexList(String ... Dsex){
            this.DsexList = solveNullList(Dsex);
            return this;
        }

        public ConditionBuilder DsexList(List<String> Dsex){
            this.DsexList = Dsex;
            return this;
        }

        public ConditionBuilder fuzzyDtitle (List<String> fuzzyDtitle){
            this.fuzzyDtitle = fuzzyDtitle;
            return this;
        }

        public ConditionBuilder fuzzyDtitle (String ... fuzzyDtitle){
            this.fuzzyDtitle = solveNullList(fuzzyDtitle);
            return this;
        }

        public ConditionBuilder rightFuzzyDtitle (List<String> rightFuzzyDtitle){
            this.rightFuzzyDtitle = rightFuzzyDtitle;
            return this;
        }

        public ConditionBuilder rightFuzzyDtitle (String ... rightFuzzyDtitle){
            this.rightFuzzyDtitle = solveNullList(rightFuzzyDtitle);
            return this;
        }

        public ConditionBuilder DtitleList(String ... Dtitle){
            this.DtitleList = solveNullList(Dtitle);
            return this;
        }

        public ConditionBuilder DtitleList(List<String> Dtitle){
            this.DtitleList = Dtitle;
            return this;
        }

        public ConditionBuilder DageBetWeen(Integer DageSt,Integer DageEd){
            this.DageSt = DageSt;
            this.DageEd = DageEd;
            return this;
        }

        public ConditionBuilder DageGreaterEqThan(Integer DageSt){
            this.DageSt = DageSt;
            return this;
        }
        public ConditionBuilder DageLessEqThan(Integer DageEd){
            this.DageEd = DageEd;
            return this;
        }


        public ConditionBuilder DageList(Integer ... Dage){
            this.DageList = solveNullList(Dage);
            return this;
        }

        public ConditionBuilder DageList(List<Integer> Dage){
            this.DageList = Dage;
            return this;
        }

        public ConditionBuilder fuzzyDtel (List<String> fuzzyDtel){
            this.fuzzyDtel = fuzzyDtel;
            return this;
        }

        public ConditionBuilder fuzzyDtel (String ... fuzzyDtel){
            this.fuzzyDtel = solveNullList(fuzzyDtel);
            return this;
        }

        public ConditionBuilder rightFuzzyDtel (List<String> rightFuzzyDtel){
            this.rightFuzzyDtel = rightFuzzyDtel;
            return this;
        }

        public ConditionBuilder rightFuzzyDtel (String ... rightFuzzyDtel){
            this.rightFuzzyDtel = solveNullList(rightFuzzyDtel);
            return this;
        }

        public ConditionBuilder DtelList(String ... Dtel){
            this.DtelList = solveNullList(Dtel);
            return this;
        }

        public ConditionBuilder DtelList(List<String> Dtel){
            this.DtelList = Dtel;
            return this;
        }

        public ConditionBuilder fuzzyDeptname (List<String> fuzzyDeptname){
            this.fuzzyDeptname = fuzzyDeptname;
            return this;
        }

        public ConditionBuilder fuzzyDeptname (String ... fuzzyDeptname){
            this.fuzzyDeptname = solveNullList(fuzzyDeptname);
            return this;
        }

        public ConditionBuilder rightFuzzyDeptname (List<String> rightFuzzyDeptname){
            this.rightFuzzyDeptname = rightFuzzyDeptname;
            return this;
        }

        public ConditionBuilder rightFuzzyDeptname (String ... rightFuzzyDeptname){
            this.rightFuzzyDeptname = solveNullList(rightFuzzyDeptname);
            return this;
        }

        public ConditionBuilder DeptnameList(String ... Deptname){
            this.DeptnameList = solveNullList(Deptname);
            return this;
        }

        public ConditionBuilder DeptnameList(List<String> Deptname){
            this.DeptnameList = Deptname;
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

        private Doctor obj;

        public Builder(){
            this.obj = new Doctor();
        }

        public Builder Dno(String Dno){
            this.obj.setDno(Dno);
            return this;
        }
        public Builder Dpassword(String Dpassword){
            this.obj.setDpassword(Dpassword);
            return this;
        }
        public Builder Dname(String Dname){
            this.obj.setDname(Dname);
            return this;
        }
        public Builder Dsex(String Dsex){
            this.obj.setDsex(Dsex);
            return this;
        }
        public Builder Dtitle(String Dtitle){
            this.obj.setDtitle(Dtitle);
            return this;
        }
        public Builder Dage(Integer Dage){
            this.obj.setDage(Dage);
            return this;
        }
        public Builder Dtel(String Dtel){
            this.obj.setDtel(Dtel);
            return this;
        }
        public Builder Deptname(String Deptname){
            this.obj.setDeptname(Deptname);
            return this;
        }
        public Doctor build(){return obj;}
    }

}
