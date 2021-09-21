public class Monovolumen extends Vehiculo{

    private boolean PuertaCorrediza;

    public boolean getPuertaCorrediza() {
        return this.PuertaCorrediza;
    }

    public void setPuertaCorrediza(boolean PuertaCorrediza) {
        this.PuertaCorrediza = PuertaCorrediza;
    }

    public Monovolumen(IMotor motor, boolean PuertaCorrediza){
        super(motor);
        this.PuertaCorrediza = PuertaCorrediza;
    }

    @Override
    public void MostrarCaracteristicas(){
        System.out.println("Monovolumen");
    }
    
}
