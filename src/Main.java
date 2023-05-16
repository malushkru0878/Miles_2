public class Main {
    public static void main(String[] args) {
        BonusMilesServis servis = new BonusMilesServis();
        int price = 10_000;
        int miles = servis.calculate(price);
        System.out.println(miles);

    }
}
