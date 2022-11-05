/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overridingmethod;

/**
 *
 * @author Irv-PC
 */
public class TextBox extends UIControl {
    private String text;

    public TextBox() {
        super(true);
        System.out.println("Text Box");
    }
    
    @Override
    public String toString(){
        return text;
    }
    
    
    public void setText(String text){this.text=text;}
    
    public void clear() {text="";}
}
