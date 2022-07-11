package Dao;

import Connection.Connect_MySQL;
import Model.Department;
import Model.Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffDao {
    List<Staff> staff=new ArrayList<>();
    Connect_MySQL connect_mySQL=new Connect_MySQL();
    private static final String SELECT_ALL_SQL="select * from thimodule3.Staff join thimodule3.Department on thimodule3.Staff.idDepartment=thimodule3.Department.idDepartment ";
    private static final String EDIT_BYID_SQL="UPDATE thimodule3.Staff SET namestaff=?, birthday=?, address=?, phonenumber=?,Email=?,iddepartment=? where IDStaff=?";
    private static final String DELETE_BYID_SQL="DELETE FROM thimodule3.Staff WHERE IDStaff=?";
    private static final String ADD_SQL="INSERT INTO thimodule3.Staff VALUE (IDStaff=?,namestaff=?, birthday=?, address=?, phonenumber=?,Email=?,iddepartment=?)";
    public List<Staff> selectAll(){
        try (Connection connection = connect_mySQL.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SQL);
        ){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idStaff=resultSet.getInt(1);
                String nameStaff=resultSet.getString(2);
                Date brithday= resultSet.getDate(3);
                String address=resultSet.getString(4);
                String phoneNumber=resultSet.getString(5);
                String email=resultSet.getString(6);
                int idDepartment=resultSet.getInt(7);
                String nameDepartment=resultSet.getString(6);
                staff.add(new Staff(idStaff,nameStaff,brithday,address,phoneNumber,email,new Department(idDepartment,nameDepartment)));
            }
            return staff;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void editStaff(int id,String nameStaff,Date birthday, String address,String phoneNumber,String email,int idDepartment){
        try (Connection connection = connect_mySQL.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(EDIT_BYID_SQL);
        ) {
            preparedStatement.setString(1,nameStaff);
            preparedStatement.setDate(2,birthday);

            preparedStatement.setString(3,address);
            preparedStatement.setString(4,phoneNumber);

            preparedStatement.setString(5,email);
            preparedStatement.setInt(6,idDepartment);
            preparedStatement.setInt(7,id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void delete(int id){
        try (Connection connection = connect_mySQL.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BYID_SQL);
        ) {
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void addStaff(int id,String nameStaff,Date birthday,String address,String phoneNumber,String email,int idDepartment){
        try (Connection connection = connect_mySQL.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(EDIT_BYID_SQL);
        ) {
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,nameStaff);
            preparedStatement.setDate(3,birthday);

            preparedStatement.setString(4,address);
            preparedStatement.setString(5,phoneNumber);

            preparedStatement.setString(6,email);
            preparedStatement.setInt(7,idDepartment);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    }
