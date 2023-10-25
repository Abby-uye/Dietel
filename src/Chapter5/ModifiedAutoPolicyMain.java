package Chapter5;

public class ModifiedAutoPolicyMain {

    public static void main(String[] args) {

        ModifiedAutoPolicy policy1 = new ModifiedAutoPolicy(11111111, "Toyota Camry","AB");
        policyInNoFaultState(policy1);
    }

    public static void policyInNoFaultState(ModifiedAutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
    }
}
