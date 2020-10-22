package org.firstinspires.ftc.teamcode.Bot_Wheems.lightsW;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;

public class Lights {

    public RevBlinkinLedDriver ledLightsW;
    public RevBlinkinLedDriver.BlinkinPattern ledPatternW;

    public void setLedPattern (RevBlinkinLedDriver.BlinkinPattern patternName) {
        ledLightsW.setPattern(patternName);

    }



}
