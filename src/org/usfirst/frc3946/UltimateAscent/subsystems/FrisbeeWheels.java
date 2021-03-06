/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3946.UltimateAscent.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc3946.UltimateAscent.RobotMap;
import org.usfirst.frc3946.UltimateAscent.commands.StopLaunchWheels;

/**
 *
 * @author Makaylah
 */
public class FrisbeeWheels extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Victor firstWheel = new Victor(RobotMap.frisbeeFirstWheel);
    public Victor secondWheel = new Victor(RobotMap.frisbeeSecondWheel);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new StopLaunchWheels(5));
    }
    
    public void set(double firstSpeed, double secondSpeed) {
        firstWheel.set(firstSpeed);
        secondWheel.set(secondSpeed);
    }
    
    public boolean isRunning() {
        if(firstWheel.getSpeed() > 0) {
            return true;
        } else {
            return false;
        }
    }
        
    public FrisbeeWheels() {
        super();
        LiveWindow.addActuator("FrisbeeWheels", "FirstWheel", firstWheel);
        LiveWindow.addActuator("FrisbeeWheels", "SecondWheel", secondWheel);
        System.out.println(this.getClass().getName()+" Initialized");
    }
}
