package Parcial;

public class persona {
      String nombre;
      String apellido;
      int edad;
      
      public persona () {
    	  this.nombre = "";
    	  this.apellido= "";
    	  this.edad= 0;
      }
      
      public persona (String nombre, String apellido, int edad) {
    	  this.nombre= nombre;
    	  this.apellido= apellido;
    	  this.edad= edad;
      }
      
      public void modificarnombre(String nuevoNombre) {
    	  this.nombre=nuevoNombre;
      }
      
}
