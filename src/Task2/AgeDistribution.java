package Task2;

import java.util.Random;

public class AgeDistribution {

    public static void main(String[] args) {

        final int ITERATIONS = 1000;
        final int MAXAGE = 35;

        int ageDistribution[][] = {
                {16, 20},
                {34, 21},
                {52, 22},
                {68, 23},
                {82, 24},
                {89, 25},
                {94, 26},
                {96, 28},
                {98, 30},
                {100, MAXAGE}
        };

        int generatedAges[] = new int[MAXAGE + 1];

        Random random = new Random();

        for (int i = 1; i <= ITERATIONS; i++) {

            int x = random.nextInt(100) + 1;

            int j = 0;

            while (x > ageDistribution[j][0]) {
                j++;
            }

            generatedAges[ageDistribution[j][1]]++;
        }

        System.out.println("Age   Count   Percentage");

        for (int age = 0; age <= MAXAGE; age++) {

            if (generatedAges[age] != 0) {

                double percentage =
                        (double) generatedAges[age] / ITERATIONS * 100;

                System.out.printf("%-5d %-7d %.2f%%\n",
                        age, generatedAges[age], percentage);
            }
        }
    }
}