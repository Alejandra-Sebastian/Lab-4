/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.webappsintro.controller;

import edu.eci.pdsw.webappsintro.model.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author hcadavid
 */

@ManagedBean(name = "beanEstadoOrdenes")
@SessionScoped
public class OrdersManagedBean {
    
    private ArrayList<Orden> ordenes;
    private int numOrden;
    private Orden selectedOrden;
    private boolean rendered=false;
    private String nombre;
    private int precio;
    private String tipo;
    
    public OrdersManagedBean() {
        ordenes = new ArrayList<Orden>();
//        Orden oo = new Orden();
//        ordenes.add(oo);
//        oo.agregarItemOrden(new Plato("Platico", 5452));
//        oo.agregarItemOrden(new Plato("Platico2", 5452));
    }
        
    public void setNumOrden(int orden) {
        numOrden = orden;
    }
    
    public int getNumOrden() {
        return numOrden;
    }
    
    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }
    
    public void setOrdenes(Orden orden) {
        ordenes.add(orden);
    }
    
    public List<ItemOrden> getElementos(int n) {
        return ordenes.get(n).getItemsOrden();
    }
    
    public void setElementos(int n, ItemOrden p) {
        ordenes.get(n).agregarItemOrden(p);
    }
    
    public void agregarOrden() {
        Orden o = new Orden();
        o.setId(ordenes.size()+1);
        ordenes.add(o);
        System.out.println(ordenes.size()+1);
    }
    
    public Orden getSelectedOrden() {
        return selectedOrden;
    }
    
    public void setSelectedOrden(Orden selor) {
        selectedOrden = selor;
    }
    
    public List<ItemOrden> getElementosSelOr(Orden selor) {
        return selor.getItemsOrden();
    }
    
    public void setRendered(boolean r){
        rendered = r;
    }
    
    public boolean getRendered(){
        return rendered;
    }
    
    public List<ItemOrden> detalles(){
        return selectedOrden.getItemsOrden();
    }
    
    public void agregarItem(String tipo, String nombre, String precio){
        int pr = Integer.parseInt(precio);
        if (tipo.equalsIgnoreCase("bebida")){
            ItemOrden io= new Bebida(nombre,pr, 100);
            selectedOrden.agregarItemOrden(io);
        }
        else{
            ItemOrden io= new Plato(nombre,pr);
            selectedOrden.agregarItemOrden(io);
        }
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String t) {
        tipo = t;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public void setPrecio(int p) {
        precio = p;
    }
}
