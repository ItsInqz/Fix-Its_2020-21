package org.firstinspires.ftc.teamcode.Bot_Wheems.Robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot_Wheems.movement_code.TwoMotorDriveWheems;

public class Robot extends TwoMotorDriveWheems {

    //hardware//
    public HardwareMap Wbot = null;

    //physical contructor
    public Robot() {

    }
    //custom robot

    public void initWbot (HardwareMap WMap) {
        Wbot = WMap;

        BackLeftMotor = Wbot.dcMotor.get("front_left_motor");
        BackRightMotor = Wbot.dcMotor.get("front_right_motor");

        //set direction
        BackLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        BackRightMotor.setDirection(DcMotor.Direction.REVERSE);

        //define mode
        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //Define brake
        BackLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BackRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }






}
