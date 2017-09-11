package edu.eci.pdsw.webappsintro.beans.impl;

import edu.eci.pdsw.webappsintro.model.*;



public class CalculadorBasicoCuentas implements CalculadorCuenta {


	public int calcularCosto(Orden o) {
		int total=0;
		for (ItemOrden p:o.getItemsOrden()){
			total+=p.getPrecio();
		}
		return total;
	}

}
