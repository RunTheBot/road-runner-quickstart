package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.*;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;

import java.lang.Math;

@Autonomous(name = "Auto", group = "auto")
public class AutoOpMode extends OpMode {

    TankDrive tankDrive;
    TrajectoryActionBuilder builder;
    @Override
    public void init() {
        tankDrive = new TankDrive(hardwareMap, new Pose2d(0, 0, 0));
        telemetry.addData("Auto", "Initialized");

        builder = tankDrive.actionBuilder(tankDrive.pose);

        builder.turn(Math.toRadians(90));
    }

    @Override
    public void loop() {

        Actions.runBlocking(builder.build());

    }
}
