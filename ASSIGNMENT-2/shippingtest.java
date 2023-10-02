public class shippingtest {
    public static void main(String[] args) {
        try {
            Item item1 = new Document(100.0, 20); // Document with 20 pages
            Item item2 = new Box1(200.0, 0.5); // Box with 0.5 Kg weight (will throw an exception)

            // Compute and print the cost for the items
            System.out.println("Cost for Document: $" + item1.computeCost());
            System.out.println("Cost for Box: $" + item2.computeCost());
        } catch (WeightBelowMinimumException e) {
            System.out.println("WeightBelowMinimumException: " + e.getMessage());
        }

    }
}

// Custom exception for handling weight less than 1Kg
class WeightBelowMinimumException extends Exception {
    public WeightBelowMinimumException(String message) {
        super(message);
    }
}

// Abstract class Item
abstract class Item {
    protected double distance;

    public Item(double distance) {
        this.distance = distance;
    }

    // Abstract method to compute the cost
    public abstract double computeCost();
}

// Subclass for Document
class Document extends Item {
    private int numPages;

    public Document(double distance, int numPages) {
        super(distance);
        this.numPages = numPages;
    }

    @Override
    public double computeCost() {
        // Define the cost calculation for documents (e.g., based on numPages and
        // distance)
        double baseCost = 2.0; // Base cost per page
        double distanceFactor = 0.1; // Cost factor for distance
        return baseCost * numPages + distanceFactor * distance;
    }
}

// Subclass for Box
class Box1 extends Item {
    private double weight;

    public Box1(double distance, double weight) throws WeightBelowMinimumException {
        super(distance);
        if (weight < 1.0) {
            throw new WeightBelowMinimumException("Weight must be at least 1Kg");
        }
        this.weight = weight;
    }

    @Override
    public double computeCost() {
        // Define the cost calculation for boxes (e.g., based on weight and distance)
        double baseCost = 5.0; // Base cost per Kg
        double distanceFactor = 0.2; // Cost factor for distance
        return baseCost * weight + distanceFactor * distance;
    }
}
