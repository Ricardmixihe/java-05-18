package com.jizhong.pojo;

public class Circinal {
	//圆周率
	//final：最终值
    public final double PI = 3.14;
    //圆的周长	
    public double girth(double radii){
        return 2 * PI * radii;
    }
    //圆的面积	
    public double area(double radii){
        return PI * radii * radii;
    }
}
