package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Control;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Robot.Jetsam_Bot_Camden;

@TeleOp(name = "Jetsam:Camden:FirstDrive")
public class TelOp extends OpMode {

    public Jetsam_Bot_Camden Bot = new Jetsam_Bot_Camden();

    double speedMultiply = 1;

    public void init() {

        Bot.initJetsam(hardwareMap);
    }

    public void loop() {

        flagControl();
        drive();
        slowDrive();
        ledControl();

    }

    public void stop() {


    }

    public void slowDrive() {

        if (gamepad1.dpad_down) {
            speedMultiply = 0.5;
        } else if (gamepad1.dpad_up) {
            speedMultiply = 1;
        }
    }

    public void drive() {

        if (gamepad1.left_stick_y > .1) {

            Bot.driveForward(speedMultiply * gamepad1.left_stick_y);
        } else if (gamepad1.left_stick_y < -.1) {

            Bot.driveBackward(speedMultiply * gamepad1.left_stick_y);
        } else if (gamepad1.left_stick_x > .1) {

            Bot.turnRight(speedMultiply * gamepad1.left_stick_x);
        } else if (gamepad1.left_stick_x < -.1) {

            Bot.turnLeft(speedMultiply * gamepad1.left_stick_x);
        } else {

            Bot.stopMotors();
        }
    }

    public void flagControl() {

        if (gamepad1.right_bumper) {
            Bot.raiseFlag();
        }
        if (gamepad1.left_bumper) {
            Bot.lowerFlag();
        }


    }

    public void ledControl() {

        if (gamepad1.a) {
            Bot.setLedPattern(RevBlinkinLedDriver.BlinkinPattern.CONFETTI);
        } else if (gamepad1.b) {
            Bot.setLedPattern(RevBlinkinLedDriver.BlinkinPattern.STROBE_GOLD);
        } else if (gamepad1.y) {
            Bot.setLedPattern(RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_PARTY_PALETTE);
        }

    }


}