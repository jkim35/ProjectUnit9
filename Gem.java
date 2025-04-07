class Gem extends Rock{
    String color;
    double price;
    double rarity;
    int shine;
    public Gem(){
        super();
        color = "Colorless";
        price = 10.0;
        rarity = 0.5;
        shine = 4;
    }
    public Gem(String n_color,double n_price,double n_rarity,int n_shine){
        super();
        color = n_color;
        price = n_price;
        rarity = n_rarity;
        shine = n_shine; 
    }
    public Gem(String n_name, double n_hardness, double n_depth, double n_weight){
        super(n_name,n_hardness,n_depth,n_weight);
        color = "Colorless";
        price = 10.0;
        rarity = 0.5;
        shine = 4;
    }
    public Gem(String n_name, double n_hardness, double n_depth, double n_weight,String n_color,double n_price,double n_rarity,int n_shine){
        super(n_name,n_hardness,n_depth,n_weight);
        color = n_color;
        price = n_price;
        rarity = n_rarity;
        shine = n_shine; 
    }
    public String getName(){
        return super.getName();
    }
    public Double getHardness(){
        return super.getHardness();
    }
    public double getDepth(){
        return super.getDepth();
    }
    public double getWeight(){
        return super.getWeight();
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public double getRarity(){
        return rarity;
    }
    public int getShine(){
        return shine;
    }
    public void setName(String n_name){
        super.setName(n_name);
    }
    public void setHardness(Double n_hardness){
        super.setHardness(n_hardness);
    }
    public void setDepth(double n_depth){
        super.setDepth(n_depth);
    }
    public void setWeight(double n_weight){
        super.setWeight(n_weight);
    }
    public void setColor(String n_color){
        color = n_color;
    }
    public void setPrice(double n_price){
        price = n_price;
    }
    public void setRarity(double n_rarity){
        rarity = n_rarity;
    }
    public void setShine(int n_shine){
        shine = n_shine;
    }
    
    public double findingProb(){
        return rarity;
    }

    public void scratchesRock(Rock rock){
        System.out.println("Why would you want to scratch gems? You know they are pretty valuable... right?");
    }
    public double auction(){
        return price*this.getWeight();
    }
    public void approval(){
        if((((int)(Math.random())*20)+rarity/2)>65){
            System.out.println("This is a good gemstone!");
        }else{
            System.out.println("Not that good of a gemstone...");
        }
    }
    public String toString(){
        return super.toString()+" The color of the gem is "+color+" and has a price of "+price+". It has a "+rarity+"% finding it in every 100 rocks. It has a shine value of "+shine+".";
    }
    public boolean equals(Object obj){
        Gem rock = (Gem)obj;
        if(name.equals(rock.getName())&& this.color.equals(rock.getColor())){
            return true;
        }else{
            return false;
        }
    }
    
}