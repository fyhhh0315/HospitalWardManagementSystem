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
public class Ward implements Serializable {

    private static final long serialVersionUID = 1704610043240L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String Wno;

    /**
    * 
    * isNullAble:0
    */
    private String Deptname;

    /**
    * 
    * isNullAble:0
    */
    private Integer Wcharge;


    public void setWno(String Wno){this.Wno = Wno;}

    public String getWno(){return this.Wno;}

    public void setDeptname(String Deptname){this.Deptname = Deptname;}

    public String getDeptname(){return this.Deptname;}

    public void setWcharge(Integer Wcharge){this.Wcharge = Wcharge;}

    public Integer getWcharge(){return this.Wcharge;}
    @Override
    public String toString() {
        return "Ward{" +
                "Wno='" + Wno + '\'' +
                "Deptname='" + Deptname + '\'' +
                "Wcharge='" + Wcharge + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Ward set;

        private ConditionBuilder where;

        public UpdateBuilder set(Ward set){
            this.set = set;
            return this;
        }

        public Ward getSet(){
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

    public static class QueryBuilder extends Ward{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> WnoList;

        public List<String> getWnoList(){return this.WnoList;}


        private List<String> fuzzyWno;

        public List<String> getFuzzyWno(){return this.fuzzyWno;}

        private List<String> rightFuzzyWno;

        public List<String> getRightFuzzyWno(){return this.rightFuzzyWno;}
        private List<String> DeptnameList;

        public List<String> getDeptnameList(){return this.DeptnameList;}


        private List<String> fuzzyDeptname;

        public List<String> getFuzzyDeptname(){return this.fuzzyDeptname;}

        private List<String> rightFuzzyDeptname;

        public List<String> getRightFuzzyDeptname(){return this.rightFuzzyDeptname;}
        private List<Integer> WchargeList;

        public List<Integer> getWchargeList(){return this.WchargeList;}

        private Integer WchargeSt;

        private Integer WchargeEd;

        public Integer getWchargeSt(){return this.WchargeSt;}

        public Integer getWchargeEd(){return this.WchargeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder WchargeBetWeen(Integer WchargeSt,Integer WchargeEd){
            this.WchargeSt = WchargeSt;
            this.WchargeEd = WchargeEd;
            return this;
        }

        public QueryBuilder WchargeGreaterEqThan(Integer WchargeSt){
            this.WchargeSt = WchargeSt;
            return this;
        }
        public QueryBuilder WchargeLessEqThan(Integer WchargeEd){
            this.WchargeEd = WchargeEd;
            return this;
        }


        public QueryBuilder Wcharge(Integer Wcharge){
            setWcharge(Wcharge);
            return this;
        }

        public QueryBuilder WchargeList(Integer ... Wcharge){
            this.WchargeList = solveNullList(Wcharge);
            return this;
        }

        public QueryBuilder WchargeList(List<Integer> Wcharge){
            this.WchargeList = Wcharge;
            return this;
        }

        public QueryBuilder fetchWcharge(){
            setFetchFields("fetchFields","Wcharge");
            return this;
        }

        public QueryBuilder excludeWcharge(){
            setFetchFields("excludeFields","Wcharge");
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

        public Ward build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> WnoList;

        public List<String> getWnoList(){return this.WnoList;}


        private List<String> fuzzyWno;

        public List<String> getFuzzyWno(){return this.fuzzyWno;}

        private List<String> rightFuzzyWno;

        public List<String> getRightFuzzyWno(){return this.rightFuzzyWno;}
        private List<String> DeptnameList;

        public List<String> getDeptnameList(){return this.DeptnameList;}


        private List<String> fuzzyDeptname;

        public List<String> getFuzzyDeptname(){return this.fuzzyDeptname;}

        private List<String> rightFuzzyDeptname;

        public List<String> getRightFuzzyDeptname(){return this.rightFuzzyDeptname;}
        private List<Integer> WchargeList;

        public List<Integer> getWchargeList(){return this.WchargeList;}

        private Integer WchargeSt;

        private Integer WchargeEd;

        public Integer getWchargeSt(){return this.WchargeSt;}

        public Integer getWchargeEd(){return this.WchargeEd;}


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

        public ConditionBuilder WchargeBetWeen(Integer WchargeSt,Integer WchargeEd){
            this.WchargeSt = WchargeSt;
            this.WchargeEd = WchargeEd;
            return this;
        }

        public ConditionBuilder WchargeGreaterEqThan(Integer WchargeSt){
            this.WchargeSt = WchargeSt;
            return this;
        }
        public ConditionBuilder WchargeLessEqThan(Integer WchargeEd){
            this.WchargeEd = WchargeEd;
            return this;
        }


        public ConditionBuilder WchargeList(Integer ... Wcharge){
            this.WchargeList = solveNullList(Wcharge);
            return this;
        }

        public ConditionBuilder WchargeList(List<Integer> Wcharge){
            this.WchargeList = Wcharge;
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

        private Ward obj;

        public Builder(){
            this.obj = new Ward();
        }

        public Builder Wno(String Wno){
            this.obj.setWno(Wno);
            return this;
        }
        public Builder Deptname(String Deptname){
            this.obj.setDeptname(Deptname);
            return this;
        }
        public Builder Wcharge(Integer Wcharge){
            this.obj.setWcharge(Wcharge);
            return this;
        }
        public Ward build(){return obj;}
    }

}
