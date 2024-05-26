package step_definitions;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TestDataStructure {
    public static void main(String[] args){

//Omar, Ramo, Jane

        List<String>names1=new ArrayList<>(List.of("Omar","Ramo", "Jane"));
        System.out.println(names1);
        System.out.println(names1.get(0));

        //[Ramo, Simpson, Jefferson]

        List<String>lastNames = new ArrayList<>(List.of("Ramo", "Simpson", "Jefferson"));
        System.out.println(lastNames);
        System.out.println(lastNames.get(0));

        List<List<String>>listsCombined = new ArrayList<>(List.of(names1, lastNames));

        System.out.println(listsCombined);
for(List<String>temp: listsCombined) {
    System.out.println(listsCombined);
}
    }
}
