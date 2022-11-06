/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Irv-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UIControl[] controls = {new TextBox(),new Checkbox()};
        
        for(var control:controls){
            // jika kontrol textbox 
            //render bagian ini
            //else jika checkbox
            //render ini
            
            control.render();
        }
        
    }
    
}
