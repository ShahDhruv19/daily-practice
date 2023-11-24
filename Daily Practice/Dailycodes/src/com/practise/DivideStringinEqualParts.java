package Practise;

import java.util.Scanner;

public class DivideStringinEqualParts {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();

//        String s = "DhruvShah";
        int e = 3;
        int nl = s.length() / e;
        if(s.length()%e!=0)
        {
            System.out.println("Not possible");
            return;
        }
        for (int i=0;i<s.length();i++)
        {
            if(i%nl==0)
            {
                System.out.println(" ");
            }
            System.out.print(s.charAt(i));
        }
    }

//    for(int i=0;i<nl;i++)
//    {
//
//    }
}
