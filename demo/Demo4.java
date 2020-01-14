package demo;


import java.util.ArrayList;

public class Demo4  {

    public static void main(String[] args) {

        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student("aaa",85.0));
                arrayList.add(new Student("ccc",83.0));
                arrayList.add(new Student("bbb",80.0));
                arrayList.add(new Student("ddd",86.0));
                arrayList.add(new Student("eee",93.0));
                arrayList.add(new Student("fff",70.0));

                for(int x=0;x<arrayList.size()-1;x++){
        for(int y=x+1;y<arrayList.size();y++){
        if(arrayList.get(x).getScore()<arrayList.get(y).getScore()){
        Student student=arrayList.get(y);
        arrayList.set(y,arrayList.get(x));
        arrayList.set(x,student);
        }
        }
        }



        int count=3;
        for(Student student:arrayList){

        if(count>0){

        System.out.println(student);
        }
        count--;
        }
        }
        }
