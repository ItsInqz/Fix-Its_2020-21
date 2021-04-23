package org.firstinspires.ftc.teamcode.RAOI.control;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.RAOI.Robot.Robot;


@Autonomous(name= "RAOI auto")
public class Auto extends LinearOpMode {

    Robot Bot = new Robot();
    private ElapsedTime run = new ElapsedTime();
    //power to go 1 foot in 1 sec//
    public double foot = 1;
    public double turn =1;
    public double mode = 0;
    public double modechange = 0;

    @Override
    public void runOpMode() throws InterruptedException {
        Bot.initRAOIbot(hardwareMap);
        telemetry.addLine("<WAITING FOR START>");
        telemetry.update();
        waitForStart();
        while (modechange==0) {
            if (gamepad1.right_bumper) {
                mode += 1;

                if (mode > 3) {
                mode = 0;
            }} else if (gamepad1.left_bumper) {
                mode -= 1;

                if (mode < 0) {
                    mode = 3;
                }}
            if (gamepad1.start) {
                modechange = 1;
            }
        }
        if (mode == 1) {
            while (opModeIsActive() && run.seconds() < 4) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", run.seconds());
                Bot.driveForward(foot);
            }
            run.reset();
            while (opModeIsActive() && run.seconds() < 1) {
                telemetry.addData("Path", "Leg 2: %2.5f S Elapsed", run.seconds());
                Bot.spinLeft(turn);
            }
            while (opModeIsActive() && run.seconds() < 2) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", run.seconds());
                Bot.driveForward(foot);
            }}
        else if (mode == 2) {
            while (opModeIsActive() && run.seconds() < 2) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", run.seconds());
                Bot.driveForward(foot);
            }
            run.reset();
            while (opModeIsActive() && run.seconds() < 1) {
                telemetry.addData("Path", "Leg 2: %2.5f S Elapsed", run.seconds());
                Bot.spinLeft(turn);
            }
            while (opModeIsActive() && run.seconds() < 2) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", run.seconds());
                Bot.driveForward(foot);
            }}
        else if (mode == 3) {
            while (opModeIsActive() && run.seconds() < 2) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", run.seconds());
                Bot.driveForward(foot);
            }
            run.reset();
            while (opModeIsActive() && run.seconds() < 1) {
                telemetry.addData("Path", "Leg 2: %2.5f S Elapsed", run.seconds());
                Bot.spinright(turn);
            }
            while (opModeIsActive() && run.seconds() < 2) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", run.seconds());
                Bot.driveForward(foot);
            }}
        requestOpModeStop();

        idle();

    }


}
