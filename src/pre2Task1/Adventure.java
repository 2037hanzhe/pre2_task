package pre2Task1;

import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String description = sc.nextLine();
        String[] item = description.split(" "); //读取整条描述信息并进行切割

        int id = Integer.parseInt(item[0]);
        String name = item[1];
        long price = Long.parseLong(item[2]);
        double capacity = Double.parseDouble(item[3]);  //按空格进行分割，并转换数据类型

        Bottle bottle = new Bottle(id, name, price, capacity);  //创建新瓶子

        int m = sc.nextInt();
        int op;
        for (int i = 0; i < m; i++) {
            op = sc.nextInt();
            if (op == 5) {
                long priceRevised = sc.nextLong();
                Operate5(priceRevised, bottle);
            } else if (op == 6) {
                boolean filled = sc.nextBoolean();
                Operate6(filled, bottle);
            } else {
                Operate(op, bottle);
            }
        }
    }

    private static void Operate(int op, Bottle bottle) {
        if (op == 1) {
            System.out.println(bottle.getName());
        } else if (op == 2) {
            System.out.println(bottle.getPrice());
        } else if (op == 3) {
            System.out.println(bottle.getCapacity());
        } else if (op == 4) {
            System.out.println(bottle.isFilled());
        } else if (op == 7) {
            System.out.println(bottle.toString());
        }
    }

    private static void Operate5(long price, Bottle bottle) {
        bottle.setPrice(price);
    }

    private static void Operate6(boolean filled, Bottle bottle) {
        bottle.setFilled(filled);
    }
}
