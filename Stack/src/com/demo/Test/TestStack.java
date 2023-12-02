package com.demo.Test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.Beans.Stack;

public class TestStack 
{
	public static void main(String [] args)
	{
	
		Stack st=new Stack(5);
		st.push(12);
		st.Display();
		st.push(148);
		st.Display();
		st.push(21);
		st.Display();
		st.push(123);
		st.Display();
		st.push(10);
		st.Display();
		st.push(15);
		st.push(14);
		System.out.println(st.pop());
		st.push(232);
		st.Display();
	}
	

}
