/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mias;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author Sergio Salvador
 */
public class fechas {

    public static void main(String[] args) {
        LocalDateTime hoyAhora = LocalDateTime.now();
        System.out.println(hoyAhora); 

        LocalDateTime AnoNuevo = LocalDateTime.of(2022, Month.JANUARY, 1, 0, 0, 0);

        long tiemporestante = Duration.between(hoyAhora, AnoNuevo).getSeconds();
        long dias = tiemporestante / 60 / 60 / 24;
        tiemporestante -= dias * 60 * 60 * 24;
        long horas = tiemporestante / 60 / 60;
        tiemporestante -= horas * 60 *60;
        long min = tiemporestante / 60;

        System.out.println("Los días restantes para año nuevo son: " +dias+"d "+horas+"h "+min+"m");
    }
}
