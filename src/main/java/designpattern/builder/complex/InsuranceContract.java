package designpattern.builder.complex;

public class InsuranceContract {
    private String contractId;

    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    private InsuranceContract(ConcreteBuilder concreteBuilder){
        this.contractId=concreteBuilder.contractId;
        this.beginDate=concreteBuilder.beginDate;
        this.endDate=concreteBuilder.endDate;
        this.personName=concreteBuilder.personName;
        this.companyName=concreteBuilder.companyName;
        this.otherData=concreteBuilder.otherData;
    }

    public void someOperation(){
        System.out.println("当前正在操作的保险合同编号为【" + this.contractId + "】");
        if(personName!=null){
            System.out.println("被保险人名称:"+personName);
        }
        if(companyName!=null){
            System.out.println("被保险公司名称:"+companyName);
        }
    }

    public static class ConcreteBuilder{
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        public ConcreteBuilder(String contractId,long beginDate,long endDate){
            this.contractId=contractId;
            this.beginDate=beginDate;
            this.endDate=endDate;
        }

        public ConcreteBuilder setPersonName(String personName){
            this.personName=personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName){
            this.companyName=companyName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData){
            this.otherData=otherData;
            return this;
        }

        public InsuranceContract build(){
            if (contractId == null || contractId.trim().length() == 0) {
                throw new IllegalArgumentException("合同编号不能为空");
            }
            boolean signPerson = (personName != null && personName.trim().length() > 0);
            boolean signCompany = (companyName != null && companyName.trim().length() > 0);
            if (signPerson && signCompany) {
                throw new IllegalArgumentException("一份保险合同不能同时与个人和公司签订");
            }
            if (signPerson == false && signCompany == false) {
                throw new IllegalArgumentException("一份保险合同不能没有签订对象");
            }
            if (beginDate <= 0) {
                throw new IllegalArgumentException("一份保险合同必须有开始生效的日期");
            }
            if (endDate <= 0) {
                throw new IllegalArgumentException("一份保险合同必须有失效的日期");
            }
            if (endDate < beginDate) {
                throw new IllegalArgumentException("一份保险合同的失效日期必须大于生效日期");
            }
            return new InsuranceContract(this);
        }

    }
}
