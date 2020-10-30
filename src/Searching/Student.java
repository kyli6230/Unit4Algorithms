package Searching;

public class Student implements Comparable {
    private String name;
    private String address;
    private int id;
    
    Student (String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public String toString(){
        return "Name:\t" + name + "\nAddress:\t" + address +
                "\nID:\t" + id + "\n----------------------------------\n";
    }
    
    public int getID(){
        return id;
    }
    
    public int compareTo(Object o){
        if(this.id > ((Student)o).getID())
            return 1;
        else if (this.id < ((Student)o).getID())
            return -1;
        else
            return 0;
    }   
}
