package com.sms.constants;

public final class SQLConstants {

    private SQLConstants() {

    }

    public static final String INSERTSTUINFO = "insert into student values(?,?,?)";
    public final static String UPDATESTUINFO = "UPDATE student SET id = ?,name=?,email=? WHERE id = ?";
    public final static String DELETESTUINFO = "DELETE student WHERE id = ?";
    public final static String GETSTUINFO = "SELECT * from student where ID=?";
    public static final String USER_INSERT = "insert into sms_user_details values(?,?,?,?,?,?,?)";
    public static final String LOGIN_INSERT1 = "insert into sms_login_details values(?,?,?)";
    public static final String INSERTATTDINFO = "insert into studentAttendence values(?,?,?)";
    public static final String INSERTMARKSINFO = "insert into studentMarkks values(?,?,?,?)";
    public static final String LOGINTYPE = "select type from sms_login_details where username=? and password=?";
    public static final String FIRSTNAME = "select firstName from sms_user_details where username=?";
    public static final String GETATTDINFO = "select * from studentAttendence where studentid=? and date1=?";
    public static final String GETMARKSINFO = "select * from studentMarkks where studentid=?";
}
