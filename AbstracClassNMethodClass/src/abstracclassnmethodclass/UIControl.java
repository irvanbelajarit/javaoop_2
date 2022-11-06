/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracclassnmethodclass;

/**
 *
 * @author Irv-PC
 */
public abstract class UIControl {
    private boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
//        this.isEnabled=isEnabled;
////        System.out.println("UIControl");
//    }
    
    public abstract void render();
    
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
