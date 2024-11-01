public class Door {
    private final int doorID;
    private String doorDescription;
    private boolean lockStatus;
    private boolean openStatus;
    private boolean enemyNoticed;
    private boolean doorBroken;

    public Door (int doorID, String doorDescription,
                 boolean lockStatus, boolean openStatus,
                 boolean enemyNoticed){
        this.doorID = doorID;
        this.doorDescription = doorDescription;
        this.lockStatus = lockStatus;
        this.openStatus = openStatus;
        this.enemyNoticed = enemyNoticed;
        this.doorBroken = false;
    }

    public int getDoorID()
    {
        return this.doorID;
    }
}