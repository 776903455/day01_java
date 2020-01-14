package com.codeutil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CodeUtil {

      /*  private  static  int width=90;
        private  static int height=20;
        private  static  int fontHeight=18;
        private static char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };


        public  static Map<String ,Object> getCode(){

            BufferedImage bufferedImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_BGR);

            Graphics graphics = bufferedImage.getGraphics();
            graphics.setColor(Color.white);
            graphics.fillRect(0,0,width,height);


            Font font=new Font("宋体",Font.BOLD,fontHeight);
            graphics.setFont(font);

            graphics.setColor(Color.blue);
            graphics.drawRect(0,0,width-1,height-1);

            Random random=new Random();
            graphics.setColor(Color.BLACK);
            for (int i = 0; i <30 ; i++) {
                int x=random.nextInt(width);
                int y=random.nextInt(height);
                int x1=random.nextInt(15);
                int y1=random.nextInt(15);
                graphics.drawLine(x,y,x+x1,y+y1);
            }


            StringBuffer stringBuffer=new StringBuffer();
            int red =0,green=0,blue=0;
            for (int i = 0; i <4 ; i++) {
                String code=String.valueOf(codeSequence[random.nextInt(codeSequence.length-1)]);
                red=random.nextInt(255);
                green=random.nextInt(255);
                blue=random.nextInt(255);
                graphics.setColor(new Color(red,green,blue));
                graphics.drawString(code,(i+1)*15,16);
                stringBuffer.append(code);

            }

            Map<String,Object> map=new HashMap<>();
            map.put("code",stringBuffer);
            map.put("codePic", bufferedImage);


            return map;
        }

    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("D:\\app\\"+System.currentTimeMillis()+".jpg");
                 Map<String,Object> map = CodeUtil.getCode();
                 ImageIO.write((RenderedImage) map.get("codePic"), "jpeg", out);
                *//* System.out.println("验证码的值为："+map.get("code"));*//*
    }*/
}
