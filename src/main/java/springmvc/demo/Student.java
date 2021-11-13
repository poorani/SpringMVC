package springmvc.demo;

import javax.validation.constraints.*;

public class Student {
    public String firstName;

    @NotNull(message = "cannot be null. required")
    @Size(min = 1, message = "required")
    public String lastName;

    @NotNull(message="required")
    @Min(value=5,message="age of student must be greater then 5 years")
    @Max(value=16,message="age of student should be lesser tha 16 years")
    public Integer age;

    @Pattern(regexp="^[0-9]{5}", message="only 5 digits allowed")
    public String postalCode;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
