package com.spring;

import java.util.List;
public class Boss {
    private String name;
    private String company;
    private Car car;
    private List<String> hobbys;
    public Boss() {
    }
    public Boss(String name, String company, Car car, List<String> hobbys) {
        this.name = name;
        this.company = company;
        this.car = car;
        this.hobbys = hobbys;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public List<String> getHobbys() {
        return hobbys;
    }
    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }
    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", car=" + car +
                ", hobbys=" + hobbys +
                '}';
    }
}