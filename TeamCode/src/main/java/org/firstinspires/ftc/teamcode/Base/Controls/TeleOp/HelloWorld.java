package org.firstinspires.ftc.teamcode.Base.Controls.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "TeleOp:HelloWorld", group ="Intro")

public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "World");
    }
    @Override
    public void loop() {

    }
}
// This is a single line comment

/*
This is a multi-line comment
Comment Line 2
 */