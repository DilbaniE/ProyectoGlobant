package org.example;

import org.example.modelos.Local;
import org.example.modelos.Oferta;
import org.example.modelos.Reserva;
import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner teclao = new Scanner(System.in);
       //objeto usuario
        Usuario objetoUsuario = new Usuario();
        Local objetoLocal =  new Local();
        Oferta objetoOferta = new Oferta();
        Reserva objetoReserva = new Reserva();

       /* //validacion de nombre
        System.out.print("dijite su nombre; ");
        objetoUsuario.setNombres(teclao.nextLine());
        System.out.println("su nombre es: " + objetoUsuario.getNombres());*/

        /*System.out.print("Dijite su correo: ");
        objetoUsuario.setCorreo(teclao.nextLine());
        System.out.print("su correo es : " + objetoUsuario.getCorreo());*/

        /*System.out.print("Dijite su ubicacion: ");
        objetoUsuario.setUbicacion(teclao.nextInt());
        System.out.print("su ubicacion es : " + objetoUsuario.getUbicacion());*/


        /*System.out.print("Dijite su nit: ");
        objetoLocal.setNit(teclao.nextLine());
        System.out.print("su nit es : " + objetoLocal.getNit());*/

        /*System.out.print("Dijite el nombre dela empresa: ");
        objetoLocal.setNombre(teclao.nextLine());
        System.out.print("su nombre es : " + objetoLocal.getNombre());*/



        /*System.out.print("Dijite el titulo de la oferta: ");
        objetoOferta.setTitulo(teclao.nextLine());
        System.out.print("el titulo de la oferta es : " + objetoOferta.getTitulo());*/

        /*System.out.print("dijite la fecha inicio formato dd/MM/yyyy ");
        objetoOferta.setFechaInicio(teclao.nextLine());
        System.out.print(("su fecha inicio es: "  + objetoOferta.getFechaInicio()) + "\n");

        System.out.print("dijite la fecha fin formato dd/MM/yyyy ");
        objetoOferta.setFechaFin(teclao.nextLine());
        System.out.print("su fecha fin es: "  + objetoOferta.getFechaFin());*/

        /*System.out.print("dijite el cosot persona ");
        objetoOferta.setCostoPerson( teclao.nextDouble());
        System.out.print("el costo persona es: "  + objetoOferta.getCostoPerson());*/



        /*System.out.print("dijite el fecha de reserva en formato dd/MM/yyyy ");
        objetoReserva.setFechaReserva( teclao.nextLine());
        System.out.print("el la fecha de reserva es:  "  + objetoReserva.getFechaReserva());*/

        System.out.print("dijite el fecha de reserva en formato dd/MM/yyyy ");
        objetoReserva.setFechaReserva( teclao.nextLine());
        System.out.print("el la fecha de reserva es:  "  + objetoReserva.getFechaReserva());

    }
}