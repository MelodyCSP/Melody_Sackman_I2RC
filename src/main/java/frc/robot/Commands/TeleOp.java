package frc.robot.Commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;

public class TeleOp extends Command{
    
    DriveTrain dt;
    Joystick joy;
    

    public TeleOp(DriveTrain dt, Joystick joy) {
        this.dt = dt;
        this.joy = joy;
        addRequirements(dt);
    }

    @Override
    public void initialize() {
        dt.tankDrive(0, 0);
    }

    @Override
    public void execute() {
        double leftPowerRaw = joy.getRawAxis(1);
        double rightPowerRaw = joy.getRawAxis(0);

        dt.tankDrive(leftPowerRaw, rightPowerRaw);
        
    }

    @Override 
    public void end(boolean interrupted) {
        dt.tankDrive(0,0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }


}
