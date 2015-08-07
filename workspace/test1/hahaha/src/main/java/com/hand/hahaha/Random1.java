package com.hand.hahaha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int target=0 ;
		
			//表示生成100内的随机数，不包括100
			System.out.println("随机生成50个小于100的随机数,分别是:");
			for(int i=0;i<50;i++){	
			 target = r.nextInt(10);
			 System.out.print(target+",");
			List lists = new ArrayList();
			lists.add(target);
			
			Iterator it = lists.iterator();
			while(it.hasNext()){
				int n = (Integer) it.next();
				int m = n/10;
				Map<Object,Object> map = new HashMap<Object,Object>();
				map.put(m,n);
			
			}
			
			
			}
			
		}
		

	}


