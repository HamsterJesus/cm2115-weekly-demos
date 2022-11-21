package uk.ac.rgu.topic8;

import java.util.Comparator;

public class person implements Comparable<person>{
    private String firstname;
    private String lastname;
    private int age;

    public person(String firstname, String lastname, int age){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(person o) {
        // TODO Auto-generated method stub
        String otherLastname = o.lastname;
        
        int position = this.lastname.compareTo(otherLastname);

        if(position < 0){ //sorts alphabetically 
            return -1;
        } else if(position == 0){
            return 0;
        } else{
            return 1;
        }
    }

    public static class PersonComparotor implements Comparator<person>{

        @Override
        public int compare(person o1, person o2) {
            if(o1.age < o2.age){ //sorts alphabetically 
                return -1;
            } else if(o1.age == o2.age){
                return 0;
            } else{
                return 1;
            }
        }
    }
    
}
