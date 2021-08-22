package model;

import javax.persistence.*;

@Entity
@Table(name = "danhsachnhanvien")
public class FPTemployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String Name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private double salary;
    @Column(nullable = false)
    private String branch;

    public FPTemployee() {
    }

    public FPTemployee(int id, String code, String name, int age, double salary, String branch) {
        this.id = id;
        this.code = code;
        Name = name;
        this.age = age;
        this.salary = salary;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
