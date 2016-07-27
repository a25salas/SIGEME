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
    <body ng-app="myApp" ng-controller="ManagerCasosController">
        <!-- START PAGE CONTAINER -->
        <div class="page-container">
            
            <!--MENU JSPF-->                       
                  <%@ include file="Header.jspf" %>
             <!--FIN MENU JSPF-->   


                <!-- START BREADCRUMB -->
                <ul class="breadcrumb">
                    <li><a href="#">Home</a></li>                    
                    <li><a href="#">Administracion</a></li>
                    <li class="active">Asignar Caso</li>
                </ul>
                <!-- END BREADCRUMB -->

                <!-- PAGE TITLE -->
                <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span> Asignar Caso</h2>
                </div>
                <!-- END PAGE TITLE -->                

                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">                
                
                    <div class="row">
                        <div class="col-md-12">
                        <!-- START CASE FORM-->
                         <form class="form-horizontal">
                            <div class="panel panel-info">
                                <div class="panel-heading">
                                    <h3 class="panel-title"><strong>SIGEME Formulario</strong> Administrativo</h3>
                                </div>
                                <div class="panel-body">
                                    <p>Rellene los siguientes campos para agregar/actualizar/ver un caso a SIGEME.</p>
                                </div>
                                <div class="panel-body">                                                                        
                                    
                                    <div class="row">
                                        
                                        <div class="col-md-6">
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label"># Expediente</label>
                                                <div class="col-md-9">                                            
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" ng-model="current.expediente" ng-disabled="mode=='update'"/>
                                                    </div>                                            
                                                    <span class="help-block">escriba el # de expediente (por ahora se le asigna uno automaticamente)</span>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Nombre</label>
                                                <div class="col-md-9">    
                                                	<div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" ng-model="current.nombre"/>
                                                    </div> 
                                                    <span class="help-block">escriba  el nombre del joven</span>
                                                </div>
                                            </div>
                                      
                                               <div class="form-group">
                                                <label class="col-md-3 control-label">Trabajador</label>
                                                <div class="col-md-9">                                                                                            
                                                    <select  class="form-control"  ng-model="current.trabajador"  ng-options="x.nombre for x in trabajadores">
                                                    </select>
                                                    <span class="help-block">Seleccione el trabajador</span>
                                                </div>
                                            </div>
                                             
                                            
                                        </div>
                                        <div class="col-md-6">
                                           
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Fecha de asignacion</label>
                                                <div class="col-md-9">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-calendar"></span></span>
                                                        <input type="text" class="form-control datepicker" id= "fecha1" ng-model="current.fechaAsignacion">                                            
                                                    </div>
                                                    <span class="help-block">Click para obtner el datepicker</span>
                                                </div>
                                            </div>

                                              <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Fecha de limite</label>
                                                <div class="col-md-9">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-calendar"></span></span>
                                                        <input type="text" class="form-control datepicker" id= "fecha2" ng-model="current.fechaEntrega">                                            
                                                    </div>
                                                    <span class="help-block">Click para obtner el datepicker</span>
                                                </div>
                                            </div>
                                            
                                            
                                                 
                                        </div>
                                        
                                    </div>

                                </div>
                                <div class="panel-footer">
                                    <button class="btn btn-default" ng-click="clear()">Limpiar/Modo-agregar</button>                                    
                                    <button ng-show="mode=='update'" type="submit" class="btn btn-primary pull-right"  ng-click="update();" data-dismiss="modal" >Actualizar Caso</button>
									<button ng-show="mode=='add'" type="submit" class="btn btn-primary pull-right"  ng-click="add();"   data-dismiss="modal" >Agregar Caso</button>
                                </div>
                            </div>
                            </form>
                            <!-- END CASE FORM-->
                        
                              <!-- START SEARCH-->
                              <div class="panel panel-default">
                                <div class="panel-body">                                    
                                    <div class="row stacked">
                                        <div class="col-md-6">
                                            <div class="input-group push-down-10">
                                                <span class="input-group-addon"><span class="fa fa-search"></span></span>
                                                <input type="text"  ng-model="filter" class="form-control">
                                                <div class="input-group-btn">
                                                    <button class="btn btn-primary" ng-click="search();">Buscar!</button>
                                                </div>
                                            </div>                                                                
                                            
                                            <span class="line-height-30">Buscar Casos  <strong>Por expediente</strong> Dar click para que se despliegue en el formulario</span>
                              
                                        </div>
                               
                                    </div>
                                </div>                                                                
                            </div>
                              <!-- END SEARCH-->

                            <!-- START DEFAULT DATATABLE -->

                            <div class="panel panel-default">
                                <div class="panel-heading">                                
                                    <h3 class="panel-title">Casos</h3>
                                    <ul class="panel-controls">
                                        <li><a href="#" class="panel-collapse"><span class="fa fa-angle-down"></span></a></li>
                                        <li><a href="#" class="panel-refresh"><span class="fa fa-refresh"></span></a></li>
                                        <li><a href="#" class="panel-remove"><span class="fa fa-times"></span></a></li>
                                    </ul>                                
                                </div>
                                <div class="panel-body">

                                    <table class="table table-hover">
                                        <thead>
                                            <tr>
                                                  <th>#</th>
                                                  <th>Nombre</th>
                                                 <th>Fech. Asignacion</th>
                                                  <th>Trabajador</th>
                                                  <th>Fech. Limite</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                          
                                         <tr ng-repeat="object in list" ng-class="{'selectedRow':$index == selectedRow}" ng-click="setClickedRow($index);edit(object);"  >
                        			        <td>{{object.expediente}}</td>
                        			        <td>{{object.nombre}}</td>
                        			        <td>{{object.fechaAsignacion}}</td>
                         			        <td>{{object.trabajador.nombre}}</td>
                       		   		        <td>{{object.fechaEntrega}}</td>
                          		     	  </tr>
                                            
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!-- END DEFAULT DATATABLE -->
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
       


app.controller('ManagerCasosController', function($scope) {

      
             $scope.filter ="";
         	 $scope.list = new Array();
         	  $scope.trabajadores= new Array();

 	          $scope.getTrabajadores = function (e){
            Proxy.trabajadoresListAll(
                    function(result){
                        $scope.$apply(function(){
                            $scope.trabajadores=result;
                       

                        });
                    });
               reset($scope);
            };

       
    		 $scope.getTrabajadores();
            $scope.setClickedRow = function(index){
                    $scope.selectedRow = index;
            };
            
            $scope.search = function (e){
            Proxy.formAdminSearch($scope.filter,
                    function(result){
                        $scope.$apply(function(){
                            $scope.list=result;
                        });
                    });
               reset($scope);
            };

             $scope.updateList = function (e){
                Proxy.trabajadoresListAll(
                    function(result){
                        $scope.$apply(function(){
                            $scope.list=result;
                        });
                    });
                reset($scope);
            };

     
            $scope.new = function (e){
                $scope.current = new FormAdmin("","","","","");
                $scope.mode='add';
            };
        
            $scope.edit = function (selected){
                $scope.current = selected.clone();
                $scope.mode='update';
        
            };


            $scope.see = function (selected){
                $scope.current = selected.clone();
                $scope.mode='see';
            };

            $scope.add = function (e){
                //if (!$scope.userForm.$valid){ alert("Error en Datos!"); return;};
      			$scope.current.fechaAsignacion= $("#fecha1").val(); // se hace porque el datepicker no es compatible con ANGULAR
            	$scope.current.fechaEntrega= $("#fecha2").val(); // se hace porque el datepicker no es compatible con ANGULAR                
                Proxy.addFormAdmin($scope.current,
                    function(status){
                        switch(status){
                            case 0: // no
                            $('#mb-duplicado').modal('show'); 
                                 reset($scope);
                                break;
                                
                            case 1: // ok
                            $('#mb-exitoso').modal('show');  
                             $scope.$apply(function(){
                                    reset($scope);
                                }); 
                                
                                                             
                                break;
                        };
                    }); 

            
                };        

              $scope.borrar = function (selected){
                $scope.current = selected.clone();
                $scope.mode='update';
                 $scope.delete();
            };
        
            $scope.update = function (e){
            		$scope.current.fechaAsignacion= $("#fecha1").val(); // se hace porque el datepicker no es compatible con ANGULAR
            		$scope.current.fechaEntrega= $("#fecha2").val(); // se hace porque el datepicker no es compatible con ANGULAR
                  Proxy.updateFormAdmin($scope.current,
                    function(status){
                        switch(status){
                            case 0: // ok
                      			$('#mb-no-modificado').modal('show'); 
                                 reset($scope);
                                break;
                                
                            case 1: // ya existe
                             $('#mb-modificado').modal('show');   
                            $scope.$apply(function(){
                                    $scope.list[$scope.selectedRow]= $scope.current.clone();
                                });
                              reset($scope);                    
                                break;
                        };
                    }); 
            };                    

            $scope.delete = function (e){
                if (confirm('seguro de borrar?')) {
                 Proxy.deleteTrabajador($scope.current,
                    function(status){
                        switch(status){
                            case 0: // no se puede
                                alert("Registro No se puede Borrar!, asegurese que no tenga casos registrados");
                                break;
                            case 1: // ok
                               alert("Registro Borrado!");
                                $scope.$apply(function(){
                                    $scope.list.splice($scope.selectedRow,1);
                                    reset($scope);
                                });
                            
                                break;
                        };
                    });
                } else {
                            // cancelo
            }
               
             };

            $scope.clear = function (e){
            	reset($scope);
            }

         
});
        
        function reset($scope){
            $scope.current = new FormAdmin("","","","","");
            $scope.current.trabajador=  $scope.trabajadores[0]; // Se le asigna el primero para que no quede nulo
            $scope.mode="add";
            $scope.selectedRow = null; 
        }


       
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

        <!-- START TEMPLATE -->
        <script type="text/javascript" src="js/plugins.js"></script>        
        <script type="text/javascript" src="js/actions.js"></script>        
        <!-- END TEMPLATE -->
        
    <!-- END SCRIPTS --> 
    
        
    </body>
</html>
