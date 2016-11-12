package org.usfirst.frc.team1076.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DrivetrainSubsystems extends Subsystem {

	Talon leftMotor;
	Talon rightMotor;
	
	public DrivetrainSubsystems(Talon left, Talon right) {
		leftMotor = left;
		rightMotor = right;
	}
	
	@Override	protected void initDefaultCommand() {
	}
	
	public void setLeftSpeed(double speed) {
		leftMotor.set(speed);
	}
	
	public void setRightSpeed(double speed) {
		rightMotor.set(speed);
	}
	
	public void setSpeed(double speed) {
		setLeftSpeed(speed);
		setRightSpeed(speed);
	}
	
	public void stop() {
		setSpeed(0);
	}
}
