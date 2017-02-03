package Ventana1_Login;

public class Jugador {
	//Variables// 
			private String nombre;
			private String apellido1;
			private String apellido2;
			private int edad;
			//Agregada nueva Variable llamada G�nero//
			private String genero;
			private int id;
			private int puntos;
	
		public Jugador() {
		
	}
		//Generaci�n de Getters and Setters ,de las variables definidas anetriormente, mediante Source > Generate Getters and Setters//
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public String getGenero() {
			return genero;
		}
		//String para G�nero//
		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getPuntos() {
			return puntos;
		}

		public void setPuntos(int puntos) {
			this.puntos = puntos;
		}

		//Integer para Edad//
			public boolean isNumeric(String cadena){
				try{
					Integer.parseInt(cadena);
					return true;
					} catch (NumberFormatException nfe){
					return false;
					}
				}
				
		//Evita los espacios en Blanco en la Ventana de Login//
			public boolean espaciosBlanco(String blanco)
				{
					for(int i = 0; i < blanco.length(); i++)
					if(blanco.charAt(i) != ' ')
					return false;
					
					return true;		
				}
				
				public String toString(){
					return this.nombre+ " " +this.apellido1+ " " +this.apellido2+ " " +this.edad+ " a�os" +this.genero+ " "+this.id+ " " +this.puntos;
				}
}