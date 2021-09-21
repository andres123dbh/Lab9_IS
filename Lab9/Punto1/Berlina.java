public class Berlina extends Vehiculo{

    private int CapacidadMaletero;

    public int getCapacidadMaletero() {
        return this.CapacidadMaletero;
    }

    public void setCapacidadMaletero(int CapacidadMaletero) {
        this.CapacidadMaletero = CapacidadMaletero;
    }


    public Berlina(IMotor motor, int CapacidadMaletero){
        super(motor);
        this.CapacidadMaletero = CapacidadMaletero;

    }

    @Override
    public void MostrarCaracteristicas(){
        System.out.println("Berlina");
    }
}
