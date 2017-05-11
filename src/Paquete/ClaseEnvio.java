package Paquete;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.PooledConnection;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;


import java.sql.DriverManager;
public class ClaseEnvio 
{
  PooledConnection m_connectionPool;
  Connection Con = null;
  Statement ConScript = null;
  ResultSet fp = null;
  String StrSql = "";

  public ClaseEnvio()
  {
  }

  private void getConexion() throws SQLException, NamingException
  {
    /*
    InitialContext ic = new InitialContext();
    OracleConnectionPoolDataSource pd = (OracleConnectionPoolDataSource) ic.lookup("jdbc/usuario");
    m_connectionPool = pd.getPooledConnection();
    ConScript = Con.createStatement();

    /*Connection conexion;*/

    DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
      // Connect to the database
      Con = DriverManager.getConnection
        ("jdbc:oracle:thin:@172.16.0.25:1521:asy5_db","usuario","tico");
        //("jdbc:oracle:thin:@172.16.0.20:1521:apps","ws_usuarios","ws101");
      ConScript = Con.createStatement ();
  }

  public ClaseUsuario pListaOpciones( String Usuario, String Clave, String Sistema )
  {
    try
    {
      //StrSql = "select a.*, rownum from usuarios.ws_accesousuario a " + "where a.usucodusu = '" + Usuario + "' and a.usuclausu = '" + Clave +  "' and a.siscodsis = '" + Sistema + "' ORDER BY ROWNUM DESC";
      StrSql = "select a.*, rownum from ws_accesousuario a where a.usucodusu = '" + Usuario + "' and a.usuclausu = '" + Clave +  "' and a.siscodsis = '" + Sistema + "' ORDER BY ROWNUM DESC";

      System.out.println( StrSql );
      this.getConexion();
      fp = ConScript.executeQuery( StrSql );
      if ( fp == null || !fp.next() )
      {
        System.out.println( "no tiene datos" );
        return null;
      }
      else
      {
        int i = fp.getInt( 14 );
        ClaseUsuario fUsuario = new ClaseUsuario();
        fUsuario.setLopcion( i );

        fUsuario.setAduana( fp.getString( 6 )  );
        fUsuario.setAux( fp.getString( 7 ) );
        fUsuario.setNit( fp.getString( 5 ) );
        fUsuario.setPerfil( fp.getString( 8 ) );
        fUsuario.setSistema( fp.getString( 9 ) );
        fUsuario.setUsuario( fp.getString( 4 ) );
        do
        {
          ClaseOpcion fu = new ClaseOpcion( fp.getString( 10 ), fp.getString( 11 ),
            fp.getString( 12 ), fp.getString( 13 ) );
          fUsuario.setLopcion( fu, --i );
        }
        while ( fp.next() );
        fp.close();
        fp = null;

        System.out.print("Finalizo el proceso pListaOpciones " + fUsuario.getLopcion().length);

        return fUsuario;
      }
    }
    catch( NamingException e )
    {
      e.printStackTrace();
      System.out.println( e.toString() );
    }
    catch( SQLException e )
    {
      e.printStackTrace();
      System.out.println( e.toString() );
    }
    catch( Exception e )
    {
      e.printStackTrace();
      System.out.println( e.toString() );
    }
    finally
    {
      try
      {
        if( ConScript != null )
          ConScript.close();
        if( Con != null )
          Con.close();
        if( m_connectionPool != null )
          m_connectionPool.close();
      }
      catch ( Exception e )
      {
        e.printStackTrace();
        System.out.println( e.toString() );
      }
    }
    return null;
  }
  
  public int pCambiaClave( String Usuario, String OldClave, String NewClave )
  {
    try
    {
      this.getConexion();
      StrSql = "update usuario set usuclausu = '" + NewClave + "' where usucodusu = '" + Usuario + "' and usuclausu = '" + OldClave + "' AND usu_num = 0";
      //StrSql = "update usuarios.usuario a set a.usuclausu = '" + NewClave + "' where a.usucodusu = '" + Usuario + "' and a.usuclausu = '" + OldClave + "'";
      int i = ConScript.executeUpdate( StrSql );
      return i;
    }
    catch( NamingException e )
    {
      e.printStackTrace();
      return -1;
    }
    catch( SQLException e )
    {
      e.printStackTrace();
      return -2;
    }
    finally
    {
      try
      {
        if( ConScript != null )
          ConScript.close();
        if( Con != null )
          Con.close();
        if( m_connectionPool != null )
          m_connectionPool.close();
      }
      catch ( Exception e )
      {
        e.printStackTrace();;
      }
    }
  }

  public static void main(String[] args)
  {
    ClaseEnvio class1 = new ClaseEnvio();

    ClaseUsuario fu = null;
    fu = class1.pListaOpciones( "RALBARRACIN", "1104", "SIVETUR" );

    for( int i = 0; i<fu.getLopcion().length; i++)
      {
        System.out.println( fu.getLopcion( i ).getCodopc() + ' ' +
          fu.getLopcion( i ).getDesc() + ' ' + fu.getLopcion( i ).getCodant() +
          ' ' + fu.getLopcion( i ).getAccion() );
      }
      
    class1.pCambiaClave( "RALBARRAICN", "1104", "BETO" );
  }
}