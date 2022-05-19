package Bank_Project;

public class BankClient {
    private String clientName;
    private float clientSSN;
    
    public float getSSN() {
        return this.clientSSN;
    }

    public void setSSN(float SSN) {
        this.clientSSN = SSN;
    }

    public String getName() {
        return this.clientName;
    }

    public void setName(String name) {
        this.clientName = name;
    }
}
