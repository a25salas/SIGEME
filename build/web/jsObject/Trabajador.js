
  function Trabajador(cedula, nombre,email,telefono,fechaNacimiento,puesto,sexo,profesion,fechaIngreso) {
    this.Trabajador(cedula, nombre ,email,telefono,fechaNacimiento,puesto,sexo,profesion,fechaIngreso);
  }
  
  Trabajador.prototype={
  	cedula: "",
	nombre: "",
	email:"",
	fechaNacimiento:"",
	telefono: "",
	puesto:"",
	sexo:"",
	profesion:"",
	fechaIngreso:"",

	Trabajador: function(cedula, nombre,email,telefono,fechaNacimiento,puesto,sexo,profesion,fechaIngreso){
		this.cedula=cedula;
		this.nombre=nombre;

		this.email=email;
		this.telefono= telefono;
		this.fechaNacimiento= fechaNacimiento;
		this.puesto=puesto;
		this.sexo=sexo;
		this.profesion=profesion;
		this.fechaIngreso=fechaIngreso;
	},
    toString:function(){
		var string;
		string="Nombre: "+ this.nombre+"\n";
		string+="Cedula: "+ this.cedula+"\n";
		string+="fechaNacimiento: "+ this.fechaNacimiento+"\n";
		string+="email: "+ this.email+"\n";
		return string;
	},

	clone:function(){
	  return new Trabajador(this.cedula, this.nombre,this.email,this.telefono,this.fechaNacimiento,this.puesto,this.sexo,this.profesion,this.fechaIngreso);
	}


  }
  
  Trabajador.from= function(plain){
    prod = new Trabajador(plain.cedula, plain.nombre,plain.email,plain.telefono,plain.fechaNacimiento,plain.puesto,plain.sexo,plain.profesion,plain.fechaIngreso);
	return prod;
  }
  
    Trabajador.to= function(prod){
    return {
        _class : 'Trabajador',
        cedula : prod.cedula,
		nombre: prod.nombre,
		email: prod.email,
		telefono: prod.telefono,
		fechaNacimiento: prod.fechaNacimiento,
		puesto: prod.puesto,
		sexo: prod.sexo,
		profesion: prod.profesion,
		fechaIngreso: prod.fechaIngreso
    };	
  }

