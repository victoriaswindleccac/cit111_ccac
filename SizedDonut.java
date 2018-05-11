*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creature;

/**
 *
 * @author victoriaswindle
 */
public class SizedDonut {
  // member variables
    public String name;
    public int sizeInmm;
    
    private int percRemaining = 100;
    
    public void simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
        System.out.println("SizedDonut.simulateEating | Perc Rem " + percRemaining);
    } // close method
    
    public int getPercRemaining(){
        return percRemaining;
    } // close method
    
} // close class