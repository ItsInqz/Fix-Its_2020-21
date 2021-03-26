package org.firstinspires.ftc.teamcode.RAOI.control;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RAOI.Robot.Robot;

    @TeleOp(name = "TeleOp AOI", group = "RAOI")

    public class TwoMotorDriveTeleOpAOI extends OpMode {

        public Robot Bot = new Robot();

        double speedMultiply = 1;


        public void init() {

            Bot.initRAOIbot(hardwareMap);
        }

        public void loop() {
            speed();
            drive();
        }

        public void speed()  {
            if (gamepad1.left_stick_button){
                speedMultiply = 0.5;

            } else if (gamepad1.right_stick_button){
                speedMultiply = 1;

            }

        }


        public void drive() {

            if (gamepad1.left_stick_y > .1) {

                Bot.reverse(speedMultiply*gamepad1.left_stick_y);

            } else if (gamepad1.left_stick_y < -.1) {

                Bot.driveForward(speedMultiply*gamepad1.left_stick_y);

            } else if (gamepad1.left_stick_x > .1) {

                Bot.spinLeft(speedMultiply*gamepad1.left_stick_x);

            } else if (gamepad1.left_stick_x < -.1) {

                Bot.spinright(speedMultiply*gamepad1.left_stick_x);

            } else {

                Bot.stopMotors();
            }
        }
        public void elevator() {
            if (gamepad1.y) {

                Bot.down();

            } else if (gamepad1.a) {

                Bot.down();

            }

        }
}
