void main() {
    String nombreProducto = "Desarmado";
    float precio = 99.5f;
    int cantidadDisponible = 46;
    boolean estaDisponible = true;

    IO.println("Nombre del producto: " + nombreProducto);
    IO.println("Precio del producto: " + precio);
    IO.println("Cantidad de disponible: " + cantidadDisponible);
    IO.println("¿Está disponible? " + estaDisponible);

    nombreProducto = "Martillo";
    precio = 76.0f;
    cantidadDisponible = 0;
    estaDisponible = false;

    IO.println("Nombre del producto: " + nombreProducto);
    IO.println("Precio del producto: " + precio);
    IO.println("Cantidad de disponible: " + cantidadDisponible);
    IO.println("¿Está disponible? " + estaDisponible);
}
