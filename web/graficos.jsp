<!DOCTYPE html>
<html lang="en">
    <head>        
        <!-- META SECTION -->
        <title>SIGEME</title>            
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        
        <link rel="icon" href="favicon.ico" type="image/x-icon" />
        <!-- END META SECTION -->
        
        <!-- CSS INCLUDE -->        
        <link rel="stylesheet" type="text/css" id="theme" href="css/theme-default.css"/>
        <!-- EOF CSS INCLUDE -->                                    
    </head>


    
    <body ng-app="myApp" ng-controller="GraficosController">
        <!-- START PAGE CONTAINER -->
        <div class="page-container">
            
            <!--MENU JSPF-->                       
                  <%@ include file="Header.jspf" %>
             <!--FIN MENU JSPF-->   


                <!-- START BREADCRUMB -->
                <ul class="breadcrumb">
                    <li><a href="#">Home</a></li>                    
                    <li><a href="#">Reportes</a></li>
                    <li class="active">Generar Reportes</li>
                </ul>
                <!-- END BREADCRUMB -->

                <!-- PAGE TITLE -->
                <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span>Graficos</h2>
                </div>
                <!-- END PAGE TITLE -->                

                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">                
                
                    <div class="row">
                        <div class="col-md-12">

                            <div class="col-md-6">

                            <!-- START LINE CHART  CANTIDAD-->
                            <div class="panel panel-default">
                            
                                     <div class="panel-heading">
                                    <div class="panel-title-box">
                                        <h3>Cantidad de casos por mes</h3>
                                        <span>SIGEME</span>
                                    </div>                                     
                                    <ul class="panel-controls panel-controls-title">                                        
                                        <li>
                                            <div id="reportrange" class="dtrange">                                            
                                                <span></span><b class="caret"></b>
                                            </div>                                     
                                        </li>                                
                                        <li><a href="#" class="panel-fullscreen rounded"><span class="fa fa-expand"></span></a></li>
                                    </ul>                                    
                                    
                                </div>
                                      <div class="input-group-btn">
                                                    <button class="btn btn-primary" ng-click="graficoCantidad();">Dar click aca para generar grafico!</button>
                                </div> 
                                <div class="panel-body">
                                    <div id="morris-line-cantidad-entregado" style="height: 300px;"></div>
                                </div>
                            </div>
                            <!-- END LINE CHART CANTIDAD-->
                             </div>
                               <div class="col-md-6">
                             <!-- START LINE CHART SEX -->
                            <div class="panel panel-default">
                            
                                     <div class="panel-heading">
                                    <div class="panel-title-box">
                                        <h3>Cantidad H/M por mes</h3>
                                        <span>(SIGEME)</span>
                                    </div>                                     
                                    <ul class="panel-controls panel-controls-title">                                        
                                        <li>
                                            <div id="reportrange" class="dtrange">                                            
                                                <span></span><b class="caret"></b>
                                            </div>                                     
                                        </li>                                
                                        <li><a href="#" class="panel-fullscreen rounded"><span class="fa fa-expand"></span></a></li>
                                    </ul>                                    
                                    
                                </div>
                                      <div class="input-group-btn">
                                                    <button class="btn btn-primary" ng-click="graficoSexo();">Dar click aca para generar grafico!</button>
                                </div> 
                                <div class="panel-body">
                                    <div id="morris-line-cantidad-sexo" style="height: 300px;"></div>
                                </div>
                            </div>
                            <!-- END LINE CHART -->
                            </div>
                            
                       

                            
                        </div>
                    </div>                                
                    
                </div>
                <!-- PAGE CONTENT WRAPPER -->                                
            </div>    
            <!-- END PAGE CONTENT -->
        </div>
        <!-- END PAGE CONTAINER -->       
 

        <!-- START PRELOADS -->
        <audio id="audio-alert" src="audio/alert.mp3" preload="auto"></audio>
        <audio id="audio-fail" src="audio/fail.mp3" preload="auto"></audio>
        <!-- END PRELOADS -->                       
        
    <!-- START SCRIPTS -->
    
        <!-- MYSCRIPT -->

         <script>
         var app = angular.module('myApp', []);
       


app.controller('GraficosController', function($scope) {

      
             $scope.filter ="";
        
           $scope.graficoCantidad = function (e){
             
                 Proxy.graficoCantidad(
                    function(list){
                      function data(lista) {
                      //alert(lista);
                    var ret = [];
                  for (var x = 0; x <= lista.length-1; x= x+2) {
              ret.push({
                    x: lista[x],
                    y: lista[x+1]
                  });
          }
          return ret;
      }

                  var graph = Morris.Line({
                      element: 'morris-line-cantidad-entregado',
                      data: data(list),
                      xkey: 'x',
                      ykeys: ['y'],
                      labels: ['cantidad'],
                      parseTime: false,
                      resize: true,
                      hideHover: true
                  });

                        });
          
                                   };
           $scope.graficoSexo = function (e){
             
                 Proxy.graficoSexo(
                    function(list){
                      function data(lista) {
                      alert(lista);
                    var ret = [];
                  for (var x = 0; x <= lista.length-2; x= x+3) {
              ret.push({
                    x: lista[x],
                    y: lista[x+1],
                    z: lista[x+2]
                  });
          }
          return ret;
      }

                  var graph = Morris.Bar({
                      element: 'morris-line-cantidad-sexo',
                      data: data(list),
                      xkey: 'x',
                      ykeys: ['y','z'],
                      labels: ['hombres','mujeres'],
                      parseTime: false,
                      resize: true,
                       lineColors: ['#33414E', '#95B75D'],
                      hideHover: true
                  });

                        });
          
                                   };



     

         
});
        
    

       
        </script>

    <!-- END MYSCRIPT-->
        <!-- START PLUGINS -->
        <script type="text/javascript" src="js/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="js/plugins/jquery/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/plugins/bootstrap/bootstrap.min.js"></script>        
        <!-- END PLUGINS -->                

        <!-- THIS PAGE PLUGINS -->
        <script type='text/javascript' src='js/plugins/icheck/icheck.min.js'></script>
        <script type="text/javascript" src="js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js"></script>
        
        <script type="text/javascript" src="js/plugins/bootstrap/bootstrap-datepicker.js"></script>                
        <script type="text/javascript" src="js/plugins/bootstrap/bootstrap-file-input.js"></script>
        <script type="text/javascript" src="js/plugins/bootstrap/bootstrap-select.js"></script>
        <script type="text/javascript" src="js/plugins/tagsinput/jquery.tagsinput.min.js"></script>
        <script type="text/javascript" src="js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js"></script>
        
        <script type="text/javascript" src="js/plugins/datatables/jquery.dataTables.min.js"></script>    
        <!-- END PAGE PLUGINS -->
            <script type="text/javascript" src="js/plugins/morris/raphael-min.js"></script>
        <script type="text/javascript" src="js/plugins/morris/morris.min.js"></script>
        <!-- START TEMPLATE -->
        <script type="text/javascript" src="js/plugins.js"></script>        
        <script type="text/javascript" src="js/actions.js"></script>        
        <!-- END TEMPLATE -->
        
    <!-- END SCRIPTS --> 
    
        
    </body>
</html>
