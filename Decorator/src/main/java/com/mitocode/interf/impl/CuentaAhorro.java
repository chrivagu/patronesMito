package com.mitocode.interf.impl;

import com.mitocode.interf.ICuentaBancaria;
import com.mitocode.model.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {

	public void abrirCuenta(Cuenta c) {
		System.out.println("-------------------------");
		System.out.println("Se abrió una cuenta de Ahorros");
		System.out.println("Cliente: " + c.getCliente());		
	}

}
