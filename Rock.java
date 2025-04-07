public class Rock{
    String name;
    double hardness;
    double depth;
    double weight;
    public Rock(){
        name = "rock";
        hardness = 3.0;
        depth = 0.0;
        weight = 10;
    }
    public Rock(String n_name,double n_hardness,double n_depth,double n_weight){
        name = n_name;
        hardness = n_hardness;
        depth = n_depth;
        weight = n_weight;
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
    public double getWeight(){
        return weight;
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
    public void setWeight(double n_weight){
        weight = n_weight;
    }
    public double findingProb(){
        if((80.3-(depth/50))>0){
        return 80.3-(depth/50);
        }else{
            return 0.0;
        }
    }
    public void throwRock(){
        if((3-weight/10)>0){
        System.out.println("You threw the rock "+(3-weight/10)+"ft!");
        }else{
            System.out.println("You couldn't throw the rock...");
        }
    }
    public void scratchesRock(Rock rock){
        if(this.hardness>rock.getHardness()){
            System.out.println("Your rock scratches the other rock!");
        }
        else if(this.hardness<rock.getHardness()){
            System.out.println("Your rock gets scratched by the other rock.");
        }else{
            System.out.println("Both rocks gets scratched.");
        }
    }
    public String toString(){
        return "Your rock weighs "+weight+" pounds and is " +name+" and has a hardness of "+hardness+" and is found underground in "+depth+"ft.";
    }
}