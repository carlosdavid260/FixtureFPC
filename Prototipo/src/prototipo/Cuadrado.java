/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

import java.util.Vector;

/**
 *
 * @author Carlos David
 */
class Cuadrado{	

	private int valor,i;
	private int [] array ;
	
	//se agarra el valor 
	public Cuadrado(int v){
	
		valor=v;
		
	}
	
	public int regresarValor(){
	
		return valor;
		
	}
	
	//se guardan los valores en el arreglo
	public void guardarValores(int w){
	
		int [] array = new int [w];
		
		for (i=0;i<valor;i++){
		
			array[i]=i;
			
		}
		
	}
	//recorrer los numeros		
	public void recorrerValores(){
	
		//aqui imprimo lso valores actualez	
		for(i=0;i<array.length;i++){
		
			System.out.print(array[i+1] + " " );
			System.out.println(); 
			
		}
			
		//aqui se recorre 
		int [] array2 = new int [valor] ;
		for (i=0 ; i < array.length ; i++){
			if (i==array.length-1){
			
			array2[1]=array[i];
			
			}else{
			
			array2[i] = array[i+1]; 
			
			}
		}
		
		for (i=0; i< array2.length;i++)
		
			array2[i] = array[i];
			
		
	}
	
}