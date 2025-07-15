package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.SingleMotor;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;

public class ForceStop extends Command {
    private final SingleMotor m_SingleMotor;
    public ForceStop(SingleMotor singleMotor){
        this.m_SingleMotor = singleMotor;
        addRequirements(m_SingleMotor);
    }

    @Override
    public void execute(){
        m_SingleMotor.motor.set(TalonSRXControlMode.PercentOutput, 0);
    }
}
