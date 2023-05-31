package com.pp2;

public class TestTh extends Thread{
	private String nombre;
    private int retardo;

    // Constructor para almacenar nuestro nombre
    // y el retardo
    public TestTh( String s,int d ) {
        nombre = s;
        retardo = d;
        }

    // El metodo run() es similar al main(), pero para
    // threads. Cuando run() termina el thread muere
    public void run() {
        // Retasamos la ejecuci�n el tiempo especificado
        try {
            sleep( retardo );
        } catch( InterruptedException e ) {
            System.out.println("Hilo morido, compruebe su conexi�n.");
        }

        // Ahora imprimimos el nombre
        System.out.println( "Hola Mundo! "+nombre+" "+retardo );
        }
}
