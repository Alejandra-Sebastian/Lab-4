package edu.eci.pdsw.webappsintro.model;

import java.util.LinkedList;
import java.util.List;

public class Orden {

	List<ItemOrden> itemsOrden;
        int id;
        int numElementos;
        int total;

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
        
        public int getNumElementos() {
            return itemsOrden.size();
        }
        
        public void setNumElementos(int numElem) {
            numElementos = numElem;
        }
        
        public int getTotal(){
            int total=0;
            for (ItemOrden io: itemsOrden){
                total+=io.getPrecio();
            }
            return total;
        }
        
        public void setTotal(int total){
            this.total = total;
        }
	
}
