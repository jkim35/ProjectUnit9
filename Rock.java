public class Rock{
    String name;
    double hardness;
    double depth;
    public Rock(String n_name,double n_hardness,double n_depth){
        name = n_name;
        hardness = n_hardness;
        depth = n_depth;
    }
    public String getName(){
        return name;
    }
    public Double getHardness(){
        return hardness;
    }
    public double getDepth(){
        return depth;
    }
    public void setName(String n_name){
        name = n_name;
    }
    public void setHardness(Double n_hardness){
        hardness = n_hardness;
    }
    public void setDepth(double n_depth){
        depth = n_depth;
    }
    public double findingProb(){
        return 80.3-(depth/50);
    }
}