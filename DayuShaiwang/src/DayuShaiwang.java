import java.util.Scanner;
import java.io.*;

public class DayuShaiwang{
    // 离输入日期有多少天
    public static int Days(int y,int m,int d){
   //计算输入年份离2010年有多少天
        int days1=0;
        for (int i=2010; i<y; i++) {
            if ((y%4==0 && y%100!=0)||y%400==0){//闰年
                days1 += 366;
            } 
            else {
                days1 += 365;
            }
        }
   //计算本年内该日期之前共有多少天  
        int days2=0;
        int[] t={31,28,31,30,31,30,31,31,30,31,30,31};//每月中的天数
        if ((y%4==0 && y%100!=0)||y%400==0){ 
            t[1]=29;
            }
        for (int i=1;i<m;i++) {
            days2 += t[i];
            }
   //总共有多少天
        int sum=days1+days2+d;
        return sum;
    }
    public static void main(String[] args)throws IOException {
    	Scanner sc=new Scanner(System.in);
        System.out.println("请输入年月日：");//键入年月日
        int y=sc.nextInt();
        int m=sc.nextInt();
        int d=sc.nextInt();
        if(y<2010){
        	System.out.println("输入年份 过小，请重新输入");}
        else{
        	//判断此人在这天打鱼还是晒网
             int s=Days(y,m,d);
             int x=s%5;   
             System.setOut(new PrintStream("outtest.txt"));//将结果存入outtest文件中
             if(x>=1 && x<=3){
            	 System.out.println("此人在这天打鱼");
             } 
             else {
                 System.out.println("此人在这天晒网");
             }
             
          }
    }
}
