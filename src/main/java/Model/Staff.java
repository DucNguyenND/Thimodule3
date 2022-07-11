package Model;

import java.sql.Date;
import java.time.LocalDate;

public class Staff {
    private int IDStaff;
    private String nameStaff;
    private LocalDate birthday;
    private String address;
    private  String phoneNumber;
    private String Email;
    private Department department;

    public Staff(String nameStaff, LocalDate birthday, String address, String phoneNumber, String email, Department department) {
        this.nameStaff = nameStaff;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        Email = email;
        this.department = department;
    }

    public Staff(int IDStaff, String nameStaff, LocalDate birthday, String address, String phoneNumber, String email, Department department) {
        this.IDStaff = IDStaff;
        this.nameStaff = nameStaff;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        Email = email;
        this.department = department;
    }

    public Staff(int idStaff, String nameStaff, Date brithday, String address, String phoneNumber, String email, Department department) {
    }

    public int getIDStaff() {
        return IDStaff;
    }

    public void setIDStaff(int IDStaff) {
        this.IDStaff = IDStaff;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
