package designpattern.builder.complex;

public class Client {
    public static void main(String[] args){
        InsuranceContract.ConcreteBuilder builder=new InsuranceContract.ConcreteBuilder("9527",123L,456L);
        InsuranceContract contract=builder.setPersonName("夏明").setOtherData("test").build();
        contract.someOperation();
    }
}
