package com.com3g.myPm.service.utils;

import java.util.Map;

import com.com3g.myPm.domaine.types.EmailCode;
import com.com3g.myPm.view.admin.vo.EmailVO;

public interface EmailService {

    public EmailVO populateEmail(EmailCode code, String to, String from, Map<String, String> params, String cc,
	    String bcc) throws Exception;
}
