package day18_demo.demo5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo5 {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        ArrayList<String> arrayList1=new ArrayList<>();

        try {
            BufferedReader br=new BufferedReader(new FileReader("d:\\test\\asd.txt"));
            String line=null;

            while((line=br.readLine())!=null){
                arrayList.add(line);
            }
            for (int i = 1; i <=arrayList.size(); i++) {

                for (int j = 0; j < arrayList.size(); j++) {
                    if(arrayList.get(j).startsWith(String.valueOf(i))){
                        arrayList1.add(arrayList.get(j));
                    }
                }


            }
           arrayList1.stream().forEach(System.out::println);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
