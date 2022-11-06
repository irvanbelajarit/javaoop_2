/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upcastingdowncasting;

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
        
        var control = new UIControl(true);
//        show(control);

        var textBox = new TextBox();
//        show(textBox);
        show(control);  //upcasting
    }
    
    public static void show (UIControl control){
        
        if(control instanceof TextBox){
                
        var textBox = (TextBox)control;   //downcasting
        textBox.setText("Hallo Dunia");
        }
        
    
        
        System.out.println(control);
    }
    
}
