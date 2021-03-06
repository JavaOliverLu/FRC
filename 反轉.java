package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends TimedRobot {
  public VictorSPX frontRightMotor=new VictorSPX(0);
  public TalonSRX backRightMotor=new TalonSRX(9);
  public VictorSPX frontLeftMotor=new VictorSPX(0);
  public TalonSRX backLeftMotor=new TalonSRX(7);
  public Joystick joy1=new Joystick(0);
 
  @Override
  public void robotInit() {
  }

  
  @Override
  public void robotPeriodic() {
  }

  
  @Override
  public void autonomousInit() {
   
  }

  
  @Override
  public void autonomousPeriodic() {
   
  }

  
  @Override
  public void teleopInit() {
    frontRightMotor.setInverted(false);
    backRightMotor.setInverted(true);
    frontLeftMotor.setInverted(true);
    backLeftMotor.setInverted(false);

  }

  
  @Override
  public void teleopPeriodic() {
    double a = joy1.getRawAxis(0);
    double b = joy1.getRawAxis(1);
    frontRightMotor.set(ControlMode.PercentOutput,a-b);
    backRightMotor.set(ControlMode.PercentOutput,a-b);
    frontLeftMotor.set(ControlMode.PercentOutput,a+b);
    backLeftMotor.set(ControlMode.PercentOutput,a+b);

  }


  @Override
  public void disabledInit() {
  }

 
  @Override
  public void disabledPeriodic() {
  }

  
  @Override
  public void testInit() {
  }

 
  @Override
  public void testPeriodic() {
  }
}