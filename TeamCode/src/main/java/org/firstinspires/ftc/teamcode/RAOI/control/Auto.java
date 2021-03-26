package org.firstinspires.ftc.teamcode.RAOI.control;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.RAOI.Robot.Robot;

@Autonomous(name= "auto")

public class Auto extends LinearOpMode {

    Robot Bot = new Robot();
    @Override
    public void runOpMode() throws InterruptedException {
        Bot.initRAOIbot(hardwareMap);
        telemetry.addLine("<WAITING FOR START>");
        telemetry.update();
        waitForStart();

        while (opModeIsActive()) {

            requestOpModeStop();
        }
        idle();

    }


}
