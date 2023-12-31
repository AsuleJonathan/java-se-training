package com.systech.part2.inheritance.companysetup;

public class QualityAssuarance extends Employee{
    private String title;

    public QualityAssuarance(String employeeNo, String employeeName, String employeeAddress, String title) {
        super(employeeNo, employeeName, employeeAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee [employeeNo=" + getEmployeeNo() + ", employeeName=" + getEmployeeName() + ", employeeAddress="
        + getEmployeeAddress() + ", title=" + title + "]";
    }
}