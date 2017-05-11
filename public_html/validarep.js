  var sesion=0
  var dele0 = new Array()
  var valo0 = new Array()

  function ftarget()
  {
     f = document.forms[0];
     f.target='_blank';
  }

  function cargar_anios() {
      document.ReportesForm.condicion10.value=document.ReportesForm.condicion5.value.substr(6,4);
      document.ReportesForm.condicion11.value=Number(document.ReportesForm.condicion5.value.substr(6,4))-1;
  }
  //"
  function cargar() {
     if ((document.ReportesForm.opcion.value==3)||(document.ReportesForm.opcion.value==5))
       {
        for	(var i=0; i < document.ReportesForm.condicion2.options.length; i++) {
           valo0[i]=document.ReportesForm.condicion2.options[i].value
           dele0[i]=document.ReportesForm.condicion2.options[i].text
        }
     }
  }
  function quitar()
  {
     
     var j=0
     var k=0
     var t=0
     dele = new Array()
     valo = new Array()

     for 	(var i=0; i < document.ReportesForm.condicion1.options.length; i++) {
        if (document.ReportesForm.condicion1.options[i].selected==true) {
           k=i
        }
     }

     if (sesion==0) {
        m=0
        for 	(var i=1; i < document.ReportesForm.condicion2.options.length; i++) {
           valor=document.ReportesForm.condicion2.options[i].text
           if (valor.substr(0,valor.indexOf("-"))==document.ReportesForm.condicion1.options[k].text) {       
              valor=document.ReportesForm.condicion2.options[i].text
              valor=valor
              dele[m]=valor.substr(valor.indexOf("-")+1)
              valo[m]=document.ReportesForm.condicion2.options[i].value
              m=m+1   
           }
        }
        sesion=sesion+1
     }
     else {
        m=0
        for 	(var i=1; i < valo0.length; i++) {
           valor=dele0[i]
           if (valor.substr(0,valor.indexOf("-"))==document.ReportesForm.condicion1.options[k].text) {       
              valor=dele0[i]
              valor=valor
              dele[m]=valor.substr(valor.indexOf("-")+1)
              valo[m]=valo0[i]
              m=m+1   
           }
        }
     }

     lon=document.ReportesForm.condicion2.options.length
     for 	(var i=1; i < lon; i++) {
        document.ReportesForm.condicion2.options[0]=null           
     }
     document.ReportesForm.condicion2.options[0]=null
     n=0
     for 	(var i=0; i < m; i++) {
        valor="var option0 = new Option(dele[i], valo[i])"
        eval(valor)
        eval("document.ReportesForm.condicion2.options[n]=option0") 
        n=++n
     }     
  }
