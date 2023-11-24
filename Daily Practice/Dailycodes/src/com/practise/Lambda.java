package com.practise;

@FunctionalInterface
interface Sum{
    int sum(int a,int b);
}
@FunctionalInterface
interface Diff{

    int diff(int a,int b);
}

@FunctionalInterface
interface count{
    int len(String a);
}
@FunctionalInterface
interface Div{
    int div(int a,int b);
//    int sum(int a);
}
@FunctionalInterface
interface Multi{
    int mul(int a,int b);
}
public class Lambda {
    public static void main(String[] args) {
//        SumA obj1=(int a,int b)->{
//            return a+b;
//        };
//        System.out.println(obj1.sum(10,10));

        Sum obj=(int a,int b)->{
            return a+b;
        };
        System.out.println(obj.sum(10,10)+"Sum");

        Diff d=(int a,int b)->{
            return a-b;
        };
        System.out.println(d.diff(20,10)+"differece");

        count c1=(String A)->{
            return A.length();
        };
        System.out.println(c1.len("String")+"String length");

        Div d1=(int a,int b)->{

                if(b!=0)
                {
                    return a/b;
                }
                else
                {
                    System.out.println("dividend is zero");
                }



            return -1;

        };
        System.out.println(d1.div(10,0));

        Multi m=(int z,int c)->{
            return z*c;
        };
        System.out.println(m.mul(10,20));

        }

    }


