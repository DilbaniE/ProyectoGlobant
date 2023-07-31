package org.example;

import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclao = new Scanner(System.in);
        Usuario objetoUsuario = new Usuario();

        System.out.print("dijite su nombre; ");
        objetoUsuario.setNombre(teclao.nextLine());

        System.out.println("su nombre es: " + objetoUsuario.getNombre());

    }
}