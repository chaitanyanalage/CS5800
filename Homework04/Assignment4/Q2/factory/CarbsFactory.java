package Assignment4.Q2.factory;

import Assignment4.Q2.macronutrient.Carbs;
import Assignment4.Q2.macronutrient.Macronutrient;
import Assignment4.Q2.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbsFactory implements MacronutrientFactory{
    private static CarbsFactory instance;
    private final List<String> allowedCarbs;

    private CarbsFactory() {
        allowedCarbs = new ArrayList<>(List.of("Cheese", "Bread", "Lentils", "Pistachio"));
    }

    public static synchronized CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }

    @Override
    public Macronutrient create(Customer customer) {
        List<String> allowedCarbsCopy = new ArrayList<>(allowedCarbs);
        if (customer.getDietPlan().equals("No Restriction")) {
            allowedCarbsCopy = new ArrayList<>(allowedCarbs);
            Random random = new Random();
            String carb = allowedCarbsCopy.get(random.nextInt(allowedCarbsCopy.size()));
            return new Carbs(carb);
        } else if (customer.getDietPlan().equals("Paleo")) {
            return new Carbs("Pistachio");
        } else if (customer.getDietPlan().equals("Vegan")) {
            //vegan meal regimen prohibits the consumption of dairy items, such as cheese
            allowedCarbsCopy = new ArrayList<>(allowedCarbs);
            allowedCarbsCopy.remove("Cheese");
            Random random = new Random();
            String carb = allowedCarbsCopy.get(random.nextInt(allowedCarbsCopy.size()));
            return new Carbs(carb);
        } else if (customer.getDietPlan().equals("Nut Allergy")) {
            //dietary regimen for nut allergies prohibits the consumption of nuts, Pistachios included
            allowedCarbsCopy = new ArrayList<>(allowedCarbs);
            allowedCarbsCopy.remove("Pistachio");
            Random random = new Random();
            String carb = allowedCarbsCopy.get(random.nextInt(allowedCarbsCopy.size()));
            return new Carbs(carb);
        } else {
            //manage alternative dietary regimens or ineffective dietary strategies
            return null;
        }
    }

}

