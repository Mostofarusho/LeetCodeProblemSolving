
public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {

        if (!knightIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!knightIsAwake && archerIsAwake && !prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!archerIsAwake && prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (!knightIsAwake && archerIsAwake && !prisonerIsAwake
                && !petDogIsPresent) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = true;
        boolean b=AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        System.out.println(b);
            // => false 

    }
}
