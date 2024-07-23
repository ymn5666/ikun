package com.iweb.test;

import com.iweb.dao.StudentDAO;
import com.iweb.dao.lmpl.StudentDAOImpl;
import com.iweb.pojo.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/** JDBC java database connection
 * @author zzl
 * @date 2024/7/22 下午2:47
 */
public class Test {
    public static void main(String[] args) {
//        //驱动加载
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("驱动加载成功!");
//        //获取jdbc连接
//        String url = "jdbc:mysql://localhost:3306/nuist?characterEncoding=utf8";
//        String username = "root";
//        String password = "a12345";
//        Connection connection = null;
//        try {
//            connection  =
//                    DriverManager.getConnection(url,username,password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println("获取连接成功");
//        try {
//            Statement s = connection.createStatement();
//            String sql = "insert into stu"+
//                    " (name,gender,birthday,addr,qqnumber)values"+
//                    "('z','男','2003-02-15','江苏宿迁','555555')";
//            //运用sql语句
//            s.execute(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            //驱动加载 接连获取 创建编译语句
//            //
//        }

//        Student s1 = new Student(0,"吴畏","男",new Date(0),"南京",110);
//        studentDAO.insert(s1);
//        StudentDAO studentDAO = new StudentDAOImpl();
//        Student s2 = new Student(5,"帅哥","男",new Date(0),"南京",123l);
//        studentDAO.update(s2);



    }
}
