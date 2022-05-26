package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test5 {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 65;
		
		System.out.println("Before: a:"+a+" b:"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After: a:"+a+" b:"+b);
		
		List<Integer> intL = Arrays.asList(8,40,1,30,44,56,65,66);
		int minValue  = intL.stream().min(Integer::compare).get();
		System.out.println("Minimum Value: "+minValue);
		int maxValue = intL.stream().max(Integer::compare).get();
		System.out.println("Maximum Value: "+maxValue);
		intL.stream().sorted(Comparator.reverseOrder()).limit(3).forEach((re) -> {
			System.out.println(re);
		});;
		intL.stream().filter((e) -> e.equals(30)).forEach((e1) -> System.out.println(e1));
		intL.stream().map((e2) -> e2 *10).forEach((e3) -> System.out.println(e3));
		int result = intL.stream().reduce(0, (a1,b1) -> a1+b1);
		System.out.println("Reduce Result: "+result);
		
//		List<Employee> emps = Arrays.asList(new Employee("Naveen",1,100000),
//											new Employee("Kumar",2,30000),
//											new Employee("Daniel",3,15000),
//											new Employee("Prince",4,20000),
//											new Employee("Kaling",5,98000));
		
		/*Optional<Employee> maxEResult = emps.stream().max(Comparator.comparingInt(Employee::getSal));
		System.out.println("Max Value: "+maxEResult.get().getName());
		Optional<Employee> minEResult = emps.stream().min(Comparator.comparingInt(Employee::getSal));
		System.out.println("Min Value: "+minEResult.get().getName());
		emps.stream().sorted(Comparator.comparingInt(Employee::getSal)).forEach((e) -> {
			System.out.println(e.getName());
		});
		
		emps.stream().filter((e1) -> e1.getName().equalsIgnoreCase("Naveen")).forEach((e1) -> {
			System.out.println(e1.getName());
		});
		emps.stream().map((e2) -> e2.getSal() * 2).forEach((e3) -> {
			System.out.println(e3);
		});*/
		//int result = emps.stream().reduce(0, (a5,b5) -> a5+b5.getId(), Integer:: sum);
		//System.out.println(result);
	}
	

}
