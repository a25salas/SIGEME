
  function FormInfo(expediente, nombreEncargado,cedula,telefono,fechaNacimiento,cedulaEncargado,sexo,nacionalidad) {
    this.FormInfo(expediente, nombreEncargado ,cedula,telefono,fechaNacimiento,cedulaEncargado,sexo,nacionalidad );
  }
  
  FormInfo.prototype={
  	expediente: "",
	nombreEncargado: "",
	cedula:"",
	fechaNacimiento:"",
	telefono: "",
	cedulaEncargado:"",
	sexo:"",
	nacionalidad:"",

	FormInfo: function(expediente, nombreEncargado,cedula,telefono,fechaNacimiento,cedulaEncargado,sexo,nacionalidad ){
		this.expediente=expediente;
		this.nombreEncargado=nombreEncargado;

		this.cedula=cedula;
		this.telefono= telefono;
		this.fechaNacimiento= fechaNacimiento;
		this.cedulaEncargado=cedulaEncargado;
		this.sexo=sexo;
		this.nacionalidad=nacionalidad;
	
	},
    toString:function(){
		var string;
		string="nombreEncargado: "+ this.nombreEncargado+"\n";
		string+="expediente: "+ this.expediente+"\n";
		string+="fechaNacimiento: "+ this.fechaNacimiento+"\n";
		string+="cedula: "+ this.cedula+"\n";
		return string;
	},

	clone:function(){
	  return new FormInfo(this.expediente, this.nombreEncargado,this.cedula,this.telefono,this.fechaNacimiento,this.cedulaEncargado,this.sexo,this.nacionalidad );
	}


  }
  
  FormInfo.from= function(plain){
    prod = new FormInfo(plain.expediente, plain.nombreEncargado,plain.cedula,plain.telefono,plain.fechaNacimiento,plain.cedulaEncargado,plain.sexo,plain.nacionalidad );
	return prod;
  }
  
    FormInfo.to= function(prod){
    return {
        _class : 'FormInfo',
        expediente : prod.expediente,
		nombreEncargado: prod.nombreEncargado,
		cedula: prod.cedula,
		telefono: prod.telefono,
		fechaNacimiento: prod.fechaNacimiento,
		cedulaEncargado: prod.cedulaEncargado,
		sexo: prod.sexo,
		nacionalidad: prod.nacionalidad
    };	
  }
