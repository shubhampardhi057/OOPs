package com.prowings.inheritance;

public class Course {

		String courseName;
		int duration;
		
		public Course() {
			super();
		}
		public Course(String courseName, int duration) {
			super();
			this.courseName = courseName;
			this.duration = duration;
		}
		@Override
		public String toString() {
			return "Course [courseName=" + courseName + ", duration=" + duration + "]";
		}
		
		
		
	}



