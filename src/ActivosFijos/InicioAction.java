package ActivosFijos;
import Paquete.ClaseUsuario;
import Paquete.ClaseWsUsuario;

import java.io.IOException;

import java.lang.String;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.util.MessageResources;

public class InicioAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    InicioForm fInicio = (InicioForm) form;   
    request.getSession().setAttribute("InicioForm", fInicio);
    
    MessageResources ms = getResources(request);
    ActionMessages error = new ActionMessages();

    ClaseWsUsuario wsUsuario = new ClaseWsUsuario( );    
    BDConection bdc = new BDConection();
    ClaseUsuario fu = null;
    String userid = fInicio.getTxt_usu();
    String password = fInicio.getTxt_pas();
    String npassword = fInicio.getTxt_npas();
    String cpassword = fInicio.getTxt_cpas();


    int i;
    int sw = 0;
    fInicio.setNombreUsuario("SALIO");
    if (mapping.getParameter().equals("salir")) {
       request.getSession().setAttribute("InicioForm",fInicio);
       return mapping.findForward("volver");       
    }
    if (mapping.getParameter().equals("cam")) {
       return mapping.findForward("volver");       
    }
    if (userid.equals("") || password.equals(""))
    {  error.add("error", new ActionMessage("error","Debe ingresar los datos de usuario y password."));
       saveErrors( request, error );   
       return mapping.findForward("volver");
    }
    try {
       fu = null;
       ArrayList listaMenu = new ArrayList();  
       
       if (!npassword.equals("")) {
          if (!npassword.equals(cpassword)) 
          {
             error.add("error", new ActionMessage("error", "No se pudo cambiar la clave, Nueva Clave y Confirmar Clave diferentes, Verifique"));
             saveErrors( request, error );
             return mapping.findForward("cambio");            
          }
          Integer Clave = wsUsuario.pCambiaClave( userid, password, npassword );    
          fInicio.setTxt_usu("");
          fInicio.setTxt_pas("");
          fInicio.setTxt_npas("");
          fInicio.setTxt_cpas("");
          if( Clave.equals("0") ) {
             error.add("error", new ActionMessage("error", "No se pudo cambiar la clave, por favor, vuelva a intentar"));
             saveErrors( request, error );
             return mapping.findForward("cambio");
          }
          else {
             error.add("error", new ActionMessage("error", "Se cambio correctamente la clave!!!"));
             saveErrors( request, error );
             return mapping.findForward("volver");
          }
       }
       
       fu = wsUsuario.pListaOpciones( userid, password, "ACTIVOSFIJOS" );
       if( fu == null )
       {
         error.add("error", new ActionMessage("error", "El usuario, no está registrado en el Sistema"));
         saveErrors( request, error );
         return mapping.findForward("volver");
       }

       request.getSession().setAttribute("user.perfil", fu.getPerfil());
       //fInicio.setNombreUsuario("Activos");
       fInicio.setNombreUsuario(fu.getUsuario());
       request.getSession().setAttribute("InicioForm",fInicio);   
       Locale locale = getLocale(request);
       int aux = fu.getLopcion().length;
       
       for( i=0; i<fu.getLopcion().length; i++ )  //para iterar la lista de todas las opciones.
       {
          try{
          listaMenu.add( new ClaseOpcion( fu.getLopcion(i).getCodopc(), fu.getLopcion(i).getDesc().toLowerCase(), "0" ) );
          }
          catch(Exception ex)
          {
          String err = ex.toString();
          }
       }   
       listaMenu.add( new ClaseOpcion( "CAM", "Cambio Clave", "0" ) );
       listaMenu.add( new ClaseOpcion( "SAL", "Salir Sistema", "0" ) );

       /*listaMenu.add( new ClaseOpcion( "RET", "Retornar", "0" ) );
       listaMenu.add( new ClaseOpcion( "ACT", "Activos", "0" ) );
       listaMenu.add( new ClaseOpcion( "AT1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "AT2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "AT3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "AT4", "Consultar", "0" ) );
       listaMenu.add( new ClaseOpcion( "AT5", "Retornar", "0" ) );

       listaMenu.add( new ClaseOpcion( "DEP", "Depreciaciones", "0" ) );
       listaMenu.add( new ClaseOpcion( "DE1", "Generar", "0" ) );
       listaMenu.add( new ClaseOpcion( "DE2", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "DE3", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "REP", "Reportes", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RP1", "AF Referencia", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RP2", "AF Rango", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RP3", "AF Grupo", "0" ) );
       listaMenu.add( new ClaseOpcion( "RP4", "AF Ubicación", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RP5", "AF Responsable", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RP6", "AF Proyecto", "0" ) );
       listaMenu.add( new ClaseOpcion( "RP7", "AF Terreno", "0" ) );
       listaMenu.add( new ClaseOpcion( "RP8", "AF Muebles", "0" ) );
       listaMenu.add( new ClaseOpcion( "RP9", "AF Marcas", "0" ) );
       listaMenu.add( new ClaseOpcion( "RP10", "AF Vehiculos", "0" ) );
       listaMenu.add( new ClaseOpcion( "RP11", "AF Regional", "0" ) );
       listaMenu.add( new ClaseOpcion( "RP12", "Retornar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RD1", "AF Referencia", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RD2", "AF Rango", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RD3", "AF Grupo", "0" ) );
       listaMenu.add( new ClaseOpcion( "RD4", "AF Ubicación", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RD5", "AF Responsable", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RD6", "AF Proyecto", "0" ) );
       listaMenu.add( new ClaseOpcion( "RD7", "AF Terreno", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "DOC", "Actas", "0" ) );
       listaMenu.add( new ClaseOpcion( "DO1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "DO2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "DO3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "DO4", "Confirmar", "0" ) );
       listaMenu.add( new ClaseOpcion( "DO5", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "DO6", "Retornar", "0" ) );

       listaMenu.add( new ClaseOpcion( "INV", "Inventarios", "0" ) );
       listaMenu.add( new ClaseOpcion( "IN1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "IN2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "IN3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "IN4", "Retornar", "0" ) );

       listaMenu.add( new ClaseOpcion( "REV", "Revaluos", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RV1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RV2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RV3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RV4", "Retornar", "0" ) );

       listaMenu.add( new ClaseOpcion( "REF", "Administración", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "RF1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RF2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RF3", "Eliminar", "0" ) );

       listaMenu.add( new ClaseOpcion( "PAT", "Parametros", "0" ) ); 
       listaMenu.add( new ClaseOpcion( "PT1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PT2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PT3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PT4", "Retornar", "0" ) );

       listaMenu.add( new ClaseOpcion( "FIN", "Financiadores", "0" ) );
       listaMenu.add( new ClaseOpcion( "FI1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "FI2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "FI3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "FI4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "FI5", "Rotornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "FUN", "Funcionarios", "0" ) );
       listaMenu.add( new ClaseOpcion( "FU1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "FU2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "FU3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "FU4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "FU5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "GRU", "Grupo Activos", "0" ) );
       listaMenu.add( new ClaseOpcion( "GR1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "GR2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "GR3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "GR4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "GR5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "OFI", "Oficinas", "0" ) );
       listaMenu.add( new ClaseOpcion( "OF1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "OF2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "OF3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "OF4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "OF5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "PAR", "Partidas", "0" ) );
       listaMenu.add( new ClaseOpcion( "PA1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PA2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PA3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PA4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PA5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "PRO", "Proyectos", "0" ) );
       listaMenu.add( new ClaseOpcion( "PR1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PR2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PR3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PR4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "PR5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "REG", "Regionales", "0" ) );
       listaMenu.add( new ClaseOpcion( "RE1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RE2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RE3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RE4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RE5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "RUB", "Rubros (Cuentas)", "0" ) );
       listaMenu.add( new ClaseOpcion( "RU1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RU2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RU3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RU4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "RU5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "BAR", "Codigo Barras", "0" ) );
       listaMenu.add( new ClaseOpcion( "BA1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "BA2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "BA3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "BA4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "BA5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "SEC", "Correlativo Actas", "0" ) );
       listaMenu.add( new ClaseOpcion( "SE1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "SE2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "SE3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "SE4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "SE5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "TCA", "Tipo Cambio", "0" ) );
       listaMenu.add( new ClaseOpcion( "TC1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "TC2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "TC3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "TC4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "TC5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "MOT", "Motivos Baja", "0" ) );
       listaMenu.add( new ClaseOpcion( "MO1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "MO2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "MO3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "MO4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "MO5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "TDO", "Tipos de Acta", "0" ) );
       listaMenu.add( new ClaseOpcion( "TD1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "TD2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "TD3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "TD4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "TD5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "UBI", "Ubicaciones", "0" ) );       
       listaMenu.add( new ClaseOpcion( "UB1", "Insertar", "0" ) );
       listaMenu.add( new ClaseOpcion( "UB2", "Modificar", "0" ) );
       listaMenu.add( new ClaseOpcion( "UB3", "Eliminar", "0" ) );
       listaMenu.add( new ClaseOpcion( "UB4", "Reportar", "0" ) );
       listaMenu.add( new ClaseOpcion( "UB5", "Retornar", "0" ) );
       
       listaMenu.add( new ClaseOpcion( "VOP", "Menu Principal", "0" ) );
       listaMenu.add( new ClaseOpcion( "VOA", "Menu Administracion", "0" ) );
       listaMenu.add( new ClaseOpcion( "VO3", "Volver", "0" ) );*/
       fInicio.setOpciones(listaMenu);
       String reg = fu.getAux().substring(0,2);
       String fin = fu.getAux().substring(3,5);
       fInicio.setAux1(fu.getAux().substring(0,2));
       fInicio.setAux2(fu.getAux().substring(3,5));
       //String reg = "02";
       //String fin = "01";
       if ((reg.equals("00"))&&(fin.equals("00"))) {
          ArrayList aCalm = bdc.listarRegionales(0);
          request.setAttribute("RegionalesLista", aCalm);
          ArrayList aCalm1 = bdc.listarFinanciadores(0);
          request.setAttribute("FinanciadoresLista", aCalm1);
          return mapping.findForward("regional"); 
       }
       else {
          String desreg = bdc.DescripcionRegional(reg);
          String desfin = bdc.DescripcionFinanciador(fin);
          if ((desreg.equals("999"))||(desfin.equals("999"))) {
             error.add("error", new ActionMessage("error", "Revise su configuración (Regional/Financiador) en Gestión de Usuarios"));
             saveErrors( request, error );             
             return mapping.findForward("volver");
          }
          else {
             fInicio.setRegional(desreg.toUpperCase());
             fInicio.setFinanciador(desfin.toUpperCase());
             fInicio.setCod_reg(reg);       
             fInicio.setCod_fin(fin); 
             return mapping.findForward("menu"); 
          }
       }
    }        
    catch( Exception e )
    {
      String errores = e.toString();
      error.add("error", new ActionMessage("error", "Revise su configuración (Regional/Financiador) en Gestión de Usuarios"));
      saveErrors( request, error );
      return (mapping.findForward("volver"));
    }
  }
}