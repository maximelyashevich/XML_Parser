package com.elyashevich.task5.marshaller;


import com.elyashevich.task5.builder.PaperEditionDOMBuilder;
import com.elyashevich.task5.entity.PaperEdition;
import com.elyashevich.task5.entity.PaperEditionList;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class PaperEditionMarshal {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String FILE_NAME="text\\papers.xml";
    public void marshalingData(String filename) {
        try {
            LOGGER.log(Level.DEBUG, "Start marshalling...");
            JAXBContext context = JAXBContext.newInstance(PaperEditionList.class);
            Marshaller m = context.createMarshaller();
            PaperEditionList st = new PaperEditionList() {
                {
                    PaperEditionDOMBuilder domBuilder = new PaperEditionDOMBuilder();
                    domBuilder.buildSetPaperEdition(FILE_NAME);
                    Set<PaperEdition> editionSet = domBuilder.getPapers();
                    for(PaperEdition paperEdition: editionSet) {
                       this.getPaperEdition().add(paperEdition);
                    }
                }
            };
            m.marshal(st, new FileOutputStream(filename));
            LOGGER.log(Level.INFO, "Successful marshalling...");
        } catch (FileNotFoundException e) {
            LOGGER.log(Level.ERROR, "XML couldn't be created: " + e);
        } catch (JAXBException e) {
            LOGGER.log(Level.ERROR, "JAXB-context is mistaken " + e);
        }
    }

    public static void main(String[] args) {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("maximelyashevich@gmail.com","gfhjkm[f");
                        }
                    });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("maximelyashevich@gmail.com"));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse("elyashevich1998@mail.ru"));
                message.setSubject("Testing Subject");
                message.setText("Test Mail");
///comment
                Transport.send(message);

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }
}