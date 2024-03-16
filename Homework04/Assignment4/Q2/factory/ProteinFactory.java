package Assignment4.Q2.factory;

import Assignment4.Q2.macronutrient.Macronutrient;
import Assignment4.Q2.macronutrient.Protein;
import Assignment4.Q2.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory implements MacronutrientFactory{
    private static ProteinFactory instance;
    private final List<String> allowedProteins;

    private ProteinFactory() {
        allowedProteins = new ArrayList<>(List.of("Fish", "Chicken", "Beef", "Tofu"));
    }

    public static synchronized ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    @Override
    public Macronutrient create(Customer customer) {
        List<String> allowedProteinsCopy = new ArrayList<>(allowedProteins);
        if (customer.getDietPlan().equals("No Restriction")) {
            allowedProteinsCopy = new ArrayList<>(allowedProteins);
            Random random = new Random();
            String protein = allowedProteinsCopy.get(random.nextInt(allowedProteinsCopy.size()));
            return new Protein(protein);
        } else if (customer.getDietPlan().equals("Vegan")) {
            //vegan diet regimen prohibits the consumption of all meat items
            allowedProteinsCopy = new ArrayList<>(allowedProteins);
            allowedProteinsCopy.remove("Fish");
            allowedProteinsCopy.remove("Chicken");
            Random random = new Random();
            String protein = allowedProteinsCopy.get(random.nextInt(allowedProteinsCopy.size()));
            return new Protein(protein);
        } else if (customer.getDietPlan().equalsIgnoreCase("Paleo")) {
            //paleo diet regimen limits specific protein options
            allowedProteinsCopy = new ArrayList<>(allowedProteins);
            allowedProteinsCopy.remove("Tofu");
            Random random = new Random();
            String protein = allowedProteinsCopy.get(random.nextInt(allowedProteinsCopy.size()));
            return new Protein(protein);
        } else if (customer.getDietPlan().equalsIgnoreCase("Nut Allergy")) {
            //
            allowedProteinsCopy = new ArrayList<>(allowedProteins);
            Random random = new Random();
            String protein = allowedProteinsCopy.get(random.nextInt(allowedProteinsCopy.size()));
            return new Protein(protein);
        }else {
            //dietary regimen for those with a nut allergy omits nuts
            return null;
        }
    }
}
