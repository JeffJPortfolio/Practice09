package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Goods> goodList = new ArrayList<>();
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while (true) {
    		String line = sc.nextLine();
    		if (line.equals("q")) {
    			break;
    		}
    		String[] temp = line.split(",");
    		Goods good = new Goods(temp[0], temp[1], temp[2]);
    		goodList.add(good);
    	}
    	System.out.println("입력완료");
    	int tot = 0 ;
    	for (int i = 0; i < goodList.size(); i++) {
    		goodList.get(i).status();
    		tot += goodList.get(i).getCount();
    	}
       System.out.println("모든 상품의 갯수는 " +tot +"개입니다");
    }

}
