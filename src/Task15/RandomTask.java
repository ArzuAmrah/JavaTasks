package Task15;

import java.util.ArrayList;

public class RandomTask {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 51; i++) {
            int random = (int) (Math.random() * 2);
            arr.add(random);
        }
        System.out.println(arr);

        int secondNumber = secondNumberFind(arr);
        System.out.println("İkinci ən böyük ədəd: " + secondNumber);
    }

    public static int secondNumberFind(ArrayList<Integer> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("Listdə ən azı 2 ədəd olmalıdır");
        }

        int enBoyuk = Integer.MIN_VALUE;
        int ikinciEnBoyuk = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > enBoyuk) {
                ikinciEnBoyuk = enBoyuk;
                enBoyuk = num;
            } else if (num > ikinciEnBoyuk && num < enBoyuk) {
                ikinciEnBoyuk = num;
            }
        }

        return ikinciEnBoyuk;

    }
}
