package day16_test.test11;

import java.util.*;


public class MyRunnable extends Thread {
    private static HashMap<String, String> map = new HashMap<>();
    private static int i = 0;
    private static int j = 0;

    public MyRunnable(String name) {
        super(name);
    }


    @Override
    public void run() {

        over:
        while (true) {
            //A、B
            synchronized (Object.class) {

                while (true) {

                    Random random = new Random();
                    int num = random.nextInt(100) + 1;
                    if (map.size() > 100) {
                        break over;
                    }

                    if (!map.containsKey(String.valueOf(num))) {
                        map.put(String.valueOf(num),"编号的员工从"+Thread.currentThread().getName()+"进，彩票号码为"+DoubleColorBalUtil.create());
                        if ("前门".equals(Thread.currentThread().getName())) {
                            i++;
                        }
                        if ("后门".equals(Thread.currentThread().getName())) {
                            j++;
                        }
                        break;
                    } else {
                        continue;
                    }


                }

                    if(map.size()==100){
                        Set<String> key = map.keySet();
                        for (String i : key) {
                            System.out.println(i+ map.get(i));
                        }
                        System.out.println("前门进的人"+i);
                        System.out.println("后门进的人"+j);
                        break over;
                    }

            }

        }
    }

}
