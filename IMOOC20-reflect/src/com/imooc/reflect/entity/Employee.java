package com.imooc.reflect.entity;

public class Employee {
    static {
        System.out.println("employee已被加载到JVM");
    }
    private Integer eno;
    public String ename;
    private Float salary;
    private String dname;
    public Employee(){
        System.out.println("默认构造方法已执行");
    }
    public Employee(Integer eno,String ename,Float salary,String dname){
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
        this.dname = dname;
    }
    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", dname='" + dname + '\'' +
                '}';
    }
    public Employee updateSalary(Float val){
        this.salary = this.salary + val;
        System.out.println(this.ename + "调薪至" + this.salary + "元");
        return this;
    }

}
