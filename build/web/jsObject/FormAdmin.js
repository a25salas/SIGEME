
  function FormAdmin(expediente, nombre,fechaAsignacion,trabajador,fechaEntrega) {
    this.FormAdmin(expediente, nombre ,fechaAsignacion,trabajador,fechaEntrega);
  }
  
  FormAdmin.prototype={
  	expediente: "",
	nombre: "",
	fechaAsignacion:"",
	trabajador: "",
	fechaEntrega:"",
	

	FormAdmin: function(expediente, nombre,fechaAsignacion,trabajador,fechaEntrega){
		this.expediente=expediente;
		this.nombre=nombre;
		this.fechaAsignacion=fechaAsignacion;
		this.trabajador= trabajador;
		this.fechaEntrega=fechaEntrega;

	},
    toString:function(){
		var string;
		string="Nombre: "+ this.nombre+"\n";
		string+="expediente: "+ this.expediente+"\n";
		string+="fechaAsignacion: "+ this.fechaAsignacion+"\n";
		string+="fechaEntrega: "+ this.fechaEntrega+"\n";
		return string;
	},

	clone:function(){
	  return new FormAdmin(this.expediente, this.nombre,this.fechaAsignacion,this.trabajador,this.fechaEntrega);
	}


  }
  
  FormAdmin.from= function(plain){
    prod = new FormAdmin(plain.expediente, plain.nombre,plain.fechaAsignacion,plain.trabajador,plain.fechaEntrega);
	return prod;
  }
  
    FormAdmin.to= function(prod){
    return {
        _class : 'FormAdmin',
        expediente : prod.expediente,
		nombre: prod.nombre,
		fechaAsignacion: prod.fechaAsignacion,
		trabajador: prod.trabajador,
		fechaEntrega: prod.fechaEntrega
		
    };	
  }
