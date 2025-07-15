package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import frc.robot.subsystems.SingleMotor;

public class TurnMotor extends Command {
    private final SingleMotor m_SingleMotor;
    private final CommandXboxController m_joystick;
    
    public TurnMotor(SingleMotor singleMotor, CommandXboxController joystick){
        this.m_SingleMotor = singleMotor;
        this.m_joystick = joystick;

        addRequirements(m_SingleMotor); // declare subsystem dependencies
    }

    @Override
    public void execute(){
        m_SingleMotor.motor.set(TalonSRXControlMode.PercentOutput, m_joystick.getLeftY() * 0.1);
    }

}
