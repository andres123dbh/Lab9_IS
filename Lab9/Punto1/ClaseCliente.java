public class ClaseCliente {
    
    public static void main(String[] args)
    {
        Vehiculo berlina = new Berlina(new Diesel(), 100);
        berlina.MostrarCaracteristicas();
        Vehiculo monovolumen = new Monovolumen(new Diesel(), false);
        monovolumen.MostrarCaracteristicas();
    }
    
}
