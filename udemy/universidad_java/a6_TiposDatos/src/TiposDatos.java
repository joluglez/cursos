void main() {
    byte tipoByte = 127;
    IO.println("tipoByte = " + tipoByte);
    short tipoShort = 32767;
    IO.println("tipoShort = " + tipoShort);
    int tipoInt = 2147483647;
    IO.println("tipoInt = " + tipoInt);
    long tipoLong = 9223372036854775807L;
    IO.println("tipoLong = " + tipoLong);

    float tipoFloat = 3.14159f;
    IO.println("tipoFloat = " + tipoFloat);
    double tipoDouble = 3.141592653589793d;
    IO.println("tipoDouble = " + tipoDouble);

    char tipoChar = 'A';
    IO.println("tipoChar = " + tipoChar);
    tipoChar = 65;
    IO.println("tipoChar = " + tipoChar);
    tipoChar = '@';
    IO.println("tipoChar = " + tipoChar);

    boolean tipoBoolean = true;
    IO.println("tipoBoolean = " + tipoBoolean);
    tipoBoolean = false;
    IO.println("tipoBoolean = " + tipoBoolean);

    String nombre = null;
    IO.println("nombre = " + nombre);
    nombre = "Juan Pérez";
    IO.println("nombre = " + nombre);
}
