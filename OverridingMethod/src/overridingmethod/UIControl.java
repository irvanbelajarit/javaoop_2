/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overridingmethod;

/**
 *
 * @author Irv-PC
 */
public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled=isEnabled;
        System.out.println("UIControl");
    }
    
    
    
    public void enable(){
        isEnabled=true;
    }
    
    public void disable(){
        isEnabled=false;
    }
    
    public boolean isEnabled(){
        return isEnabled;
    }
    
}
