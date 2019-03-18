package com.com3g.myPm.service.utils.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.com3g.myPm.domaine.types.EmailCode;
import com.com3g.myPm.service.utils.EmailService;
import com.com3g.myPm.view.admin.vo.EmailVO;

@Service("emailService")
public class EmailServiceImpl implements EmailService {

    protected static Logger logger = Logger.getLogger("TemplateEmailService");

    @Autowired
    private VelocityEngine velocityEngine;

    @Autowired
    private DozerBeanMapper mapper;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public EmailVO populateEmail(EmailCode code, String to, String from, Map<String, String> params, String cc,
	    String bcc) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

//    @Autowired
//    private EmailTemplateDao emailTemplateDao;

//    @Override
//    public EmailVO populateEmail(EmailCode code, String to, String from, Map<String, String> params, String cc,
//	    String bcc) throws Exception {
//
//	velocityEngine.init();
//	VelocityContext context = new VelocityContext();
//
//	Iterator<String> itValue = params.values().iterator();
//	Iterator<String> itKey = params.keySet().iterator();
//
//	while (itValue.hasNext()) {
//	    context.put(itKey.next(), itValue.next());
//	}
//
//	EmailTemplate emailTemplate = emailTemplateDao.findByCode(code);
//	String template = emailTemplate.getMessage();
//
//	StringWriter contenuWriter = new StringWriter();
//	velocityEngine.evaluate(context, contenuWriter, "", template);
//	String contenuMessage = contenuWriter.toString();
//
//	EmailVO emailVO = new EmailVO();
//	emailVO.setSubject(emailTemplate.getSubject());
//	emailVO.setFrom(from);
//	emailVO.setTo(to);
//	emailVO.setCc(cc);
//	emailVO.setBcc(bcc);
//	emailVO.setBody(contenuMessage);
//
//	return emailVO;
//
//    }
}
