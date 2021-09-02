package org.firstinspires.ftc.teamcode.Zarchive.RAOI.control;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Zarchive.RAOI.Robot.Robot;

   // @TeleOp(name = "TeleOp AOI", group = "RAOI")

    public class TwoMotorDriveTeleOpAOI extends OpMode {

        public Robot Bot = new Robot();

        double speedMultiply = 1;


        public void init() {

            Bot.initRAOIbot(hardwareMap);
        }

        public void loop() {
            speed();
            drive();
            elevator();
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
            if (gamepad1.dpad_up) {

                Bot.up(0.35);

            } else if (gamepad1.dpad_down) {

                Bot.down(0.35);

            }
            else {
                Bot.StopEle();
            }

        }
}
