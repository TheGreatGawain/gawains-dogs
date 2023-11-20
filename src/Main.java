public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Hooch";
        dog1.breed = "Boxer";
        dog1.ageInYears = 2;
        dog1.gender = 'M';
        dog1.weightInPounds = 10.5;
        dog1.vaccinated = false;
        dog1.display();

        Dog dog2 = new Dog();
        dog2.name = "Billy";
        dog2.breed = "British Bulldog";
        dog2.ageInYears = 5;
        dog2.gender = 'F';
        dog2.weightInPounds = 5.5;
        dog2.vaccinated = true;
        dog2.display();

        Dog dog3 = new Dog();
        dog3.name = "Jack";
        dog3.breed = "Staffordshire Bull Terrier";
        dog3.gender = 'M';
        dog3.ageInYears = 3;
        dog3.weightInPounds = 5.0;
        dog3.vaccinated = true;
        dog3.display();
    }
}
