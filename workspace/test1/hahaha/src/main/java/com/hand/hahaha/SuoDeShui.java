package com.hand.hahaha;

import java.util.Scanner;

public class SuoDeShui {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("请输入工资:");
			int i = s.nextInt();
			if(i<=1500){
				double j=i*0.03;
				System.out.println("所需要交纳的税费为："+j);
				
			}else if(i>1500||i<=4500){
				double n=i*0.1;
				System.out.println("所需要交纳的税费为："+n);
				
			}else if(i>4500||i<=9000){
				double a=i*0.2;
				System.out.println("所需要交纳的税费为："+a);
				
			}else if(i>9000||i<=35000){
				double b=i*0.25;
				System.out.println("所需要交纳的税费为："+b);
			}else if(i>35000||i<=55000){
				double m=i*0.3;
				System.out.println("所需要交纳的税费为："+m);
			}else if(i>55000||i<=80000){
				double h=i*0.35;
				System.out.println("所需要交纳的税费为："+h);
			}else if(i>80000){
				double w=i*0.45;
				System.out.println("所需要交纳的税费为："+w);
			}
		
			
		}
	}

}
