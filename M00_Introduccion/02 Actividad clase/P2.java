public class P2{

    public static void main(String[] args){
        int x=5, y=0, z=3, b=0;

        y = (int)(1.5*10)%2 + z*9;
        if (y>7){
            for (b = 1; b<3; ++b){
                System.out.println(y+" "+b);
            }
        }
        else {
            System.out.println(y+b+" ");
        }
    }

}