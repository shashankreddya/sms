package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.sms.connection.ConnectionManager;
import com.sms.constants.SQLConstants;
import com.sms.vo.CustomerRegVO;
import com.sms.vo.LoginVO;

public class CustomerRegDAO {
    private transient Connection dbConnection;
    private transient PreparedStatement preparedStatement;
    private transient ResultSet rset;
    private transient Statement statement;
    private transient final List<String> emailList = new ArrayList<String>();
    public static final Logger LOG = Logger.getLogger(CustomerRegDAO.class);

    public String insertCustomerDetails(final CustomerRegVO cvo) {
	String message = "";

	final String sql = SQLConstants.LOGIN_INSERT1;
	final String sql1 = SQLConstants.USER_INSERT;
	final String custName = (cvo.getFirstName().substring(0, 3) + cvo.getLastName().substring(0, 2)).toLowerCase();
	// System.out.println(custName);
	try {
	    dbConnection = ConnectionManager.getConnection();
	    preparedStatement = dbConnection.prepareStatement(sql);
	    preparedStatement.setString(1, custName);
	    preparedStatement.setString(2, cvo.getPassWord());
	    preparedStatement.setString(3, cvo.getLoginType());
	    final int status1 = preparedStatement.executeUpdate();
	    if (status1 == 1) {
		preparedStatement = dbConnection.prepareStatement(sql1);
		preparedStatement.setString(1, custName);
		preparedStatement.setString(2, cvo.getFirstName());
		preparedStatement.setString(3, cvo.getLastName());
		preparedStatement.setString(4, cvo.getDateOfBirth());
		preparedStatement.setString(5, cvo.getAddress());
		preparedStatement.setString(6, cvo.getContactNo());
		preparedStatement.setString(7, cvo.getGender());
		final int status = preparedStatement.executeUpdate();
		if (status == 1) {
		    message = "succes" + " " + custName;
		    // dbConnection.commit();
		} else {
		    message = "fail";
		    dbConnection.rollback();
		}
	    }
	} catch (Exception e) {
	    // throw new CustomerException("Connection not established during
	    // inserting data", e);

	    // TODO Auto-generated catch block

	} finally {
	    try {
		dbConnection.close();
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		// throw new CustomerException("Connection not closed after
		// inserting data",e);
	    }
	}
	LOG.info("customer details inserted");
	return message;
    }

    /*
     * private String autoGenerate(final String custName) throws
     * CustomerException { final StringBuffer custid = new StringBuffer();
     * dbConnection = ConnectionManager.getConnection(); try { final String
     * generate = SQLUtill.getSqlProperty(SQLConstants.GENERATE);
     * custid.append('C'); custid.append(custName.substring(0,
     * 2).toUpperCase()); statement = dbConnection.createStatement(); rset =
     * statement.executeQuery(generate); while (rset.next()) {
     * custid.append(rset.getInt(1)); } } catch (Exception e) { throw new
     * CustomerException(" autogeneration failed",e); } finally { try {
     * dbConnection.close(); } catch (Exception e) { // TODO Auto-generated
     * catch block throw new
     * CustomerException("Connection not closed after autogeneration",e); } }
     * LOG.info("customer id autogenerated"); return custid.toString(); }
     */
    /*
     * public List<String> emailValidation(final CustomerRegVO cvo) throws
     * CustomerException {
     * 
     * dbConnection = ConnectionManager.getConnection(); final String emailid =
     * SQLUtill.getSqlProperty(SQLConstants.eMAIl); try { statement =
     * dbConnection.createStatement(); rset = statement.executeQuery(emailid);
     * while (rset.next()) { emailList.add(rset.getString("EMAIl_ID")); } }
     * catch (Exception e) { // TODO Auto-generated catch block throw new
     * CustomerException("Connection not established during emailvalidation",e);
     * } finally { try { dbConnection.close(); } catch (Exception e) { // TODO
     * Auto-generated catch block throw new
     * CustomerException("Connection not closed after emailvalidation",e); } }
     * LOG.info("email list fectched from database"); return emailList; }
     */
    public String loginType(final LoginVO loginVO) {
	String ltype = "";
	String firstname = "";
	String customerID = "";
	final String sql2 = SQLConstants.LOGINTYPE;
	final String sql3 = SQLConstants.FIRSTNAME;

	dbConnection = ConnectionManager.getConnection();
	try {
	    preparedStatement = dbConnection.prepareStatement(sql2);
	    // preparedStatement.setString(1, loginVO.getEmailId());
	    preparedStatement.setString(2, loginVO.getPassword());
	    rset = preparedStatement.executeQuery();
	    if (rset.next()) {
		ltype = rset.getString(1);
	    } else {
		ltype = "F";
	    }
	    preparedStatement = dbConnection.prepareStatement(sql3);
	    // preparedStatement.setString(1,loginVO.getEmailId());
	    rset = preparedStatement.executeQuery();
	    while (rset.next()) {
		firstname = rset.getString(1);
	    }
	    /*
	     * preparedStatement=dbConnection.prepareStatement(SQLUtill.
	     * getSqlProperty(SQLConstants.custId));
	     * preparedStatement.setString(1,loginVO.getEmailId());
	     * rset=preparedStatement.executeQuery(); while(rset.next()) {
	     * customerID=rset.getString(1); }
	     */ } catch (Exception e) {
	    // TODO Auto-generated catch block
	    // throw new CustomerException("Connection not established during
	    // checking logintype",e);
	} finally {
	    try {
		dbConnection.close();
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		// throw new CustomerException("Connection not closed after
		// checking logintype",e);
	    }
	}
	LOG.info("logintype fetched from database");
	System.out.println(ltype + " " + firstname);
	return ltype + " " + firstname + " " + loginVO.getUserName();
    }

}