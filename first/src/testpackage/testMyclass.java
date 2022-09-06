package testpackage;

import base.MyParamDetail;  //导入我的自定义数据类型


public class testMyclass {
    public static void main(String[] args) {
        MyParamDetail myParamDetail = new MyParamDetail();
        System.out.println("MyParamDetail中的初始数据为：");
        System.out.println("sex:"+ myParamDetail.getSex());
        System.out.println("age:"+ myParamDetail.getAge());
        System.out.println("id:"+myParamDetail.getID());
        System.out.println("name:"+myParamDetail.getName());
        System.out.println("number:"+myParamDetail.getNumber());

        System.out.println("\nMyParamDetail中手动修改后的数据为：");
        myParamDetail.setAge(18);
        myParamDetail.setID("1");
        myParamDetail.setName("fjh");
        myParamDetail.setNumber("10000");
        myParamDetail.setSex("strongMale");
        System.out.println("sex:"+ myParamDetail.getSex());
        System.out.println("age:"+ myParamDetail.getAge());
        System.out.println("id:"+myParamDetail.getID());
        System.out.println("name:"+myParamDetail.getName());
        System.out.println("number:"+myParamDetail.getNumber());
    }
}
