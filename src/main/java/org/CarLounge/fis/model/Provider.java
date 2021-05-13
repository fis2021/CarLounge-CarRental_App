package org.CarLounge.fis.model;

import java.util.Date;
import java.util.Objects;

public class Provider {
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String bDate;
    private String companyName;
    private String address;
    private String phone;
    private String taxRegNo;
    private String cnp;

    private double feedbackValue=0;
    private int feedbackCounter=0;
    private double feedback=0;

    public Provider(String email, String password, String firstname, String lastname, String bDate, String companyName, String address, String phone, String taxRegNo, String cnp) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.bDate = bDate;
        this.companyName = companyName;
        this.address = address;
        this.phone = phone;
        this.taxRegNo = taxRegNo;
        this.cnp=cnp;
    }

    public Provider() { }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getBDate() {
        return bDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getTaxRegNo() {
        return taxRegNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setBdate(String bDate) {
        this.bDate = bDate;
    }

    public void setCompanyname(String companyName) {
        this.companyName = companyName;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTaxRegNo(String taxRegNo) {
        this.taxRegNo = taxRegNo;
    }

    public double getFeedbackValue() {
        return feedbackValue;
    }

    public int getFeedbackCounter() {
        return feedbackCounter;
    }

    public double getFeedback() {
        return feedback;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setFeedback(double feedbackValue) {
        this.feedbackValue+=feedbackValue;
        this.feedbackCounter++;
        this.feedback = feedbackValue / feedbackCounter;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", bDate=" + bDate +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", taxRegNo='" + taxRegNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return email.equals(provider.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, firstname, lastname, bDate, companyName, address, phone, taxRegNo);
    }
}
