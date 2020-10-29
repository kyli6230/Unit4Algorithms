package Sorting;

public class ISS_Student implements Comparable {
    private String name, address;
    private int id;
    
    ISS_Student(String n, String a, int i){
        name = n;
        address = a;
        id = 1;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object t) {
        ISS_Student other = (ISS_Student)t;
        return name.compareTo(other.getName());
    }
}
