package day10_test.test1;


public class Test1 {

    public static void main(String[] args) {

        String num="23.123891";
        HandleAble test8= new HandleAble() {
            @Override
            public String HandleString(String num) {
                return  num.substring(0, num.indexOf("."));
            }
        };
         String string = test8.HandleString(num);
        System.out.println("取整："+string);

        HandleAble test9=new HandleAble() {
            @Override
            public String HandleString(String num) {
                int index=num.indexOf(".");
                char[] ch=num.substring(index,index+6).toCharArray();
                if(ch[ch.length-1]<'5'){
                    return num.substring(0,index+5);
                }else {


                    num=num.substring(0,index+5);
                    char c=num.charAt(num.length()-1);
                    char c1=(char) (c+1);
                    num=num.substring(0,index+4);
                    num= num.concat(String.valueOf(c1));
                    return num;
                }

            }
        };


       String num1= test9.HandleString(num);
        System.out.println("取小数点后四位:"+num1);

    }

    /*
        System.out.println("取整：");
        Test8 test9=(num)-> System.out.println(num.substring(0,num.indexOf(".")));
        test9.HandleString("23.44512215");
        System.out.println("取小数点后四位:");
        Test8 test8=(num)->{

            int index=num.indexOf(".");
            char[] ch=num.substring(index,index+6).toCharArray();
            if(ch[ch.length-1]<'5'){
                System.out.println(num.substring(0,index+5));
            }else {
                num=num.substring(0,index+5);
                char c=num.charAt(num.length()-1);
                char c1=(char) (c+1);
               num=num.replace(String.valueOf(c),String.valueOf(c1));
                System.out.println(num);
            }
        };

        test8.HandleString("23.44518215");*/


}
