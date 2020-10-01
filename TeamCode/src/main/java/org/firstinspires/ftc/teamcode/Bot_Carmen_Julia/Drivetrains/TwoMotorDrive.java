package org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.Drivetrains;

import com.qualcomm.robotcore.hardware.DcMotor;

public class TwoMotorDrive {
    public DcMotor rearRightMotor;
    public DcMotor rearLeftMotor;

    //Stop Motor with a decimal of zero
    public void stopMotors (){
        rearRightMotor.setPower(0);
        rearLeftMotor.setPower(0);
    }

    public void driveForward (double power){
        rearRightMotor.setPower(power);
        rearLeftMotor.setPower(power);
    }
}
