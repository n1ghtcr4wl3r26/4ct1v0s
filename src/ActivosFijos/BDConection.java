package ActivosFijos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import java.util.ArrayList;
import java.text.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.servlet.http.HttpServletRequest;

import javax.sql.PooledConnection;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

import oracle.jdbc.driver.OracleTypes;


public class BDConection 
{   
    private PooledConnection m_connectionPool = null;
    private Connection l_connection = null;
    private Statement l_stmt = null;
    public String StrSql = "";
    public BDConection() {
    }


  public Connection getConexion() throws SQLException, NamingException
  {
    InitialContext ic = new InitialContext();
    OracleConnectionPoolDataSource pd = (OracleConnectionPoolDataSource) ic.lookup("jdbc/prueba");
    m_connectionPool = pd.getPooledConnection();
    return( m_connectionPool.getConnection() );
  }

    public void Cierra(Connection cn, ResultSet rs) 
    {
        try {
            if (!(rs == null)) {
                rs.close();
            }

            if (!(cn == null)) {
                cn.close();
            }
        } catch (SQLException e) {
        }
    }

  public String insertardocumentos( 
  String vdoc_codreg, 
  String vdoc_tipdoc, 
  int    vdoc_numero, 
  String vdoc_fecha, 
  String vdoc_codofiorigen, 
  String vdoc_codfunorigen, 
  String vdoc_codubiorigen, 
  String vdoc_codfin, 
  String vdoc_codfinorigen, 
  String vdoc_codpryorigen, 
  String vdoc_codregdestino, 
  String vdoc_codofidestino, 
  String vdoc_codfundestino, 
  String vdoc_codubidestino, 
  String vdoc_codfindestino, 
  String vdoc_codprydestino, 
  String vdoc_observacion, 
  String vdoc_inconfirma, 
  String vdoc_usuario, 
  int vestado,
  int vdoc_devolucion
  ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla    
      call = l_connection.prepareCall("{call pg_activos.insertardocumentos (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vdoc_codreg);
      call.setString(2,vdoc_tipdoc);
      call.setInt(3,vdoc_numero);
      call.setString(4,vdoc_fecha);
      call.setString(5,vdoc_codofiorigen);
      call.setString(6,vdoc_codfunorigen);
      call.setString(7,vdoc_codubiorigen);
      call.setString(8,vdoc_codfinorigen);
      call.setString(9,vdoc_codpryorigen);
      call.setString(10,vdoc_codregdestino);
      call.setString(11,vdoc_codofidestino);
      call.setString(12,vdoc_codfundestino);
      call.setString(13,vdoc_codubidestino);
      call.setString(14,vdoc_codfindestino);
      call.setString(15,vdoc_codprydestino);
      call.setString(16,vdoc_observacion);
      call.setString(17,vdoc_inconfirma);
      call.setString(18,vdoc_usuario);
      call.setInt(19,vestado);
      call.setString(20,vdoc_codfin);
      call.setInt(21,vdoc_devolucion);      
      call.registerOutParameter(22,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(23,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      can=call.getInt(22);
      msg=call.getString(23);
        
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertardetdocumentos( 
  String vdoc_codfin,
  String vdoc_codreg,
  String vdoc_tipdoc,
  int    vdoc_numero,
  String vdoc_fecha,
  String vdoc_codfunorigen,
  int    vdoc_item,
  String vdoc_codrubactual,
  String vdoc_codregactual,
  int    vdoc_codigo,
  String vdoc_codmot,
  String vdoc_usuario, 
  String vdoc_codofiactual,
  String vdoc_codubiactual,
  int vestado 
  ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
        call = l_connection.prepareCall("{call pg_activos.insertardetdocumentos (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vdoc_codfin);
      call.setString(2,vdoc_codreg);
      call.setString(3,vdoc_tipdoc);
      call.setInt(4,vdoc_numero);
      call.setString(5,vdoc_fecha);
      call.setString(6,vdoc_codfunorigen);
      call.setInt(7,vdoc_item);      
      call.setString(8,vdoc_codrubactual);
      call.setString(9,vdoc_codregactual);
      call.setInt(10,vdoc_codigo);
      call.setString(11,vdoc_codmot);
      call.setString(12,vdoc_usuario);
      call.setString(13,vdoc_codofiactual);
      call.setString(14,vdoc_codubiactual);      
      call.setInt(15,vestado);
      call.registerOutParameter(16,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(17,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(17);
      can=call.getInt(16);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  
  
  public String confirmardocumentos( String vdoc_codfin, String vdoc_codreg, String vdoc_tipdoc, int vdoc_numero,
  String vdoc_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.confirmardocumentos (?,?,?,?,?,?,?,?)}");
      call.setString(1,vdoc_codfin);
      call.setString(2,vdoc_codreg);
      call.setString(3,vdoc_tipdoc);
      call.setInt(4,vdoc_numero);
      call.setString(5,vdoc_usuario);
      call.setInt(6,vestado);
      call.registerOutParameter(7,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(8,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(8);
      can=call.getInt(7);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertaractivos( 
  String vact_codrub, 
  String vact_codreg, 
  int    vact_codigo, 
  String vact_codgrp, 
  String vact_codpar, 
  String vact_codofi, 
  String vact_codfun, 
  String vact_codubi, 
  String vact_codfin, 
  String vact_codpry, 
  String vact_codmot, 
  String vact_feccompra, 
  double vact_tipcam, 
  double vact_tipufv, 
  String vact_umanejo, 
  String vact_descripcion, 
  String vact_desadicional, 
  String vact_accesorios,
  String vact_proveedor, 
  String vact_marca, 
  String vact_modelo, 
  String vact_serie1, 
  String vact_serie2,   
  String vact_docreferencia, 
  String vact_fecreferencia, 
  String vact_docrefotro,
  String vact_placa, 
  String vact_aniofabricacion,
  String vact_color,
  String vact_procedencia,
  String vact_gobmunicipal,
  String vact_valcobol, 
  String vact_valcodol, 
  String vact_valcoufv, 
  String vact_fecbaja, 
  String vact_ordencompra, 
  String vact_numfactura, 
  String vact_numcomprobante, 
  String vact_codanterior, 
  String vact_indetiqueta, 
  String vrev_fecha, 
  int vrev_vidaut, 
  String vrev_estadoactivo, 
  String vrev_desestado, 
  String vrev_indepreciacion,
  String vrev_numdocumento,
  String vact_usuario, 
  int vestado 
  ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertaractivos (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vact_codrub);
      call.setString(2,vact_codreg);
      call.setInt(3,vact_codigo);
      call.setString(4,vact_codgrp);
      call.setString(5,vact_codpar);
      call.setString(6,vact_codofi);
      call.setString(7,vact_codfun);
      call.setString(8,vact_codubi);
      call.setString(9,vact_codfin);
      call.setString(10,vact_codpry);
      call.setString(11,vact_codmot);
      call.setString(12,vact_feccompra);
      call.setDouble(13,vact_tipcam);
      call.setDouble(14,vact_tipufv);
      call.setString(15,vact_umanejo);
      call.setString(16,vact_descripcion);
      call.setString(17,vact_desadicional);
      call.setString(18,vact_accesorios);
      call.setString(19,vact_proveedor);
      call.setString(20,vact_marca);
      call.setString(21,vact_modelo);
      call.setString(22,vact_serie1);
      call.setString(23,vact_serie2);
      call.setString(24,vact_docreferencia);
      call.setString(25,vact_fecreferencia);
      call.setString(26,vact_docrefotro);
      call.setString(27,vact_placa);
      call.setString(28,vact_aniofabricacion);
      call.setString(29,vact_color);
      call.setString(30,vact_procedencia);
      call.setString(31,vact_gobmunicipal);
      call.setString(32,vact_valcobol);
      call.setString(33,vact_valcodol);
      call.setString(34,vact_valcoufv);
      call.setString(35,vact_fecbaja);
      call.setString(36,vact_ordencompra);
      call.setString(37,vact_numfactura);
      call.setString(38,vact_numcomprobante);
      call.setString(39,vact_codanterior);
      call.setString(40,vact_indetiqueta);
      call.setString(41,vrev_fecha);
      call.setInt(42,vrev_vidaut);
      call.setString(43,vrev_estadoactivo);
      call.setString(44,vrev_desestado);
      call.setString(45,vrev_indepreciacion);
      call.setString(46,vrev_numdocumento);
      call.setString(47,vact_usuario);
      call.setInt(48,vestado);
      call.registerOutParameter(49,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(50,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(50);
      can=call.getInt(49);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  
    
  public String insertarmejorasrebajas( 
  String vmre_codrub, 
  String vmre_codreg, 
  int vmre_codigo, 
  String vmre_inmejreb,
  int vmre_corel,
  String vmre_fecha, 
  double vmre_tipcam, 
  double vmre_tipufv, 
  String vmre_descripcion, 
  String vmre_desadicional, 
  String vmre_proveedor, 
  String vmre_marca, 
  String vmre_modelo, 
  String vmre_serie, 
  String vmre_docreferencia, 
  String vmre_fecreferencia,  
  double vmre_valbol, 
  double vmre_valdol, 
  double vmre_valufv, 
  String vmre_ordencompra, 
  int vmre_numfactura, 
  String vmre_numcomprobante,   
  String vrev_fecha, 
  int vrev_vidaut, 
  String vrev_estadoactivo, 
  String vrev_desestado, 
  String vrev_numdocumento,  
  String vmre_usuario, 
  int vestado 
  ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarmejorasrebajas (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vmre_codrub);
      call.setString(2,vmre_codreg);
      call.setInt(3,vmre_codigo);
      call.setString(4,vmre_inmejreb);
      call.setInt(5,vmre_corel);
      call.setString(6,vmre_fecha);
      call.setDouble(7,vmre_tipcam);
      call.setDouble(8,vmre_tipufv);
      call.setString(9,vmre_descripcion);
      call.setString(10,vmre_desadicional);
      call.setString(11,vmre_proveedor);
      call.setString(12,vmre_marca);
      call.setString(13,vmre_modelo);
      call.setString(14,vmre_serie);
      call.setString(15,vmre_docreferencia);      
      call.setString(16,vmre_fecreferencia);
      call.setDouble(17,vmre_valbol);
      call.setDouble(18,vmre_valdol);
      call.setDouble(19,vmre_valufv);
      call.setString(20,vmre_ordencompra);
      call.setInt(21,vmre_numfactura);
      call.setString(22,vmre_numcomprobante);
      call.setString(23,vrev_fecha);
      call.setInt(24,vrev_vidaut);
      call.setString(25,vrev_estadoactivo);
      call.setString(26,vrev_desestado);
      call.setString(27,vrev_numdocumento);
      call.setString(28,vmre_usuario);
      call.setInt(29,vestado);
      call.registerOutParameter(30,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(31,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(31);
      can=call.getInt(30);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  
    
  public String insertarrevaluos( 
  String vrev_codrub, 
  String vrev_codreg, 
  int vrev_codigo, 
  int vrev_numrevaluo,
  String vrev_fecha, 
  double vrev_tipcam, 
  double vrev_tipufv, 
  double vrev_valbol, 
  double vrev_valdol, 
  double vrev_valufv, 
  double vrev_depacubol, 
  double vrev_depacudol, 
  double vrev_depacuufv, 
  int vrev_vidaut, 
  String vrev_estadoactivo, 
  String vrev_desestado,   
  String vrev_indepreciacion, 
  String vrev_numdocumento,  
  String vrev_usuario, 
  int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarrevaluos (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vrev_codrub);
      call.setString(2,vrev_codreg);
      call.setInt(3,vrev_codigo);
      call.setInt(4,vrev_numrevaluo);      
      call.setString(5,vrev_fecha);
      call.setDouble(6,vrev_tipcam);
      call.setDouble(7,vrev_tipufv);
      call.setDouble(8,vrev_valbol);
      call.setDouble(9,vrev_valdol);
      call.setDouble(10,vrev_valufv);
      call.setDouble(11,vrev_depacubol);
      call.setDouble(12,vrev_depacudol);
      call.setDouble(13,vrev_depacuufv);
      call.setInt(14,vrev_vidaut);      
      call.setString(15,vrev_estadoactivo);
      call.setString(16,vrev_desestado);
      call.setString(17,vrev_indepreciacion);
      call.setString(18,vrev_numdocumento);
      call.setString(19,vrev_usuario);
      call.setInt(20,vestado);
      call.registerOutParameter(21,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(22,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(22);
      can=call.getInt(21);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertarfinanciadores( String vfin_codigo, String vfin_descripcion, String vfin_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarfinanciadores (?,?,?,?,?,?)}");
      call.setString(1,vfin_codigo);
      call.setString(2,vfin_descripcion);
      call.setString(3,vfin_usuario);
      call.setInt(4,vestado);
      call.registerOutParameter(5,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(6,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(6);
      can=call.getInt(5);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  
                   
  public String insertarfuncionarios( String vfun_codigo, String vfun_descripcion, String vfun_cargo, String vfun_codofi, String vfun_codreg, String vfun_usuario, int vestado, String vfun_codfin, String vfun_correo, String vfun_estado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarfuncionarios (?,?,?,?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vfun_codigo);
      call.setString(2,vfun_descripcion);
      call.setString(3,vfun_cargo);
      call.setString(4,vfun_codofi);
      call.setString(5,vfun_codreg);
      call.setString(6,vfun_usuario);
      call.setString(7,vfun_codfin);
      call.setString(8,vfun_correo);
      call.setString(9,vfun_estado);      
      call.setInt(10,vestado);
      call.registerOutParameter(11,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(12,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(12);
      can=call.getInt(11);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertargrupos( String vgrp_codigo, String vgrp_descripcion, String vgrp_codrub, String vgrp_usuario, String vgrp_estado, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertargrupos (?,?,?,?,?,?,?,?)}");
      call.setString(1,vgrp_codigo);
      call.setString(2,vgrp_descripcion);
      call.setString(3,vgrp_codrub);
      call.setString(4,vgrp_usuario);
      call.setString(5,vgrp_estado);
      call.setInt(6,vestado);
      call.registerOutParameter(7,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(8,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(8);
      can=call.getInt(7);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertaroficinas( String vofi_codigo, String vofi_descripcion, String vofi_codreg, String vofi_codubi, String vofi_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertaroficinas (?,?,?,?,?,?,?,?)}");
      call.setString(1,vofi_codigo);
      call.setString(2,vofi_descripcion);
      call.setString(3,vofi_codreg);
      call.setString(4,vofi_codubi);
      call.setString(5,vofi_usuario);
      call.setInt(6,vestado);
      call.registerOutParameter(7,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(8,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(8);
      can=call.getInt(7);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertarpartidas( String vpar_codigo, String vpar_descripcion, String vpar_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarpartidas (?,?,?,?,?,?)}");
      call.setString(1,vpar_codigo);
      call.setString(2,vpar_descripcion);
      call.setString(3,vpar_usuario);
      call.setInt(4,vestado);
      call.registerOutParameter(5,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(6,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(6);
      can=call.getInt(5);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertarproyectos( String vpry_codigo, String vpry_descripcion, String vpry_codfin, String vpry_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarproyectos (?,?,?,?,?,?,?)}");
      call.setString(1,vpry_codigo);
      call.setString(2,vpry_descripcion);
      call.setString(3,vpry_codfin);
      call.setString(4,vpry_usuario);
      call.setInt(5,vestado);
      call.registerOutParameter(6,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(7,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(7);
      can=call.getInt(6);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertarregionales( String vreg_codigo, String vreg_descripcion, String vreg_codfun, String vreg_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarregionales (?,?,?,?,?,?,?)}");
      call.setString(1,vreg_codigo);
      call.setString(2,vreg_descripcion);
      call.setString(3,vreg_codfun);      
      call.setString(4,vreg_usuario);
      call.setInt(5,vestado);
      call.registerOutParameter(6,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(7,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(7);
      can=call.getInt(6);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertarusuarios( String vusu_codigo, String vusu_carnet, String vusu_codfun, String vreg_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarusuarios (?,?,?,?,?,?)}");
      call.setString(1,vusu_codigo);
      call.setString(2,vusu_carnet);
      call.setString(3,vusu_codfun);      
      call.setInt(4,vestado);
      call.registerOutParameter(5,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(6,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(6);
      can=call.getInt(5);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  
  
  public String insertarrubros( String vrub_codigo, String vrub_descripcion, int vrub_vidaut, double vrub_porcen, String vrub_codpar, String vrub_ctadep, String vrub_ctadac, String vrub_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarrubros (?,?,?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vrub_codigo);
      call.setString(2,vrub_descripcion);
      call.setInt(3,vrub_vidaut);
      call.setDouble(4,vrub_porcen);
      call.setString(5,vrub_codpar);
      call.setString(6,vrub_ctadep);
      call.setString(7,vrub_ctadac);
      call.setString(8,vrub_usuario);
      call.setInt(9,vestado);
      call.registerOutParameter(10,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(11,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(11);
      can=call.getInt(10);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertarsecbarras( String vbar_rubro, String vbar_codreg, int vbar_numero, String vrub_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarsecbarras (?,?,?,?,?,?)}");
      call.setString(1,vbar_rubro);
      call.setString(2,vbar_codreg);
      call.setInt(3,vbar_numero);
      call.setInt(4,vestado);
      call.registerOutParameter(5,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(6,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(6);
      can=call.getInt(5);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertarsectiposdoc(String vstd_codfin, String vstd_codreg, String vstd_tipdoc, int vstd_numero, String vstd_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarsectiposdoc (?,?,?,?,?,?,?,?)}");
      call.setString(1,vstd_codfin);
      call.setString(2,vstd_codreg);
      call.setString(3,vstd_tipdoc);
      call.setInt(4,vstd_numero);
      call.setString(5,vstd_usuario);
      call.setInt(6,vestado);
      call.registerOutParameter(7,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(8,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(8);
      can=call.getInt(7);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertartipocambio( String vtca_fecha, double vtca_tipcam, double vtca_tipufv, String vtca_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertartipocambio (?,?,?,?,?,?,?)}");
      call.setString(1,vtca_fecha);
      call.setDouble(2,vtca_tipcam);
      call.setDouble(3,vtca_tipufv);
      call.setString(4,vtca_usuario);
      call.setInt(5,vestado);
      call.registerOutParameter(6,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(7,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(7);
      can=call.getInt(6);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertartiposbaja( String vmot_codigo, String vmot_descripcion, String vmot_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertartiposbaja (?,?,?,?,?,?)}");
      call.setString(1,vmot_codigo);
      call.setString(2,vmot_descripcion);
      call.setString(3,vmot_usuario);
      call.setInt(4,vestado);
      call.registerOutParameter(5,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(6,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(6);
      can=call.getInt(5);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertartiposdoc( String vtdo_codigo, String vtdo_descripcion, String vtdo_feccie, String vtdo_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertartiposdoc (?,?,?,?,?,?,?)}");
      call.setString(1,vtdo_codigo);
      call.setString(2,vtdo_descripcion);
      call.setString(3,vtdo_feccie);
      call.setString(4,vtdo_usuario);
      call.setInt(5,vestado);
      call.registerOutParameter(6,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(7,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(7);
      can=call.getInt(6);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String insertarubicaciones( String vubi_codigo, String vubi_descripcion, String vubi_direccion, String vubi_codreg, String vubi_usuario, int vestado ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarubicaciones (?,?,?,?,?,?,?,?)}");
      call.setString(1,vubi_codigo);
      call.setString(2,vubi_descripcion);
      call.setString(3,vubi_direccion);
      call.setString(4,vubi_codreg);
      call.setString(5,vubi_usuario);
      call.setInt(6,vestado);
      call.registerOutParameter(7,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(8,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(8);
      can=call.getInt(7);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  
  public ArrayList listarDocumentos(String vdoc_codreg, String vdoc_tipdoc, int vdoc_numero) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarDocumentos(?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vdoc_codreg);
     call.setString(3,vdoc_tipdoc);
     call.setInt(4,vdoc_numero);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     if( !(l_rset == null || !l_rset.next()) )
     {
         DocumentosDetalleForm d = new DocumentosDetalleForm();
         d.setcodreg(l_rset.getString(1));       
         d.settipdoc(l_rset.getString(2));
         d.setnumero(l_rset.getInt(3));
         d.setfecha(l_rset.getString(4));
         d.setcodofiorigen(l_rset.getString(5));
         d.setcodfunorigen(l_rset.getString(6));
         d.setcodubiorigen(l_rset.getString(7));
         d.setcodfinorigen(l_rset.getString(8));
         d.setcodpryorigen(l_rset.getString(9));
         d.setcodofidestino(l_rset.getString(10));
         d.setcodfundestino(l_rset.getString(11));
         d.setcodubidestino(l_rset.getString(12));
         d.setcodfindestino(l_rset.getString(13));
         d.setcodpryorigen(l_rset.getString(14));
         d.setobservacion(l_rset.getString(15));
         d.setinconfirma(l_rset.getString(16));
         alCam.add(d);
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarEstados() throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
        try
        {
         l_connection = this.getConexion();
         l_stmt = l_connection.createStatement();    
         ResultSet l_rset = null;
         CallableStatement call = null;
         call = l_connection.prepareCall("{? = call pg_activos.listarEstados }");
         call.registerOutParameter(1, OracleTypes.CURSOR);
         call.execute();
         l_rset = (ResultSet) call.getObject(1);
         if( !(l_rset == null || !l_rset.next()) )
         {
             EstadosForm d1 = new EstadosForm();
             d1.setEstado("0");
             d1.setDesestado("<--- Seleccionar --->");
             alCam.add(d1);     
             do {
                EstadosForm d = new EstadosForm();
                d.setEstado(l_rset.getString(1));       
                d.setDesestado(l_rset.getString(2));
                alCam.add(d);
             } while (l_rset.next());         
         }
         return alCam;
        }
        catch ( SQLException e )
        { 
          StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
          return alCam;
        }
        catch( NamingException e )
        { 
          StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
          return alCam;
        }
        catch( Exception e )
        { 
          StrSql = e.getMessage();
          return alCam;
        }
        finally
        {
          try
          {
            if( l_connection != null )
              l_connection.close();
            if( m_connectionPool != null )
              m_connectionPool.close(); // close the pooled connection
            if( l_stmt != null )
              l_stmt.close();
          }
          catch (Exception e)
          {
            StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
            return alCam;
          }
        } 
    
        
  }

  public ArrayList listarActivos(String vact_codrub, String vact_codreg, int vact_codigo) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarActivos(?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vact_codrub);
     call.setString(3,vact_codreg);
     call.setInt(4,vact_codigo);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     if( !(l_rset == null || !l_rset.next()) )
     {
         ActivosDetalleForm d = new ActivosDetalleForm();
         d.setcodrub(l_rset.getString(1));       
         d.setcodreg(l_rset.getString(2));
         d.setcodigo(l_rset.getInt(3));
         d.setcodgrp(l_rset.getString(4));
         d.setcodpar(l_rset.getString(5));
         d.setcodofi(l_rset.getString(6));
         d.setcodfun(l_rset.getString(7));
         d.setcodubi(l_rset.getString(8));
         d.setcodfin(l_rset.getString(9));
         d.setcodpry(l_rset.getString(10));
         d.setcodmot(l_rset.getString(11));
         d.setfeccompra(l_rset.getString(12));
         d.settipcam(l_rset.getDouble(13));
         d.settipufv(l_rset.getDouble(14));
         d.setumanejo(l_rset.getString(15));
         d.setdescripcion(l_rset.getString(16));
         d.setdesadicional(l_rset.getString(17));
         d.setaccesorios(l_rset.getString(18));
         d.setproveedor(l_rset.getString(19));
         d.setmarca(l_rset.getString(20));
         d.setmodelo(l_rset.getString(21));
         d.setserie1(l_rset.getString(22));
         d.setserie2(l_rset.getString(23));
         d.setdocreferencia(l_rset.getString(24));
         d.setfecreferencia(l_rset.getString(25));
         d.setdocrefotro(l_rset.getString(26));
         d.setplaca(l_rset.getString(27));
         d.setaniofabricacion(l_rset.getString(28));
         d.setcolor(l_rset.getString(29));
         d.setprocedencia(l_rset.getString(30));
         d.setgobmunicipal(l_rset.getString(31));
         d.setvalcobol(l_rset.getString(32));
         d.setvalcodol(l_rset.getString(33));
         d.setvalcoufv(l_rset.getString(34));
         d.setfecbaja(l_rset.getString(35));
         d.setordencompra(l_rset.getString(36));
         d.setnumfactura(l_rset.getString(37));
         d.setnumcomprobante(l_rset.getString(38));
         d.setcodanterior(l_rset.getString(39));
         d.setindetiqueta(l_rset.getString(40));             
         d.setfecha(l_rset.getString(41));             
         d.setvidaut(l_rset.getInt(42));             
         d.setestadoactivo(l_rset.getString(43));             
         d.setdesestado(l_rset.getString(44));             
         d.setindepreciacion(l_rset.getString(45));
         d.setnumdocumento(l_rset.getString(46));
         alCam.add(d);
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarMejorasRebajas(String vmre_codrub,String vmre_codreg, int vmre_codigo, int vmre_corel) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarMejorasRebajas(?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vmre_codrub);
     call.setString(3,vmre_codreg);
     call.setInt(4,vmre_codigo);
     call.setInt(5,vmre_corel);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     if( !(l_rset == null || !l_rset.next()) )
     {
         MejorasRebajasDetalleForm d = new MejorasRebajasDetalleForm();
         d.setcodrub(l_rset.getString(1));       
         d.setcodreg(l_rset.getString(2));
         d.setcodigo(l_rset.getInt(3));
         d.setinmejreb(l_rset.getString(4));
         d.setcorel(l_rset.getInt(5));
         d.setfecha(l_rset.getString(6));
         d.settipcam(l_rset.getDouble(7));
         d.settipufv(l_rset.getDouble(8));
         d.setdescripcion(l_rset.getString(9));
         d.setdesadicional(l_rset.getString(10));
         d.setproveedor(l_rset.getString(11));
         d.setmarca(l_rset.getString(12));
         d.setmodelo(l_rset.getString(13));
         d.setserie(l_rset.getString(14));
         d.setdocreferencia(l_rset.getString(15));
         d.setfecreferencia(l_rset.getString(16));
         d.setvalbol(l_rset.getDouble(17));
         d.setvaldol(l_rset.getDouble(18));
         d.setvalufv(l_rset.getDouble(19));
         d.setordencompra(l_rset.getString(20));
         d.setnumfactura(l_rset.getInt(21));
         d.setnumcomprobante(l_rset.getString(22));
         d.setRfecha(l_rset.getString(23));
         d.setVidaut(l_rset.getInt(24));
         d.setEstadoactivo(l_rset.getString(25));
         d.setDesestado(l_rset.getString(26));
         d.setNumdocumento(l_rset.getString(27));
         alCam.add(d);
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarMejorasRebajas3(String vact_codrub, String vact_codreg, String vact_descripcion, int vparametro) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarMejorasRebajas3(?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vact_codrub);
     call.setString(3,vact_codreg);
     call.setString(4,vact_descripcion);
     call.setInt(5,vparametro);     
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        do {
             ActivosDetalleForm d = new ActivosDetalleForm();
             d.setcodrub(l_rset.getString(1));
             d.setcodreg(l_rset.getString(2));
             d.setcodigo(l_rset.getInt(3));
             d.setCorel(l_rset.getInt(4));
             d.setdescripcion(l_rset.getString(5));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarMejorasRebajas4(String vmre_codrub,String vmre_codreg, String vdescripcion, int vparametro) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarMejorasRebajas4(?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vmre_codrub);
     call.setString(3,vmre_codreg);
     call.setString(4,vdescripcion);     
     call.setInt(5,vparametro);
     call.execute();
     int c = 0;
     l_rset = (ResultSet) call.getObject(1);
     if( !(l_rset == null || !l_rset.next()) )
     {
       do {     
         MejorasRebajasDetalleForm d = new MejorasRebajasDetalleForm();
         d.setcodrub(l_rset.getString(1));       
         d.setcodreg(l_rset.getString(2));
         d.setcodigo(l_rset.getInt(3));
         d.setDesactivo(l_rset.getString(4));
         if (vparametro!=1){
            d.setinmejreb(l_rset.getString(5));
            d.setcorel(l_rset.getInt(6));
            d.setfecha(l_rset.getString(7));
            d.settipcam(l_rset.getDouble(8));
            d.settipufv(l_rset.getDouble(9));
            d.setdescripcion(l_rset.getString(10));
            d.setdesadicional(l_rset.getString(11));
            d.setproveedor(l_rset.getString(12));
            d.setmarca(l_rset.getString(13));
            d.setmodelo(l_rset.getString(14));
            d.setserie(l_rset.getString(15));
            d.setdocreferencia(l_rset.getString(16));
            d.setfecreferencia(l_rset.getString(17));
            d.setvalbol(l_rset.getDouble(18));
            d.setvaldol(l_rset.getDouble(19));
            d.setvalufv(l_rset.getDouble(20));
            d.setordencompra(l_rset.getString(21));
            d.setnumfactura(l_rset.getInt(22));
            d.setnumcomprobante(l_rset.getString(23));
            d.setRfecha(l_rset.getString(24));
            d.setVidaut(l_rset.getInt(25));
            d.setEstadoactivo(l_rset.getString(26));
            d.setDesestado(l_rset.getString(27));
            d.setNumdocumento(l_rset.getString(28));
         }
         alCam.add(d);
         c = c+1;
       } while (l_rset.next());         
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarRevaluos(String vrev_codrub, String vrev_codreg, int vrev_codigo, int vrev_numrevaluo) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarRevaluos(?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vrev_codrub);
     call.setString(3,vrev_codreg);
     call.setInt(4,vrev_codigo);
     call.setInt(5,vrev_numrevaluo);     
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     if( !(l_rset == null || !l_rset.next()) )
     {
         RevaluosDetalleForm d = new RevaluosDetalleForm();
         d.setcodrub(l_rset.getString(1));       
         d.setcodreg(l_rset.getString(2));
         d.setcodigo(l_rset.getInt(3));
         d.setNumrevaluo(l_rset.getInt(4));
         d.setfecha(l_rset.getString(5));
         d.settipcam(l_rset.getDouble(6));
         d.settipufv(l_rset.getDouble(7));
         d.setvalbol(l_rset.getDouble(8));
         d.setvaldol(l_rset.getDouble(9));
         d.setvalufv(l_rset.getDouble(10));
         d.setdepacubol(l_rset.getDouble(11));
         d.setdepacudol(l_rset.getDouble(12));
         d.setdepacuufv(l_rset.getDouble(13));
         d.setvidaut(l_rset.getInt(14));
         d.setestadoactivo(l_rset.getString(15));
         d.setdesestado(l_rset.getString(16));         
         d.setindepreciacion(l_rset.getString(17));
         d.setnumdocumento(l_rset.getString(18));             
         alCam.add(d);
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarRevaluos3(String vact_codrub, String vact_codreg, String vact_descripcion, String vact_codgrp, int vparametro) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarrevaluos3(?,?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vact_codrub);
     call.setString(3,vact_codreg);
     call.setString(4,vact_descripcion);
     call.setString(5,vact_codgrp);
     call.setInt(6,vparametro);     
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        do {
             ActivosDetalleForm d = new ActivosDetalleForm();
             d.setcodrub(l_rset.getString(1));
             d.setcodreg(l_rset.getString(2));
             d.setcodigo(l_rset.getInt(3));
             if (d.getcodigo()<10000)
                d.setCeros("0");
             if (d.getcodigo()<1000)
                d.setCeros("00");
             if (d.getcodigo()<100)
                d.setCeros("000");
             if (d.getcodigo()<10)
                d.setCeros("0000");             
             d.setNumrevaluo(l_rset.getInt(4));
             d.setdescripcion(l_rset.getString(5));
             d.setcodgrp(l_rset.getString(6));             
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarRevaluos4(String vmre_codrub,String vmre_codreg, String vdescripcion, String vmre_codgrp, int vparametro) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarRevaluos4(?,?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vmre_codrub);
     call.setString(3,vmre_codreg);
     call.setString(4,vdescripcion);     
     call.setString(5,vmre_codgrp);
     call.setInt(6,vparametro);
     call.execute();
     int c = 0;
     l_rset = (ResultSet) call.getObject(1);
     if( !(l_rset == null || !l_rset.next()) )
     {
       do {     
         RevaluosDetalleForm d = new RevaluosDetalleForm();
         d.setcodrub(l_rset.getString(1));       
         d.setcodreg(l_rset.getString(2));
         d.setcodigo(l_rset.getInt(3));
         d.setDesactivo(l_rset.getString(4));         
         d.setcodgrp(l_rset.getString(5));
         if (vparametro!=1){
            d.setNumrevaluo(l_rset.getInt(6));
            d.setfecha(l_rset.getString(7));
            d.settipcam(l_rset.getDouble(8));
            d.settipufv(l_rset.getDouble(9));
            d.setvalbol(l_rset.getDouble(10));
            d.setvaldol(l_rset.getDouble(11));
            d.setvalufv(l_rset.getDouble(12));
            d.setdepacubol(l_rset.getDouble(13));
            d.setdepacudol(l_rset.getDouble(14));
            d.setdepacuufv(l_rset.getDouble(15));
            d.setvidaut(l_rset.getInt(16));
            d.setestadoactivo(l_rset.getString(17));
            d.setdesestado(l_rset.getString(18));         
            d.setindepreciacion(l_rset.getString(19));
            d.setnumdocumento(l_rset.getString(20));             
         }
         alCam.add(d);
         c = c+1;
       } while (l_rset.next());         
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarDetDocumentos(String vdoc_codfin, String vdoc_codreg,String vdoc_tipdoc,int vdoc_numero) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listardetdocumentos(?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vdoc_codfin);
     call.setString(3,vdoc_codreg);     
     call.setString(4,vdoc_tipdoc);
     call.setInt(5,vdoc_numero);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        do {
             DetDocumentosDetalleForm d = new DetDocumentosDetalleForm();
             d.setcodfin(l_rset.getString(1));
             d.setcodreg(l_rset.getString(2));
             d.settipdoc(l_rset.getString(3));
             d.setnumero(l_rset.getInt(4));
             d.setitem(l_rset.getInt(5));
             d.setcodrubactual(l_rset.getString(6));
             d.setDescripcion_codmot(l_rset.getString(7));
             d.setDescripcion_activo(l_rset.getString(8));
             //d.setcodregactual(l_rset.getString(6));
             //d.setcodigo(l_rset.getInt(7));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarDetDocumentos2(String vdoc_codfin, String vdoc_codreg,String vdoc_tipdoc,int vdoc_numero) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listardetdocumentos2(?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vdoc_codfin);
     call.setString(3,vdoc_codreg);
     call.setString(4,vdoc_tipdoc);
     call.setInt(5,vdoc_numero);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        do {
             DetDocumentosDetalleForm d = new DetDocumentosDetalleForm();
             d.setcodfin(l_rset.getString(1));
             d.setcodreg(l_rset.getString(2));
             d.settipdoc(l_rset.getString(3));
             d.setnumero(l_rset.getInt(4));
             d.setitem(l_rset.getInt(5));
             d.setcodrubactual(l_rset.getString(6));
             d.setDescripcion_codmot(l_rset.getString(7));
             d.setDescripcion_activo(l_rset.getString(8));
             d.setCodanterior(l_rset.getString(9));
             d.setEstado(l_rset.getString(10));
             //d.setcodregactual(l_rset.getString(6));
             //d.setcodigo(l_rset.getInt(7));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarFinanciadores(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFinanciadores }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
       if (par==0){
          FinanciadoresDetalleForm d1 = new FinanciadoresDetalleForm();
          d1.setCodigo("0");
          d1.setDescripcion("<--- Seleccionar --->");
          alCam.add(d1);
       }
        do {
             FinanciadoresDetalleForm d = new FinanciadoresDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarFuncionarios(int par, String vcod_reg) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionarios(?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             d.setCorreo(l_rset.getString(8));
             d.setCodfin(l_rset.getString(9));
             d.setDescripcion_codfin(l_rset.getString(10));
             d.setEstado(l_rset.getString(11));             
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarFuncionariosf(int par, String vcod_reg, String vcod_fin) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionariosf(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.setString(3,vcod_fin);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             d.setCorreo(l_rset.getString(8));
             d.setCodfin(l_rset.getString(9));
             d.setDescripcion_codfin(l_rset.getString(10));
             d.setEstado(l_rset.getString(11));             
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }  

  public ArrayList listarFuncionariosfa(int par, String vcod_reg, String vcod_fin) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionariosfa(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.setString(3,vcod_fin);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             d.setCorreo(l_rset.getString(8));
             d.setCodfin(l_rset.getString(9));
             d.setDescripcion_codfin(l_rset.getString(10));
             d.setEstado(l_rset.getString(11));             
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }    

  public ArrayList listarFuncionariosa(int par, String vcod_reg, String vcod_fin) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionariosa(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.setString(3,vcod_fin);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             d.setCorreo(l_rset.getString(8));
             d.setEstado(l_rset.getString(9));             
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarFuncionarios2(int par, String vcod_reg, String vaux) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();     
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionarios2(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.setString(3,vaux);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarFuncionarios3(int par, String vcod_reg, String vcod_fin, String vaux) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();     
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionarios3(?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.setString(3,vcod_fin);
     call.setString(4,vaux);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarFuncionarios4(int par, String vcod_reg) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionarios4(?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             d.setCorreo(l_rset.getString(8));
             d.setEstado(l_rset.getString(9));             
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarFuncionariosR(int par, String vcod_reg, String vcod_fin) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();     
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionariosR(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.setString(3,vcod_fin);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }  

public ArrayList listarFuncionariosR1(int par, String vcod_reg, String vcod_fin) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();     
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionariosR1(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.setString(3,vcod_fin);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }  

  public ArrayList listarFuncionariosR2(int par, String vcod_reg, String vcod_fin) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();     
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarFuncionariosR2(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.setString(3,vcod_fin);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0) {
           FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCargo(l_rset.getString(3));
             d.setCodofi(l_rset.getString(4));
             d.setDescripcion_codofi(l_rset.getString(5));
             d.setCodreg(l_rset.getString(6));
             d.setDescripcion_codreg(l_rset.getString(7));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }  
  
  public ArrayList listarRubros(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarRubros }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           RubrosDetalleForm d1 = new RubrosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);          
        }
        do {
             RubrosDetalleForm d = new RubrosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setVidaut(l_rset.getInt(3));
             d.setPorcen(l_rset.getDouble(4));
             d.setCodpar(l_rset.getString(5));
             d.setDescripcion_codpar(l_rset.getString(6));
             d.setCtadep(l_rset.getString(7));
             d.setCtadac(l_rset.getString(8));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }
  
  public ArrayList listarRubrosP(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarRubrosP }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           RubrosDetalleForm d1 = new RubrosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);          
        }
        do {
             RubrosDetalleForm d = new RubrosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setVidaut(l_rset.getInt(3));
             d.setPorcen(l_rset.getDouble(4));
             d.setCodpar(l_rset.getString(5));
             d.setDescripcion_codpar(l_rset.getString(6));
             d.setCtadep(l_rset.getString(7));
             d.setCtadac(l_rset.getString(8));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarGrupos(int par, String vcod_rub) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarGrupos(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setInt(2,par);
     call.setString(3,vcod_rub);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     //Modificacion Edgar Arteaga solicitud activos fijos 15/09/2016
     if(vcod_rub != null &&  vcod_rub.equals("01")){
        par=1; 
     }
     
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if ((par==0)||(par==2)) {
           GruposDetalleForm d1 = new GruposDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             GruposDetalleForm d = new GruposDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCodrub(l_rset.getString(3));
             d.setCodrub_descripcion(l_rset.getString(4));
             d.setEstado(l_rset.getString(5));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarOficinas(int par, String vcod_reg) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarOficinas(?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           OficinasDetalleForm d1 = new OficinasDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);     
        }
        do {
             OficinasDetalleForm d = new OficinasDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCodreg(l_rset.getString(3));
             d.setDescripcion_codreg(l_rset.getString(4));
             d.setCodubi(l_rset.getString(5));
             d.setDescripcion_codubi(l_rset.getString(6));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

public ArrayList listarOficinas2(int par, String vcod_reg, String vcod_ofi) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     if(vcod_ofi != null){
        par=1; 
     } 
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarOficinas2(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.setString(3,vcod_ofi);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           OficinasDetalleForm d1 = new OficinasDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);     
        }
        do {
             OficinasDetalleForm d = new OficinasDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCodreg(l_rset.getString(3));
             d.setDescripcion_codreg(l_rset.getString(4));
             d.setCodubi(l_rset.getString(5));
             d.setDescripcion_codubi(l_rset.getString(6));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

public ArrayList listarOficinas1(String vcod_reg) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarOficinas1(?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        FuncionariosDetalleForm d1 = new FuncionariosDetalleForm();
        d1.setCodigo("0");
        d1.setDescripcion("<--- Seleccionar --->");
        alCam.add(d1);
        do {
             FuncionariosDetalleForm d = new FuncionariosDetalleForm();
             d.setCodofi(l_rset.getString(1));
             d.setDescripcion_codofi(l_rset.getString(2));
             d.setCodreg(l_rset.getString(3));
             d.setDescripcion_codreg(l_rset.getString(4));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarPartidas(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarPartidas }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           PartidasDetalleForm d1 = new PartidasDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);      
        }
        do {
             PartidasDetalleForm d = new PartidasDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarProyectos(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarProyectos }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           ProyectosDetalleForm d1 = new ProyectosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);      
        }
        do {
             ProyectosDetalleForm d = new ProyectosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarProyectos2(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarProyectos2 }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           ProyectosDetalleForm d1 = new ProyectosDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);      
        }
        do {
             ProyectosDetalleForm d = new ProyectosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarRegionales(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarRegionales }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           RegionalesDetalleForm d1 = new RegionalesDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);     
        }
        do {
             RegionalesDetalleForm d = new RegionalesDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setCodfun(l_rset.getString(3));
             d.setCodfun_descripcion(l_rset.getString(4));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarUsuarios(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarUsuarios }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           UsuariosDetalleForm d1 = new UsuariosDetalleForm();
           d1.setCodigo("0");
           d1.setCarnet("<--- Seleccionar --->");
           alCam.add(d1);     
        }
        do {
             UsuariosDetalleForm d = new UsuariosDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setCarnet(l_rset.getString(2));
             d.setCodfun(l_rset.getString(3));
             d.setDesfuncionario(l_rset.getString(4));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }
  public ArrayList listarActivos2(int par, String vact_codfin,  String vact_codreg, String vact_tipdoc, int vact_numero,String vact_codfunorigen,String vact_fecha,String vact_rubcod,int vact_inicod,int vact_fincod) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarActivos2(?,?,?,?,?,?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vact_codfin);
     call.setString(3,vact_codreg);
     call.setString(4,vact_tipdoc);
     call.setInt(5,vact_numero);     
     call.setString(6,vact_codfunorigen);     
     call.setString(7,vact_fecha);
     call.setString(8,vact_rubcod);     
     call.setInt(9,vact_inicod);     
     call.setInt(10,vact_fincod);     
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           Activos2DetalleForm d1 = new Activos2DetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);      
        }
        do {
             Activos2DetalleForm d = new Activos2DetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     else 
     {
        if (par==0){
           Activos2DetalleForm d1 = new Activos2DetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);      
        }       
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarActivos3(String vact_codrub, String vact_codreg, String vact_descripcion, String vact_codgrp, String vact_codfin, int vestado, String vdesgrp) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarActivos3(?,?,?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vact_codrub);
     call.setString(3,vact_codreg);
     call.setString(4,vact_descripcion);
     call.setString(5,vact_codgrp);
     call.setString(6,vact_codfin);
     call.setInt(7,vestado);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        do {
             ActivosDetalleForm d = new ActivosDetalleForm();
             d.setcodrub(l_rset.getString(1));
             d.setcodreg(l_rset.getString(2));
             d.setcodigo(l_rset.getInt(3));
             if (d.getcodigo()<10000)
                d.setCeros("0");
             if (d.getcodigo()<1000)
                d.setCeros("00");
             if (d.getcodigo()<100)
                d.setCeros("000");
             if (d.getcodigo()<10)
                d.setCeros("0000");
             d.setdescripcion(l_rset.getString(4));
             d.setcodgrp(vact_codgrp);
             d.setcodfin(vact_codfin);
             d.setDescodgrp(vdesgrp);
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarActivos4(String vact_codrub, String vact_codreg, String vact_descripcion, String vact_codgrp,  String vact_codfin, int vestado) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     NumberFormat formatter4 = new DecimalFormat("########0.00");
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarActivos4(?,?,?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vact_codrub);
     call.setString(3,vact_codreg);
     call.setString(4,vact_descripcion);
     call.setString(5,vact_codgrp);     
     call.setString(6,vact_codfin);     
     call.setInt(7,vestado);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
         do {     
            ActivosDetalleForm d = new ActivosDetalleForm();
            d.setcodrub(l_rset.getString(1));       
            d.setcodreg(l_rset.getString(2));
            d.setcodigo(l_rset.getInt(3));
            d.setcodgrp(l_rset.getString(4));
            d.setcodpar(l_rset.getString(5));
            d.setcodofi(l_rset.getString(6));
            d.setcodfun(l_rset.getString(7));
            d.setcodubi(l_rset.getString(8));
            d.setcodfin(l_rset.getString(9));
            d.setcodpry(l_rset.getString(10));
            d.setcodmot(l_rset.getString(11));
            d.setfeccompra(l_rset.getString(12));
            d.settipcam(l_rset.getDouble(13));
            d.settipufv(l_rset.getDouble(14));
            d.setumanejo(l_rset.getString(15));
            d.setdescripcion(l_rset.getString(16));
            d.setdesadicional(l_rset.getString(17));
            d.setaccesorios(l_rset.getString(18));
            d.setproveedor(l_rset.getString(19));
            d.setmarca(l_rset.getString(20));
            d.setmodelo(l_rset.getString(21));
            d.setserie1(l_rset.getString(22));
            d.setserie2(l_rset.getString(23));
            d.setdocreferencia(l_rset.getString(24));
            d.setfecreferencia(l_rset.getString(25));
            d.setdocrefotro(l_rset.getString(26));
            d.setplaca(l_rset.getString(27));
            d.setaniofabricacion(l_rset.getString(28));
            d.setcolor(l_rset.getString(29));
            d.setprocedencia(l_rset.getString(30));
            d.setgobmunicipal(l_rset.getString(31));
            d.setvalcobol(formatter4.format(l_rset.getDouble(32)));
            d.setvalcodol(formatter4.format(l_rset.getDouble(33)));
            d.setvalcoufv(formatter4.format(l_rset.getDouble(34)));
            d.setfecbaja(l_rset.getString(35));
            d.setordencompra(l_rset.getString(36));
            d.setnumfactura(l_rset.getString(37));
            d.setnumcomprobante(l_rset.getString(38));
            d.setcodanterior(l_rset.getString(39));
            d.setindetiqueta(l_rset.getString(40));             
            d.setfecha(l_rset.getString(41));             
            d.setvidaut(l_rset.getInt(42));             
            d.setestadoactivo(l_rset.getString(43));             
            d.setDescripcionestado(l_rset.getString(44));             
            d.setdesestado(l_rset.getString(45));             
            d.setindepreciacion(l_rset.getString(46));
            d.setnumdocumento(l_rset.getString(47));
            alCam.add(d);
            c = c+1;
         } while (l_rset.next());         
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }
   
  public ArrayList listarSecbarras(int par, String vcod_reg) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarSecbarras(?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           SecBarrasDetalleForm d1 = new SecBarrasDetalleForm();
           d1.setRubro("0");
           d1.setCodreg("<--- Seleccionar --->");
           alCam.add(d1); 
        }
        do {
             SecBarrasDetalleForm d = new SecBarrasDetalleForm();
             d.setRubro(l_rset.getString(1));
             d.setCodrub_descripcion(l_rset.getString(2));
             d.setFecalta(l_rset.getString(3));
             d.setCodreg(l_rset.getString(4));
             d.setCodreg_descripcion(l_rset.getString(5));
             d.setNumero(l_rset.getInt(6));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarSectiposdoc(int par, String vcod_fin, String vcod_reg) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarSectiposdoc(?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_fin);
     call.setString(3,vcod_reg);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           SecTiposDocDetalleForm d1 = new SecTiposDocDetalleForm();
           d1.setCodreg("0");
           d1.setTipdoc("<--- Seleccionar --->");
           alCam.add(d1); 
        }
        do {
             SecTiposDocDetalleForm d = new SecTiposDocDetalleForm();
             d.setCodfin(l_rset.getString(1));
             d.setCodreg(l_rset.getString(2));
             d.setTipdoc(l_rset.getString(3));
             d.setNumero(l_rset.getInt(4));
             d.setCodreg_descripcion(l_rset.getString(5));
             d.setTipdoc_descripcion(l_rset.getString(6));
             d.setCodfin_descripcion(l_rset.getString(7));
             d.setGestion(l_rset.getString(8));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarTipocambio(int par,int vopcion) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarTipocambio(?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setInt(2,vopcion);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           TipoCambioDetalleForm d1 = new TipoCambioDetalleForm();
           d1.setFecha("0");
           alCam.add(d1);
        }
        do {
             TipoCambioDetalleForm d = new TipoCambioDetalleForm();
             d.setFecha(l_rset.getString(1));
             d.setTipcam(l_rset.getDouble(2));
             d.setTipufv(l_rset.getDouble(3));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarTiposbaja(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarTiposbaja }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           TiposBajaDetalleForm d1 = new TiposBajaDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             TiposBajaDetalleForm d = new TiposBajaDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarActas(int par,int conf, String vcodfin, String vcodreg, String vtipdoc, int vinicio, int vfin, int vopcion, String vconf, String vgestionant) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarActas(?,?,?,?,?,?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setInt(2,conf);
     call.setString(3,vcodfin);
     call.setString(4,vcodreg);
     call.setString(5,vtipdoc);
     call.setInt(6,vinicio);
     call.setInt(7,vfin);     
     call.setInt(8,vopcion);     
     call.setString(9,vconf);
     call.setString(10,vgestionant);     
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           DocumentosDetalleForm d1 = new DocumentosDetalleForm();
           d1.setcodreg("0");
           d1.settipdoc("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             DocumentosDetalleForm d = new DocumentosDetalleForm();
             d.setcodreg(l_rset.getString(1));
             d.settipdoc(l_rset.getString(2));
             d.setnumero(l_rset.getInt(3));
             d.setfecha(l_rset.getString(4));
             d.setcodofiorigen(l_rset.getString(5));
             d.setcodfunorigen(l_rset.getString(6));
             d.setcodofidestino(l_rset.getString(10));
             d.setcodfundestino(l_rset.getString(11));
             d.setobservacion(l_rset.getString(15));
             d.setDescripcion_tipdoc(l_rset.getString(20));
             d.setGlosa(l_rset.getString(21));
             /*d.setNombre_codfunorigen(nombrefuncionario(d.getcodfunorigen()));
             d.setNombre_codfundestino(nombrefuncionario(d.getcodfundestino()));
             d.setNombre_codofiorigen(nombreoficina(d.getcodofiorigen(),d.getcodreg()));
             d.setNombre_codofidestino(nombreoficina(d.getcodofidestino(),d.getcodreg()));
             d.setNombre_carorigen(nombrecargo(d.getcodfunorigen()));
             d.setNombre_cardestino(nombrecargo(d.getcodfundestino()));*/
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }
  
  public ArrayList listarActas2(int par,int conf, String vcodfin, String vcodreg, String vtipdoc, int vinicio, int vfin, int vopcion, String vconf, String vgestionant) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarActas2(?,?,?,?,?,?,?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setInt(2,conf);
     call.setString(3,vcodfin);
     call.setString(4,vcodreg);
     call.setString(5,vtipdoc);
     call.setInt(6,vinicio);
     call.setInt(7,vfin);
     call.setInt(8,vopcion);     
     call.setString(9,vconf);     
     call.setString(10,vgestionant);     
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           DocumentosDetalleForm d1 = new DocumentosDetalleForm();
           d1.setcodreg("0");
           d1.settipdoc("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             DocumentosDetalleForm d = new DocumentosDetalleForm();
             d.setcodreg(l_rset.getString(1));
             d.settipdoc(l_rset.getString(2));
             d.setnumero(l_rset.getInt(3));
             d.setfecha(l_rset.getString(4));
             d.setcodofiorigen(l_rset.getString(5));
             d.setcodfunorigen(l_rset.getString(6));
             d.setcodofidestino(l_rset.getString(10));
             d.setcodfundestino(l_rset.getString(11));
             d.setobservacion(l_rset.getString(15));
             d.setDescripcion_tipdoc(l_rset.getString(20));
             d.setNombre_codfunorigen(l_rset.getString(21));
             d.setNombre_codfundestino(l_rset.getString(22));
             /*d.setNombre_codofiorigen(nombreoficina(d.getcodofiorigen(),d.getcodreg()));
             d.setNombre_codofidestino(nombreoficina(d.getcodofidestino(),d.getcodreg()));
             d.setNombre_carorigen(nombrecargo(d.getcodfunorigen()));
             d.setNombre_cardestino(nombrecargo(d.getcodfundestino()));*/
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public ArrayList listarTiposdoc(int par, int vpar, String vcodfin, String vcodreg) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarTiposdoc(?,?,?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setInt(2,vpar);
     call.setString(3,vcodfin);
     call.setString(4,vcodreg);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           TiposDocDetalleForm d1 = new TiposDocDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             TiposDocDetalleForm d = new TiposDocDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setFeccie(l_rset.getString(3));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public int maximoSecbarras(String vtpo_codrub,String vtpo_codreg) throws SQLException, Exception
  {
    String msg=null;
    int num=0;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.maximoSecbarras(?,?,?) }");
     call.setString(1,vtpo_codrub);
     call.setString(2,vtpo_codreg);
     call.registerOutParameter(3,Types.NUMERIC);
     call.execute();
     num=call.getInt(3);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public int maximoRevaluos(String vtpo_codrub,String vtpo_codreg,int vtpo_codigo,int vtpo_correl ) throws SQLException, Exception
  {
    String msg=null;
    int num=0;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.maximoRevaluos(?,?,?,?,?) }");
     call.setString(1,vtpo_codrub);
     call.setString(2,vtpo_codreg);
     call.setInt(3,vtpo_codigo);
     call.setInt(4,vtpo_correl);     
     call.registerOutParameter(5,Types.NUMERIC);
     call.execute();
     num=call.getInt(5);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String maximaFechaRevaluos(String vtpo_codrub,String vtpo_codreg,int vtpo_codigo,int vtpo_correl,int vtpo_numrel ) throws SQLException, Exception
  {
    String msg=null;
    String fecha=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.maximafecharevaluos(?,?,?,?,?,?) }");
     call.setString(1,vtpo_codrub);
     call.setString(2,vtpo_codreg);
     call.setInt(3,vtpo_codigo);
     call.setInt(4,vtpo_correl);     
     call.setInt(5,vtpo_numrel);     
     call.registerOutParameter(6,Types.VARCHAR);
     call.execute();
     fecha=call.getString(6);
     return fecha;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return fecha;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return fecha;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return fecha;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return fecha;
      }
    }     
  }
  
  public int maximoMejoras(String vtpo_codrub,String vtpo_codreg,int vtpo_codigo) throws SQLException, Exception
  {
    String msg=null;
    int num=0;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.maximoMejoras(?,?,?,?) }");
     call.setString(1,vtpo_codrub);
     call.setString(2,vtpo_codreg);
     call.setInt(3,vtpo_codigo);
     call.registerOutParameter(4,Types.NUMERIC);
     call.execute();
     num=call.getInt(4);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String DescripcionRubro(String vtpo_codrub) throws SQLException, Exception
  {
    String msg=null;
    String desrub=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.descripcionrubro(?,?) }");
     call.setString(1,vtpo_codrub);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     desrub=call.getString(2);
     return desrub;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return desrub;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return desrub;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return desrub;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return desrub;
      }
    }     
  }

  public String PartidaRubro(String vtpo_codrub) throws SQLException, Exception
  {
    String msg=null;
    String desrub=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.partidarubro(?,?) }");
     call.setString(1,vtpo_codrub);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     desrub=call.getString(2);
     return desrub;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return desrub;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return desrub;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return desrub;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return desrub;
      }
    }     
  }

  public int VidaUtilRubro(String vtpo_codrub) throws SQLException, Exception
  {
    String msg=null;
    int vidautrub=0;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.vidautilrubro(?,?) }");
     call.setString(1,vtpo_codrub);
     call.registerOutParameter(2,Types.NUMERIC);
     call.execute();
     vidautrub=call.getInt(2);
     return vidautrub;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return vidautrub;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return vidautrub;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return vidautrub;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return vidautrub;
      }
    }     
  }

  public String DescripcionActivo(String vact_codfin,  String vact_codreg, String vact_tipdoc, int vact_numero,String vact_codfunorigen,String vact_fecha,String vact_rubcod,int vact_codigo) throws SQLException, Exception
  {
    String msg=null;
    String desact=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.descripcionactivo(?,?,?,?,?,?,?,?,?)}");
     call.setString(1,vact_codfin);
     call.setString(2,vact_codreg);
     call.setString(3,vact_tipdoc);
     call.setInt(4,vact_numero);     
     call.setString(5,vact_codfunorigen);     
     call.setString(6,vact_fecha);
     call.setString(7,vact_rubcod);     
     call.setInt(8,vact_codigo);     
     call.registerOutParameter(9,Types.VARCHAR);
     call.execute();
     desact=call.getString(9);
     return desact;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return desact;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return desact;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return desact;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return desact;
      }
    }     
  }
  
  public String DescripcionPartida(String vtpo_codrub) throws SQLException, Exception
  {
    String msg=null;
    String despar=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.descripcionpartida(?,?) }");
     call.setString(1,vtpo_codrub);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     despar=call.getString(2);
     return despar;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return despar;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return despar;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return despar;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return despar;
      }
    }     
  }

  public String DescripcionRegional(String vtpo_codreg) throws SQLException, Exception
  {
    String msg=null;
    String desreg=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.descripcionregional(?,?) }");
     call.setString(1,vtpo_codreg);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     desreg=call.getString(2);
     return desreg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return desreg;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return desreg;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return desreg;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return desreg;
      }
    }     
  }

  public String DescripcionFinanciador(String vtpo_codfin) throws SQLException, Exception
  {
    String msg=null;
    String desfin=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.descripcionfinanciador(?,?) }");
     call.setString(1,vtpo_codfin);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     desfin=call.getString(2);
     return desfin;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return desfin;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return desfin;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return desfin;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return desfin;
      }
    }     
  }

  public int maximoTiposdoc(String vtpo_codfin, String vtpo_codreg,String vtpo_tipdoc) throws SQLException, Exception
  {
    String msg=null;
    int num=0;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.maximoTiposdoc(?,?,?,?) }");
     call.setString(1,vtpo_codfin);
     call.setString(2,vtpo_codreg);
     call.setString(3,vtpo_tipdoc);
     call.registerOutParameter(4,Types.NUMERIC);
     call.execute();
     num=call.getInt(4);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String FeccierreTiposdoc(String vtpo_tipdoc) throws SQLException, Exception
  {
    String msg=null;
    String num=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.feccierreTiposdoc(?,?) }");
     call.setString(1,vtpo_tipdoc);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     num=call.getString(2);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String nombrecargo(String vdoc_codfun) throws SQLException, Exception
  {
    String msg=null;
    String num=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.nombrecargo(?,?) }");
     call.setString(1,vdoc_codfun);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     num=call.getString(2);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String nombrefuncionario(String vdoc_codfun) throws SQLException, Exception
  {
    String msg=null;
    String num=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.nombrefuncionario(?,?) }");
     call.setString(1,vdoc_codfun);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     num=call.getString(2);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String nombreoficina(String vdoc_codofi, String vcodreg) throws SQLException, Exception
  {
    String msg=null;
    String num=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.nombreoficina(?,?,?) }");
     call.setString(1,vdoc_codofi);
     call.setString(2,vcodreg);     
     call.registerOutParameter(3,Types.VARCHAR);
     call.execute();
     num=call.getString(3);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String nombregrupo(String vcodrub, String vcodgrp) throws SQLException, Exception
  {
    String msg=null;
    String num=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.nombregrupo(?,?,?) }");
     call.setString(1,vcodrub);     
     call.setString(2,vcodgrp);     
     call.registerOutParameter(3,Types.VARCHAR);
     call.execute();
     num=call.getString(3);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String nombreubicacion(String vcodreg, String vcodubi) throws SQLException, Exception
  {
    String msg=null;
    String num=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.nombreubicacion(?,?,?) }");
     call.setString(1,vcodreg);
     call.setString(2,vcodubi);
     call.registerOutParameter(3,Types.VARCHAR);
     call.execute();
     num=call.getString(3);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String nombreproyecto(String vcodpry) throws SQLException, Exception
  {
    String msg=null;
    String num=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.nombreproyecto(?,?) }");
     call.setString(1,vcodpry);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     num=call.getString(2);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String nombrefinanciador(String vcodfin) throws SQLException, Exception
  {
    String msg=null;
    String num=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.nombrefinanciador(?,?) }");
     call.setString(1,vcodfin);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     num=call.getString(2);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String nombretipobaja(String vcodmot) throws SQLException, Exception
  {
    String msg=null;
    String num=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.nombretipobaja(?,?) }");
     call.setString(1,vcodmot);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     num=call.getString(2);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public int maximoDetDocumentos(String vtpo_codfin, String vtpo_codreg,String vtpo_tipdoc, int vtpo_numero) throws SQLException, Exception
  {
    String msg=null;
    int num=0;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.maximodetdocumentos(?,?,?,?,?) }");
     call.setString(1,vtpo_codfin);
     call.setString(2,vtpo_codreg);
     call.setString(3,vtpo_tipdoc);
     call.setInt(4,vtpo_numero);     
     call.registerOutParameter(5,Types.NUMERIC);
     call.execute();
     num=call.getInt(5);
     return num;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return num;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return num;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return num;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return num;
      }
    }     
  }

  public String FuncionarioActivos(String vtpo_codreg, String vtpo_codfin) throws SQLException, Exception
  {
    String msg=null;
    String codfun=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.funcionarioactivos(?,?,?) }");
     call.setString(1,vtpo_codreg);
     call.setString(2,vtpo_codfin);
     call.registerOutParameter(3,Types.VARCHAR);
     call.execute();
     codfun=call.getString(3);
     return codfun;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return codfun;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return codfun;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return codfun;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return codfun;
      }
    }     
  }
  
  public String OficinaFuncionarioActivos(String vtpo_codfun) throws SQLException, Exception
  {
    String msg=null;
    String codofi=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{call pg_activos.oficinafuncionarioactivos(?,?) }");
     call.setString(1,vtpo_codfun);
     call.registerOutParameter(2,Types.VARCHAR);
     call.execute();
     codofi=call.getString(2);
     return codofi;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return codofi;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return codofi;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return codofi;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return codofi;
      }
    }     
  }

  public ArrayList listarUbicaciones(int par, String vcod_reg) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarUbicaciones(?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcod_reg);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           UbicacionesDetalleForm d1 = new UbicacionesDetalleForm();
           d1.setCodigo("0");
           d1.setDescripcion("<--- Seleccionar --->");
           alCam.add(d1);
        }
        do {
             UbicacionesDetalleForm d = new UbicacionesDetalleForm();
             d.setCodigo(l_rset.getString(1));
             d.setDescripcion(l_rset.getString(2));
             d.setDireccion(l_rset.getString(3));
             d.setCodreg(l_rset.getString(4));
             d.setDescripcion_codreg(l_rset.getString(5));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public String depreciaciontotal(String vdpr_fecha, String vdpr_usuario, int vestado, String vdpr_codrub, 
  String vdpr_codreg, String vdpr_codini, String vdpr_codfin) throws SQLException, Exception
  {
    String msg=null;
    int can ;
    ArrayList alCam = new ArrayList();
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.depreciaciontotal (?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vdpr_fecha);
      call.setString(2,vdpr_usuario);
      call.setInt(3,vestado);
      call.setString(4,vdpr_codrub);
      call.setString(5,vdpr_codreg);
      call.setString(6,vdpr_codini);
      call.setString(7,vdpr_codfin);
      call.registerOutParameter(8,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(9,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      can=call.getInt(8);
      msg=call.getString(9);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }     
  }

  public ParametrosForm listarParametros() throws SQLException, Exception
  {
    String msg=null;
    ParametrosForm alCam = new ParametrosForm();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarparametros }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     if( !(l_rset == null || !l_rset.next()) )
     {
         alCam.setCte_codinstitucion(l_rset.getString(1));
         alCam.setCte_codrubaccesorios(l_rset.getString(2));
         alCam.setCte_codrubmejoras(l_rset.getString(3));
         alCam.setCte_codrubrebajas(l_rset.getString(4));
         alCam.setCte_codrub1(l_rset.getString(5));
         alCam.setCte_codrub1(l_rset.getString(5));
         alCam.setCte_codrub2(l_rset.getString(6));
         alCam.setCte_codrub3(l_rset.getString(7));
         alCam.setCte_codrub4(l_rset.getString(8));
         alCam.setCte_codrub5(l_rset.getString(9));
         alCam.setCte_codrub6(l_rset.getString(10));
         alCam.setCte_tipdocentrega(l_rset.getString(11));
         alCam.setCte_tipdocdevolucion(l_rset.getString(12));
         alCam.setCte_tipdoctransferencia(l_rset.getString(13));
         alCam.setCte_tipdocbaja(l_rset.getString(14));
         alCam.setCte_tipdoctraregionales(l_rset.getString(15));
         alCam.setCte_gestion(l_rset.getString(16));
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

public String Gestion() throws SQLException, Exception
  {
    String msg=null;
    String gestion=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.gestion }");
     call.registerOutParameter(1,Types.VARCHAR);
     call.execute();
     gestion=call.getString(1);
     return gestion;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return gestion;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return gestion;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return gestion;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return gestion;
      }
    }     
  }

public String Gestiond() throws SQLException, Exception
  {
    String msg=null;
    String gestiond=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.gestiond }");
     call.registerOutParameter(1,Types.VARCHAR);
     call.execute();
     gestiond=call.getString(1);
     return gestiond;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return gestiond;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return gestiond;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return gestiond;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return gestiond;
      }
    }     
  }
  
public String Obtener_correo(String vcod_fun) throws SQLException, Exception
  {
    String msg=null;
    String correo=null;
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.obtener_correo(?) }");
     call.registerOutParameter(1,Types.VARCHAR);
     call.setString(2,vcod_fun);
     call.execute();
     correo=call.getString(1);
     return correo;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return correo;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return correo;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return correo;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return correo;
      }
    }     
  }
  
  public MesAnioDetalleForm listarMesAnio() throws SQLException, Exception
  {
    String msg=null;
    MesAnioDetalleForm d = new MesAnioDetalleForm();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.mesgestion }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        do {
             d.setAnio(l_rset.getString(1));
             d.setMes(l_rset.getString(2));
             c = c+1;
         } while (l_rset.next());
     }
     return d;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return d;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return d;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return d;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return d;
      }
    }     
  }
  
  public ArrayList listarInventarios(String vcodreg,int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarInventarios(?) }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.setString(2,vcodreg);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           InventariosDetalleForm d1 = new InventariosDetalleForm();
           d1.setCodbarra("0");
           d1.setFecha("<--- Seleccionar --->");
           alCam.add(d1);      
        }
        do {
             InventariosDetalleForm d = new InventariosDetalleForm();
             d.setCodbarra(l_rset.getString(1));
             d.setFecha(l_rset.getString(2));
             d.setCodofi(l_rset.getString(3));
             d.setCodfun(l_rset.getString(4));
             d.setCodubi(l_rset.getString(5));
             d.setCodfin(l_rset.getString(6));
             d.setCodpry(l_rset.getString(7));
             d.setCodreg(l_rset.getString(8));
             d.setEstado(l_rset.getString(9));
             d.setMod(l_rset.getString(10));
             d.setCodbarrad(l_rset.getString(11));
             d.setCodofides(l_rset.getString(12));
             d.setCodfundes(l_rset.getString(13));
             d.setCodfindes(l_rset.getString(14));
             d.setCodprydes(l_rset.getString(15));
             d.setCodregdes(l_rset.getString(16));
             d.setEstadodes(l_rset.getString(17));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }

  public String insertarinventarios( 
  String vinv_codbarra, 
  String vinv_fecha, 
  String vinv_codofi, 
  String vinv_codfun, 
  String vinv_codubi, 
  String vinv_codfin, 
  String vinv_codpry, 
  String vinv_codreg, 
  String vinv_estado,
  String vinv_usuario, 
  String vinv_mod,
  int vestado ) 
  throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarinventarios (?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vinv_codbarra);
      call.setString(2,vinv_fecha);
      call.setString(3,vinv_codofi);
      call.setString(4,vinv_codfun);
      call.setString(5,vinv_codubi);
      call.setString(6,vinv_codfin);
      call.setString(7,vinv_codpry);
      call.setString(8,vinv_codreg);
      call.setString(9,vinv_estado);
      call.setString(10,vinv_usuario);
      call.setInt(11,vestado);
      call.setString(12,vinv_mod);
      call.registerOutParameter(13,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(14,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      can=call.getInt(13);
      msg=call.getString(14);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public String generarinventarios(String vcodreg,String vcodfin,String vusuario,String vtipoacta) 
  throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.generarinventarios (?,?,?,?,?,?)}");
      call.setString(1,vcodreg);
      call.setString(2,vcodfin);
      call.setString(3,vusuario); 
      call.setString(4,vtipoacta);
      call.registerOutParameter(5,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(6,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      can=call.getInt(5);
      msg=call.getString(6);
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  
  
  public String insertarParametros( 
  String vcte_codinstitucion, 
  String vcte_codrubaccesorios, 
  String vcte_codrubmejoras, 
  String vcte_codrubrebajas, 
  String vcte_codrub1, 
  String vcte_codrub2, 
  String vcte_codrub3, 
  String vcte_codrub4, 
  String vcte_codrub5, 
  String vcte_codrub6, 
  String vcte_tipdocentrega, 
  String vcte_tipdocdevolucion, 
  String vcte_tipdoctransferencia,
  String vcte_tipdocbaja, 
  String vcte_tipdoctraregionales,
  String vcte_gestion, 
  int vestado 
  ) throws SQLException, Exception
  { 
    String msg=null;
    int can ;    
    try
    {
      l_connection = this.getConexion();
      l_stmt = l_connection.createStatement();
      ResultSet l_rset = null; 
      CallableStatement call = null;
      // graba configuracion tabla              
      call = l_connection.prepareCall("{call pg_activos.insertarparametros (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
      call.setString(1,vcte_codinstitucion);
      call.setString(2,vcte_codrubaccesorios);
      call.setString(3,vcte_codrubmejoras);
      call.setString(4,vcte_codrubrebajas);
      call.setString(5,vcte_codrub1);
      call.setString(6,vcte_codrub2);
      call.setString(7,vcte_codrub3);
      call.setString(8,vcte_codrub4);
      call.setString(9,vcte_codrub5);
      call.setString(10,vcte_codrub6);
      call.setString(11,vcte_tipdocentrega);
      call.setString(12,vcte_tipdocdevolucion);
      call.setString(13,vcte_tipdoctransferencia);
      call.setString(14,vcte_tipdocbaja);
      call.setString(15,vcte_tipdoctraregionales);
      call.setString(16,vcte_gestion);
      call.setInt(17,vestado);
      call.registerOutParameter(18,Types.NUMERIC);  // devuelve un entero
      call.registerOutParameter(19,Types.VARCHAR);  // devuelve una cadena

      call.execute();
      msg=call.getString(19);
      can=call.getInt(18);
      
      return msg;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return StrSql;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return StrSql;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return StrSql;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return StrSql;
      }
    }
  }  

  public ArrayList listarParametros(int par) throws SQLException, Exception
  {
    String msg=null;
    ArrayList alCam = new ArrayList();
    try
    {
     l_connection = this.getConexion();
     l_stmt = l_connection.createStatement();    
     ResultSet l_rset = null;
     CallableStatement call = null;
     call = l_connection.prepareCall("{? = call pg_activos.listarParametros }");
     call.registerOutParameter(1, OracleTypes.CURSOR);
     call.execute();
     l_rset = (ResultSet) call.getObject(1);
     int c = 0;
     if( !(l_rset == null || !l_rset.next()) )
     {
        if (par==0){
           ParametrosDetalleForm d1 = new ParametrosDetalleForm();
           d1.setcodinstitucion("0");
           d1.setcodrubaccesorios("<--- Seleccionar --->");
           alCam.add(d1);      
        }
        do {
             ParametrosDetalleForm d = new ParametrosDetalleForm();
             d.setcodinstitucion(l_rset.getString(1));
             d.setcodrubaccesorios(l_rset.getString(2));
             d.setcodrubmejoras(l_rset.getString(3));
             d.setcodrubrebajas(l_rset.getString(4));
             d.setcodrub1(l_rset.getString(5));
             d.setcodrub2(l_rset.getString(6));
             d.setcodrub3(l_rset.getString(7));
             d.setcodrub4(l_rset.getString(8));
             d.setcodrub5(l_rset.getString(9));
             d.setcodrub6(l_rset.getString(10));
             d.setTipdocentrega(l_rset.getString(11));
             d.setTipdocdevolucion(l_rset.getString(12));
             d.setTipdoctransferencia(l_rset.getString(13));
             d.setTipdocbaja(l_rset.getString(14));
             d.setTipdoctraregionales(l_rset.getString(15));
             d.setGestion(l_rset.getString(16));
             alCam.add(d);
             c = c+1;
         } while (l_rset.next());
     }
     return alCam;
    }
    catch ( SQLException e )
    { 
      StrSql = "La Consulta no se ejecuto correctamente " + e.getMessage();
      return alCam;
    }
    catch( NamingException e )
    { 
      StrSql = "No se puede conectar con el Pool de la Base de Datos " + e.getMessage();
      return alCam;
    }
    catch( Exception e )
    { 
      StrSql = e.getMessage();
      return alCam;
    }
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if( m_connectionPool != null )
          m_connectionPool.close(); // close the pooled connection
        if( l_stmt != null )
          l_stmt.close();
      }
      catch (Exception e)
      {
        StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return alCam;
      }
    }     
  }
  
}
