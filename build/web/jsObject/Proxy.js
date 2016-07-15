var Proxy = Proxy || {};


// USUARIO Y SESION
Proxy.userLogin = function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=userLogin";
    AJAX_req.open( "POST", url, true );
   
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            jsonText=AJAX_req.responseText;
            // aqui est 
            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
   
    AJAX_req.send("user="+jsonText);   
};

Proxy.userLogout = function(){
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=userLogout";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            
        }
    };
    AJAX_req.send();   
};


Proxy.addUser = function(user){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=addUser";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
    AJAX_req.send("user="+jsonText);  
};

Proxy.getUser = function(id,callBack){
    jsonText = id;
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=getUser";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
            callBack(object);
        }
    };
    AJAX_req.send("user="+jsonText);  
};

Proxy.updateUser = function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=updateUser";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("user="+jsonText);  
};

// TRABAJADORES
Proxy.trabajadoresListAll = function(callBack){
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=TrabajadoresListAll";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
            callBack(object);
        }
    };
    AJAX_req.send();   
};

Proxy.trabajadoresSearch = function(criteria,callBack){
    jsonText = criteria;
    var AJAX_req = new XMLHttpRequest();
      url="/SIGEME/sigemeServlet?action=TrabajadoresSearch";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
            callBack(object);
        }
    };
    AJAX_req.send("criteria="+jsonText);   
};

Proxy.addTrabajador = function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=addTrabajador";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;
           
            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("trabajador="+jsonText);  
};

Proxy.updateTrabajador = function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=updateTrabajador";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("trabajador="+jsonText);  
};

Proxy.deleteTrabajador = function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=deleteTrabajador";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("trabajador="+jsonText);  
};

//FORM_ADMIN

Proxy.formAdminSearch = function(criteria,callBack){
    jsonText = criteria;
    var AJAX_req = new XMLHttpRequest();
      url="/SIGEME/sigemeServlet?action=formAdminSearch";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
            callBack(object);
        }
    };
    AJAX_req.send("criteria="+jsonText);   
};

Proxy.formAdminSearchSession = function(criteria,callBack){ // obtiene los casos de su respectiva sesion
    jsonText = criteria;
    var AJAX_req = new XMLHttpRequest();
      url="/SIGEME/sigemeServlet?action=formAdminSearchSession";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
            callBack(object);
        }
    };
    AJAX_req.send("criteria="+jsonText);   
};

Proxy.addFormAdmin = function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=addFormAdmin";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;
           alert(jsonText);
            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("formAdmin="+jsonText);  
};


Proxy.updateFormAdmin = function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=updateFormAdmin";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("formAdmin="+jsonText);  
};

//FORM_INFO

Proxy.formInfoGet = function(criteria,callBack){
    jsonText = criteria;
    var AJAX_req = new XMLHttpRequest();
      url="/SIGEME/sigemeServlet?action=formInfoGet";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
            callBack(object);
        }
    };
    AJAX_req.send("criteria="+jsonText);   
};

Proxy.updateFormInfo = function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/sigemeServlet?action=updateFormInfo";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("formInfo="+jsonText);  
};

// calendario
Proxy.addCalendarDTO= function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/CalendarJsonServlet?action=addEvent";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;

            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("calendar="+jsonText);  

};
Proxy.updateCalendarDTO= function(user,callBack){

    jsonText = JSON.stringify(user,replacer);

    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/CalendarJsonServlet?action=updateEvent";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;

            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("calendar="+jsonText);  

};

Proxy.deleteCalendarDTO= function(user,callBack){
    jsonText = JSON.stringify(user,replacer);
    var AJAX_req = new XMLHttpRequest();
    url="/SIGEME/CalendarJsonServlet?action=deleteEvent";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); 
      AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
           jsonText=AJAX_req.responseText;
            var object = JSON.parse( jsonText,revive );
             
            callBack(object);
        }
    };
    AJAX_req.send("calendar="+jsonText);  
};

// graficos con MORRIS.JS
Proxy.graficoCantidad = function(callBack){
    jsonText= "" ;
    var AJAX_req = new XMLHttpRequest();
      url="/SIGEME/sigemeServlet?action=listaCantidad";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            jsonText=AJAX_req.responseText;
            
            var object = JSON.parse(jsonText,revive);
            callBack(object);
        }
    };
    AJAX_req.send();   
};

Proxy.graficoSexo = function(callBack){
    jsonText= "" ;
    var AJAX_req = new XMLHttpRequest();
      url="/SIGEME/sigemeServlet?action=graficoSexo";
    AJAX_req.open( "POST", url, true );
    AJAX_req.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    AJAX_req.onreadystatechange = function(){
        if( AJAX_req.readyState === 4 && AJAX_req.status === 200 ){
            jsonText=AJAX_req.responseText;
            
            var object = JSON.parse(jsonText,revive);
            callBack(object);
        }
    };
    AJAX_req.send();   
};