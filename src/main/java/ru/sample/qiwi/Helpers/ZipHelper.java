package ru.sample.qiwi.Helpers;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.IOUtils;

/**
 * Created by Дмитрий Астахов on 14.09.2016.
 */
public class ZipHelper {
    /**
     * Архивирование данных
     * @param bytes Архивируемые данные
     * @param filename Название архивируемого файла
     * @return Архив
     * @throws IOException
     */
    public static byte[] archivingData(byte[] bytes, String filename) throws IOException{
        ZipOutputStream zos = null;
        ByteArrayOutputStream bos = null;

        try {
            bos = new ByteArrayOutputStream();
            zos = new ZipOutputStream(bos);

            ZipEntry entry = new ZipEntry(filename);
            zos.putNextEntry(entry);
            zos.write(bytes);
        } catch(IOException e) {
            throw new IOException("Ошибка архивирования данных: " + e.getMessage());
        } finally {
            if (zos != null) {
                zos.close();
            }
        }

        return bos.toByteArray();
    }

    /**
     * Архивирование данных
     * @param input Текст
     * @param filename Название архивируемого файла
     * @return Архив
     * @throws IOException
     */
    public static byte[] archivingData(String input, String filename) throws IOException{
        return archivingData(input.getBytes(), filename);
    }

    // TODO: Архивирование нескольких файлов в один архив
    public static byte[][] archivingDataset(String[] inputs, String[] filenames) throws IOException{
        return null;
    }

    // TODO: Архивирование нескольких файлов в один архив
    public static byte[][] archivingDataset(byte[] inputs, String[] filenames) throws IOException{
        return null;
    }

    public static byte[] unarchivingData(byte[] input) throws IOException, Exception {
        String result;
        ZipEntry entry;
        final int BUFFER = 2048;
        ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(input));

        // Проверяем существуют ли файл в архиве
        entry = zis.getNextEntry();
        if (entry == null) {
            throw new Exception("Ошибка обработки архива: архив не содержит файлов"); // TODO: Изменить Exception
        }

        int count;
        byte data[] = new byte[BUFFER];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedOutputStream dest = new BufferedOutputStream(baos, BUFFER);

        while ((count = zis.read(data, 0, BUFFER)) != -1) {
            dest.write(data, 0, count);
        }
        dest.flush();
        dest.close();

        return baos.toByteArray();
    }

    public static String unarchivingData(InputStream inputStream) throws IOException, Exception {
        String result;
        result = new String(unarchivingData(IOUtils.toByteArray(inputStream)));

        return result;
    }

    // TODO: Разархивирование нескольких файлов из архива
    public static String[] unarchivingDataset(InputStream[] inputStream) throws IOException, Exception {
        return null;
    }

    // TODO: Разархивирование нескольких файлов из архива
    public static byte[] unarchivingDataset(byte[] inputStream) throws IOException, Exception {
        return null;
    }
}
