//71A	Way Too Long Words    strings	800

import java.util.Scanner;

public class waytolong {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
       for(int i=1;i<=n;i++){
        String s= sc.nextLine();
        abbr res = new abbr();
        System.out.print(res.calc(s) + "\n");
        sc.close();
        } 
    }
}

class abbr{
    public String calc(String abc){
        if(abc.length()<=10){
            return abc;
        }
        else{
            String Str2= abc.charAt(0)+ Integer.toString(abc.length()-2) + abc.charAt(abc.length()-1);
            return Str2;
        }
    }
}
   
