// Задание 3 - Напишите метод, который определит тип (расширение)
// файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

import java.io.File;

public class Task03 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println("Расширение файла: " + getFileExtension(file));

        file = new File("log.xml");
        System.out.println("Расширение файла: " + getFileExtension(file));

        file = new File("img.jpg");
        System.out.println("Расширение файла: " + getFileExtension(file));

        file = new File("img");
        System.out.println("Расширение файла: " + getFileExtension(file));
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "Расширение не найдено";
    }

}
