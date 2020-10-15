package org.firstinspires.ftc.teamcode.Kilowatt_Bot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.DriveTrain.DualMotorDrive1;
import org.firstinspires.ftc.teamcode.Bot_Kilowatt.DriveTrain.TwoMotorDrive;
import org.firstinspires.ftc.teamcode.Bot_Kilowatt.Robot.*;

public class Kilowatt_Bot extends TwoMotorDrive {

    //hardware variable
    public HardwareMap hwBot = null;

    public Kilowatt_Bot(){

    }

    public void initKilowatt (HardwareMap hwMap) {

        hwBot = hwMap;

        rearLeftMotor = hwBot.dcMotor.get("rear_left_motor");
        rearRightMotor = hwBot.dcMotor.get("rear_right_motor");

        rearLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        rearRightMotor.setDirection(DcMotor.Direction.REVERSE);

        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rearLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


    }
}
