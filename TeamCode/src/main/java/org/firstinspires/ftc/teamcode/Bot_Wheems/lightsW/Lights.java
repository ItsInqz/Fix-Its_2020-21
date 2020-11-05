package org.firstinspires.ftc.teamcode.Bot_Wheems.lightsW;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import org.firstinspires.ftc.teamcode.Bot_Wheems.launcherw.launcher;

public class Lights extends launcher{

    public RevBlinkinLedDriver ledLightsW;
    public RevBlinkinLedDriver.BlinkinPattern ledPatternW;

    public void setLedPattern (RevBlinkinLedDriver.BlinkinPattern patternName) {
        ledLightsW.setPattern(patternName);

    }



}
