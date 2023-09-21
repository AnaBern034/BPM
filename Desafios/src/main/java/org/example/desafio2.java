package org.example;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class desafio2 {
    public static void  ConverterSegundosParaDataHora() {
            long segundos = 1693225566L;

            Instant instant = Instant.ofEpochSecond(segundos);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss")
                    .withZone(ZoneId.of("GMT"));

            String dataFormatada = formatter.format(instant);
         System.out.println(dataFormatada);
        }
    }

