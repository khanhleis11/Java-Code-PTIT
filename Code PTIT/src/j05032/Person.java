package j05032;

public class Person {
    private String name, dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }
    
    public String getYear(){
        String[] tmp = this.dob.split("/");
        return tmp[2];
    }
    
    public String getMonth(){
        String[] tmp = this.dob.split("/");
        return tmp[1];
    }
    
    public String getDay(){
        String[] tmp = this.dob.split("/");
        return tmp[0];
    }
    
    public String toString() {
        return this.name + " " + this.dob;
    }
}
