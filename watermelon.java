//4A	Watermelon brute force, math	800

import java.util.*;

public class watermelon{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int a = s.nextInt();
       
       weight r = new weight();
       r.res(a);
    }
}

class weight{
    public void res(int w){
        if( w%2 == 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

