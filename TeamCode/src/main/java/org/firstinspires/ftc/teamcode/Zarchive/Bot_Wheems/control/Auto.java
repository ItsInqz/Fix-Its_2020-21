package org.firstinspires.ftc.teamcode.Zarchive.Bot_Wheems.control;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Zarchive.Bot_Wheems.Robot.Robot;

//@Autonomous (name= "auto Test")

public class Auto extends LinearOpMode {

    Robot Bot = new Robot();
    @Override
    public void runOpMode() throws InterruptedException {
        Bot.initWbot(hardwareMap);
        Bot.armStandard();
        Bot.handClose();
        telemetry.addLine("<WAITING FOR START>");
        telemetry.update();
        waitForStart();

        while (opModeIsActive()) {
            Bot.driveForward(-0.5);
            sleep(2000);
            Bot.turnright(0.66);
            sleep(1000);
            Bot.driveForward(0.5);
            //sleep(1000);
            //Bot.turnright(0.5);
            //sleep(1000);
            //Bot.driveForward(0.5);
            //sleep(1000);
            //Bot.stopp(0);
            //sleep(500);
            //Bot.armDown();
            //sleep(500);
            //Bot.handOpen();
            //sleep(1000);
            requestOpModeStop();
        }
        idle();

    }


}
