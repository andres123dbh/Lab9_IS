public abstract class Vehiculo {
    private IMotor motor;

    public Vehiculo(IMotor motor){
        this.motor = motor;
    }

    public IMotor getMotor() {
        return this.motor;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    public void Acelerar(double aceleracion){
    }

    public void Frenar(){
    }

    public void MostrarCaracteristicas(){
    }
}
