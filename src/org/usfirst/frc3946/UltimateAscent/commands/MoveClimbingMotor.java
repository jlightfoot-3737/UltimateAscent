/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3946.UltimateAscent.commands;

import edu.wpi.first.wpilibj.Relay;

/**
 *
 * @author 10374778
 */
public class MoveClimbingMotor extends CommandBase {
    
    public MoveClimbingMotor() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires (climbingMotor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        climbingMotor.set(Relay.Value.kForward);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
