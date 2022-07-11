package Controller;

import Dao.StaffDao;
import Model.Staff;
import sun.rmi.server.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/qlnv")
public class StaffServlet extends HttpServlet {
    List<Staff> staff=new ArrayList<>();
    StaffDao staffDao=new StaffDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = null;
        String action=req.getParameter("action");
        if (action==null){
            action="";
        }

        staff=staffDao.selectAll();
        int id= Integer.parseInt(req.getParameter("id"));
        switch (action){

            case "edit":

                req.setAttribute("id",id);
                requestDispatcher=req.getRequestDispatcher("/edit.jsp");
                requestDispatcher.forward(req,resp);
               break;
            case "delete":
                staffDao.delete(id);
                break;
            case "add":
                resp.sendRedirect("/add.jsp");
                break;


            default:
                req.setAttribute("staff",staff);
                requestDispatcher=req.getRequestDispatcher("/qlnv.jsp");
                requestDispatcher.forward(req,resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = null;
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("namenv");
        LocalDate ngaysinh= LocalDate.parse(req.getParameter("birthday"));
        String address=req.getParameter("address");
        String phoneNumber=req.getParameter("phone");
        String email=req.getParameter("Email");
        int idPhongban= Integer.parseInt(req.getParameter("idphongban"));

        switch (action) {

            case "edit":
                staffDao.editStaff(id,name, Date.valueOf(ngaysinh),address,phoneNumber,email,idPhongban);
                break;
            case "add":

                staffDao.addStaff(id,name, Date.valueOf(ngaysinh),address,phoneNumber,email,idPhongban);
                break;
        }
    }}
