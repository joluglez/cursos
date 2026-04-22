void main() {
    IO.println("*** Uso de Var en Java ***");
    String nombre1 = "Juan";
    IO.println("Nombre 1: " + nombre1);
    var nombre2 = "Carlos";
    IO.println("Nombre 2: " + nombre2);

    var edad = 30;
    IO.println("Edad: " + edad);

    var sueldo = 5000.5f;
    IO.println("Sueldo: " + sueldo);

    var esCasado = false;
    IO.println("esCasado = " + esCasado);
    esCasado = true;
    IO.println("esCasado = " + esCasado);
}
