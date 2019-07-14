package com.upupuup.Singleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @Author:upupupuup
 * @Date:2019/5/14 2:31 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public enum SerEnumSingleton {
    // 注释
   INSTANCE;
   private String content;

   public String getContent() {
       return content;
   }

   public void setContent(String content) {
       this.content = content;
   }

   private SerEnumSingleton() {}

    public static void main(String[] args) throws IOException {
        SerEnumSingleton singleton = SerEnumSingleton.INSTANCE;
        singleton.setContent("枚举单例序列化");
        System.out.println("枚举序列化前读取其中的内容：" + singleton.getContent());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerEnumSingleton.obj"));
        oos.writeObject(singleton);
        oos.flush();
        oos.close();
        new ArrayList<String>();
    }
}
