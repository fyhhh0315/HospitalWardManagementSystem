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
public class Bed implements Serializable {

    private static final long serialVersionUID = 1704610023425L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String Wno;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String Bno;

    /**
    * 
    * isNullAble:1
    */
    private String Bstate;


    public void setWno(String Wno){this.Wno = Wno;}

    public String getWno(){return this.Wno;}

    public void setBno(String Bno){this.Bno = Bno;}

    public String getBno(){return this.Bno;}

    public void setBstate(String Bstate){this.Bstate = Bstate;}

    public String getBstate(){return this.Bstate;}
    @Override
    public String toString() {
        return "Bed{" +
                "Wno='" + Wno + '\'' +
                "Bno='" + Bno + '\'' +
                "Bstate='" + Bstate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Bed set;

        private ConditionBuilder where;

        public UpdateBuilder set(Bed set){
            this.set = set;
            return this;
        }

        public Bed getSet(){
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

    public static class QueryBuilder extends Bed{
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
        private List<String> BnoList;

        public List<String> getBnoList(){return this.BnoList;}


        private List<String> fuzzyBno;

        public List<String> getFuzzyBno(){return this.fuzzyBno;}

        private List<String> rightFuzzyBno;

        public List<String> getRightFuzzyBno(){return this.rightFuzzyBno;}
        private List<String> BstateList;

        public List<String> getBstateList(){return this.BstateList;}


        private List<String> fuzzyBstate;

        public List<String> getFuzzyBstate(){return this.fuzzyBstate;}

        private List<String> rightFuzzyBstate;

        public List<String> getRightFuzzyBstate(){return this.rightFuzzyBstate;}
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

        public QueryBuilder fuzzyBstate (List<String> fuzzyBstate){
            this.fuzzyBstate = fuzzyBstate;
            return this;
        }

        public QueryBuilder fuzzyBstate (String ... fuzzyBstate){
            this.fuzzyBstate = solveNullList(fuzzyBstate);
            return this;
        }

        public QueryBuilder rightFuzzyBstate (List<String> rightFuzzyBstate){
            this.rightFuzzyBstate = rightFuzzyBstate;
            return this;
        }

        public QueryBuilder rightFuzzyBstate (String ... rightFuzzyBstate){
            this.rightFuzzyBstate = solveNullList(rightFuzzyBstate);
            return this;
        }

        public QueryBuilder Bstate(String Bstate){
            setBstate(Bstate);
            return this;
        }

        public QueryBuilder BstateList(String ... Bstate){
            this.BstateList = solveNullList(Bstate);
            return this;
        }

        public QueryBuilder BstateList(List<String> Bstate){
            this.BstateList = Bstate;
            return this;
        }

        public QueryBuilder fetchBstate(){
            setFetchFields("fetchFields","Bstate");
            return this;
        }

        public QueryBuilder excludeBstate(){
            setFetchFields("excludeFields","Bstate");
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

        public Bed build(){return this;}
    }


    public static class ConditionBuilder{
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
        private List<String> BstateList;

        public List<String> getBstateList(){return this.BstateList;}


        private List<String> fuzzyBstate;

        public List<String> getFuzzyBstate(){return this.fuzzyBstate;}

        private List<String> rightFuzzyBstate;

        public List<String> getRightFuzzyBstate(){return this.rightFuzzyBstate;}

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

        public ConditionBuilder fuzzyBstate (List<String> fuzzyBstate){
            this.fuzzyBstate = fuzzyBstate;
            return this;
        }

        public ConditionBuilder fuzzyBstate (String ... fuzzyBstate){
            this.fuzzyBstate = solveNullList(fuzzyBstate);
            return this;
        }

        public ConditionBuilder rightFuzzyBstate (List<String> rightFuzzyBstate){
            this.rightFuzzyBstate = rightFuzzyBstate;
            return this;
        }

        public ConditionBuilder rightFuzzyBstate (String ... rightFuzzyBstate){
            this.rightFuzzyBstate = solveNullList(rightFuzzyBstate);
            return this;
        }

        public ConditionBuilder BstateList(String ... Bstate){
            this.BstateList = solveNullList(Bstate);
            return this;
        }

        public ConditionBuilder BstateList(List<String> Bstate){
            this.BstateList = Bstate;
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

        private Bed obj;

        public Builder(){
            this.obj = new Bed();
        }

        public Builder Wno(String Wno){
            this.obj.setWno(Wno);
            return this;
        }
        public Builder Bno(String Bno){
            this.obj.setBno(Bno);
            return this;
        }
        public Builder Bstate(String Bstate){
            this.obj.setBstate(Bstate);
            return this;
        }
        public Bed build(){return obj;}
    }

}
