/*Q. WAJP to manage employee salary details using map.
	1. add atleast 6 employee records 
	2. print only those employees whose salary  is greater than 50000 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class P1 {
    public static void main(String[] args) {
        Map<Integer, Double> emp = new HashMap<>();
        emp.put(101, 45000.0);
        emp.put(102, 55000.0);
        emp.put(103, 60000.0);
        emp.put(104, 48000.0);    
        emp.put(105, 75000.0);
        emp.put(106, 30000.0);
        System.out.println("Employees: " + emp);

        System.out.println("Employees with salary greater than 50000: ");
        Set<Map.Entry<Integer, Double>> entries = emp.entrySet();
        for(Map.Entry<Integer, Double> entry : entries) {
            if(entry.getValue() > 50000) {
                System.out.println("Employee ID: " + entry.getKey() + ", Salary: " + entry.getValue());
            }
        }
    }
}
