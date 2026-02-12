package main.com.tyss;

public class StudentService {
    public boolean isEligible(int age){
        if(age>=18){
            return true;
        }else if(age<0){
            throw new IllegalArgumentException("Age cannot be negative.");
        }else{
            return false;
        }
    }
}
