package uk.ac.rgu.topic8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class app {
    public static void main(String[] args){
        person MrNotSmellGood = new person("lloyd", "barclay", 21);
        person smelly = new person("alex", "butuc", 73);
        person stinky = new person("denise", "mills", 12);
        person smellsLikeFlowers = new person("hamster", "jesus", 19);

        Map<String, person> myMap = new HashMap<>();
        myMap.put("lob-friend", MrNotSmellGood);
        myMap.put("short-king", smelly);
        myMap.put("my-little-panini", stinky);
        myMap.put("lob-friend", smellsLikeFlowers);

        for(String key : myMap.keySet()){
            person p = myMap.get(key);
            //System.out.println(key + ": " + p.getFirstname() + " " + p.getLastname());
        }

        Map<String, List> myMap2 = new HashMap<>();

        List<person> people = new ArrayList<>();
        people.add(MrNotSmellGood);
        people.add(smellsLikeFlowers);

        myMap2.put("lob-friend", people);

        for(String key : myMap2.keySet()){
            List<person> people2 = myMap2.get(key);
            for(person p : people2){
               // System.out.println(key + ": " + p.getFirstname() + " " + p.getLastname());
            }
        }

        List<person> people3 = new ArrayList<>();

        people3.add(smelly);
        people3.add(smellsLikeFlowers);
        people3.add(stinky);
        people3.add(MrNotSmellGood);

        //Collections.sort(people3); //alph
        //people3.sort(new person.PersonComparotor());

        for(person p : people3){
            //System.out.println(p.getFirstname() + " " + p.getLastname() + " " + p.getAge());
        }

        //people3.forEach(System.out::println);
        List<person> people4 = people3.stream().filter((person) -> person.getAge() > 20).collect(Collectors.toList());
        people4.forEach(System.out::println);
        
    }
}
