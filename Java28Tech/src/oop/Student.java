package oop;

public class Student {
    private String id, name, className;
    private double gpa;

    public Student(String id, String name, String className, double gpa) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public double getGpa() {
        return gpa;
    }
    
    
}
