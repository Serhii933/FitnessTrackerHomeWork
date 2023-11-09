class FitnessTracker {
    public static void main(String[] args) {
        FitnessTrackerUser user1 = new FitnessTrackerUser("John", "Johnson", 10, 5, 1989, "John@example.com", "+6953276587");
        user1.setWeight(65.5);
        user1.setBloodPressure("120/80");
        user1.setStepsPerDay(8000);

        FitnessTrackerUser user2 = new FitnessTrackerUser("Jakob", "Breadly", 15, 8, 1984, "Breadly@example.com", "+1534698764");
        user2.setWeight(70.2);
        user2.setBloodPressure("130/85");
        user2.setStepsPerDay(10000);

        FitnessTrackerUser user3 = new FitnessTrackerUser("Mila", "White", 20, 3, 2000, "White@example.com", "+6538956423");
        user3.setWeight(80.2);
        user3.setBloodPressure("140/85");
        user3.setStepsPerDay(12000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}