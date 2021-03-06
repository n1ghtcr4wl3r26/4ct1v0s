package ActivosFijos;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;
public class EnviarCorreo 
{
  public EnviarCorreo()
  {
    Properties props = new Properties();
props.setProperty("mail.transport.protocol", "smtp");
props.setProperty("mail.host", "anbdm");
props.setProperty("mail.user", "monitor@aduana.gob.bo");
 Session mailSession = Session.getDefaultInstance(props, null);
Transport transport = mailSession.getTransport();
MimeMessage message = new MimeMessage(mailSession);
message.setSubject("Alerta de Monitoreo de Servicios");
message.setFrom(new InternetAddress("monitor@aduana.gob.bo"));
// BUSCA LA LISTA DE MAILS A ENVIAR
//call1 = Con.prepareCall("{? = call pkg_monitor.lista_notificaciones(?) }");
call1.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
call1.setString(2, p_nom_ind);
call1.execute();
rs = (ResultSet) call1.getObject(1);
if( !(rs == null || !rs.next()) )
{ do                 
  {   String p_not_fun = rs.getString("not_fun");
      String tel_mov = null;
      if (rs.getString("tip_not").equals("M"))
            message.addRecipient(Message.RecipientType.BCC,new InternetAddress(p_not_fun));
      else
      { String cad_viva = "@viva-gsm.com";
        String cad_entel = "@entelmovil.com.bo";
        String cad_tigo = "@tigo.com.bo";                     
        //String cad_telecel = "@telecel.com.bo";
        if (Integer.parseInt(p_not_fun.substring(0,3))>=700 && Integer.parseInt(p_not_fun.substring(0,3))<=709)
            tel_mov = "591" + p_not_fun + cad_viva;
        if (Integer.parseInt(p_not_fun.substring(0,3))>=710 && Integer.parseInt(p_not_fun.substring(0,3))<=739)
            tel_mov = p_not_fun + cad_entel;
        if (Integer.parseInt(p_not_fun.substring(0,2)) == 76 || Integer.parseInt(p_not_fun.substring(0,2)) == 77)
            tel_mov = p_not_fun + cad_tigo;      
        message.addRecipient(Message.RecipientType.BCC,new InternetAddress(tel_mov)); 
      }
    } while (rs.next());                           
    MimeMultipart multipart = new MimeMultipart("related");
    htmlText = null;
    // Contenido (the html)
    BodyPart messageBodyPart = new MimeBodyPart();
    htmlText = "Se�or: <br><BR> El Sistema ha detectado una alerta en : <br> Fecha y Hora : "+
                     p_fch_lec+" " + p_hor_lec +
                     " <br> Servicio/Indicador/Estado/Valor : '" + p_nom_ser + "/"+p_nom_ind+"/"+ estado +"/"+p_val_lec+
                     "<br><br> Atentamente <br><br> monitor@aduana.gob.bo";
    messageBodyPart.setContent(htmlText, "text/html");
    // adiciona aqui  
    multipart.addBodyPart(messageBodyPart);
    message.setContent(multipart);
    transport.connect();
    transport.sendMessage(message, message.getRecipients(Message.RecipientType.BCC));
    transport.close();
}
  
  }
}