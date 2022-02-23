package com.codekul.Java28SeptSpring.mailsend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mailcontroller {

  @Autowired
  private MailSender mailSender;

@PostMapping("sendMail")
  public String sendmail(){
      String from = "testmymail246@gmail.com";
      String to = "patelallauddin53@gmail.com";

      SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
      simpleMailMessage.setSubject("Hello");
      simpleMailMessage.setText("HII TEST MESSAGE");
      simpleMailMessage.setCc("dhavaldokhe@gmail.com");
      simpleMailMessage.setFrom(from);
      simpleMailMessage.setTo(to);
      mailSender.send(simpleMailMessage);
      return "mail sent ....";
  }
}
