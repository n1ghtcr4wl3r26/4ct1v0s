<!-- Original:  Richard Gorremans (RichardG@spiritwolfx.com) -->
<!-- Web Site:  http://www.spiritwolfx.com -->

<!-- This script and many more are available free online at -->
<!-- The JavaScript Source!! http://javascript.internet.com -->

<!-- Begin
// Check browser version
var isNav4 = false, isNav5 = false, isIE4 = false
var strSeperator = "/"; 
// If you are using any Java validation on the back side you will want to use the / because 
// Java date validations do not recognize the dash as a valid date separator.
var vDateType = 3; // Global value for type of date format
//                1 = mm/dd/yyyy
//                2 = yyyy/dd/mm  (Unable to do date check at this time)
//                3 = dd/mm/yyyy
var vYearType = 4; //Set to 2 or 4 for number of digits in the year for Netscape
var vYearLength = 2; // Set to 4 if you want to force the user to enter 4 digits for the year before validating.
var err = 0; // Set the error code to a default of zero
if(navigator.appName == "Netscape") {
if (navigator.appVersion < "5") {
isNav4 = true;
isNav5 = false;
}
else
if (navigator.appVersion > "4") {
isNav4 = false;
isNav5 = true;
   }
}
else {
isIE4 = true;
}
function DateFormat(vDateName, vDateValue, e, dateCheck, dateType) {
vDateType = dateType;
// vDateName = object name
// vDateValue = value in the field being checked
// e = event
// dateCheck 
// True  = Verify that the vDateValue is a valid date
// False = Format values being entered into vDateValue only
// vDateType
// 1 = mm/dd/yyyy
// 2 = yyyy/mm/dd
// 3 = dd/mm/yyyy
//Enter a tilde sign for the first number and you can check the variable information.
if (vDateValue == "~") {
alert("AppVersion = "+navigator.appVersion+" \nNav. 4 Version = "+isNav4+" \nNav. 5 Version = "+isNav5+" \nIE Version = "+isIE4+" \nYear Type = "+vYearType+" \nDate Type = "+vDateType+" \nSeparator = "+strSeperator);
vDateName.value = "";
vDateName.focus();
return true;
}
var whichCode = (window.Event) ? e.which : e.keyCode;
// Check to see if a seperator is already present.
// bypass the date if a seperator is present and the length greater than 8
if (vDateValue.length > 8 && isNav4) {
if ((vDateValue.indexOf("-") >= 1) || (vDateValue.indexOf("/") >= 1))
return true;
}
//Eliminate all the ASCII codes that are not valid
var alphaCheck = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ/-";
if (alphaCheck.indexOf(vDateValue) >= 1) {
if (isNav4) {
vDateName.value = "";
vDateName.focus();
vDateName.select();
return false;
}
else {
vDateName.value = vDateName.value.substr(0, (vDateValue.length-1));
return false;
   }
}
if (whichCode == 8) //Ignore the Netscape value for backspace. IE has no value
return false;
else {
//Create numeric string values for 0123456789/
//The codes provided include both keyboard and keypad values
var strCheck = '13,47,48,49,50,51,52,53,54,55,56,57,58,59,95,96,97,98,99,100,101,102,103,104,105';
if (strCheck.indexOf(whichCode) != -1) {
if (isNav4) {
if (((vDateValue.length < 6 && dateCheck) || (vDateValue.length == 7 && dateCheck)) && (vDateValue.length >=1)) {
alert("Fecha Invalida");
vDateName.value = "";
vDateName.focus();
vDateName.select();
return false;
}
if (vDateValue.length == 6 && dateCheck) {
var mDay = vDateName.value.substr(2,2);
var mMonth = vDateName.value.substr(0,2);
var mYear = vDateName.value.substr(4,4)
//Turn a two digit year into a 4 digit year
if (mYear.length == 2 && vYearType == 4) {
var mToday = new Date();
//If the year is greater than 30 years from now use 19, otherwise use 20
var checkYear = mToday.getFullYear() + 30; 
var mCheckYear = '20' + mYear;
if (mCheckYear >= checkYear)
mYear = '19' + mYear;
else
mYear = '20' + mYear;
}
var vDateValueCheck = mMonth+strSeperator+mDay+strSeperator+mYear;
if (!dateValid(vDateValueCheck)) {
alert("Fecha Invalida");
vDateName.value = "";
vDateName.focus();
vDateName.select();
return false;
}
return true;
}
else {
// Reformat the date for validation and set date type to a 1
if (vDateValue.length >= 8  && dateCheck) {
if (vDateType == 1) // mmddyyyy
{
var mDay = vDateName.value.substr(2,2);
var mMonth = vDateName.value.substr(0,2);
var mYear = vDateName.value.substr(4,4)
vDateName.value = mMonth+strSeperator+mDay+strSeperator+mYear;
}
if (vDateType == 2) // yyyymmdd
{
var mYear = vDateName.value.substr(0,4)
var mMonth = vDateName.value.substr(4,2);
var mDay = vDateName.value.substr(6,2);
vDateName.value = mYear+strSeperator+mMonth+strSeperator+mDay;
}
if (vDateType == 3) // ddmmyyyy
{
var mMonth = vDateName.value.substr(2,2);
var mDay = vDateName.value.substr(0,2);
var mYear = vDateName.value.substr(4,4)
vDateName.value = mDay+strSeperator+mMonth+strSeperator+mYear;
}
//Create a temporary variable for storing the DateType and change
//the DateType to a 1 for validation.
var vDateTypeTemp = vDateType;
vDateType = 1;
var vDateValueCheck = mMonth+strSeperator+mDay+strSeperator+mYear;
if (!dateValid(vDateValueCheck)) {
alert("Fecha Invalida");
vDateType = vDateTypeTemp;
vDateName.value = "";
vDateName.focus();
vDateName.select();
return false;
}
vDateType = vDateTypeTemp;
return true;
}
else {
if (((vDateValue.length < 8 && dateCheck) || (vDateValue.length == 9 && dateCheck)) && (vDateValue.length >=1)) {
alert("Fecha Invalida");
vDateName.value = "";
vDateName.focus();
vDateName.select();
return false;
         }
      }
   }
}
else {
// Non isNav Check
if (((vDateValue.length < 8 && dateCheck) || (vDateValue.length == 9 && dateCheck)) && (vDateValue.length >=1)) {
alert("Fecha Invalida");
vDateName.value = "";
vDateName.focus();
return true;
}
// Reformat date to format that can be validated. mm/dd/yyyy
if (vDateValue.length >= 8 && dateCheck) {
// Additional date formats can be entered here and parsed out to
// a valid date format that the validation routine will recognize.
if (vDateType == 1) // mm/dd/yyyy
{
var mMonth = vDateName.value.substr(0,2);
var mDay = vDateName.value.substr(3,2);
var mYear = vDateName.value.substr(6,4)
}
if (vDateType == 2) // yyyy/mm/dd
{
var mYear = vDateName.value.substr(0,4)
var mMonth = vDateName.value.substr(5,2);
var mDay = vDateName.value.substr(8,2);
}
if (vDateType == 3) // dd/mm/yyyy
{
var mDay = vDateName.value.substr(0,2);
var mMonth = vDateName.value.substr(3,2);
var mYear = vDateName.value.substr(6,4)
}
if (vYearLength == 4) {
if (mYear.length < 4) {
alert("Fecha Invalida");
vDateName.value = "";
vDateName.focus();
return true;
   }
}
// Create temp. variable for storing the current vDateType
var vDateTypeTemp = vDateType;
// Change vDateType to a 1 for standard date format for validation
// Type will be changed back when validation is completed.
vDateType = 1;
// Store reformatted date to new variable for validation.
var vDateValueCheck = mMonth+strSeperator+mDay+strSeperator+mYear;
if (mYear.length == 2 && vYearType == 4 && dateCheck) {
//Turn a two digit year into a 4 digit year
var mToday = new Date();
//If the year is greater than 30 years from now use 19, otherwise use 20
var checkYear = mToday.getFullYear() + 30; 
var mCheckYear = '20' + mYear;
if (mCheckYear >= checkYear)
mYear = '19' + mYear;
else
mYear = '20' + mYear;
vDateValueCheck = mMonth+strSeperator+mDay+strSeperator+mYear;
// Store the new value back to the field.  This function will
// not work with date type of 2 since the year is entered first.
if (vDateTypeTemp == 1) // mm/dd/yyyy
vDateName.value = mMonth+strSeperator+mDay+strSeperator+mYear;
if (vDateTypeTemp == 3) // dd/mm/yyyy
vDateName.value = mDay+strSeperator+mMonth+strSeperator+mYear;
} 
if (!dateValid(vDateValueCheck)) {
alert("Fecha Invalida");
vDateType = vDateTypeTemp;
vDateName.value = "";
vDateName.focus();
return true;
}
vDateType = vDateTypeTemp;
return true;
}
else {
if (vDateType == 1) {
if (vDateValue.length == 2) {
vDateName.value = vDateValue+strSeperator;
}
if (vDateValue.length == 5) {
vDateName.value = vDateValue+strSeperator;
   }
}
if (vDateType == 2) {
if (vDateValue.length == 4) {
vDateName.value = vDateValue+strSeperator;
}
if (vDateValue.length == 7) {
vDateName.value = vDateValue+strSeperator;
   }
} 
if (vDateType == 3) {
if (vDateValue.length == 2) {
vDateName.value = vDateValue+strSeperator;
}
if (vDateValue.length == 5) {
vDateName.value = vDateValue+strSeperator;
   }
}
return true;
   }
}
if (vDateValue.length == 10&& dateCheck) {
if (!dateValid(vDateName)) {
// Un-comment the next line of code for debugging the dateValid() function error messages
//alert(err);  
alert("Fecha Invalida");
vDateName.focus();
vDateName.select();
   }
}
return false;
}
else {
// If the value is not in the string return the string minus the last
// key entered.
if (isNav4) {
vDateName.value = "";
vDateName.focus();
vDateName.select();
return false;
}
else
{
vDateName.value = vDateName.value.substr(0, (vDateValue.length-1));
return false;
         }
      }
   }
}
function dateValid(objName) {
var strDate;
var strDateArray;
var strDay;
var strMonth;
var strYear;
var intday;
var intMonth;
var intYear;
var booFound = false;
var datefield = objName;
var strSeparatorArray = new Array("-"," ","/",".");
var intElementNr;
// var err = 0;
var strMonthArray = new Array(12);
strMonthArray[0] = "Jan";
strMonthArray[1] = "Feb";
strMonthArray[2] = "Mar";
strMonthArray[3] = "Apr";
strMonthArray[4] = "May";
strMonthArray[5] = "Jun";
strMonthArray[6] = "Jul";
strMonthArray[7] = "Aug";
strMonthArray[8] = "Sep";
strMonthArray[9] = "Oct";
strMonthArray[10] = "Nov";
strMonthArray[11] = "Dec";
//strDate = datefield.value;
strDate = objName;
if (strDate.length < 1) {
return true;
}
for (intElementNr = 0; intElementNr < strSeparatorArray.length; intElementNr++) {
if (strDate.indexOf(strSeparatorArray[intElementNr]) != -1) {
strDateArray = strDate.split(strSeparatorArray[intElementNr]);
if (strDateArray.length != 3) {
err = 1;
return false;
}
else {
strDay = strDateArray[0];
strMonth = strDateArray[1];
strYear = strDateArray[2];
}
booFound = true;
   }
}
if (booFound == false) {
if (strDate.length>5) {
strDay = strDate.substr(0, 2);
strMonth = strDate.substr(2, 2);
strYear = strDate.substr(4);
   }
}
//Adjustment for short years entered
if (strYear.length == 2) {
strYear = '20' + strYear;
}
strTemp = strDay;
strDay = strMonth;
strMonth = strTemp;
intday = parseInt(strDay, 10);
if (isNaN(intday)) {
err = 2;
return false;
}
intMonth = parseInt(strMonth, 10);
if (isNaN(intMonth)) {
for (i = 0;i<12;i++) {
if (strMonth.toUpperCase() == strMonthArray[i].toUpperCase()) {
intMonth = i+1;
strMonth = strMonthArray[i];
i = 12;
   }
}
if (isNaN(intMonth)) {
err = 3;
return false;
   }
}
intYear = parseInt(strYear, 10);
if (isNaN(intYear)) {
err = 4;
return false;
}
if (intMonth>12 || intMonth<1) {
err = 5;
return false;
}
if ((intMonth == 1 || intMonth == 3 || intMonth == 5 || intMonth == 7 || intMonth == 8 || intMonth == 10 || intMonth == 12) && (intday > 31 || intday < 1)) {
err = 6;
return false;
}
if ((intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11) && (intday > 30 || intday < 1)) {
err = 7;
return false;
}
if (intMonth == 2) {
if (intday < 1) {
err = 8;
return false;
}
if (LeapYear(intYear) == true) {
if (intday > 29) {
err = 9;
return false;
   }
}
else {
if (intday > 28) {
err = 10;
return false;
      }
   }
}
return true;
}
function LeapYear(intYear) {
if (intYear % 100 == 0) {
if (intYear % 400 == 0) { return true; }
}
else {
if ((intYear % 4) == 0) { return true; }
}
return false;
}
//  End -->

<!--

//Disable right mouse click Script
//By Maximus (maximus@nsimail.com) w/ mods by DynamicDrive
//For full source code, visit http://www.dynamicdrive.com

var message="Function Deshabilitada!";

///////////////////////////////////

  function popup2(z,x,y)
  {
	  var win = window.open('acecalendar_popup.htm?valor=' + z, 'popup_cal', 'left=' + x + ',top=' + y + ',resizable=no,status=no,titlebar=no,scrollbars=no,width=150,height=210');
	  win.focus();
  }

   function Evalua()
   {  f = document.forms[0];
      var Mensaje = "";     
      if( bCancel == true ) return bCancel;
      if (f.op.value == 0)
      {  if (!comboObligatorio(f.aduana.value))
           Mensaje = Mensaje + 'Debe elegir una Aduana. \n';
         if (!comboObligatorio(f.patron.value))
           Mensaje = Mensaje + 'Debe elegir un patrón. \n';  
      }
      if (f.op.value == 4 )
      {  
         if( ! textoObligatorio( f.horas.value ) )
            Mensaje = Mensaje + 'Ingrese el tiempo. \n';
         if( ! textoObligatorio( f.fec_ini.value ) )
            Mensaje = Mensaje + 'Ingrese fecha inicial. \n';
         else
         {  if( ! esFecha( f.fec_ini.value )   )
                Mensaje = Mensaje + 'La fecha inicial es incorrecta. \n';
            else
                if (! esHora(f.hr_ini.value))
                     Mensaje = Mensaje + 'La hora inicial es incorrecta. \n';
         }
         if( textoObligatorio( f.fec_fin.value ) )
         {  if( ! esFecha( f.fec_fin.value ) )
               Mensaje = Mensaje + 'La fecha final es incorrecta. \n';
            else
            {   if (! esHora(f.hr_fin.value))
                    Mensaje = Mensaje + 'La hora final es incorrecta. \n';
                else   
               {    if (ComparaFechas(f.fec_fin.value, f.fec_ini.value) == 1 )
                    {      Mensaje = Mensaje + 'El rango de fechas es incorrecto. \n'; }
               }
            }
         }  
      }
      if ( f.op.value == 3)
      {  if( ! textoObligatorio( f.horas.value ) )
            Mensaje = Mensaje + 'Ingrese el tiempo. \n';
      }     
     if( Mensaje == "" )
        return true;
      else
     {
        alert( Mensaje );
        return false;
     }
   };
   
   function EvaluaR()
   {    f = document.forms[0];
        var Mensaje = "";    
        if( bCancel == true ) return bCancel;
        if (!comboObligatorio(f.aduana.value))
           Mensaje = Mensaje + 'Debe elegir una Aduana. \n';
        if (!comboObligatorio(f.patron.value))
           Mensaje = Mensaje + 'Debe elegir un patrón. \n';  
        if( Mensaje == "" )
          return true;
        else
       {
         alert( Mensaje );
         return false;
       }
   };

   function esNumero()
   { key=window.event.keyCode; //codigo de tecla. 
     if (key < 48 || key > 57)//si no es numero 
     {    if (key != 44) //no es coma
          {   window.event.keyCode=0;}   //anula la entrada de texto. 
     }
   };

   function esFecha(fecha)
   { borrar = fecha;
     if ((fecha.substr(2,1) == "/") && (fecha.substr(5,1) == "/"))
     {  for (i=0; i<10; i++)
	      {	
           if (((fecha.substr(i,1)<"0") || (fecha.substr(i,1)>"9")) && (i != 2) && (i != 5))
			     {  borrar = '';
              break;  
			     }  
        }
	      if (borrar)
	      {    a = fecha.substr(6,4);
             m = fecha.substr(3,2);
		         d = fecha.substr(0,2);
		         if((a < 1900) || (a > 2050) || (m < 1) || (m > 12) || (d < 1) || (d > 31))
		                borrar = '';
		         else
		         {
        	      if((a%4 != 0) && (m == 2) && (d > 28))	   
		                borrar = ''; // Año no viciesto y es febrero y el dia es mayor a 28
			           else	
			           {   if ((((m == 4) || (m == 6) || (m == 9) || (m==11)) && (d>30)) || ((m==2) && (d>29)))
			                  borrar = '';	      				  	 
			           }  // else
		         } // fin else
        } // if (error)
     } // if ((caja.substr(2,1) == "/") && (caja.substr(5,1) == "/"))	
     else
         borrar = '';
     if (borrar == '')
   	   return false;  
     else
       return true;
   }; 

   function esHora(hora)
   {  res = 0;
      if ((hora.substr(2,1) == ":") && (hora.substr(5,1) == ":"))
      {  
         if (parseInt (hora.substr(0,2)) > 24)
            res = 1;
         else
           if (parseInt (hora.substr(3,2)) > 59)
              res = 1;
           else
              if (parseInt (hora.substr(5,2)) > 59)
                 res = 1;
      }   
      else
         res = 1;
      if (res == 0)
         return true;
      else
         return false;
   };
  
   function ComparaFechas(fec0, fec1)
   { 
     //true=fec1>fec0
     var bRes = false;
     var sDia0 = fec0.substr(0, 2);
     var sMes0 = fec0.substr(3, 2);
     var sAno0 = fec0.substr(6, 4);
     var sDia1 = fec1.substr(0, 2);
     var sMes1 = fec1.substr(3, 2);
     var sAno1 = fec1.substr(6, 4);
     var fecha0=sAno0+sMes0+sDia0;
     var fecha1=sAno1+sMes1+sDia1;
     if (Number(fecha1) <= Number(fecha0)) 
        bRes = true;
    return bRes;
   } 
   
   function ValidaMail(sDir)
   {  var pos1, pos2, bOk = true; 
 
      pos1 = sDir.indexOf('@', 0); 
      pos2 = sDir.indexOf('.', 0); 
      bOk = bOk && (pos1 > 0); 
      bOk = bOk && (pos2 != -1); 
      bOk = bOk && (pos1 < pos2 - 1); 
      bOk = bOk && (pos2 < sDir.length - 1); 
      if (!bOk)
        return false;
      else
        return true;
   };
   
function blancos ( texto )
{ 
  if (texto.length) 
  {
    while( '' + texto.charAt(0) == " " )
    {
      texto = texto.substring( 1, texto.length);
    }
  }
  return texto;
};

function textoObligatorio( texto )
{ 
  aux = blancos( texto );
  if( aux == "" ) 
  { return false;}
  else
    return true;
};

function comboObligatorio( texto )
{ 
  if( texto == "0" ) 
  { return false;}
  else
    return true;
}

function Mayusculas(texto)
{  texto.value = texto.value.toUpperCase();
}
function solonumeros(checkStr)
{
  var checkOK = "0123456789."; 
  var allValid = true; 
  var decPoints = 0; 
  var allNum = ""; 
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i); 
    if (ch==",")
       decPoints=decPoints+1;
    for (j = 0; j < checkOK.length; j++) 
      if (ch == checkOK.charAt(j))
        break; 
    if (j == checkOK.length) { 
      allValid = false; 
      break; 
    } 
    if (decPoints>1)
       allValid = false; 
    allNum += ch; 
  } 
  if (!allValid) { 
    return (false); 
  } 
  else {
    return (true); 
  }
}

function solonumerosint(checkStr)
{
  var checkOK = "0123456789"; 
  var allValid = true; 
  var decPoints = 0; 
  var allNum = ""; 
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i); 
    for (j = 0; j < checkOK.length; j++) 
      if (ch == checkOK.charAt(j))
        break; 
    if (j == checkOK.length) { 
      allValid = false; 
      break; 
    } 
    allNum += ch; 
  } 
  if (!allValid) { 
    return (false); 
  } 
  else {
    return (true); 
  }
}

function devuelvehoy()
{
   var xdia;
   hoy=new Date();
   var anio = hoy.getFullYear();
   var mes = hoy.getMonth()+1;
   xmes=mes;
   if (mes<10) 
      xmes="0"+mes;
   var dia = hoy.getUTCDate();
   if (dia<10) xdia="0"+dia;
   else xdia=dia;
   hoydia=xdia+"/"+xmes+"/"+anio;
   return hoydia;
}

function sololetras(checkStr)
{
  var checkOK = 'abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ_0123456789/-*.,;:!#$%()=?¡<>áéíóúÁÉÍÓÚ`´Üü '; 
  var allValid = true; 
  var decPoints = 0; 
  var allNum = ""; 
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i); 
    if (ch==".")
       decPoints=decPoints+1;
    for (j = 0; j < checkOK.length; j++) 
      if (ch == checkOK.charAt(j))
        break; 
    if (j == checkOK.length) { 
      allValid = false; 
      break; 
    } 
    if (decPoints>1)
       allValid = false; 
    allNum += ch; 
  } 
  if (!allValid) { 
    return (false); 
  } 
  else {
    return (true); 
  }
}

function handleEnter (field, event) {
		var keyCode = event.keyCode ? event.keyCode : event.which ? event.which : event.charCode;
		//alert(keyCode)
		if (keyCode == 13) {
			var i;
			for (i = 0; i < field.form.elements.length; i++) {
			//alert(field.form.elements[i].value+ " " +field.form.elements[i].type);
				  if (field == field.form.elements[i])  
					 break;
			}
			i = (i + 1) % field.form.elements.length;
			//alert(field.form.elements[i].value+ " //// " +field.form.elements[i].type + " " + i);
			if (field.form.elements[i].id=="noelement") {
				i = i + 1;
			}
			//alert(field.form.elements[i].value+ " //// " +field.form.elements[i].id + " " + field.form.elements[i].name + " " +i);
		    field.form.elements[i].focus();
			field.form.elements[i].select();			
			return false;
		} 
		else
		return true;
}  

function validar2(form)
  {
    hoy=devuelvehoy();
    mensaje=""
    foco=""
    try {
    i=form.act_codrub.selectedIndex
   	if (!comboObligatorio(form.act_codrub.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.act_codrub.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    i=form.act_codreg.selectedIndex;
   	if (!comboObligatorio(form.act_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.act_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.act_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
   	if (!comboObligatorio(form.act_codigo.value)) {
	   	mensaje=mensaje+"Debe introducir Código <> 0\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.act_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.act_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_descripcion.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_descripcion.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_marca.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_marca.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_modelo.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_modelo.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie1.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_serie1.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie2.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_serie2.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_placa.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_placa.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_color.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_color.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_procedencia.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_procedencia.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_gobmunicipal.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_gobmunicipal.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
    i=form.act_codgrp.selectedIndex;
   	if (!comboObligatorio(form.act_codgrp.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Grupo\n"
		  if (foco.length==0) foco="form.act_codgrp.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpar.selectedIndex;
   	if (!comboObligatorio(form.act_codpar.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Partida\n"
		  if (foco.length==0) foco="form.act_codpar.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codofi.selectedIndex;
   	if (!comboObligatorio(form.act_codofi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Oficina\n"
		  if (foco.length==0) foco="form.act_codofi.focus()"
  	}      
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codfun.selectedIndex;
   	if (!comboObligatorio(form.act_codfun.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Funcionario\n"
		  if (foco.length==0) foco="form.act_codfun.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codubi.selectedIndex;
   	if (!comboObligatorio(form.act_codubi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Ubicación\n"
		  if (foco.length==0) foco="form.act_codubi.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpry.selectedIndex;
   	if (!comboObligatorio(form.act_codpry.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Proyecto\n"
		  if (foco.length==0) foco="form.act_codpry.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!esFecha(form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra dd/mm/yyyy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!ComparaFechas(hoy, form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra menor o igual a hoy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!ComparaFechas(form.rev_fecha.value, form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación mayor igual a Fecha de Compra \n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!esFecha(form.act_fecreferencia.value)){
      mensaje=mensaje+"Debe introducir Fecha de Registro dd/mm/yyyy\n"
      if (foco.length==0) foco="form.act_fecreferencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!ComparaFechas(hoy, form.act_fecreferencia.value)){
      mensaje=mensaje+"Debe introducir Fecha de Registro menor o igual a hoy\n"
      if (foco.length==0) foco="form.act_fecreferencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_descripcion.value)){
      mensaje=mensaje+"Debe introducir Descripción\n"
      if (foco.length==0) foco="form.act_descripcion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_valcobol.value)){
      mensaje=mensaje+"Debe introducir Valor de Compra Bolivianos\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_valcobol.value)){
      mensaje=mensaje+"Debe introducir Valor de Compra Bs\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.act_valcobol.value)){
         mensaje=mensaje+"Debe introducir Números en Valor de Compra Bs\n"
         if (foco.length==0) foco="form.act_valcobol.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.act_valcobol.value)<=0){
      mensaje=mensaje+"Debe introducir Valor de Compra Bs\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.act_numfactura.value)){
         mensaje=mensaje+"Debe introducir Números en Número de Factura\n"
         if (foco.length==0) foco="form.act_numfactura.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_umanejo.value)){
      mensaje=mensaje+"Debe introducir Cilindrada\n"
      if (foco.length==0) foco="form.act_umanejo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_proveedor.value)){
      mensaje=mensaje+"Debe introducir Proveedor\n"
      if (foco.length==0) foco="form.act_proveedor.focus()"
    }
    }
    catch (e) {
      xvar=0
    } 
    try {
    if (!textoObligatorio(form.act_marca.value)){
      mensaje=mensaje+"Debe introducir Marca\n"
      if (foco.length==0) foco="form.act_marca.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_modelo.value)){
      mensaje=mensaje+"Debe introducir Tipo\n"
      if (foco.length==0) foco="form.act_modelo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_serie1.value)){
      mensaje=mensaje+"Debe introducir Chasis\n"
      if (foco.length==0) foco="form.act_serie1.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_serie2.value)){
      mensaje=mensaje+"Debe introducir Motor\n"
      if (foco.length==0) foco="form.act_serie2.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_docreferencia.value)){
      mensaje=mensaje+"Debe introducir Carnet de Propiedad\n"
      if (foco.length==0) foco="form.act_docreferencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_placa.value)){
      mensaje=mensaje+"Debe introducir Placa\n"
      if (foco.length==0) foco="form.act_placa.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_aniofabricacion.value)){
      mensaje=mensaje+"Debe introducir Año de Fabricación\n"
      if (foco.length==0) foco="form.act_aniofabricacion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (!solonumerosint(form.act_aniofabricacion.value)){
         mensaje=mensaje+"Debe introducir Números en Año de Fabricación\n"
         if (foco.length==0) foco="form.act_aniofabricacion.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_color.value)){
      mensaje=mensaje+"Debe introducir Color\n"
      if (foco.length==0) foco="form.act_color.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_procedencia.value)){
      mensaje=mensaje+"Debe introducir Procedencia\n"
      if (foco.length==0) foco="form.act_procedencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (!sololetras(form.act_procedencia.value)){
         mensaje=mensaje+"Debe introducir Letras en Procedencia\n"
         if (foco.length==0) foco="form.act_procedencia.focus()"
      }
    }
    catch (e) {
      xvar=0
    }        
    try {
    if (!textoObligatorio(form.act_gobmunicipal.value)){
      mensaje=mensaje+"Debe introducir Gobierno Municipal\n"
      if (foco.length==0) foco="form.act_gobmunicipal.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!esFecha(form.rev_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación dd/mm/yyyy\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    var sMes0 = form.rev_fecha.value;
    var sAno0 = form.rev_fecha.value;
    if ((sMes0.substr(3,2)!=form.mes.value)||(sAno0.substr(6,4)!=form.anio.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación igual al periodo "+form.anio.value+form.mes.value+" de proceso\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.rev_estadoactivo.selectedIndex
   	if (!comboObligatorio(form.rev_estadoactivo.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Estado de Activo\n"
		  if (foco.length==0) foco="form.rev_estadoactivo.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }

    if (mensaje.length>0)
    {
       alert(mensaje)
       eval(foco)
       return false
    }
}  

function validar0(form)
{
    alert("validar0");
    hoy=devuelvehoy();
    mensaje=""
    foco=""
    try {
    i=form.act_codrub.selectedIndex
   	if (!comboObligatorio(form.act_codrub.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.act_codrub.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    i=form.act_codreg.selectedIndex;
   	if (!comboObligatorio(form.act_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.act_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.act_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
        if (!solonumeros(form.act_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.act_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_descripcion.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_descripcion.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_marca.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_marca.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_modelo.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_modelo.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie1.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_serie1.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie2.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_serie2.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_placa.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_placa.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_color.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_color.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_procedencia.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_procedencia.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_gobmunicipal.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_gobmunicipal.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
   	if (!comboObligatorio(form.act_codigo.value)) {
	   	mensaje=mensaje+"Debe introducir Código <> 0\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codgrp.selectedIndex;
   	if (!comboObligatorio(form.act_codgrp.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Grupo\n"
		  if (foco.length==0) foco="form.act_codgrp.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpar.selectedIndex;
   	if (!comboObligatorio(form.act_codpar.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Partida\n"
		  if (foco.length==0) foco="form.act_codpar.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codofi.selectedIndex;
   	if (!comboObligatorio(form.act_codofi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Oficina\n"
		  if (foco.length==0) foco="form.act_codofi.focus()"
  	}      
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codfun.selectedIndex;
   	if (!comboObligatorio(form.act_codfun.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Funcionario\n"
		  if (foco.length==0) foco="form.act_codfun.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codubi.selectedIndex;
   	if (!comboObligatorio(form.act_codubi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Ubicación\n"
		  if (foco.length==0) foco="form.act_codubi.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpry.selectedIndex;
   	if (!comboObligatorio(form.act_codpry.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Proyecto\n"
		  if (foco.length==0) foco="form.act_codpry.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!esFecha(form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra dd/mm/yyyy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_proveedor.value)){
      mensaje=mensaje+"Debe introducir Proveedor\n"
      if (foco.length==0) foco="form.act_proveedor.focus()"
    }
    }
    catch (e) {
      xvar=0
    }  
    try {
    if (form.act_codrub.value == "07")
    if (!textoObligatorio(form.act_marca.value)){
      mensaje=mensaje+"Debe introducir Marca\n"
      if (foco.length==0) foco="form.act_marca.focus()"
    }
    }
    catch (e) {
      xvar=0
    }  
    try {
    if (!ComparaFechas(hoy, form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra menor o igual a hoy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    /*try {
    if (!ComparaFechas(form.rev_fecha.value,hoy)){
      mensaje=mensaje+"Debe introducir Fecha de Activación mayor o igual a hoy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }*/
    try {
    if (!ComparaFechas(form.rev_fecha.value, form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación mayor igual a Fecha de Compra \n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_descripcion.value)){
      mensaje=mensaje+"Debe introducir Descripción\n"
      if (foco.length==0) foco="form.act_descripcion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_valcobol.value)){
      mensaje=mensaje+"Debe introducir Valor de Compra Bolivianos\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_valcobol.value)){
      mensaje=mensaje+"Debe introducir Valor de Compra Bs\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.act_valcobol.value)){
         mensaje=mensaje+"Debe introducir Números en Valor de Compra Bs\n"
         if (foco.length==0) foco="form.act_valcobol.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.act_valcobol.value)<=0){
      mensaje=mensaje+"Debe introducir Valor de Compra Bs\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.act_numfactura.value)){
         mensaje=mensaje+"Debe introducir Números en Número de Factura\n"
         if (foco.length==0) foco="form.act_numfactura.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!esFecha(form.rev_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación dd/mm/yyyy\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    var sMes0 = form.rev_fecha.value;
    var sAno0 = form.rev_fecha.value;
    if ((sMes0.substr(3,2)!=form.mes.value)||(sAno0.substr(6,4)!=form.anio.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación igual al periodo "+form.anio.value+form.mes.value+" de proceso\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.rev_estadoactivo.selectedIndex
   	if (!comboObligatorio(form.rev_estadoactivo.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Estado de Activo\n"
		  if (foco.length==0) foco="form.rev_estadoactivo.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }

    if (mensaje.length>0)
    {
       alert(mensaje)
       eval(foco)
       return false
    }
}  

function validar1(form)
{
    hoy=devuelvehoy();
    mensaje=""
    foco=""
    try {
    i=form.act_codrub.selectedIndex
   	if (!comboObligatorio(form.act_codrub.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.act_codrub.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    i=form.act_codreg.selectedIndex;
   	if (!comboObligatorio(form.act_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.act_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.act_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
   	if (!comboObligatorio(form.act_codigo.value)) {
	   	mensaje=mensaje+"Debe introducir Código <> 0\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.act_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.act_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_descripcion.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_descripcion.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_marca.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.act_marca.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_modelo.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.act_modelo.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie1.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.act_serie1.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie2.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.act_serie2.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_placa.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.act_placa.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_color.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.act_color.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_procedencia.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.act_procedencia.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_gobmunicipal.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.act_gobmunicipal.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
    i=form.act_codgrp.selectedIndex;
   	if (!comboObligatorio(form.act_codgrp.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Grupo\n"
		  if (foco.length==0) foco="form.act_codgrp.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpar.selectedIndex;
   	if (!comboObligatorio(form.act_codpar.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Partida\n"
		  if (foco.length==0) foco="form.act_codpar.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codofi.selectedIndex;
   	if (!comboObligatorio(form.act_codofi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Oficina\n"
		  if (foco.length==0) foco="form.act_codofi.focus()"
  	}      
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codfun.selectedIndex;
   	if (!comboObligatorio(form.act_codfun.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Funcionario\n"
		  if (foco.length==0) foco="form.act_codfun.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codubi.selectedIndex;
   	if (!comboObligatorio(form.act_codubi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Ubicación\n"
		  if (foco.length==0) foco="form.act_codubi.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpry.selectedIndex;
   	if (!comboObligatorio(form.act_codpry.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Proyecto\n"
		  if (foco.length==0) foco="form.act_codpry.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!esFecha(form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra dd/mm/yyyy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!ComparaFechas(hoy, form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra menor o igual a hoy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    /*try {
    if (!ComparaFechas(form.rev_fecha.value,hoy)){
      mensaje=mensaje+"Debe introducir Fecha de Activación mayor o igual a hoy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }*/
    try {
    if (!ComparaFechas(form.rev_fecha.value, form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación mayor igual a Fecha de Compra \n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_umanejo.value)){
      mensaje=mensaje+"Debe introducir Superficie Terreno\n"
      if (foco.length==0) foco="form.act_umanejo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_descripcion.value)){
      mensaje=mensaje+"Debe introducir Descripción del Inmueble\n"
      if (foco.length==0) foco="form.act_descripcion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_accesorios.value)){
      alert("Debe introducir Dirección Inmueble");
      if (foco.length==0) foco="form.act_accesorios.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_serie1.value)){
      mensaje=mensaje+"Debe introducir Testimonio No.\n"
      if (foco.length==0) foco="form.act_serie1.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_valcobol.value)){
      mensaje=mensaje+"Debe introducir Valor de Compra Bolivianos\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.act_valcobol.value)){
         mensaje=mensaje+"Debe introducir Números en Valor de Compra Bs\n"
         if (foco.length==0) foco="form.act_valcobol.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.act_valcobol.value)<=0){
      mensaje=mensaje+"Debe introducir Valor de Compra Bs\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }   
    try {
      if (!solonumerosint(form.act_numfactura.value)){
         mensaje=mensaje+"Debe introducir Números en Número de Factura\n"
         if (foco.length==0) foco="form.act_numfactura.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_docreferencia.value)){
      mensaje=mensaje+"Debe introducir Folio No.\n"
      if (foco.length==0) foco="form.act_docreferencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!esFecha(form.act_fecreferencia.value)){
      mensaje=mensaje+"Debe introducir Fecha de Registro dd/mm/yyyy\n"
      if (foco.length==0) foco="form.act_fecreferencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!ComparaFechas(hoy, form.act_fecreferencia.value)){
      mensaje=mensaje+"Debe introducir Fecha de Registro menor o igual a hoy\n"
      if (foco.length==0) foco="form.act_fecreferencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_procedencia.value)){
      mensaje=mensaje+"Debe introducir Departamento\n"
      if (foco.length==0) foco="form.act_procedencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_gobmunicipal.value)){
      mensaje=mensaje+"Debe introducir Provincia\n"
      if (foco.length==0) foco="form.act_gobmunicipal.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!esFecha(form.rev_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación dd/mm/yyyy\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    var sMes0 = form.rev_fecha.value;
    var sAno0 = form.rev_fecha.value;
    if ((sMes0.substr(3,2)!=form.mes.value)||(sAno0.substr(6,4)!=form.anio.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación igual al periodo "+form.anio.value+form.mes.value+" de proceso\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.rev_estadoactivo.selectedIndex
   	if (!comboObligatorio(form.rev_estadoactivo.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Estado de Activo\n"
		  if (foco.length==0) foco="form.rev_estadoactivo.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
      if (!sololetras(form.act_procedencia.value)){
         mensaje=mensaje+"Debe introducir Letras en Departamento\n"
         if (foco.length==0) foco="form.act_procedencia.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (!sololetras(form.act_gobmunicipal.value)){
         mensaje=mensaje+"Debe introducir Letras en Provincia\n"
         if (foco.length==0) foco="form.act_gobmunicipal.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    if (mensaje.length>0)
    {
       alert(mensaje)
       eval(foco)
       return false
    }
}
  
function validar3(form)
{
    hoy=devuelvehoy();
    mensaje=""
    foco=""
    try {
    i=form.act_codrub.selectedIndex
   	if (!comboObligatorio(form.act_codrub.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.act_codrub.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    i=form.act_codreg.selectedIndex;
   	if (!comboObligatorio(form.act_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.act_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.act_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
   	if (!comboObligatorio(form.act_codigo.value)) {
	   	mensaje=mensaje+"Debe introducir Código <> 0\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.act_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.act_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_descripcion.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_descripcion.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_marca.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_marca.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_modelo.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_modelo.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie1.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_serie1.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie2.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_serie2.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_placa.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_placa.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_color.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_color.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_procedencia.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_procedencia.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_gobmunicipal.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_gobmunicipal.focus()"
         }
    }
    catch (e) {
      xvar=0
    }       
    try {
    i=form.act_codgrp.selectedIndex;
   	if (!comboObligatorio(form.act_codgrp.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Grupo\n"
		  if (foco.length==0) foco="form.act_codgrp.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpar.selectedIndex;
   	if (!comboObligatorio(form.act_codpar.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Partida\n"
		  if (foco.length==0) foco="form.act_codpar.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codofi.selectedIndex;
   	if (!comboObligatorio(form.act_codofi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Oficina\n"
		  if (foco.length==0) foco="form.act_codofi.focus()"
  	}      
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codfun.selectedIndex;
   	if (!comboObligatorio(form.act_codfun.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Funcionario\n"
		  if (foco.length==0) foco="form.act_codfun.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codubi.selectedIndex;
   	if (!comboObligatorio(form.act_codubi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Ubicación\n"
		  if (foco.length==0) foco="form.act_codubi.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpry.selectedIndex;
   	if (!comboObligatorio(form.act_codpry.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Proyecto\n"
		  if (foco.length==0) foco="form.act_codpry.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!esFecha(form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra dd/mm/yyyy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!ComparaFechas(hoy, form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra menor o igual a hoy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    /*try {
    if (!ComparaFechas(form.rev_fecha.value,hoy)){
      mensaje=mensaje+"Debe introducir Fecha de Activación mayor o igual a hoy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }*/
    try {
    if (!ComparaFechas(form.rev_fecha.value, form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación mayor igual a Fecha de Compra \n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_umanejo.value)){
      mensaje=mensaje+"Debe introducir Superficie Terreno\n"
      if (foco.length==0) foco="form.act_umanejo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_descripcion.value)){
      mensaje=mensaje+"Debe introducir Descripción\n"
      if (foco.length==0) foco="form.act_descripcion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_valcobol.value)){
      mensaje=mensaje+"Debe introducir Valor de Compra Bolivianos\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.act_valcobol.value)){
         mensaje=mensaje+"Debe introducir Números en Valor de Compra Bs\n"
         if (foco.length==0) foco="form.act_valcobol.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.act_valcobol.value)<=0){
      mensaje=mensaje+"Debe introducir Valor de Compra Bs\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.act_numfactura.value)){
         mensaje=mensaje+"Debe introducir Números en Número de Factura\n"
         if (foco.length==0) foco="form.act_numfactura.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_marca.value)){
      mensaje=mensaje+"Debe introducir Marca\n"
      if (foco.length==0) foco="form.act_marca.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.act_modelo.value)){
      mensaje=mensaje+"Debe introducir Modelo\n"
      if (foco.length==0) foco="form.act_modelo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!esFecha(form.rev_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación dd/mm/yyyy\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_serie1.value)){
      mensaje=mensaje+"Debe introducir Número de Serie\n"
      if (foco.length==0) foco="form.act_serie1.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    var sMes0 = form.rev_fecha.value;
    var sAno0 = form.rev_fecha.value;
    if ((sMes0.substr(3,2)!=form.mes.value)||(sAno0.substr(6,4)!=form.anio.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación igual al periodo "+form.anio.value+form.mes.value+" de proceso\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.rev_estadoactivo.selectedIndex
   	if (!comboObligatorio(form.rev_estadoactivo.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Estado de Activo\n"
		  if (foco.length==0) foco="form.rev_estadoactivo.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }

    if (mensaje.length>0)
    {
       alert(mensaje)
       eval(foco)
       return false
    }
}  
  
function validar4(form)
{
    hoy=devuelvehoy();
    mensaje=""
    foco=""
    try {
    i=form.act_codrub.selectedIndex
   	if (!comboObligatorio(form.act_codrub.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.act_codrub.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    i=form.act_codreg.selectedIndex;
   	if (!comboObligatorio(form.act_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.act_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.act_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
   	if (!comboObligatorio(form.act_codigo.value)) {
	   	mensaje=mensaje+"Debe introducir Código <> 0\n"
		  if (foco.length==0) foco="form.act_codigo.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.act_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.act_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_descripcion.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_descripcion.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_marca.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_marca.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_modelo.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_modelo.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie1.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_serie1.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_serie2.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_serie2.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_placa.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_placa.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_color.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_color.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_procedencia.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_procedencia.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (form.operacion.value==2) 
         if (!sololetras(form.act_gobmunicipal.value)){
            mensaje=mensaje+"Caracteres no permitidos \"\[\{\}\]&|+\'\n"
            if (foco.length==0) foco="form.act_gobmunicipal.focus()"
         }
    }
    catch (e) {
      xvar=0
    }    
    try {
    i=form.act_codgrp.selectedIndex;
   	if (!comboObligatorio(form.act_codgrp.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Grupo\n"
		  if (foco.length==0) foco="form.act_codgrp.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpar.selectedIndex;
   	if (!comboObligatorio(form.act_codpar.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Partida\n"
		  if (foco.length==0) foco="form.act_codpar.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codofi.selectedIndex;
   	if (!comboObligatorio(form.act_codofi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Oficina\n"
		  if (foco.length==0) foco="form.act_codofi.focus()"
  	}      
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codfun.selectedIndex;
   	if (!comboObligatorio(form.act_codfun.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Funcionario\n"
		  if (foco.length==0) foco="form.act_codfun.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codubi.selectedIndex;
   	if (!comboObligatorio(form.act_codubi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Ubicación\n"
		  if (foco.length==0) foco="form.act_codubi.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codpry.selectedIndex;
   	if (!comboObligatorio(form.act_codpry.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Proyecto\n"
		  if (foco.length==0) foco="form.act_codpry.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!esFecha(form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra dd/mm/yyyy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    /*try {
    if (!ComparaFechas(form.rev_fecha.value,hoy)){
      mensaje=mensaje+"Debe introducir Fecha de Activación mayor o igual a hoy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }*/
    try {
    if (!ComparaFechas(hoy, form.act_feccompra.value)){
      mensaje=mensaje+"Debe introducir Fecha de Compra menor o igual a hoy\n"
      if (foco.length==0) foco="form.act_feccompra.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_umanejo.value)){
      mensaje=mensaje+"Debe introducir Unidad de Manejo\n"
      if (foco.length==0) foco="form.act_umanejo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_descripcion.value)){
      mensaje=mensaje+"Debe introducir Descripción\n"
      if (foco.length==0) foco="form.act_descripcion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_proveedor.value)){
      mensaje=mensaje+"Debe introducir Proveedor\n"
      if (foco.length==0) foco="form.act_proveedor.focus()"
    }
    }
    catch (e) {
      xvar=0
    }  
    try {
    if (!textoObligatorio(form.act_procedencia.value)){
      mensaje=mensaje+"Debe introducir Material\n"
      if (foco.length==0) foco="form.act_procedencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }   
    try {
    if (!textoObligatorio(form.act_gobmunicipal.value)){
      mensaje=mensaje+"Debe introducir Dimensiones\n"
      if (foco.length==0) foco="form.act_gobmunicipal.focus()"
    }
    }
    catch (e) {
      xvar=0
    } 
    try {
    if (!textoObligatorio(form.act_valcobol.value)){
      mensaje=mensaje+"Debe introducir Valor de Compra Bolivianos\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.act_valcobol.value)){
      mensaje=mensaje+"Debe introducir Valor de Compra Bs\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.act_valcobol.value)){
         mensaje=mensaje+"Debe introducir Números en Valor de Compra Bs\n"
         if (foco.length==0) foco="form.act_valcobol.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.act_valcobol.value)<=0){
      mensaje=mensaje+"Debe introducir Valor de Compra Bs\n"
      if (foco.length==0) foco="form.act_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.act_numfactura.value)){
         mensaje=mensaje+"Debe introducir Números en Número de Factura\n"
         if (foco.length==0) foco="form.act_numfactura.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!esFecha(form.rev_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación dd/mm/yyyy\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    var sMes0 = form.rev_fecha.value;
    var sAno0 = form.rev_fecha.value;
    if ((sMes0.substr(3,2)!=form.mes.value)||(sAno0.substr(6,4)!=form.anio.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación igual al periodo "+form.anio.value+form.mes.value+" de proceso\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.rev_estadoactivo.selectedIndex
   	if (!comboObligatorio(form.rev_estadoactivo.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Estado de Activo\n"
		  if (foco.length==0) foco="form.rev_estadoactivo.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }

    if (mensaje.length>0)
    {
       alert(mensaje)
       eval(foco)
       return false
    }
  }

  function validar(form)
  {
    mensaje=""
    foco=""
    if (form.opcion.value==1) {
       try {
          if (!textoObligatorio( form.condicion1.value )) {
	      	   mensaje=mensaje+"Debe introducir Descripciòn\n"
      		   if (foco.length==0) foco="form.condicion1.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
    }
    if (form.opcion.value==2) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Rubro\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
       try {
          if (!textoObligatorio( form.condicion3.value )) {
	      	   mensaje=mensaje+"Debe introducir Código Inicial\n"
      		   if (foco.length==0) foco="form.condicion3.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!textoObligatorio( form.condicion4.value )) {
	      	   mensaje=mensaje+"Debe introducir Còdigo Final\n"
      		   if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!solonumeros( form.condicion3.value )) {
	      	   mensaje=mensaje+"Debe introducir Números en Código Inicial\n"
      		   if (foco.length==0) foco="form.condicion3.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!solonumeros( form.condicion4.value )) {
	      	   mensaje=mensaje+"Debe introducir Números en Còdigo Final\n"
      		   if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if ((Number(form.condicion3.value)<0)||(Number(form.condicion3.value)>99999)) {
	      	   mensaje=mensaje+"Debe introducir Números en Código Inicial > 0 y < 99999\n"
      		   if (foco.length==0) foco="form.condicion3.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if ((Number(form.condicion4.value)<0)||(Number(form.condicion4.value)>99999)) {
	      	   mensaje=mensaje+"Debe introducir Números en Código Final > 0 y < 99999\n"
      		   if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
    }
    if (form.opcion.value==3) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Rubro\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
       try {
          i=form.condicion2.selectedIndex
   	      if (!comboObligatorio(form.condicion2.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Grupo\n"
		         if (foco.length==0) foco="form.condicion2.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
    }
    if (form.opcion.value==4) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Ubicación\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
    }
    if (form.opcion.value==5) {
       try {
          i=form.condicion3.selectedIndex
   	      if (!comboObligatorio(form.condicion3.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Funcionario\n"
		         if (foco.length==0) foco="form.condicion3.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
    }
    if (form.opcion.value==6) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Proyecto\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
    }
    if (form.opcion.value==7) {
    }
    if (form.opcion.value==8) {
    }
    if (form.opcion.value==9) {
    }
    if (form.opcion.value==10) {
    }
    if (form.opcion.value==11) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Oficina\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
    }

    if (form.opcion.value==12) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Rubro\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
    }

    if (form.opcion.value==13) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Rubro\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
       try {
          if (!textoObligatorio( form.condicion4.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Inicial \n"
      		   if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion4.value)){
             mensaje=mensaje+"Debe introducir Fecha Inicial dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (!ComparaFechas(form.condicion5.value, form.condicion4.value)){
             mensaje=mensaje+"Debe introducir Fecha Inicial menor o igual a Fecha Final\n"
             if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
          xvar=0
       }
    }
    if (form.opcion.value==14) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Rubro\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
       try {
          if (!textoObligatorio( form.condicion4.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Inicial \n"
      		   if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       }        
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (!esFecha(form.condicion4.value)){
             mensaje=mensaje+"Debe introducir Fecha Inicial dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       }       
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (!ComparaFechas(form.condicion5.value, form.condicion4.value)){
             mensaje=mensaje+"Debe introducir Fecha Inicial menor o igual a Fecha Final\n"
             if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
          xvar=0
       }       
    }
    if (form.opcion.value==15) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Rubro\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }
    if (form.opcion.value==16) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Rubro\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }
    if (form.opcion.value==17) {
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }
    if (form.opcion.value==18) {
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }
    if (form.opcion.value==19||form.opcion.value==31) {
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }
    if (form.opcion.value==21) {
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }    
    if (form.opcion.value==22) {
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }    
    if (form.opcion.value==23) {
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }    
    if (form.opcion.value==24) {
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          i=form.condicion6.selectedIndex
   	      if (!comboObligatorio(form.condicion6.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Funcionario\n"
		         if (foco.length==0) foco="form.condicion6.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
    }    
    if (form.opcion.value==25) {
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }
    if (form.opcion.value==28) {
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }
    if (form.opcion.value==27) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Rubro\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
       try {
          if (!textoObligatorio( form.condicion3.value )) {
	      	   mensaje=mensaje+"Debe introducir Código Inicial\n"
      		   if (foco.length==0) foco="form.condicion3.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!textoObligatorio( form.condicion4.value )) {
	      	   mensaje=mensaje+"Debe introducir Còdigo Final\n"
      		   if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!solonumeros( form.condicion3.value )) {
	      	   mensaje=mensaje+"Debe introducir Números en Código Inicial\n"
      		   if (foco.length==0) foco="form.condicion3.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!solonumeros( form.condicion4.value )) {
	      	   mensaje=mensaje+"Debe introducir Números en Còdigo Final\n"
      		   if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if ((Number(form.condicion3.value)<0)||(Number(form.condicion3.value)>99999)) {
	      	   mensaje=mensaje+"Debe introducir Números en Código Inicial > 0 y < 99999\n"
      		   if (foco.length==0) foco="form.condicion3.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if ((Number(form.condicion4.value)<0)||(Number(form.condicion4.value)>99999)) {
	      	   mensaje=mensaje+"Debe introducir Números en Código Final > 0 y < 99999\n"
      		   if (foco.length==0) foco="form.condicion4.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Inicial \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!textoObligatorio( form.condicion6.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion6.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Inicial dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (!esFecha(form.condicion6.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion6.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (!ComparaFechas(form.condicion6.value, form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Inicial menor o igual a Fecha Final\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
          xvar=0
       }
    }
    if (form.opcion.value==29) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Funcionario\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }    
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Inicial \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!textoObligatorio( form.condicion6.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion6.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Inicial dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (!esFecha(form.condicion6.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion6.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (!ComparaFechas(form.condicion6.value, form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Inicial menor o igual a Fecha Final\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
          xvar=0
       }
    }
    if (form.opcion.value==30) {
       try {
          i=form.condicion1.selectedIndex
   	      if (!comboObligatorio(form.condicion1.options[i].value)) {
	   	       mensaje=mensaje+"Debe introducir Ubicacio\n"
		         if (foco.length==0) foco="form.condicion1.focus()"
  	      }  
       }
       catch (e) {
         xvar=0      
       }
       try {
          if (!textoObligatorio( form.condicion5.value )) {
	      	   mensaje=mensaje+"Debe introducir Fecha Final \n"
      		   if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       } 
       try {
          if (!esFecha(form.condicion5.value)){
             mensaje=mensaje+"Debe introducir Fecha Final dd/mm/yyyy\n"
             if (foco.length==0) foco="form.condicion5.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
    }    
    if (mensaje.length>0)
    {
       alert(mensaje)
       eval(foco)
       return false
    }
    else 
    {
       ftarget()
       return true
    }
  }
    