package com.hb.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author jagad
 *
 */
public class ArrayList1 {

	public static void main(String[] args) {

		Set<Employee> al=new HashSet<Employee>();
		Employee e1=new Employee();
		e1.setId(101);
		e1.setEname("nani");
		e1.setEmarks("100000");
		e1.setEsal("100000");
		al.add(e1);
		System.out.println(al);

	}

}
