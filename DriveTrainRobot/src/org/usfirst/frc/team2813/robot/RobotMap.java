package org.usfirst.frc.team2813.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
	
	public static SpeedController driveTrainSpeedControllerLeft0;
	public static SpeedController driveTrainSpeedControllerLeft1;
	public static SpeedController driveTrainSpeedControllerRight0;
	public static SpeedController driveTrainSpeedControllerRight1;
	public static DifferentialDrive driveTrainRobotDrive;
	public static final int DriveTrainLeftID0 = 0;
	public static final int DriveTrainLeftID1 = 1;
	public static final int DriveTrainLeftID2 = 2;
	public static final int DriveTrainRightID0 = 3;
	public static final int DriveTrainRightID1 = 4;
	public static SpeedControllerGroup m_left;
	public static SpeedControllerGroup m_right;
	public static void init() {
		driveTrainSpeedControllerLeft0 = new Spark(DriveTrainLeftID0);
		driveTrainSpeedControllerLeft1 = new Spark(DriveTrainLeftID1);
		driveTrainSpeedControllerRight0 = new Spark(DriveTrainRightID0);
		driveTrainSpeedControllerRight1 = new Spark(DriveTrainRightID1);
		m_left = new SpeedControllerGroup(driveTrainSpeedControllerLeft0, driveTrainSpeedControllerLeft1);
		m_right = new SpeedControllerGroup(driveTrainSpeedControllerRight0, driveTrainSpeedControllerRight1);
		driveTrainRobotDrive = new DifferentialDrive(m_left, m_right);
	}
	
	

}
