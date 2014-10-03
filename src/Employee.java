public class Employee {
    
    private String name;
    private int type;
    private double rate;
    private int hours;
    
    public Employee(){
        name="";
        type=0;
        rate=0;
        hours=0;
        
    }
    
    public String getTypeRules(){
        return"1 or 2";
    }
    
    public String getRateRules(){
        return"noblank";
    }
    
    public String getHoursRules(){
        return "between 6.75 and 30.50, inclusive";
    }
    
    public boolean setName(String nm){
        boolean blank = (nm.equals(""));
        if(blank)
         return false;
        else{
            name=nm;
            return true;
        }
    }
    
    
}
