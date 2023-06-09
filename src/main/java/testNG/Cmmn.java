package testNG;

import java.util.HashSet;
import java.util.Set;

public class Cmmn {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(90);
		s.add(30);
		s.add(40);
		s.add(50);
		
		Set<Integer> s1 = new HashSet<>();
		
		s1.add(30);
		s1.add(50);
		s1.add(40);
		s1.add(90);
		
		s1.retainAll(s);
		
		System.out.println(s1);
	}
}
