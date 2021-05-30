package com.tfg.demo.utils;

import java.io.File;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author igorr clase encargada en descargar imagen  *
 */
public class DescargaImagen {

    private static final Logger log = LoggerFactory.getLogger(DescargaImagen.class);

    public static String descargaImagen(MultipartFile multiPart, String ruta) {
        //obtenemos el nombre original de archivo
        String nombreOriginal = multiPart.getOriginalFilename();
        nombreOriginal = nombreOriginal.replace(" ", "_");
        String nombreFinal = randomAlphaNumeric(28) + nombreOriginal;
        try {
            log.debug("el metodo: " + "descargaImagen " + "comenzando...");
            File imagenFile = new File(ruta + nombreFinal);
            log.debug("el metodo: " + "descargaImagen " + "Archivo se ha guardado en====================>"
                    + imagenFile.getAbsolutePath());

            //guardar fiscamente el archivo
            multiPart.transferTo(imagenFile);
            log.debug("el metodo: " + "descargaImagen " + "fin...");

            return nombreFinal;
        } catch (IOException e) {
            log.debug("el metodo: " + "descargaImagen " + "ha fallado, razon: " + e.getMessage());

            return null;
        }

    }

    /**
     * metodo para generar una cadena aleatoria de longitud N
     *
     * @param count
     * @return
     */
    public static String randomAlphaNumeric(int count) {
        String CARACTERES = "zaqwsxcderfvbgtyhnmjuikñpç1234567890";
        StringBuilder sBuilder = new StringBuilder();
        while (count-- != 0) {
            int caracter = (int) (Math.random() * CARACTERES.length());
            sBuilder.append(CARACTERES.charAt(caracter));
        }
        return sBuilder.toString();
    }

}
