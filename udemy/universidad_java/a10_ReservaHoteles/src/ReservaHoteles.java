public class ReservaHoteles {
    static void main() {
        var nombreCliente = "Pedro Flores";
        var diasEstancia = 10;
        var tarifaDiaria = 549.9f;
        var tieneVistaMar = true;

        IO.println("Nombre Cliente: " + nombreCliente);
        IO.println("Dias Estancia: " + diasEstancia);
        IO.println("Tarifa Diaria: " + tarifaDiaria);
        IO.println("Tiene Vista Mar: " + tieneVistaMar);

        diasEstancia = 7;
        tarifaDiaria = 525.9f;
        tieneVistaMar = false;

        IO.println();
        IO.println("--- Actualización de Reserva ---");
        IO.println("Nombre Cliente: " + nombreCliente);
        IO.println("Dias Estancia: " + diasEstancia);
        IO.println("Tarifa Diaria: " + tarifaDiaria);
        IO.println("Tiene Vista Mar: " + tieneVistaMar);
    }
}
