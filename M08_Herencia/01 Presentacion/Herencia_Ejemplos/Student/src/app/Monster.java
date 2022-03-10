package app;

public class Monster {
    public int hp = 100;
}

class Boss extends Monster{
    public long hp = 1000000;

    public int getHP_1(){
        return (int)super.hp;
    }

    public int getHP_2(){
        return (int)this.hp;
    }    
}

class Demo2{
    public static void main(String[] args){
        Boss bowser = new Boss();
        System.out.println();

        System.out.println("Bowser's HP_1 is... 100");
        System.out.println("Bowser's HP_2 is... 1000000");
        System.out.println();

        System.out.println("Bowser's HP_1 is... 1000000");
        System.out.println("Bowser's HP_2 is... 1000000");
        System.out.println();        

        System.out.println("Bowser's HP_1 is... 1000000");
        System.out.println("Bowser's HP_2 is... 100");
        System.out.println();    

        System.out.println("Bowser's HP_1 is... 100");
        System.out.println("Bowser's HP_2 is... 100");
        System.out.println();            

    }

}



