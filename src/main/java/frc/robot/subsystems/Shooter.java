// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  WPI_TalonFX rightshooter = new WPI_TalonFX(Constants.RIGHT_SHOOTER);
  WPI_TalonFX leftshooter = new WPI_TalonFX(Constants.LEFT_SHOOTER);
  /** Creates a new Shooter. */
  public Shooter() {}

  public void Backward_LeftShooter() {
    leftshooter.set(0.5);
  }

  public void Backward_RightShooter() {
    rightshooter.set(0.5);
  }
  public void Forward_LeftShooter() {
    rightshooter.set(-0.5);
  }
  public void Forward_RightShooter() {
    rightshooter.set(-0.5);
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
