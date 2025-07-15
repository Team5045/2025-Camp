package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class SingleMotor extends SubsystemBase {
    public TalonSRX motor;
    public SingleMotor(int id){
        motor = new TalonSRX(id);
    }
}
