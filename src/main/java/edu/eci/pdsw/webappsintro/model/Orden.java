package edu.eci.pdsw.webappsintro.model;

import java.util.LinkedList;
import java.util.List;

public class Orden {

	List<ItemOrden> itemsOrden;
        int id;

	public Orden() {
		itemsOrden=new LinkedList<>();
	}
	
	public void agregarItemOrden(ItemOrden p){
		itemsOrden.add(p);
	}
	
	public List<ItemOrden> getItemsOrden(){
		return itemsOrden;
	}
	
        @Override
	public String toString(){
		return itemsOrden.toString();
	}
        
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
	
}
