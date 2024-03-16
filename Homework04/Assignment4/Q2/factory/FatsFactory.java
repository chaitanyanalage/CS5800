package Assignment4.Q2.factory;

import Assignment4.Q2.macronutrient.Fats;
import Assignment4.Q2.macronutrient.Macronutrient;
import Assignment4.Q2.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatsFactory implements MacronutrientFactory{
    private static FatsFactory instance;
    private final List<String> allowedFats;

    private FatsFactory() {
        allowedFats = new ArrayList<>(List.of("Avocado", "Sour cream", "Tuna", "Peanuts"));
    }

    public static synchronized FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }

    @Override
    public Macronutrient create(Customer customer) {
        List<String> allowedFatsCopy = new ArrayList<>(allowedFats);
        if (customer.getDietPlan().equals("No Restriction")) {
            allowedFatsCopy = new ArrayList<>(allowedFats);
            Random random = new Random();
            String fat = allowedFatsCopy.get(random.nextInt(allowedFatsCopy.size()));
            return new Fats(fat);
        } else if (customer.getDietPlan().equals("Paleo")) {
            //paleo diet regimen excludes all dairy items, such as Sour cream, from its permitted foods
            allowedFatsCopy = new ArrayList<>(allowedFats);
            allowedFatsCopy.remove("Sour cream");
            Random random = new Random();
            String fat = allowedFatsCopy.get(random.nextInt(allowedFatsCopy.size()));
            return new Fats(fat);
        } else if (customer.getDietPlan().equals("Vegan")) {
            //vegan meal plan prohibits the consumption of dairy items, such as sour cream
            allowedFatsCopy = new ArrayList<>(allowedFats);
            allowedFatsCopy.remove("Sour cream");
            allowedFatsCopy.remove("Tuna");
            Random random = new Random();
            String fat = allowedFatsCopy.get(random.nextInt(allowedFatsCopy.size()));
            return new Fats(fat);
        } else if (customer.getDietPlan().equals("Nut Allergy")) {
            //dietary regimen for those with a nut allergy prohibits the consumption of nuts, including peanuts.
            allowedFatsCopy = new ArrayList<>(allowedFats);
            allowedFatsCopy.remove("Peanuts");
            Random random = new Random();
            String fat = allowedFatsCopy.get(random.nextInt(allowedFatsCopy.size()));
            return new Fats(fat);
        } else {
            //manage alternative dietary regimens or ineffective dietary strategies.
            return null;
        }
    }
}

