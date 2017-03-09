/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Customer {
  
    private String name;
	private double monthly_payments;
	private Loan loan;   
   
        public Customer() {
    	this("Name unknown");
    }
    public Customer(String name){
    	setName(name);
    	setMonthlyPayments(0.0);
    }
     public Customer(String name, double mpayment){
    	setName(name);
    	setMonthlyPayments(mpayment);
    }

     public void setName(String name){
    	this.name = name;
    }   
    public void setMonthlyPayments(double mpayment){
    	this.monthly_payments = mpayment;
    }
  
    public String getName() {
    	return name;
    }
    public double getMonthlypayments() {
    	return monthly_payments;
    }
    public String toString() {
    	return "Name: " + getName() + " Payments: " + getMonthlypayments();
    }
    public void takeoutloan() {
     loan = new Loan(5000.0,10.0,5);
    monthly_payments = loan.getMonthlyPayment();
    }
   } 
  

