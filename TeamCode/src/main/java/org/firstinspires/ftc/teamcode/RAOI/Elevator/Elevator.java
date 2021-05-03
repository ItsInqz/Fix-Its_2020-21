package org.firstinspires.ftc.teamcode.RAOI.Elevator;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Elevator {
    public DcMotor EleMotor;

    public LinearOpMode LinearOp = null;
    public void setLinearOp(LinearOpMode linearOp) {
        this.LinearOp = linearOp;
    }

    public void up (double power) {

        EleMotor.setPower(power);

    }
    public void down (double power){

        EleMotor.setPower(power);

    }
}
