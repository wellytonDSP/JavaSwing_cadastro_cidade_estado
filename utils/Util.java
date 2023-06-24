/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pr.senaccadastros.utils;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.print.DocFlavor.URL;

/**
 *
 * @author Admin
 */
public class Util {

    public static byte[] getBytesFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);

        System.out.print(file.toString());
        long length = file.length();

        byte[] bytes = new byte[(int) length];

        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
            offset += numRead;
        }

        if (offset < bytes.length) {
            throw new IOException("Erro ao ler arquivo: " + file.getName());
        }

        is.close();
        return bytes;
    }

    public static void salvaArquivo(String caminhoSalvar, File file) throws FileNotFoundException, IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(getBytesFromFile(file));
        InputStream stream = new BufferedInputStream(bais);

        String path = file.toString().replace(".", "=");

        String[] array01 = path.split("=");
        String[] array02 = caminhoSalvar.split("build/classes");

        String arquivo = array02[0] + "teste" + "." + array01[1];

        OutputStream bos = new FileOutputStream(arquivo);

        int bytesRead = 0;
        byte[] buffer = new byte[8192];
        while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        bos.close();
        stream.close();
    }
}
