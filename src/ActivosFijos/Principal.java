package ActivosFijos;

import System.*;
                      
 public class Principal
 { 
  public static void Main()
  {
   GenExcell ge = new GenExcell();
   ge.DoExcell("nuevo_file.html");
   ge.DoExcell("nuevo_file.xls");
  }
 }  
  
  class GenExcell  
 {
   StreamWriter w;
 

   public int DoExcell(string ruta)
   {
     FileStream fs = new FileStream(ruta, FileMode.Create, 
                                          FileAccess.ReadWrite);
     w = new StreamWriter(fs);    
     EscribeCabecera();          
                      
     for (int i=0;i<20;i++)
     {
       EscribeLinea(i);  
     }   
   
     EscribePiePagina();                             
     w.Close(); 
     return 0;
  }  
  
  public void EscribeCabecera()
  {
   StringBuilder html = new StringBuilder(); 
   html.Append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD  HTML 4.0 Transitional//EN\">");
   html.Append("<html>");
   html.Append("  <head>");
   html.Append("<title>www.devjoker.com</title>");
   html.Append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");
   html.Append("  </head>");
   html.Append("<body>");
   html.Append("<p>");
   html.Append("<table>");
   html.Append("<tr style=\"font-weight: bold;font-size: 12px;color: white;\">");
   html.Append("<td></td><td bgcolor=\"Blue\">Titulo de la tabla:</td>");
   html.Append("<td bgcolor=\"Blue\">Iteracion/td>");
   html.Append("</tr>");
      
   w.Write(html.ToString());
  }
  
  public void EscribeLinea( int i)
  {   
   string bgColor = "", fontColor = "";
   if (i % 2 ==  0)
   {
    bgColor   = " bgcolor=\"LightBlue\" ";
    fontColor = " style=\"font-size: 10px;color: white;\" ";
   }
   w.Write("<tr ><td ></td><td {2} {3}>Titulo de la celda:{0}</td><td {2} {3}>Valor de la celda: {1}</td></tr>",i.ToString(),i.ToString(), bgColor, fontColor);
  }
  
  public void EscribePiePagina()
  {
   StringBuilder html = new StringBuilder();       
   html.Append("  </table>");
   html.Append("</p>");
   html.Append(" </body>");
   html.Append("</html>");
   w.Write(html.ToString());
  }
  
 } 