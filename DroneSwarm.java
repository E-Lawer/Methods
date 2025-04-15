class DroneSwarm {
    int droneCount;
    String mission;

    public static void launchMission(String task, int number) {
        mission = task;
        droneCount = number;
        System.out.println("Launching " + droneCount + " drones for mission: " + mission);
    }
}