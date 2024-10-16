package frc.robot.Commands;

import frc.robot.subsystems.DriveTrain;

public class PIDTurnccw {
    DriveTrain dt;
    double setPointAngle;
    
    public PIDTurnccw(DriveTrain dt, double setPoint){
        this.dt = dt;
        this.setPointAngle = setPoint;
        addRequirements(dt);
        dt.setTolerance(5);
    }

    public void initialize() {
       
    }


    public void execute() {
        
        
    }

    public void end(boolean interrupted) {
        
    }

    public boolean isFinished() {
       return true;
    }


}
