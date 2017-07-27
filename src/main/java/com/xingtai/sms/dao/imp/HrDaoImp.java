package com.xingtai.sms.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xingtai.sms.dao.HrDao;
import com.xingtai.sms.entity.Hr;
import com.xingtai.sms.jdbc.JdbcUtil;

public class HrDaoImp implements HrDao {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Hr checkall(String husername, String hpwd) {
        //System.out.println(husername);
        String sql = "select * from hr where husername=? and hpwd=?";
        Hr hr = null;
        try {
            con = JdbcUtil.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, husername);
            pst.setString(2, hpwd);
            //System.out.println(pst.toString());
            rs = pst.executeQuery();
            if (rs.next()) {
                hr = new Hr();
                hr.setHid(rs.getInt(1));
                hr.setHname(rs.getString(2));
                hr.setHusername(rs.getString(3));
                hr.setHpwd(rs.getString(4));
                hr.setHsex(rs.getString(5));
                hr.setHage(rs.getInt(6));
                hr.setHemail(rs.getString(7));
                hr.setHcompany(rs.getString(8));
                hr.setHno(rs.getString(9));
                hr.setHmobileno(rs.getString(10));
            }
            return hr;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        } finally {
            JdbcUtil.release(con, pst, rs);
        }

    }

    public boolean checkname(String husername) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean checkpwd(String hpwd) {
        // TODO Auto-generated method stub
        return false;
    }

    public Hr selectHrById(int hid) {
        String sql = "select * from hr where hid=?";
        Hr hr = null;
        try {
            con = JdbcUtil.getCon();
            pst = con.prepareStatement(sql);
            pst.setInt(1, hid);
            rs = pst.executeQuery();
            if (rs.next()) {
                hr = new Hr();
                hr.setHid(rs.getInt(1));
                hr.setHname(rs.getString(2));
                hr.setHusername(rs.getString(3));
                hr.setHpwd(rs.getString(4));
                hr.setHsex(rs.getString(5));
                hr.setHage(rs.getInt(6));
                hr.setHemail(rs.getString(7));
                hr.setHcompany(rs.getString(8));
                hr.setHno(rs.getString(9));
                hr.setHmobileno(rs.getString(10));
            }
            return hr;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        } finally {
            JdbcUtil.release(con, pst, rs);
        }
    }

    public boolean updateHrById(int hid, String husername, String hmobileno,
                                String hemail) {
        String sql = "update hr set husername=?,hmobileno=?,hemail=? where hid=?";
        try {
            con = JdbcUtil.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, husername);
            pst.setString(2, hmobileno);
            pst.setString(3, hemail);
            pst.setInt(4, hid);
            pst.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JdbcUtil.release(con, pst);
        }
        return false;
    }

    public boolean updateHrById(int hid, String hpwd) {
        String sql = "update hr set hpwd=? where hid=?";
        try {
            con = JdbcUtil.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, hpwd);
            pst.setInt(2, hid);
            pst.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

}
