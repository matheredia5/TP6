
package tp6;

import javax.swing.JOptionPane;
import negocio.Cliente;
import negocio.Directorio;


public class Tp6 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Directorio d=new Directorio();
        //Cliente martin lucero de la punta mod 11 mz 33 dni 123 telefono 4242
        boolean resultado=d.agregarCliente("4242",new Cliente(123,"martin","lucero","la punta","mod 11 mz 33") );
       if(resultado){
       
           JOptionPane.showMessageDialog(null,"Dato registrado");
       }else{
       
           JOptionPane.showMessageDialog(null,"Dato No registrado");
           
       }
       boolean resultado2=d.agregarCliente("4242",new Cliente(333,"pepe","lucero","la punta","mod 11 mz 33") );
       if(resultado2){
       
           JOptionPane.showMessageDialog(null,"Dato registrado");
       }else{
       
           JOptionPane.showMessageDialog(null,"Dato No registrado");
           
       }
        
        
    }
    
}
