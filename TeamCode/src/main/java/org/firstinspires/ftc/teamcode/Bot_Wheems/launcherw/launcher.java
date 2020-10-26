package org.firstinspires.ftc.teamcode.Bot_Wheems.launcherw;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class launcher {

    public DcMotor launcher1;
    public DcMotor launcher2;
    public Servo dropper;
    double launcherPower = 5;

    public void stoplauncher () {
        launcher1.setPower(0);
        launcher2.setPower(0);

    }

    public void startlauncher (double power) {
        double ABSpower = Math.abs(power);
        launcher1.setPower(ABSpower);
        launcher2.setPower(ABSpower);

    }
    public void drop_ball_and_reset () throws InterruptedException {
        dropper.setPosition(0.5);
        wait(750);
        dropper.setPosition(0);

    }
    //this is all theoretical//
}
