

function revive(k,v) {
	if (v instanceof Object && v._class == 'Usuario') {
		return Usuario.from(v);
	}  
    if (v instanceof Object && v._class == 'Trabajador') {
    return Trabajador.from(v);
  } 
    if (v instanceof Object && v._class == 'FormAdmin') {
    return FormAdmin.from(v);
  }      
   if (v instanceof Object && v._class == 'FormInfo') {
    return FormInfo.from(v);
  }       
        if (v instanceof Object && v._class == 'CalendarDTO') {
    return CalendarDTO.from(v);
  }      
		
    return v;
}

function replacer(k,v) {
	if (v instanceof Usuario) {
		return Usuario.to(v);
	}
    if (v instanceof Trabajador) {
    return Trabajador.to(v);
  }

    if (v instanceof FormAdmin) {
    return FormAdmin.to(v);
  }
     if (v instanceof FormInfo) {
    return FormInfo.to(v);
  }
     if (v instanceof CalendarDTO) {
    return CalendarDTO.to(v);
  }
		        
	return v;
}

