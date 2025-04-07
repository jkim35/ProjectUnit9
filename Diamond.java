

class Diamond extends Gem {
    double clarity;
    public Diamond(){
        super();
        clarity = 5;
    }
    public Diamond(double n_weight,String n_color,double n_price,double n_rarity,int n_shine,double n_clarity){
        super("Diamond",10.0,15000,n_weight,n_color,n_price,n_rarity,n_shine);
        clarity = n_clarity;
    }
    
    public double getWeight(){
        return super.getWeight();
    }
    public String getColor(){
        return super.getColor();
    }
    public double getPrice(){
        return super.getPrice();
    }
    public double getRarity(){
        return super.getRarity();
    }
    public int getShine(){
        return super.getShine();
    }
    public double getClarity(){
        return clarity;
    }
    public void setWeight(double n_weight){
        super.setWeight(n_weight);
    }
    public void setColor(String n_color){
        super.setColor(n_color);
    }
    public void setPrice(double n_price){
        super.setPrice(n_price);
    }
    public void setRarity(double n_rarity){
        super.setRarity(n_rarity);
    }
    public void setShine(int n_shine){
        super.setShine(n_shine);
    }
    public void setClarity(double n_clarity){
        clarity = n_clarity;
    }
    public void throwRock(){
        System.out.println("The diamond breaks. Great job.");
    }
    public void approval(){
        if(clarity > 5){
            System.out.println("Beautiful diamond.");
        }else{
            System.out.println("Mediocre diamond. Doesn't sell that much.");
        }
    }
    public double opaqueness(){
        return (10-clarity)/2;
    }
    public int peopleWant(){
        return (int)Math.ceil(super.auction()*(clarity));
    }
    public String toString(){
        return super.toString()+" The clarity of the diamond is "+clarity+".";
    }
    public boolean equals(Object obj){
        Diamond rock = (Diamond)obj;
        if(this.name.equals(rock.getName())&& this.color.equals(rock.getColor())&&this.clarity == rock.getClarity()){
            return true;
        }else{
            return false;
        }
    }
}
