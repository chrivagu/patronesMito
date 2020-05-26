package com.mitocode.inter.impl;

import com.mitocode.inter.ICuenta;
import com.mitocode.model.Cuenta;

public class CuentaBancoAImpl implements ICuenta {

    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        double saldoActual = cuenta.getSaldoInicial() - monto;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        double saldoActual = cuenta.getSaldoInicial() + monto;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    public void mostrarSaldo(Cuenta cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
    }

}
