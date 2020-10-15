package org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.Robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.Drivetrains.TwoMotorDrive;


public class CarmenBot extends TwoMotorDrive {// Custom Robot Initiazition Method

    public HardwareMap hwBot = null;

    public CarmenBot(){

    }

    public void initRobot (HardwareMap hwMap) {

        hwBot = hwMap;

        rearLeftMotor =  hwBot.dcMotor.get("rear_left_motor");
        rearRightMotor = hwBot.dcMotor.get("rear_right_motor");

        //Sets the direction of the robot's motors
        rearLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        rearRightMotor.setDirection(DcMotor.Direction.REVERSE);

        //Define this robot run modes
        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Define this robot's braking modes
        rearLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);



    }
}
