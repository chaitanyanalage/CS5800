package Assignment4.Q2.factory;

import Assignment4.Q2.model.Customer;

public class MacronutrientAbstractFactory {
    private static MacronutrientAbstractFactory instance;

    private MacronutrientAbstractFactory() {
        //constructor that is private to disallow instantiation from external sources.
    }

    public static synchronized MacronutrientAbstractFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientAbstractFactory();
        }
        return instance;
    }

    public CarbsFactory createCarbsFactory() {
        return CarbsFactory.getInstance();
    }

    public ProteinFactory createProteinFactory() {
        return ProteinFactory.getInstance();
    }

    public FatsFactory createFatsFactory() {
        return FatsFactory.getInstance();
    }
}
