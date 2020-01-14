package day10_test.test3;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {

        ArrayList<User> arrayList =new ArrayList<>();
        for(int i=1;i<=50;i++){
            User user=new User(i);
            arrayList.add(user);
        }

        System.out.println("未分组：");
        System.out.println(arrayList);


       /* for (int i=1;i<=50;i++){
            System.out.println(arrayList.get(i-1));
            *//*if(arrayList.get(i).getUid()>0&&arrayList.get(i).getUid()<9){
                arrayList.get(i).setType(null);
                System.out.print(arrayList.get(i).getUid()+"-"+arrayList.get(i).getType()+" ");
            }*//*
        }*/
        Receptionist receptionist1=new Receptionist();
        Receptionist receptionist2=new Receptionist();
        Receptionist receptionist3=new Receptionist();


        receptionist1.setFilter(new Filter() {
            @Override
            public void filterUser(User user) {
                if(user.getUid()>=10&&user.getUid()<20){
                    user.setType("v1");
                }
            }
        });

        receptionist2.setFilter(new Filter() {
            @Override
            public void filterUser(User user) {
                if (user.getUid() >= 20 && user.getUid() < 30) {
                    user.setType("v2");
                }
            }
        });

        for (int i = 0; i < arrayList.size(); i++) {
            User user=arrayList.get(i);
            receptionist1.Reception(user);
           receptionist2.Reception(user);
           receptionist3.Reception(user);

        }

        System.out.println("分组后：");
        for (int i = 0; i <arrayList.size() ; i++) {
            if(i%9==0){
                System.out.println();
            }
            System.out.print(arrayList.get(i).getUid()+"-"+arrayList.get(i).getType()+" ");

        }

//        for (int i=0;i<arrayList.size();i++){
//            if(i>=9&&i<=19) {
//                User user = receptionist1.Reception(arrayList.get(i));
//                user.setUid(i);
//                user.setType("v1");
//
//            }else if(i>=20&&i<=29){
//                User user1=receptionist2.Reception(arrayList.get(i));
//                user1.setUid(i);
//                user1.setType("v2");
//
//            }else {
//                User user3=receptionist3.Reception(arrayList.get(i));
//                user3.setUid(i+1);
//                user3.setType("A");
//
//            }
//        }


        /*System.out.println();
        System.out.println("以分组：");
        for (int i=0;i<arrayList.size();i++){


            if(arrayList.get(i).getUid()>=0&&arrayList.get(i).getUid()<9){
                arrayList.get(i).setType("A");
              System.out.print(arrayList.get(i).getUid()+"-"+arrayList.get(i).getType()+" ");
            }


            if(arrayList.get(i).getUid()>=9){
                System.out.print(arrayList.get(i).getUid()+"-"+arrayList.get(i).getType()+" ");
            }

            if(i%9==0){
                System.out.println();
            }
        }*/
    }


}
