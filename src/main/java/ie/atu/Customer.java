package ie.atu;

public class Customer extends Person{
    private String customerNo;
    private boolean mailingList;

    public Customer() {

    }

    public Customer(String name, String address, String phone, String customerNo, boolean mailingList) {
        super(name, address, phone);
        this.customerNo = customerNo;
        this.mailingList = mailingList;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerNo='" + customerNo + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
