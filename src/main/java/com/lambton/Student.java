package com.lambton;

public class Student
{
    int studentID;
    String name;

    public Student()
    {
        this.studentID=-1;
        this.name="NO NAME";
    }

    public Student(int studentID ,String name)
    {
        this.studentID = studentID;
        this.name=name;
    }
    @Override
    public String toString()
    {
        return "Student{" + "studentID = " + studentID + ",\t name" + name + "\'" + "}";
    }
    public void finalize()
    {

    }


}
