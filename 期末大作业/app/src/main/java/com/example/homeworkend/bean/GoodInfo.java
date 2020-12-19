package com.example.homeworkend.bean;

import com.example.homeworkend.R;

import java.util.ArrayList;

public class GoodInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public String eva;
    public GoodInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        eva="";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "凯", "达摩", "译星", "亚瑟", "项羽", "孙尚香","高渐离","亚索"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "曙光守护者-凯",
            "大发明家-达摩",
            "踏雪寻梅-译星",
            "恶灵骑士-亚瑟",
            "帝国元帅-项羽",
            "水果甜心-孙尚香",
            "死亡摇滚-高渐离",
            "武陵仙君-诸葛亮"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {88,88, 88, 88, 28, 88,28,88};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.kai, R.drawable.damo, R.drawable.yixing,
            R.drawable.yase, R.drawable.xiangyu, R.drawable.ssx,R.drawable.gjl,R.drawable.zgl
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.kai, R.drawable.damo, R.drawable.yixing,
            R.drawable.yase, R.drawable.xiangyu, R.drawable.ssx,R.drawable.gjl,R.drawable.zgl
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodInfo> getDefaultList() {
        ArrayList<GoodInfo> goodsList = new ArrayList<GoodInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodInfo info = new GoodInfo();
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
