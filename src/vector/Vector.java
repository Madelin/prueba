
package vector;

import javax.swing.*;
public class Vector {

    
    public static void main(String[] args) {
       int num;

         int vec[]= new int[5];
         
         for (int i=0; i<5; i++){
             
           num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del vec1  en la posicion" +i));
            
             if(num>8){
                  vec[i]= num;
                 System.out.println(vec[i]);
             }else{
                 System.out.println("el numero que ingreso no es mayor que 8");
             }
               }
  }
    
}
//muy bueno pero para que es esto  int vec[]= new int[5];
//eso es un vector