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
    <body ng-app="myApp" ng-controller="ManagerTrabajadoresController">
        <!-- START PAGE CONTAINER -->
        <div class="page-container">
            
            <!--MENU JSPF-->                       
                  <%@ include file="Header.jspf" %>
             <!--FIN MENU JSPF-->   


                <!-- START BREADCRUMB -->
                <ul class="breadcrumb">
                    <li><a href="#">Home</a></li>                    
                    <li><a href="#">Administracion</a></li>
                    <li class="active">Trabajadores</li>
                </ul>
                <!-- END BREADCRUMB -->

                <!-- PAGE TITLE -->
                <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span> Mantenimiento de Trabajadores</h2>
                </div>
                <!-- END PAGE TITLE -->                

                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">                
                
                    <div class="row">
                        <div class="col-md-12">
                        <!-- START FORM-->
                         <form class="form-horizontal">
                            <div class="panel panel-info">
                                <div class="panel-heading">
                                    <h3 class="panel-title"><strong>SIGEME Datos</strong> Trabajador</h3>
                                </div>
                                <div class="panel-body">
                                    <p>Rellene los siguientes campos para agregar/actualizar/ver un trabajador a SIGEME.</p>
                                </div>
                                <div class="panel-body">                                                                        
                                    
                                    <div class="row">
                                        
                                        <div class="col-md-6">
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Cedula</label>
                                                <div class="col-md-9">                                            
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" ng-model="current.cedula" ng-disabled="mode=='update'|| mode=='see'"/>
                                                    </div>                                            
                                                    <span class="help-block">escriba la cedula del trabajador</span>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Tipo</label>
                                                <div class="col-md-9">                                                                                            
                                                    <select class="form-control"  ng-disabled="mode=='see'" ng-model="user.tipo" data-ng-options="a for a in tipo">
                                                    </select>
                                                    <span class="help-block">Seleccione el tipo de usuario</span>
                                                </div>
                                            </div>
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Contrasena</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-unlock-alt"></span></span>
                                                        <input type="text" class="form-control"  ng-model="user.clave" ng-disabled="mode=='see'"/>
                                                    </div>            
                                                    <span class="help-block">Contrasena SIGEME</span>
                                                </div>
                                            </div>
                                              <div class="form-group">
                                                <label class="col-md-3 control-label">Nombre</label>
                                                <div class="col-md-9">                                            
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" ng-model="current.nombre" ng-disabled="mode=='see'"/>
                                                    </div>                                            
                                                    <span class="help-block">escriba el nombre del trabajador</span>
                                                </div>
                                            </div>
                                              <div class="form-group">
                                                <label class="col-md-3 control-label">Sexo</label>
                                                <div class="col-md-9">                                                                                            
                                                    <select class="form-control"  ng-disabled="mode=='see'" ng-model="current.sexo" data-ng-options="a for a in sex">
                                                    </select>
                                                    <span class="help-block">Seleccione el sexo</span>
                                                </div>
                                            </div>
                                            
                                        </div>
                                        <div class="col-md-6">
                                               <div class="form-group">
                                                <label class="col-md-3 control-label">Puesto</label>
                                                <div class="col-md-9">                                            
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" ng-model="current.puesto" ng-disabled="mode=='see'"/>
                                                    </div>                                            
                                                    <span class="help-block">escriba el puesto del trabajador</span>
                                                </div>
                                            </div>
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Nacimiento</label>
                                                <div class="col-md-9">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-calendar"></span></span>
                                                        <input type="text" class="form-control datepicker" id= "fecha1" ng-model="current.fechaNacimiento" ng-disabled="mode=='see'">                                            
                                                    </div>
                                                    <span class="help-block">Click para obtner el datepicker</span>
                                                </div>
                                            </div>
                                             <div class="form-group">
                                                <label class="col-md-3 control-label">Profesion</label>
                                                <div class="col-md-9">                                            
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" ng-model="current.profesion" ng-disabled="mode=='see'"/>
                                                    </div>                                            
                                                    <span class="help-block">escriba la profesion del trabajador</span>
                                                </div>
                                            </div>
                                             <div class="form-group">
                                                <label class="col-md-3 control-label">Telefono</label>
                                                <div class="col-md-9">                                            
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control"  ng-model="current.telefono" ng-disabled="mode=='see'"/>
                                                    </div>                                            
                                                    <span class="help-block">escriba el tele del trabajador</span>
                                                </div>
                                            </div>
                                             <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Fecha ingreso</label>
                                                <div class="col-md-9">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-calendar"></span></span>
                                                        <input type="text" class="form-control datepicker" id= "fecha2" ng-model="current.fechaIngreso" ng-disabled="mode=='see'" >                                            
                                                    </div>
                                                    <span class="help-block">Click para obtner el datepicker</span>
                                                </div>
                                            </div>
                                             <div class="form-group">
                                                <label class="col-md-3 control-label">E-mail</label>
                                                <div class="col-md-9">                                            
                                                    <div class="input-group">
                                                    <span class="input-group-addon">@</span>
                                                        <input type="email" class="form-control" ng-model="current.email" ng-disabled="mode=='see'"/>
                                                    </div>                                            
                                                    <span class="help-block">escriba el e-mail del trabajador</span>
                                                </div>
                                            </div>
                                                 
                                        </div>
                                        
                                    </div>

                                </div>
                                <div class="panel-footer">
                                    <button class="btn btn-default" ng-click="clear()">Limpiar/Modo-agregar</button>  <button ng-show="mode=='update'" type="submit" class="btn btn-danger"  ng-click="delete();" data-dismiss="modal" >Eliminar Trabajdor</button>                                   
                                    <button ng-show="mode=='update'" type="submit" class="btn btn-success pull-right"  ng-click="update();" data-dismiss="modal" >Actualizar Trabajdor</button>
                                    <button ng-show="mode=='add'" type="submit" class="btn btn-primary pull-right"  ng-click="add();"   data-dismiss="modal" >Agregar Trabajador</button>
                                </div>
                            </div>
                            </form>
                        <!-- END FORM-->  
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
                                            
                                            <span class="line-height-30">Buscar Trabajadores  <strong>Por cedula</strong> para consultar todos solo dar click sin ningun criterio</span>
                              
                                        </div>
                               
                                    </div>
                                </div>                                                                
                            </div>
                              <!-- END SEARCH-->

                            <!-- START DEFAULT DATATABLE -->

                            <div class="panel panel-default">
                                <div class="panel-heading">                                
                                    <h3 class="panel-title">Trabajadores</h3>
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
                                            	  <th>#ID</th>
                                                  <th>Nombre</th>
                                                  <th>Nacimiento</th>
                                                 <th>Puesto</th>
                                                  <th>Profesion</th>
                                                  <th>Telefono</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                          
                                                   <tr ng-repeat="object in list" ng-class="{'selectedRow':$index == selectedRow}"  ng-click="setClickedRow($index);edit(object);" >
                                 <td>{{object.cedula}}</td>
                                <td>{{object.nombre}}</td>
                                <td>{{object.fechaNacimiento}}</td>
                                <td>{{object.puesto}}</td>
                                 <td>{{object.profesion}}</td>
                                 <td>{{object.telefono}}</td>
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
       


app.controller('ManagerTrabajadoresController', function($scope) {

      
             $scope.filter ="";
         	 $scope.list = new Array();
            reset($scope);

               $scope.sex =
    [
        "Masculino","Femenino"
    
    ]; 

              $scope.tipo =
    [
            1,2,3,4,5,6,7
    
    ]; 


            $scope.setClickedRow = function(index){
                    $scope.selectedRow = index;
            };
            
            $scope.search = function (e){
            Proxy.trabajadoresSearch($scope.filter,
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
                $scope.current = new Trabajador("","","","","","","Masculino","","");
                $scope.mode='add';
            };
        
            $scope.edit = function (selected){
                $scope.current = selected.clone();
                $scope.mode='update';
                Proxy.getUser( $scope.current.cedula,function(result){
                        $scope.$apply(function(){
                            $scope.user=result;
                        });
                    }); 
            };


            $scope.see = function (selected){
                $scope.current = selected.clone();
                $scope.mode='see';
            };

            $scope.add = function (e){
                //if (!$scope.userForm.$valid){ alert("Error en Datos!"); return;};
                $scope.current.fechaNacimiento= $("#fecha1").val(); // se hace porque el datepicker no es compatible con ANGULAR
            	$scope.current.fechaIngreso= $("#fecha2").val(); // se hace porque el datepicker no es compatible con ANGULAR
                $scope.user.id=$scope.current.cedula;                 
                Proxy.addTrabajador($scope.current,
                    function(status){
                        switch(status){
                            case 0: // ya existe
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
                 Proxy.addUser($scope.user); // agregamos al usuario  
            
                };        

              $scope.borrar = function (selected){
                $scope.current = selected.clone();
                $scope.mode='update';
                 $scope.delete();
            };
        
            $scope.update = function (e){
            		$scope.current.fechaNacimiento= $("#fecha1").val(); // se hace porque el datepicker no es compatible con ANGULAR
            		$scope.current.fechaIngreso= $("#fecha2").val(); // se hace porque el datepicker no es compatible con ANGULAR
                  Proxy.updateTrabajador($scope.current,
                    function(status){
                        switch(status){
                            case 0: // error
                           $('#mb-no-modificado').modal('show'); 
                                 reset($scope);
                                break;
                                
                            case 1: //ok
                             $('#mb-modificado').modal('show'); 
                            $scope.$apply(function(){
                                    $scope.list[$scope.selectedRow]= $scope.current.clone();
                                });
                                
                               reset($scope);                
                                break;
                        };
                    }); 
                    
                       Proxy.updateUser($scope.user,
                    function(status){
                        switch(status){
                            case 0: // error
                           $('#mb-no-modificado').modal('show'); 
                                 reset($scope);
                                break;
                                
                            case 1: //ok
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
            $scope.current = new Trabajador("","","","","","","","","")
            $scope.user= new Usuario("","",1);
            $scope.mode='add';
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
        <script type="text/javascript" src="js/settings.js"></script>
        
        <script type="text/javascript" src="js/plugins.js"></script>        
        <script type="text/javascript" src="js/actions.js"></script>        
        <!-- END TEMPLATE -->
        
    <!-- END SCRIPTS --> 
    
        
    </body>
</html>






