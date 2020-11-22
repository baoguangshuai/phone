package com.example.eight.bean;

import com.example.eight.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static String[] mNameArray = {
            "VivoBook15", "Redolbook", "灵耀x2", "猎鹰V4", "华硕天选", "灵耀14","灵越5000","戴尔DELL灵越"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "华硕(ASUS) VivoBook15s 英特尔酷睿i5 新版15.6英寸轻薄笔记本电脑",
            "华硕Redolbook14 锐龙版 7nm六核高性能轻薄本 网课学生办公笔记本电脑",
            "华硕(ASUS) 灵耀X2 Duo 英特尔酷睿i7 双屏轻薄14英寸设计办公笔记本电脑",
            "华硕(ASUS) 猎鹰V4 23.8英寸商用办公一体机电脑",
            "华硕(ASUS) 天选 15.6英寸游戏笔记本电脑",
            "华硕(ASUS)灵耀14 十代i7 13.5mm超轻薄14英寸商务办公手提笔记本电脑",
            "戴尔DELL灵越5000 14英寸酷睿i5网课学习轻薄笔记本电脑",
            "戴尔DELL灵越5000 酷睿i5 15.6英寸网课学习轻薄笔记本电脑"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {4499, 3699, 8969, 4299, 7699, 6229,4199,4469};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.aa, R.drawable.bb, R.drawable.cc,
            R.drawable.dd, R.drawable.ee, R.drawable.ff,R.drawable.gg,R.drawable.hh
    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < mThumbArray.length; i++) {
            planetList.add(new Planet(mThumbArray[i], mNameArray[i], mDescArray[i]));
        }
        return planetList;
    }
}