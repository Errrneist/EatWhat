package com.Trinnect.FRQ201403;+

public class SeatingChart {
	public SeatingChart (List<Student> studentList, int rows, int cols)
	{
		seats = new Student[rows][cols];//Define seats is a student in certain position
		int studentIndex = 0; //initialize studentIndex as an int with value 0
		for (int col = 0; col < cols; col++)//Start from each column
		{
			for (int row = 0; row < rows; row++) //First fill each rows
			{
				if (studentIndex < studentList.size())//test if all students are assigned
				{
						seats[row][col] = studentList.get(StudentIndex);//Get object from studentList using identifier StudentIndex
						studentIndex++;//StudentIndex increase by one
				}
			}
		}
	}
}





class removeAbsentStudents
{
	public int removeAbsentStudents(int a)
	{
		int count = 0; //initialize loop variable count = 0
		for (int row = 0; row < seats.length; row++)//Start from each row; find the seats.length( the number of rows)
		{ 
			for (int col = 0; col < seats[0].length; col++)//Then start from each column; find the seats[0].length(The number of columns)
			{
				if (seats[row][col] != null && seats[row][col].getAbsenceCount() > a)//If student isn't null and absent more than a
				{
					seats[row][col] = null;//make the student null
					count++;//increase the count by 1
				}
			}
		}
	}
	return count;//return count
}