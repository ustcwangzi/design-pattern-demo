package com.wz.prototype;

import java.io.*;
import java.util.List;

/**
 * 原型模式
 * Create by wangzi on 2017/8/4
 */
public class Prototype implements Cloneable, Serializable {
    private int id;
    private String name;
    private List<String> list;

    public Prototype() {
    }

    public Prototype(int id, String name, List<String> list) {
        this.id = id;
        this.name = name;
        this.list = list;
    }

    /**
     * 浅拷贝
     * @return
     */
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }

    /**
     * 深拷贝
     * @return
     */
    public Prototype deepClone(){
        Prototype prototype = null;
        try{
            //序列化
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(bos);
            outputStream.writeObject(this);

            //反序列化
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(bis);
            prototype = (Prototype)inputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return prototype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
