public class Equipment{
    String eqpFileCode = "MMA-BD";
    String eqpSerialNum = "Test5";

    public void eqpCreation(String a, String b){
        System.out.println("Equipment is created successfully using " + a + " and " + b);
    } 
    public void eqpDeletion(){
        System.out.println("Equipment is deleted successfully!");
    }

    /**
     * @param args
     */
    public static void main(String[] args){
        Equipment eqp1 = new Equipment();
        eqp1.eqpCreation("A675M", "Test1");
        eqp1.eqpDeletion();
    }
}