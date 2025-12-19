import javax.xml.transform.Source;

public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id,String name,int birthYear,double height, double weight,String bloodGroup,String phoneNumber){
        if(id<0){
            id=0;
        }else{
            this.id=id;
        }

        this.name=name;
        if(birthYear>=1800&&birthYear<=2026){
            this.birthYear=birthYear;
        }
        else{
            System.out.println("error birthYear please try again");
        }
        if(height>=0){
            this.height=height;
        }
        else{
            this.height=0;
            System.out.println("error height please try again");
        }
        if(weight>=0){
            this.weight=weight;
        }
        else{
            this.weight=0;
            System.out.println("error weight please try again");
        }
        this.bloodGroup=bloodGroup;
        this.phoneNumber=phoneNumber;
    }

    public int getAge(int currentYear){
        return currentYear-birthYear;
    }

    public double getBMI(){
        if(height<=0||weight<=0){
            return 0;
        }
        else {
            return weight / Math.pow(height / 100, 2);
        }
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Blood group: " + bloodGroup);
        System.out.println("Patient Phone number: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI());
        System.out.println(" ");
        System.out.println("........................................");
    }
}
