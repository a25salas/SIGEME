
  function CalendarDTO(id, title,description,color,date) {
    this.CalendarDTO(id, title ,description,color,date);
  }
  
  CalendarDTO.prototype={
  	id: "",
	title: "",
	description:"",
	color: "",
	date:"",


	CalendarDTO: function(id, title,description,color,date){
		this.id=id;
		this.title=title;
		this.description=description;
		this.color= color;
		this.date= date;
	},
    toString:function(){
		var string;
		string="title: "+ this.title+"\n";
		string+="id: "+ this.id+"\n";
		string+="description: "+ this.description+"\n";
		return string;
	},

	clone:function(){
	  return new CalendarDTO(this.id, this.title,this.description,this.color,this.date);
	}


  }
  
  CalendarDTO.from= function(plain){
    prod = new CalendarDTO(plain.id, plain.title,plain.description,plain.color,plain.date);
	return prod;
  }
  
    CalendarDTO.to= function(prod){
    return {
        _class : 'CalendarDTO',
        id : prod.id,
		title: prod.title,
		description: prod.description,
		color: prod.color,
		date:prod.date
    };	
  }
