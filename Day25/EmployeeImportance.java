/**
 * EmployeeImportance
 */
import java.util.*;
public class EmployeeImportance {

    public static void main(String[] args) {
        
        // DFS approach
    }
}

// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

class SolutionEmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        

        HashMap<Integer,Employee> map = new HashMap<>();
        
        if(employees.size() ==0){
            return 0;
        }
        
        // the key will be the employee id and the value will be the list of the subordinates.
        for(Employee emp: employees){
            map.put(emp.id,emp);
        }
        
        return calculateImportance(map,id);
    }

    public int calculateImportance(HashMap<Integer,Employee> map, int id){
        
        int firstEmployee;
        int employeeImportance=0;
        
        // get the importance of the current employee
        Employee selfEmp = map.get(id);
        firstEmployee = selfEmp.importance;
        
        // for every employee get the importance value and add it to the total.
        // call recursively the function for every employee.
        for(int ids: selfEmp.subordinates){
            employeeImportance += calculateImportance(map,ids);
        }    
        return firstEmployee + employeeImportance;
    }
}