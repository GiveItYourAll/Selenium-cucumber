package step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DataTableSteps {

    @Given("this is a data table as a list")
    public void data_table_as_list(List<String>names) {
        System.out.println("Given names "+names);



    }
    @Given("this is a data table as a map")
    public void data_table_as_map(Map<String, String> employee) {

        System.out.println(employee);
        System.out.println(employee.get("firstName"));
        System.out.println(employee.get("lastName"));
        System.out.println(employee.get("middleName"));
    }
    @Given ("this is a data table as list of lists")
    public void data_table_as_a_List_of_lists(List<List<String>> employees) {
        for (List<String>employee:employees){
            System.out.println(employee.get(0));
            System.out.println(employee.get(1));
            System.out.println(employee.get(2));
        }}
    @Given ("this is a data table as a list of maps")
        public void data_table_as_a_list_of_maps(List<Map<String,String>>employees) {

for(Map<String,String>employee:employees) {
    System.out.println(employee.get("firstName"));
}

        }
    }





