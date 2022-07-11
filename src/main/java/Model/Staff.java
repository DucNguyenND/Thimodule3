package Model;

import java.time.LocalDate;
import java.util.Date;

public class Staff {
    private int IDStaff;
    private String nameStaff;
    private Date birthday;
    private String address;
    private  String phoneNumber;
    private String Email;
    private Department department;

    public Staff(String nameStaff, Date birthday, String address, String phoneNumber, String email, Department department) {
        this.nameStaff = nameStaff;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        Email = email;
        this.department = department;
    }

    public Staff(int IDStaff, String nameStaff, Date birthday, String address, String phoneNumber, String email, Department department) {
        this.IDStaff = IDStaff;
        this.nameStaff = nameStaff;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        Email = email;
        this.department = department;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
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
