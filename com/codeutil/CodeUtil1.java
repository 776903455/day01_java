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

public class CodeUtil1 {
    private  static  int width=90;
    private static int height=20;
    private static char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    public static void main(String[] args) throws IOException {
        /*String uuid = UUIDUtil.getUuid();
        System.out.println(uuid);*/
        String uuid = UUIDUtil.getUuid();
        /*输出地址*/
        OutputStream os=new FileOutputStream("D:\\app\\"+uuid+".jpg");
        Map<String,Object> map=getCodeImg();
        ImageIO.write((RenderedImage) map.get("codeImg"),"jpeg",os);
        System.out.println(map.get("code"));

    }

    public static Map<String ,Object> getCodeImg(){

        /*获得图片缓冲区对象*/
        BufferedImage bufferedImage =  new BufferedImage(width,height,BufferedImage.TYPE_INT_BGR);
        /*拿到画笔*/
        Graphics graphics = bufferedImage.getGraphics();

        graphics.setColor(Color.white);
        /*花一个实体长方形并填充为白色*/
        graphics.fillRect(0,0,width,height);

        graphics.setColor(Color.BLACK);
        /*画一个黑色的长方形边框*/
        graphics.drawRect(0,0,width-1,height-1);

        /*设置字体*/
        Font font= new Font("黑体",Font.BOLD,18);
        graphics.setFont(font);

        /*设置30条干扰线*/
        for (int i = 0; i <30 ; i++) {
            int x=width;
            int y=height;
            int x1=width+10;
            int y1=height+10;
            graphics.drawLine(x,y,x1,y1);
        }

        /*获取4个随机字符并把它门画在图片缓冲区上*/
        Random random =new Random();
        /*创建一个字符串缓冲区*/
        StringBuffer stringBuffer=new StringBuffer();
        /*获取随机rgb颜色*/
        int red=0,greem=0,blue=0;
        for (int i = 0; i <4 ; i++) {
            String code=String.valueOf(codeSequence[random.nextInt(codeSequence.length)]);
            red=random.nextInt(255);
            greem=random.nextInt(255);
            blue=random.nextInt(255);
            graphics.setColor(new Color(red,greem,blue));
            graphics.drawString(code,(i+1)*15,16);
            stringBuffer.append(code);

        }

        Map<String,Object> map=new HashMap<>();
        /*把生成的4个字符存入map集合*/
        map.put("code",stringBuffer);
        /*把生成图片存入map集合*/
        map.put("codeImg",bufferedImage);
        return  map;
    }
 }
