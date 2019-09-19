import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество стен в вашей комнате:");
        int numberOfWalls = in.nextInt();
        double fullPerimeter = 0;

        for (int currentWall = 1; currentWall <= numberOfWalls; currentWall++) {
            System.out.println("Введите длину стены " + currentWall + ":");
            double wallLength = in.nextDouble();
            fullPerimeter += wallLength;

        }
        System.out.println("Периметр комнаты равен: " + fullPerimeter);
        System.out.println("Введите ширину обоев:");
        double wallpaperWidth = in.nextDouble();
        double cloth = Math.ceil(fullPerimeter / wallpaperWidth);
        System.out.println("Вам необходимо полотнищ: " + cloth);
        System.out.println("Введите длину рулона в метрах:");
        double rollLength = in.nextDouble();
        System.out.println("Введите высоту комнаты в метрах (например 2,75):");
        double roomHeight = in.nextDouble();
        System.out.println("Высота потолка: " + roomHeight);
        double fullStripes = Math.floor(rollLength / roomHeight);
        System.out.println("С одного рулона вы получите полных полос: " + fullStripes);
        double allWallpaperRolls = Math.ceil(cloth / fullStripes);
        System.out.println("Для ремонта вам необходимо рулонов обоев " + allWallpaperRolls + " при ширине рулона " + wallpaperWidth + "м и его длине " + rollLength + "м");


    }
}