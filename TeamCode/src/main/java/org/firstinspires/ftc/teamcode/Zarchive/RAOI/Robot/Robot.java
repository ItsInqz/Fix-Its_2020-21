package org.firstinspires.ftc.teamcode.Zarchive.RAOI.Robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Zarchive.RAOI.motion.DualMotorDrive;;

    public class Robot extends DualMotorDrive {

        //hardware//
        public HardwareMap RAOIbot = null;

        //physical contructor
        public Robot() {

        }

        //custom robot

        public void initRAOIbot(HardwareMap RAOIMap) {
            RAOIbot = RAOIMap;

            BackLeftMotor = RAOIbot.dcMotor.get("front_left_motor");
            BackRightMotor = RAOIbot.dcMotor.get("front_right_motor");
            EleMotor = RAOIbot.dcMotor.get("elevator_motor");
            //set direction
            BackLeftMotor.setDirection(DcMotor.Direction.REVERSE);
            BackRightMotor.setDirection(DcMotor.Direction.FORWARD);
            EleMotor. setDirection(DcMotor.Direction.FORWARD);


            //define mode
            setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

            //Define brake
            BackLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            BackRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            EleMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
    }
