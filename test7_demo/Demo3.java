package test7_demo;

public class Demo3 {

    public static void main(String[] args) {
        String s1="User{name='马云',age=45,money=25000.0d}";
        int startIndex=s1.indexOf("{")+1;
        int endIndex=s1.lastIndexOf("}");
        s1=s1.substring(startIndex,endIndex);
        System.out.println(s1);
        s1=s1.replace("'","");
        String[] s2=s1.split(",");
        for (int i = 0; i <s2.length ; i++) {

           String[] result= s2[i].split("=");
           s2[i]=result[1];
//           int index =s2[i].indexOf("=")+1;
////           String s3=s2[i].substring(index,s2[i].length());
////            System.out.println(s3);
////
        }


        for (int i = 0; i <s2.length ; i++) {
            System.out.println(s2[i]);
        }

    }
}
