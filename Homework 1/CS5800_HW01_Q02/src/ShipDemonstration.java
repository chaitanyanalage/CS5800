public class ShipDemonstration {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        //Assigned Ship, CruiseShip, and CargoShip objects as array element
        ships[0] = new Ship("Seawise Giant", "1979");
        ships[1] = new CruiseShip("Batillus Class", "1976", 3560);
        ships[2] = new CargoShip("Esso Atlantic/Esso Pacific", "1977", 5676);

        //Printing output using for loop
        for (Ship ship : ships) {
            ship.print();
            System.out.println("__________________________________\n");
        }
    }
}
