// Задание 2 - Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;

public class Task02 {
    
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Task02.class.getName());
        FileHandler fh = new FileHandler("loggerTask02.xml");
        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

       
        int[] nums = {2, 1, 3, 6, 9, 4, 153, 0};
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            logger.log(Level.INFO, "Сообщение");

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i+1]) {
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
       
        }
        
        for (int i : nums) {
            System.out.println(i);
        }
        

    }

}
