package day17_test.test19;

import javax.print.Doc;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Test19 {

    /*键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数
    注意:用文件类型(后缀名,不包含.(点),如："java","txt")作为key,
     用个数作为value,放入到map集合中,并用两种方式遍历map集合
      例如：
     doc 的类型的文件有 3 个
      java 的类型的文件有 5 个
      txt 的类型的文件有 7 个 */

    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入文件夹路径");
        String next = scanner.next();
        File file=new File(next);
        HashMap<String,Integer> map1=getNumber(file,map);
        System.out.println(map1);

    }

    private static HashMap<String, Integer> getNumber(File file, HashMap<String, Integer> map) {

        if(!file.exists()){
            System.out.println("文件不存在");
        }
        File[] files=file.listFiles();
        for(File file1:files){
            if(file1.isFile()){
                if(file1.getName().endsWith("doc")){
                    if(!map.containsKey("doc")){
                        map.put("doc",1);
                    }else {
                        map.put("doc",map.get("doc")+1);
                    }
                }else if(file1.getName().endsWith("java")){
                    if(!map.containsKey("java")){
                        map.put("java",1);
                    }else {
                        map.put("java",map.get("java")+1);
                    }
                }else if(file1.getName().endsWith("txt")){
                    if(!map.containsKey("txt")){
                        map.put("txt",1);
                    }else {
                        map.put("txt",map.get("txt")+1);
                    }
                }
            }else{
                getNumber(file1,map);
            }
        }

        return map;
    }

}
