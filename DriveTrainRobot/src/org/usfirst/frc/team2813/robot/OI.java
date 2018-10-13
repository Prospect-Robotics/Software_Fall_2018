package org.usfirst.frc.team2813.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	
	public Joystick joystick;
	public final int JoystickID = 0;
	public OI() {
		// TODO Auto-generated constructor stub
		joystick = new Joystick(JoystickID);
	}

	public Joystick getJoystick() {
		return joystick;
	}
}
