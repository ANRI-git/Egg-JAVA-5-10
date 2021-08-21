package Guia_8_REL_Ejercicio_Extra_02;


public class Policy {
    private Client client;
    private Vehicle vehicle;
    private Integer policyNum;
    private String policyDate;
    private Fees fee;
    private String typePayment;
    private Double totalAmount;
    private Boolean hailCoverage;
    private Double maxhailCov;
    private String covaregeType;

    public Policy() {
    }

    public Policy(Client client, Vehicle vehicle, Integer policyNum, String policyDate, Fees fee, String typePayment, Double totalAmount, Boolean hailCoverage, Double maxhailCov, String covaregeType) {
        this.client = client;
        this.vehicle = vehicle;
        this.policyNum = policyNum;
        this.policyDate = policyDate;
        this.fee = fee;
        this.typePayment = typePayment;
        this.totalAmount = totalAmount;
        this.hailCoverage = hailCoverage;
        this.maxhailCov = maxhailCov;
        this.covaregeType = covaregeType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Integer getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
    }

    public String getPolicyDate() {
        return policyDate;
    }

    public void setPolicyDate(String policyDate) {
        this.policyDate = policyDate;
    }

    public Fees getFee() {
        return fee;
    }

    public void setFee(Fees fee) {
        this.fee = fee;
    }

    public String getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Boolean getHailCoverage() {
        return hailCoverage;
    }

    public void setHailCoverage(Boolean hailCoverage) {
        this.hailCoverage = hailCoverage;
    }

    public Double getMaxhailCov() {
        return maxhailCov;
    }

    public void setMaxhailCov(Double maxhailCov) {
        this.maxhailCov = maxhailCov;
    }

    public String getCovaregeType() {
        return covaregeType;
    }

    public void setCovaregeType(String covaregeType) {
        this.covaregeType = covaregeType;
    }
    
}
