package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion) {
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 0: {
                while (!sc.hasNextInt()) {
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1: {
                while (!sc.hasNextDouble()) {
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return validado;
    }

    public static boolean validarNumero(int numero) {
        boolean validado = true;
        if (numero < 0 || numero > 99) {
            validado = false;
        }
        return validado;
    }

    public static String unidades(char numero) {
        String numeroString = "";
        switch (numero) {
            case '0':
                numeroString = "CERO";
                break;
            case '1':
                numeroString = "UNO";
                break;
            case '2':
                numeroString = "DOS";
                break;
            case '3':
                numeroString = "TRES";
                break;
            case '4':
                numeroString = "CUATRO";
                break;
            case '5':
                numeroString = "CINCO";
                break;
            case '6':
                numeroString = "SEIS";
                break;
            case '7':
                numeroString = "SIETE";
                break;
            case '8':
                numeroString = "OCHO";
                break;
            case '9':
                numeroString = "NUEVE";
                break;
        }
        return numeroString;
    }

    public static String decenasEspeciales(int numero) {
        String numeroString = "";
        switch (numero) {
            case 10:
                numeroString = "DIEZ";
                break;
            case 11:
                numeroString = "ONCE";
                break;
            case 12:
                numeroString = "DOCE";
                break;
            case 13:
                numeroString = "TRECE";
                break;
            case 14:
                numeroString = "CATORCE";
                break;
            case 15:
                numeroString = "QUINCE";
                break;
            case 16:
                numeroString = "DIECISEIS";
                break;
            case 17:
                numeroString = "DIECISIETE";
                break;
            case 18:
                numeroString = "DIECIOCHO";
                break;
            case 19:
                numeroString = "DIECINUEVE";
                break;
            case 20:
                numeroString = "VEINTE";
                break;
            case 21:
                numeroString = "VEINTIUNO";
                break;
            case 22:
                numeroString = "VEINTIDOS";
                break;
            case 23:
                numeroString = "VEINTITRES";
                break;
            case 24:
                numeroString = "VEINTICUATRO";
                break;
            case 25:
                numeroString = "VEINTICINCO";
                break;
            case 26:
                numeroString = "VEINTISEIS";
                break;
            case 27:
                numeroString = "VEINTISIETE";
                break;
            case 28:
                numeroString = "VEINTIOCHO";
                break;
            case 29:
                numeroString = "VEINTINUEVE";
                break;
        }
        return numeroString;
    }

    public static String decenas(char numero) {
        String numeroString = "";
        switch (numero) {
            case '3':
                numeroString = "TREINTA";
                break;
            case '4':
                numeroString = "CUARENTA";
                break;
            case '5':
                numeroString = "CINCUENTA";
                break;
            case '6':
                numeroString = "SESENTA";
                break;
            case '7':
                numeroString = "SETENTA";
                break;
            case '8':
                numeroString = "OCHENTA";
                break;
            case '9':
                numeroString = "NOVENTA";
                break;
        }
        return numeroString;
    }

    public static void main(String[] args) {
        int numero, numeroCifras, unidades, decenas;
        char primeraCifra, segundaCifra;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a transformar un valor numérico a uno alfabético!");
        System.out.print("Introduce un número: ");
        numero = (int) validador(0);
        while (!validarNumero(numero)) {
            System.out.print("¡Introduce un número entre 0 y 99! ");
            numero = (int) validador(0);
        }
        sc.close();
        numeroCifras = String.valueOf(numero).length();
        if (numeroCifras < 2) {
            primeraCifra = String.valueOf(numero).charAt(0);
            System.out.println(unidades(primeraCifra));
        } else if (numero < 30) {
            System.out.println(decenasEspeciales(numero));
        } else {
            primeraCifra = String.valueOf(numero).charAt(0);
            segundaCifra = String.valueOf(numero).charAt(1);
            if (segundaCifra == '0') {
                System.out.printf("%s\n", decenas(primeraCifra));
            } else {
                System.out.printf("%s y %s\n", decenas(primeraCifra), unidades(segundaCifra));
            }
        }
    }
}
