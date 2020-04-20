package com.mitocode;

import com.mitocode.model.Conexion;

public class AppSingleton {

	public static void main(String[] args) {
		//Instanciacion por constructor prohibido por ser "private"
		//Conexion c = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
	}
	
	//Otro ejemplo en: https://www.youtube.com/watch?v=qiFeiYLzIH8
	//Spring Framework gestiona sus beans como Singleton por defecto
}
