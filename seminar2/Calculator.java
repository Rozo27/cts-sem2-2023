import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */
    public double calculateSumOfPowers() {
        double result = 0.0;
        do {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Tastati valoarea pentru X:");
                double x = Double.parseDouble(reader.readLine());

                System.out.println("Tastati valoarea pentru Y:");
                double y = Double.parseDouble(reader.readLine());

                result = calculatePower(x, 5) + calculatePower(y, 7);
                break;
            } catch (IOException e) {
                System.out.println("The reading proccess cannot be done right now");
            } catch (NumberFormatException e) {
                System.out.println("The value that you entered is not numeric");
            }
        } while (result == 0.0);
        return result;
    }

    public double calculatePower(double base, int power) {
        double result = 1.0;
        for(int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }
}