package com.sms.bo;

import org.apache.log4j.Logger;

import com.sms.dao.CustomerRegDAO;
import com.sms.vo.CustomerRegVO;
import com.sms.vo.LoginVO;

public class CustomerRegBO {
    public static final Logger LOG = Logger.getLogger(CustomerRegBO.class);
    public static CustomerRegDAO cdao = new CustomerRegDAO();

    public String insertDataBO(final CustomerRegVO cvo) {
	String message;
	message = cdao.insertCustomerDetails(cvo);
	return message;
    }

    public String loginCheck(final LoginVO loginVO) {
	System.out.println(cdao.loginType(loginVO));
	return cdao.loginType(loginVO);
    }
}
