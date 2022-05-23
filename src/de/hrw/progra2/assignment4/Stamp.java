package de.hrw.progra2.assignment4;

public class Stamp {

    private final long id = this.hashCode();
    private String name;
    private int publisherYear;
    private String country;
    private float shippingValue;
    private int numberOfCopies;
    private boolean collectibleCondition;
    private float collectibleValue;

    public Stamp() {
    }

    public Stamp(String name, int publisherYear, String country, float shippingValue, int numberOfCopies, boolean collectibleCondition) {
        this.name = name;
        this.publisherYear = publisherYear;
        this.country = country;
        this.shippingValue = shippingValue;
        this.numberOfCopies = numberOfCopies;
        this.collectibleCondition = collectibleCondition;
        if (collectibleCondition) {
            this.collectibleValue = ((float) publisherYear / (float) numberOfCopies) + shippingValue;
        } else {
            this.collectibleValue = ((float) publisherYear / (float) numberOfCopies);
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getShippingValue() {
        return shippingValue;
    }

    public void setShippingValue(float shippingValue) {
        this.shippingValue = shippingValue;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public boolean isCollectibleCondition() {
        return collectibleCondition;
    }

    public void setCollectibleCondition(boolean collectibleCondition) {
        this.collectibleCondition = collectibleCondition;
    }

    public float getCollectibleValue() {
        return collectibleValue;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisherYear=" + publisherYear +
                ", country='" + country + '\'' +
                ", shippingValue=" + shippingValue +
                ", numberOfCopies=" + numberOfCopies +
                ", collectibleCondition=" + collectibleCondition +
                ", collectibleValue=" + collectibleValue +
                '}';
    }

    public boolean increasedInValue() {
        return collectibleValue > shippingValue;
    }

    public String estimateRarity() {

        if (numberOfCopies <= 200 && numberOfCopies >= 0) {
            return "extravagante Seltenheit";
        } else if (numberOfCopies <= 10000) {
            return "reguläre Seltenheit";
        } else {
            return "keine Seltenheit";
        }

    }

    public boolean isGermanHistoryStamp() {
        return country.equals("Germany") && publisherYear <= 1945;
    }

    public Stamp olderStamp(Stamp stamp) {
        if (this.publisherYear < stamp.publisherYear) {
            return this;
        } else {
            return stamp;
        }
    }

    public static void main(String[] args) {
        Stamp stamp1 = new Stamp("Herbert", 1945, "France", 5, 5000, true);
        Stamp stamp2 = new Stamp("Peter", 1940, "America", 20, 9424, false);
        Stamp stamp3 = new Stamp("Manfred", 1960, "Poland", 40, 15000, true);

        StampCollection stampCollection = new StampCollection();
        stampCollection.addStamp(stamp1);
        stampCollection.addStamp(stamp2);
        stampCollection.addStamp(stamp3);

        System.out.println(stamp1);
        System.out.println(stamp2);
        System.out.println(stamp3);
        System.out.println("-------------------------");

        System.out.println(stampCollection);
        System.out.println("-------------------------");

        System.out.println("ID Stamp 1: " + stamp1.getId());
        System.out.println("ID Stamp 2: " + stamp2.getId());
        System.out.println("ID Stamp 3: " + stamp3.getId());
        System.out.println("-------------------------");

        System.out.println("Name der Stamp 1: " + stamp1.getName());
        System.out.println("Name der Stamp 2: " + stamp2.getName());
        System.out.println("Name der Stamp 3: " + stamp3.getName());
        System.out.println("-------------------------");

        stamp1.setName("Karl");
        stamp2.setName("Meier");
        stamp3.setName("Uwe");

        System.out.println("Name der Stamp 1 nach Anpassung: " + stamp1.getName());
        System.out.println("Name der Stamp 2 nach Anpassung: " + stamp2.getName());
        System.out.println("Name der Stamp 3 nach Anpassung: " + stamp3.getName());
        System.out.println("-------------------------");

        System.out.println("PublisherYear der Stamp 1: " + stamp1.getPublisherYear());
        System.out.println("PublisherYear der Stamp 2: " + stamp2.getPublisherYear());
        System.out.println("PublisherYear der Stamp 3: " + stamp3.getPublisherYear());
        System.out.println("-------------------------");

        stamp1.setPublisherYear(1934);
        stamp2.setPublisherYear(1924);
        stamp3.setPublisherYear(1952);

        System.out.println("PublisherYear der Stamp 1 nach Anpassung: " + stamp1.getPublisherYear());
        System.out.println("PublisherYear der Stamp 2 nach Anpassung: " + stamp2.getPublisherYear());
        System.out.println("PublisherYear der Stamp 3 nach Anpassung: " + stamp3.getPublisherYear());
        System.out.println("-------------------------");

        System.out.println("Country der Stamp 1: " + stamp1.getCountry());
        System.out.println("Country der Stamp 2: " + stamp2.getCountry());
        System.out.println("Country der Stamp 3: " + stamp3.getCountry());
        System.out.println("-------------------------");

        stamp1.setCountry("Germany");
        stamp2.setCountry("Egypt");
        stamp3.setCountry("Switzerland");

        System.out.println("Country der Stamp 1 nach Anpassung: " + stamp1.getCountry());
        System.out.println("Country der Stamp 2 nach Anpassung: " + stamp2.getCountry());
        System.out.println("Country der Stamp 3 nach Anpassung: " + stamp3.getCountry());
        System.out.println("-------------------------");

        System.out.println("ShippingValue der Stamp 1: " + stamp1.getShippingValue());
        System.out.println("ShippingValue der Stamp 2: " + stamp2.getShippingValue());
        System.out.println("ShippingValue der Stamp 3: " + stamp3.getShippingValue());
        System.out.println("-------------------------");

        stamp1.setShippingValue(30);
        stamp2.setShippingValue(10);
        stamp3.setShippingValue(20);

        System.out.println("ShippingValue der Stamp 1 nach Anpassung: " + stamp1.getShippingValue());
        System.out.println("ShippingValue der Stamp 2 nach Anpassung: " + stamp2.getShippingValue());
        System.out.println("ShippingValue der Stamp 3 nach Anpassung: " + stamp3.getShippingValue());
        System.out.println("-------------------------");

        System.out.println("NumberOfCopies der Stamp 1: " + stamp1.getNumberOfCopies());
        System.out.println("NumberOfCopies der Stamp 2: " + stamp2.getNumberOfCopies());
        System.out.println("NumberOfCopies der Stamp 3: " + stamp3.getNumberOfCopies());
        System.out.println("-------------------------");

        stamp1.setNumberOfCopies(180);
        stamp2.setNumberOfCopies(413241);
        stamp3.setNumberOfCopies(20);

        System.out.println("NumberOfCopies der Stamp 1 nach Anpassung: " + stamp1.getNumberOfCopies());
        System.out.println("NumberOfCopies der Stamp 2 nach Anpassung: " + stamp2.getNumberOfCopies());
        System.out.println("NumberOfCopies der Stamp 3 nach Anpassung: " + stamp3.getNumberOfCopies());
        System.out.println("-------------------------");

        System.out.println("Status CollectibleCondition der Stamp 1: " + stamp1.isCollectibleCondition());
        System.out.println("Status CollectibleCondition der Stamp 2: " + stamp2.isCollectibleCondition());
        System.out.println("Status CollectibleCondition der Stamp 3: " + stamp3.isCollectibleCondition());
        System.out.println("-------------------------");

        stamp1.setCollectibleCondition(false);
        stamp2.setCollectibleCondition(true);
        stamp3.setCollectibleCondition(false);

        System.out.println("Status CollectibleCondition der Stamp 1 nach Anpassung: " + stamp1.isCollectibleCondition());
        System.out.println("Status CollectibleCondition der Stamp 2 nach Anpassung: " + stamp2.isCollectibleCondition());
        System.out.println("Status CollectibleCondition der Stamp 3 nach Anpassung: " + stamp3.isCollectibleCondition());
        System.out.println("-------------------------");

        System.out.println("CollectibleValue der Stamp 1: " + stamp1.getCollectibleValue());
        System.out.println("CollectibleValue der Stamp 2: " + stamp2.getCollectibleValue());
        System.out.println("CollectibleValue der Stamp 3: " + stamp3.getCollectibleValue());
        System.out.println("-------------------------");
        System.out.println("-------------------------");

        System.out.println("Status increasedInValue der Stamp 1: " + stamp1.increasedInValue());
        System.out.println("Status increasedInValue der Stamp 2: " + stamp2.increasedInValue());
        System.out.println("Status increasedInValue der Stamp 3: " + stamp3.increasedInValue());
        System.out.println("-------------------------");

        System.out.println("Status estimateRarity der Stamp 1: " + stamp1.estimateRarity());
        System.out.println("Status estimateRarity der Stamp 2: " + stamp2.estimateRarity());
        System.out.println("Status estimateRarity der Stamp 3: " + stamp3.estimateRarity());
        System.out.println("-------------------------");

        System.out.println("Status isGermanHistoryStamp der Stamp 1: " + stamp1.isGermanHistoryStamp());
        System.out.println("Status isGermanHistoryStamp der Stamp 2: " + stamp2.isGermanHistoryStamp());
        System.out.println("Status isGermanHistoryStamp der Stamp 3: " + stamp3.isGermanHistoryStamp());
        System.out.println("-------------------------");

        System.out.println(stamp1.olderStamp(stamp2));
        System.out.println(stamp2.olderStamp(stamp3));
        System.out.println("-------------------------");


        System.out.println("numberOfExtravagantStamps: " + stampCollection.numberOfExtravagantStamps());
        System.out.println("-------------------------");

        System.out.println("historicValuableStamps: " + stampCollection.historicValuableStamps());
        System.out.println("-------------------------");

        System.out.println("averageShippingValue: " + stampCollection.averageShippingValue());
        System.out.println("-------------------------");

        System.out.println("printValueStatistic");
        stampCollection.printValueStatistic();
        System.out.println("-------------------------");

        stampCollection.removeStamp(stamp1);
        stampCollection.removeStamp(stamp2);
        stampCollection.removeStamp(stamp3);

        System.out.println("stampCollection nach Löschung der drei Stamps: " + stampCollection);

    }

}

