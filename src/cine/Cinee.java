/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinee;

/**
 *
 * @author az257loki
 */
public class Cinee {

    int aforo;
    int sillasOcupadas;
    String tituloPelicula;
    int precioEntrada;
    private int personasIngresadas;
    double porcentajeOcupacion;
    int sillasLibres;
    
     public Cinee(){
    aforo=100;
    sillasOcupadas=0;
    tituloPelicula="";
    precioEntrada=500;
    porcentajeOcupacion=0.0;
    sillasLibres=0;
    };
       public void incrementarSillasOcupadas(){
       sillasOcupadas++;
       }
    public void setAforo(int afo){
    aforo= afo;
    }
    public void settituloPelicula(String peli){
        tituloPelicula=peli;
    }
    public void setsillasOcupadas(int ocupacion){
         sillasOcupadas=ocupacion;
    }
    public void setPrecioEntradas(int entrada){
        precioEntrada=entrada;
    }
    public void setSillasLibres( int libres){
        int ocupado;
        
        ocupado=aforo-libres;
        sillasOcupadas=ocupado;
    }
    //metod aforo
    public int getPersonasIngresadas() {
        return personasIngresadas;
    }

    public int getAforo() {
        return aforo;
    }

    public int getSillasOcupadas() {
        sillasOcupadas++;
        return sillasOcupadas;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }
    
    public int getPrecioEntrada() {
        return precioEntrada;
    }
    //metodo sillas libres   
     public int getsillasLibres() {
         int sillasLibres =aforo-sillasOcupadas;
        return sillasLibres;
    }
     //metodo porcentaje de ocupacion 
     public double getPorcentajeOcupacion(){
         double porcentaje;
         porcentaje = (sillasOcupadas*aforo)/100;
     return porcentaje;
     }
     public int getIngresoSala(){
        /* int total;
         total=aforo*precioEntrada;  
         
         return total ;*/
        int ingresos = sillasOcupadas * precioEntrada;
        return ingresos;

     }
    
     public void vaciarsala(){
     tituloPelicula="";
     sillasOcupadas=0;
     double porcentajeOcupacion = 0.0;
     }
     public void boleta(){
      sillasOcupadas++;
     }
      public double getlunes( ){
       double lunes=sillasOcupadas*precioEntrada;
       double des=0.1;
       double descuento=lunes*(1.0-des);
       return descuento;
       
      }
         public double getmartes( ){
       double lunes=sillasOcupadas*precioEntrada;
       double des=0.2;
       double descuento=lunes*(1.0-des);
       return descuento;
       
      }
};
 

