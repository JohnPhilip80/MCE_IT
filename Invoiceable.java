package edu.mce.john.ims.model;

public interface Invoiceable {
	void generateInvoice();
	Double calculateTax(Double rate);
}
