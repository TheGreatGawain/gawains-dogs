public class Dog {

    public String name;
    public String breed;
    public int ageInYears;
    public char gender;
    public double weightInPounds;
    public boolean vaccinated;
    String newline = System.getProperty("line.separator");

    public void display() {
        System.out.println(newline);
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Gender: " + gender);
        System.out.println("Age in years: " + ageInYears);
        System.out.println("Weight in lb: " + weightInPounds);
        System.out.println("Vaccinated: " + vaccinated);
        System.out.println(newline);
    }
}
