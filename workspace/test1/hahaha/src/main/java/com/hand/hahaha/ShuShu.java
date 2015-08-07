package com.hand.hahaha;

public class ShuShu {

	public static void main(String[] args) {
			System.out.println("101-200间总共有21个素数分别是：");	
			for(int i=101;i<=200;i++){
				boolean isPrime = true;//一开始假定i是质数
				for(int j=2;j<i;j++){
					if(i%j==0){//只要存在一种情况除了1和它本身之外约数
						isPrime = false;//非质数
						break;
						
					}
				}
				
				if(isPrime){
					System.out.print(i+",");
				}
				
			}
			
		}
	

	}


