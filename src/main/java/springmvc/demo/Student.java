package springmvc.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
    public String firstName;

    @NotNull(message = "cannot be null. required")
    @Size(min = 1, message = "required")
    public String lastName;

    @Min(value=5,message="age of student must be greater then 5 years")
    @Max(value=16,message="age of student should be lesser tha 16 years")
    public int age;

    public Student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
