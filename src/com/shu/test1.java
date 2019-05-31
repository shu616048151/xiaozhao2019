package com.shu;

import org.junit.Test;

import java.util.*;

public class test1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	
	@Test
	public void test(){
		List<User> userList=new ArrayList<>();
		userList.add(new User("zhangsan",188));
		userList.add(new User("lisi",19));
		Collections.sort(userList, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				if (o1.getAge()>o2.getAge()) {
					return 1;
				}if (o1.getAge()<o2.getAge()) {
					return -1;
				}
				return 0;
			}
		});
		System.out.println(userList);
	}
	
	@Test
	public void test2(){
		List<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(2);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
