public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Cherno Alpha");
        System.out.println(jaeger1.getModelName());
        jaeger1.setMark("Mark-1.");
        System.out.println(jaeger1.getModelName() + " had " + jaeger1.getMark());
        jaeger1.setOrigin("Russia.");
        System.out.println("It was the first jaeger in " + jaeger1.getOrigin());
        jaeger1.setHeight(85.34f);
        System.out.println("Cherno Alpha's height is " + jaeger1.getHeight());
        jaeger1.setWeight(4500f);
        System.out.println("Cherno Alpha's weignt is " + jaeger1.getWeight() + " tons.");
        jaeger1.setStrength(10);
        System.out.println("Cherno Alpha had " + jaeger1.getStrength() + " points strength.");
        jaeger1.setArmor(10);
        System.out.println("Cherno Alpha had " + jaeger1.getArmor() + " points armor.");
        System.out.println("After repairing Cherno Alpha had " + jaeger1.upgradeArmor() + 
                 " points armor.");
        System.out.println("Damage decreased Cherno Alpha's strength to " + 
                jaeger1.loseStrength() + " points.");
        jaeger1.setArmor(15);
        System.out.println("Added new quality armor " + jaeger1.getArmor()+ "\n");
        Jaeger jaeger2 = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 5100f, 8, 6);
        System.out.println(jaeger2);
        
        System.out.println("\nИмя второго егеря = " + jaeger2.getModelName());
    }
}