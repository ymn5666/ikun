package com.iweb.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**pojo 实体类 OPM object relation model
 * DAO 接口
 * @author zzl
 * @date 2024/7/22 下午3:22
 */
public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/nuist?characterEncoding=utf8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "a12345";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}