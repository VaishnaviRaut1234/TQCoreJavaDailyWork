package com.example;

public class Student 
{
		private int sid;
		private String name;
		
		static String collegeName="SGBAU";
		static int sCount=0;
		
		//instance block
		{
			sCount++;
		}
		public Student()
		{
		}
		
		public Student(int sid, String name)
		{
			this.sid=sid;
			this.name=name;
			
		}

		public int getSid() 
		{
			return sid;
		}



		public void setSid(int sid) 
		{
			this.sid = sid;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}
		
		
		public static void main(String[] args) 
		{
			

		}

	}

