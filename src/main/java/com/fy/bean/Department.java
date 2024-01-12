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
public class Department implements Serializable {

    private static final long serialVersionUID = 1704610028201L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String Deptname;

    /**
    * 
    * isNullAble:0
    */
    private String Deptaddress;

    /**
    * 
    * isNullAble:0
    */
    private String Depttel;


    public void setDeptname(String Deptname){this.Deptname = Deptname;}

    public String getDeptname(){return this.Deptname;}

    public void setDeptaddress(String Deptaddress){this.Deptaddress = Deptaddress;}

    public String getDeptaddress(){return this.Deptaddress;}

    public void setDepttel(String Depttel){this.Depttel = Depttel;}

    public String getDepttel(){return this.Depttel;}
    @Override
    public String toString() {
        return "Department{" +
                "Deptname='" + Deptname + '\'' +
                "Deptaddress='" + Deptaddress + '\'' +
                "Depttel='" + Depttel + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Department set;

        private ConditionBuilder where;

        public UpdateBuilder set(Department set){
            this.set = set;
            return this;
        }

        public Department getSet(){
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

    public static class QueryBuilder extends Department{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> DeptnameList;

        public List<String> getDeptnameList(){return this.DeptnameList;}


        private List<String> fuzzyDeptname;

        public List<String> getFuzzyDeptname(){return this.fuzzyDeptname;}

        private List<String> rightFuzzyDeptname;

        public List<String> getRightFuzzyDeptname(){return this.rightFuzzyDeptname;}
        private List<String> DeptaddressList;

        public List<String> getDeptaddressList(){return this.DeptaddressList;}


        private List<String> fuzzyDeptaddress;

        public List<String> getFuzzyDeptaddress(){return this.fuzzyDeptaddress;}

        private List<String> rightFuzzyDeptaddress;

        public List<String> getRightFuzzyDeptaddress(){return this.rightFuzzyDeptaddress;}
        private List<String> DepttelList;

        public List<String> getDepttelList(){return this.DepttelList;}


        private List<String> fuzzyDepttel;

        public List<String> getFuzzyDepttel(){return this.fuzzyDepttel;}

        private List<String> rightFuzzyDepttel;

        public List<String> getRightFuzzyDepttel(){return this.rightFuzzyDepttel;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyDeptaddress (List<String> fuzzyDeptaddress){
            this.fuzzyDeptaddress = fuzzyDeptaddress;
            return this;
        }

        public QueryBuilder fuzzyDeptaddress (String ... fuzzyDeptaddress){
            this.fuzzyDeptaddress = solveNullList(fuzzyDeptaddress);
            return this;
        }

        public QueryBuilder rightFuzzyDeptaddress (List<String> rightFuzzyDeptaddress){
            this.rightFuzzyDeptaddress = rightFuzzyDeptaddress;
            return this;
        }

        public QueryBuilder rightFuzzyDeptaddress (String ... rightFuzzyDeptaddress){
            this.rightFuzzyDeptaddress = solveNullList(rightFuzzyDeptaddress);
            return this;
        }

        public QueryBuilder Deptaddress(String Deptaddress){
            setDeptaddress(Deptaddress);
            return this;
        }

        public QueryBuilder DeptaddressList(String ... Deptaddress){
            this.DeptaddressList = solveNullList(Deptaddress);
            return this;
        }

        public QueryBuilder DeptaddressList(List<String> Deptaddress){
            this.DeptaddressList = Deptaddress;
            return this;
        }

        public QueryBuilder fetchDeptaddress(){
            setFetchFields("fetchFields","Deptaddress");
            return this;
        }

        public QueryBuilder excludeDeptaddress(){
            setFetchFields("excludeFields","Deptaddress");
            return this;
        }

        public QueryBuilder fuzzyDepttel (List<String> fuzzyDepttel){
            this.fuzzyDepttel = fuzzyDepttel;
            return this;
        }

        public QueryBuilder fuzzyDepttel (String ... fuzzyDepttel){
            this.fuzzyDepttel = solveNullList(fuzzyDepttel);
            return this;
        }

        public QueryBuilder rightFuzzyDepttel (List<String> rightFuzzyDepttel){
            this.rightFuzzyDepttel = rightFuzzyDepttel;
            return this;
        }

        public QueryBuilder rightFuzzyDepttel (String ... rightFuzzyDepttel){
            this.rightFuzzyDepttel = solveNullList(rightFuzzyDepttel);
            return this;
        }

        public QueryBuilder Depttel(String Depttel){
            setDepttel(Depttel);
            return this;
        }

        public QueryBuilder DepttelList(String ... Depttel){
            this.DepttelList = solveNullList(Depttel);
            return this;
        }

        public QueryBuilder DepttelList(List<String> Depttel){
            this.DepttelList = Depttel;
            return this;
        }

        public QueryBuilder fetchDepttel(){
            setFetchFields("fetchFields","Depttel");
            return this;
        }

        public QueryBuilder excludeDepttel(){
            setFetchFields("excludeFields","Depttel");
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

        public Department build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> DeptnameList;

        public List<String> getDeptnameList(){return this.DeptnameList;}


        private List<String> fuzzyDeptname;

        public List<String> getFuzzyDeptname(){return this.fuzzyDeptname;}

        private List<String> rightFuzzyDeptname;

        public List<String> getRightFuzzyDeptname(){return this.rightFuzzyDeptname;}
        private List<String> DeptaddressList;

        public List<String> getDeptaddressList(){return this.DeptaddressList;}


        private List<String> fuzzyDeptaddress;

        public List<String> getFuzzyDeptaddress(){return this.fuzzyDeptaddress;}

        private List<String> rightFuzzyDeptaddress;

        public List<String> getRightFuzzyDeptaddress(){return this.rightFuzzyDeptaddress;}
        private List<String> DepttelList;

        public List<String> getDepttelList(){return this.DepttelList;}


        private List<String> fuzzyDepttel;

        public List<String> getFuzzyDepttel(){return this.fuzzyDepttel;}

        private List<String> rightFuzzyDepttel;

        public List<String> getRightFuzzyDepttel(){return this.rightFuzzyDepttel;}

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

        public ConditionBuilder fuzzyDeptaddress (List<String> fuzzyDeptaddress){
            this.fuzzyDeptaddress = fuzzyDeptaddress;
            return this;
        }

        public ConditionBuilder fuzzyDeptaddress (String ... fuzzyDeptaddress){
            this.fuzzyDeptaddress = solveNullList(fuzzyDeptaddress);
            return this;
        }

        public ConditionBuilder rightFuzzyDeptaddress (List<String> rightFuzzyDeptaddress){
            this.rightFuzzyDeptaddress = rightFuzzyDeptaddress;
            return this;
        }

        public ConditionBuilder rightFuzzyDeptaddress (String ... rightFuzzyDeptaddress){
            this.rightFuzzyDeptaddress = solveNullList(rightFuzzyDeptaddress);
            return this;
        }

        public ConditionBuilder DeptaddressList(String ... Deptaddress){
            this.DeptaddressList = solveNullList(Deptaddress);
            return this;
        }

        public ConditionBuilder DeptaddressList(List<String> Deptaddress){
            this.DeptaddressList = Deptaddress;
            return this;
        }

        public ConditionBuilder fuzzyDepttel (List<String> fuzzyDepttel){
            this.fuzzyDepttel = fuzzyDepttel;
            return this;
        }

        public ConditionBuilder fuzzyDepttel (String ... fuzzyDepttel){
            this.fuzzyDepttel = solveNullList(fuzzyDepttel);
            return this;
        }

        public ConditionBuilder rightFuzzyDepttel (List<String> rightFuzzyDepttel){
            this.rightFuzzyDepttel = rightFuzzyDepttel;
            return this;
        }

        public ConditionBuilder rightFuzzyDepttel (String ... rightFuzzyDepttel){
            this.rightFuzzyDepttel = solveNullList(rightFuzzyDepttel);
            return this;
        }

        public ConditionBuilder DepttelList(String ... Depttel){
            this.DepttelList = solveNullList(Depttel);
            return this;
        }

        public ConditionBuilder DepttelList(List<String> Depttel){
            this.DepttelList = Depttel;
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

        private Department obj;

        public Builder(){
            this.obj = new Department();
        }

        public Builder Deptname(String Deptname){
            this.obj.setDeptname(Deptname);
            return this;
        }
        public Builder Deptaddress(String Deptaddress){
            this.obj.setDeptaddress(Deptaddress);
            return this;
        }
        public Builder Depttel(String Depttel){
            this.obj.setDepttel(Depttel);
            return this;
        }
        public Department build(){return obj;}
    }

}
