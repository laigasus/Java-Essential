package ch01;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP"; // 오류 발생
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

    protected int customerID;
    protected String customerName;
    protected String customerGrade;

    // getter, setter 구현
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}