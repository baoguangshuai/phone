package com.example.goods.bean;

import com.example.goods.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
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
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.aas, R.drawable.bbs, R.drawable.ccs,
            R.drawable.dds, R.drawable.ees, R.drawable.ffs,R.drawable.ggs,R.drawable.hhs
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
