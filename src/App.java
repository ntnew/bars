public class App {
    public static void main(String[] args) {
        int i =0;
        char b = 'v';
        boolean flag = false;
        Contract contract = new Contract();
        contract.setField("i", i);
        contract.setField("b", b);
        contract.setField("flag", flag);
        System.out.println(contract.getFieldByName("i"));
        System.out.println(contract.getFieldByName("b"));
        System.out.println(contract.getFieldByName("flag"));
    }

}
