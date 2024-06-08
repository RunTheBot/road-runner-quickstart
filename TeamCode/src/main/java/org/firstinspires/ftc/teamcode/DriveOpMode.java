package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.PoseVelocity2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Drive", group = "drive")
public class DriveOpMode extends OpMode {

    TankDrive tankDrive;
    @Override
    public void init() {
        tankDrive = new TankDrive(hardwareMap, new Pose2d(0, 0, 0));
        telemetry.addData("Auto", "Initialized");
    }

    @Override
    public void loop() {

        tankDrive.setDrivePowers(new PoseVelocity2d( new Vector2d(0, gamepad1.left_stick_y), gamepad1.right_stick_x));
        tankDrive.updatePoseEstimate();

    }
}































