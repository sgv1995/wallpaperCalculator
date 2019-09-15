import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество стен в вашей комнате:");
        int numberOfwalls = in.nextInt();
        double fullPerimeter = 0;

        for (int currentWall = 1; currentWall <= numberOfwalls; currentWall++) {
            System.out.println("Введите длину стены " + currentWall + ":");
            double wallPerimeter = in.nextDouble();
            fullPerimeter += wallPerimeter;

        }
        System.out.println("Периметр комнаты равен: " + fullPerimeter);
        System.out.println("Введите ширину обоев:");
        double wallpaperWidth = in.nextDouble();
        double cloth = fullPerimeter / wallpaperWidth;
        cloth = Math.ceil(cloth);
        System.out.println("Вам необходимо полотнищ: " + cloth);
        System.out.println("Введите длину рулона в метрах:");
        double rollLength = in.nextDouble();
        System.out.println("Введите высоту комнаты в метрах (например 2,75):");
        double roomHeight = in.nextDouble();
        roomHeight += 0.10;
        System.out.println("Высота потолка с учётом запаса в 10см: " + roomHeight);
        double fullStripes = rollLength / roomHeight;
        fullStripes = Math.floor(fullStripes);
        System.out.println("С одного рулона вы получите полных полос: " + fullStripes);
        double allWallpaperRolls = cloth / fullStripes;
        allWallpaperRolls = Math.ceil(allWallpaperRolls);
        System.out.println("Для ремонта вам необходимо рулонов обоев " + allWallpaperRolls + " при ширине рулона " + wallpaperWidth + "м и его длине " + rollLength + "м");


    }
}