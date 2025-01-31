// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Constants;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Audio;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Hooks;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Lights; 

public class StatusCheck2 extends InstantCommand {

  Audio audio;
  Arm arm;
  Hooks hooks;
  Drivetrain drivetrain;
  Intake intake;
  Lights lights;

  public StatusCheck2(Drivetrain Drivetrain, Hooks Hooks, Arm Arm, Intake Intake, Lights Lights, Audio Audio) {

    arm = Arm;
    drivetrain = Drivetrain;
    hooks = Hooks;
    intake = Intake;
    lights = Lights;
    audio = Audio;

    addRequirements(Drivetrain, Lights);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    if (drivetrain.FrontLeftDriveVoltage < 9) {

      lights.SetColor(Constants.Colors.DarkGreen);
 
    } else if (drivetrain.FrontLeftTurnVoltage < 9) {

      lights.SetColor(Constants.Colors.Aqua);
 
    } else if (drivetrain.FrontRightDriveVoltage < 9) {

      lights.SetColor(Constants.Colors.Lime);
 
    } else if (drivetrain.BackLeftDriveVoltage < 9) {

      lights.SetColor(Constants.Colors.LawnGreen);

    } else if (drivetrain.BackRightDriveVoltage < 9) {

      lights.SetColor(Constants.Colors.BlueGreen);
 
    } else if (drivetrain.FrontLeftTurnVoltage < 9) {

      lights.SetColor(Constants.Colors.Aqua);
 
    } else if (drivetrain.FrontRightTurnVoltage < 9) {

      lights.SetColor(Constants.Colors.SkyBlue);
 
    } else if (drivetrain.BackLeftTurnVoltage < 9) {

      lights.SetColor(Constants.Colors.DarkBlue);
 
    } else if (drivetrain.BackRightTurnVoltage < 9) {

      lights.SetColor(Constants.Colors.BlueViolet);
 
   // } else if (intake.LeftIntakeVoltage < 9) {

      lights.SetColor(Constants.Colors.HotPink);
 
      } else if (intake.RightIntakeVoltage < 9) {

      lights.SetColor(Constants.Colors.DarkRed);
      
      } else if (intake.RearFlyVoltage < 9) {

      lights.SetColor(Constants.Colors.Red);

      } else if (intake.FrontFlyVoltage < 9) {

      lights.SetColor(Constants.Colors.RedOrange);

      } else if (arm.BottomShootingVoltage < 9) {

        lights.SetColor(Constants.Colors.Gold);

        } else if (arm.CentralShootingVoltage < 9) {

        lights.SetColor(Constants.Colors.Yellow);

        } else if (arm.TopShootingVoltage < 9) {

        lights.SetColor(Constants.Colors.Violet);

        } else if (hooks.RightHookVoltage < 9) {

        lights.SetColor(Constants.Colors.Blue);

        } else if (hooks.LeftHookVoltage < 9) {

        lights.SetColor(Constants.Colors.BlueShot);
        
        } else if (arm.AngleVoltage < 9) {

        lights.SetColor(Constants.Colors.RedShot);

        } else {

        lights.SetColor(Constants.Colors.Rainbow);

        }        

  }
}
