class FitnessTrackerUser {
    private final String firstName;
    private String lastName;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phone;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;
    private final int age;

    public FitnessTrackerUser(String firstName, String lastName, int birthDay, int birthMonth, int birthYear,
                              String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.age = calculateAge(birthYear);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public int getAge() {
        return age;
    }

    private int calculateAge(int birthYear) {
        return 2020 - birthYear;
    }

    public void printAccountInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date of Birth: " + birthDay + "." + birthMonth + "." + birthYear);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println("-------------------------");
    }
}