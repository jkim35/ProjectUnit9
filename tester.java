import java.util.*;
public class tester {
    public static void main(String[] args) {
        ArrayList<Rock> rockCollection = new ArrayList<Rock>();
        Rock r1 = new Rock("Granite",6,100,10);
        Rock r2 = new Rock();
        Rock r3 = new Gem("Ruby",5,1000,2,"Red",150,10,6);
        Diamond r4 = new Diamond(15,"Colorless",1500,0.5,7,7);
        Rock r5 = new Gem();
        r5=r3;
        Rock r6 = new Gem();
        Rock r7 = new Gem("Emerald",4,-50,5.6);
        Rock r8 = new Diamond();
        Rock r9 = new Gem("Blue",250,10,6);
        Rock r10 = new Diamond();
        r10 = r4;
        rockCollection.add(r1);
        rockCollection.add(r2);
        rockCollection.add(r3);
        rockCollection.add(r4);
        rockCollection.add(r5);
        rockCollection.add(r6);
        rockCollection.add(r7);
        rockCollection.add(r8);
        rockCollection.add(r9);
        rockCollection.add(r10);

        System.out.println(r1);
        r1.throwRock();
        System.out.println(r1.equals(r10));
        System.out.println(r3.findingProb());
        System.out.println(r4.peopleWant());
        System.out.println(r10);
        System.out.println(r6);
    }
}
