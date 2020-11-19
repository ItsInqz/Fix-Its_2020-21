package org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.Control;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.Robot.CarmenBot;

@Autonomous (name = "simple Auto Tester")

public class Auto extends LinearOpMode {

    CarmenBot Bot = new CarmenBot();

    @Override
    public void runOpMode() throws InterruptedException {

        Bot.initRobot(hardwareMap);
        Bot.lowerArm();

        telemetry.addLine("WAITING FOR START >");
        telemetry.update();
        waitForStart();

        while (opModeIsActive()){
            // go straight
            Bot.rearLeftMotor.setPower(0.5);
            Bot.rearRightMotor.setPower(0.5);
            sleep(2000);
            Bot.rearLeftMotor.setPower(0);
            Bot.rearRightMotor.setPower(0);

            // turn right
            Bot.rearLeftMotor.setPower(0.5);
            Bot.rearRightMotor.setPower(-0.5);
            sleep(2000);
            Bot.rearLeftMotor.setPower(0);
            Bot.rearRightMotor.setPower(0);

            // go straight
            Bot.rearLeftMotor.setPower(0.5);
            Bot.rearRightMotor.setPower(0.5);
            sleep(2000);
            Bot.rearLeftMotor.setPower(0);
            Bot.rearRightMotor.setPower(0);

            //turn right
            Bot.rearLeftMotor.setPower(0.5);
            Bot.rearRightMotor.setPower(-0.5);
            sleep(2000);
            Bot.rearLeftMotor.setPower(0);
            Bot.rearRightMotor.setPower(0);

            //go straight
            Bot.rearLeftMotor.setPower(0.5);
            Bot.rearRightMotor.setPower(0.5);
            sleep(2000);
            Bot.rearLeftMotor.setPower(0);
            Bot.rearRightMotor.setPower(0);

            //turn right
            Bot.rearLeftMotor.setPower(0.5);
            Bot.rearRightMotor.setPower(-0.5);
            sleep(2000);
            Bot.rearLeftMotor.setPower(0);
            Bot.rearRightMotor.setPower(0);

            //go straight
            Bot.rearLeftMotor.setPower(0.5);
            Bot.rearRightMotor.setPower(0.5);
            sleep(2000);
            Bot.rearLeftMotor.setPower(0);
            Bot.rearRightMotor.setPower(0);

            //turn right
            Bot.rearLeftMotor.setPower(0.5);
            Bot.rearRightMotor.setPower(-0.5);
            sleep(2000);
            Bot.rearLeftMotor.setPower(0);
            Bot.rearRightMotor.setPower(0);

            requestOpModeStop();
        }
        idle();
    }
}

