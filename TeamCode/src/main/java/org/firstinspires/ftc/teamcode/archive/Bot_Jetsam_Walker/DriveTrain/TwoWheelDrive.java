package org.firstinspires.ftc.teamcode.archive.Bot_Jetsam_Walker.DriveTrain;

import com.qualcomm.robotcore.hardware.DcMotor;

public class TwoWheelDrive {
    public DcMotor backLeftMotor;
    public DcMotor backRightMotor;

    public void stopMotors() {
        backLeftMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void moveMotors(double power) {
        backLeftMotor.setPower(power);
        backRightMotor.setPower(power);
    }
}