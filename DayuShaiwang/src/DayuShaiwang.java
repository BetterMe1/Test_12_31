import java.util.Scanner;
import java.io.*;

public class DayuShaiwang{
    // �����������ж�����
    public static int Days(int y,int m,int d){
   //�������������2010���ж�����
        int days1=0;
        for (int i=2010; i<y; i++) {
            if ((y%4==0 && y%100!=0)||y%400==0){//����
                days1 += 366;
            } 
            else {
                days1 += 365;
            }
        }
   //���㱾���ڸ�����֮ǰ���ж�����  
        int days2=0;
        int[] t={31,28,31,30,31,30,31,31,30,31,30,31};//ÿ���е�����
        if ((y%4==0 && y%100!=0)||y%400==0){ 
            t[1]=29;
            }
        for (int i=1;i<m;i++) {
            days2 += t[i];
            }
   //�ܹ��ж�����
        int sum=days1+days2+d;
        return sum;
    }
    public static void main(String[] args)throws IOException {
    	Scanner sc=new Scanner(System.in);
        System.out.println("�����������գ�");//����������
        int y=sc.nextInt();
        int m=sc.nextInt();
        int d=sc.nextInt();
        if(y<2010){
        	System.out.println("������� ��С������������");}
        else{
        	//�жϴ�����������㻹��ɹ��
             int s=Days(y,m,d);
             int x=s%5;   
             System.setOut(new PrintStream("outtest.txt"));//���������outtest�ļ���
             if(x>=1 && x<=3){
            	 System.out.println("�������������");
             } 
             else {
                 System.out.println("����������ɹ��");
             }
             
          }
    }
}
