package com.javaex.ex02;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	System.out.println("친구 3명 등록");
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Friend> fList = new ArrayList<>();
//    	Friend f1 = new Friend();
//    	Friend f2 = new Friend();
//    	Friend f3 = new Friend();
//    	
//    	list.add(f1);
//    	list.add(f2);
//    	list.add(f3);
//    	
//    	for (int i = 0 ; i < 3 ; i++) {
//    		String[] temp = new String[3];
//    		
//    		String input = sc.nextLine();
//    		temp = input.split(" ");
//    		list.get(i).setName(temp[0]);
//    		list.get(i).setHp(temp[1]);
//    		list.get(i).setSchool(temp[2]);
//    	}
    	
    	   for (int i = 0; i < 3; i++) {
               String line = sc.nextLine();
               String[] data = line.split(" ");

               // Friend 객체 생성하여 데이터 넣기
               Friend friend = new Friend();
               friend.setName(data[0]);
               friend.setHp(data[1]);
               friend.setSchool(data[2]);

               // 배열에 추가하기
               fList.add(friend);
           }
    	
    	
    	for (int i = 0 ; i <fList.size(); i++) {
    		System.out.println(fList.get(i).showInfo());
    	}
    	
	
    	
    	
		 
		 
		 
		 
		 sc.close();
    }

}
