package day20_test.test8.shop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
    @org.junit.Test
    public void test1(){
        String path = "D:\\shop\\clother.txt";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            while(fis.available()>0){
                ois=new ObjectInputStream(fis);
                System.out.println(ois.readObject());
                /*   map=(Map<String, Product>)ois.readObject();*/
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
