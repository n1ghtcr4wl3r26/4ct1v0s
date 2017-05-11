package Paquete;
import Paquete.ClaseOpcion;
import Paquete.ClaseUsuario;

import java.net.URL;
import java.util.Properties;
import java.util.Vector;
import oracle.soap.transport.http.OracleSOAPHTTPConnection;
import org.apache.soap.Constants;
import org.apache.soap.Fault;
import org.apache.soap.SOAPException;
import org.apache.soap.encoding.SOAPMappingRegistry;
import org.apache.soap.encoding.soapenc.BeanSerializer;
import org.apache.soap.rpc.Call;
import org.apache.soap.rpc.Parameter;
import org.apache.soap.rpc.Response;
import org.apache.soap.util.xml.QName;

public class ClaseWsUsuario
{
  public ClaseWsUsuario()
  {
    m_httpConnection = new OracleSOAPHTTPConnection();
    m_smr = new SOAPMappingRegistry();

    BeanSerializer beanSer = new BeanSerializer();
    m_smr.mapTypes(Constants.NS_URI_SOAP_ENC, new QName("http://Paquete/IClaseEnvio.xsd", "Paquete_ClaseOpcion"), Paquete.ClaseOpcion.class, beanSer, beanSer);
    m_smr.mapTypes(Constants.NS_URI_SOAP_ENC, new QName("http://Paquete/IClaseEnvio.xsd", "Paquete_ClaseUsuario"), Paquete.ClaseUsuario.class, beanSer, beanSer);
  }

  //public String endpoint = "http://desasrv9.aduana.gob.bo:7777/serviciousuario/wsUsuario";
  //public String endpoint = "http://olddwserver.aduana.gov.bo:7777/newusuario/wsUsuario";
  //public String endpoint = "http://anbsa1:7777/wsUsuario/wsUsuario";
  public String endpoint = "http://anb9ias1:7777/wsUsuario/wsUsuario";
  private OracleSOAPHTTPConnection m_httpConnection = null;
  private SOAPMappingRegistry m_smr = null;

  public ClaseUsuario pListaOpciones(String Usuario, String Clave, String Sistema) throws Exception
  {
    ClaseUsuario returnVal = null;

    URL endpointURL = new URL(endpoint);
    Call call = new Call();
    call.setSOAPTransport(m_httpConnection);
    call.setTargetObjectURI("wsUsuario");
    call.setMethodName("pListaOpciones");
    call.setEncodingStyleURI(Constants.NS_URI_SOAP_ENC);

    Vector params = new Vector();
    params.addElement(new Parameter("Usuario", java.lang.String.class, Usuario, null));
    params.addElement(new Parameter("Clave", java.lang.String.class, Clave, null));
    params.addElement(new Parameter("Sistema", java.lang.String.class, Sistema, null));
    call.setParams(params);

    call.setSOAPMappingRegistry(m_smr);

    Response response = call.invoke(endpointURL, "");

    if (!response.generatedFault())
    {
      Parameter result = response.getReturnValue();
      returnVal = (ClaseUsuario)result.getValue();
    }
    else
    {
      Fault fault = response.getFault();
      throw new SOAPException(fault.getFaultCode(), fault.getFaultString());
    } 

    return returnVal;
  }

  public Integer pCambiaClave(String Usuario, String OldClave, String NewClave) throws Exception
  {
    Integer returnVal = null;

    URL endpointURL = new URL(endpoint);
    Call call = new Call();
    call.setSOAPTransport(m_httpConnection);
    call.setTargetObjectURI("wsUsuario");
    call.setMethodName("pCambiaClave");
    call.setEncodingStyleURI(Constants.NS_URI_SOAP_ENC);

    Vector params = new Vector();
    params.addElement(new Parameter("Usuario", java.lang.String.class, Usuario, null));
    params.addElement(new Parameter("OldClave", java.lang.String.class, OldClave, null));
    params.addElement(new Parameter("NewClave", java.lang.String.class, NewClave, null));
    call.setParams(params);

    call.setSOAPMappingRegistry(m_smr);

    Response response = call.invoke(endpointURL, "");

    if (!response.generatedFault())
    {
      Parameter result = response.getReturnValue();
      returnVal = (Integer)result.getValue();
    }
    else
    {
      Fault fault = response.getFault();
      throw new SOAPException(fault.getFaultCode(), fault.getFaultString());
    }

    return returnVal;
  }

  public void setMaintainSession(boolean maintainSession)
  {
    m_httpConnection.setMaintainSession(maintainSession);
  }

  public boolean getMaintainSession()
  {
    return m_httpConnection.getMaintainSession();
  }

  public void setTransportProperties(Properties props)
  {
    m_httpConnection.setProperties(props);
  }

  public Properties getTransportProperties()
  {
    return m_httpConnection.getProperties();
  }
}