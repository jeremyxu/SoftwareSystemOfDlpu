/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yt.connectdb;

import java.sql.*;

/**
 * 连接数据库的类
 *
 * @author 挺
 */
public class ConnDB {

    private Connection ct = null;

    public Connection getConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/members_12", "root", "yt19940124");
            //ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/members_12", "root", "123456");
            //ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/sum_15280381_member_12", "sum_15280381", "yangting19940124");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ct;
    }
}
