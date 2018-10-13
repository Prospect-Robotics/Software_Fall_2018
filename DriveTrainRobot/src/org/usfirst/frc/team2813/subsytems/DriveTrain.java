package org.usfirst.frc.team2813.subsytems;

import org.usfirst.frc.team2813.commands.OIDrive;
import org.usfirst.frc.team2813.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final DifferentialDrive robotDrive = RobotMap.driveTrainRobotDrive;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new OIDrive());
    }
    
    public void arcadeDrive(Joystick joystick) {
    	robotDrive.arcadeDrive(joystick.getX(), joystick.getY());
    	
    }
}

