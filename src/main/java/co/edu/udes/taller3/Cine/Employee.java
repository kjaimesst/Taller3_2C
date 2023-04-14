/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller3.Cine;

/**
 *
 * @author kamil
 */
public class Employee {
    /*        Employee myEmployee = new Employee(post, salary, initialTime, finalTime, name, ID, age); 
*/
    private String post;
    private double salary;
    private String initialTime;
    private String finalTime;
    private String name;
    private String id;
    private String age;

    Employee(String post, double salary, String initialTime, String finalTime, String name, String ID, int age) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(String initialTime) {
        this.initialTime = initialTime;
    }

    public String getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(String finalTime) {
        this.finalTime = finalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Employee(String post, double salary, String initialTime, String finalTime, String name, String id, String age) {
        this.post = post;
        this.salary = salary;
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
