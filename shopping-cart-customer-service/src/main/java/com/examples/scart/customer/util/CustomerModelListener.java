package com.examples.scart.customer.util;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
//import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.examples.scart.customer.model.Customer;

// Updates generated document id before inserting into database
@Component
public class CustomerModelListener { //extends AbstractMongoEventListener<Customer> {

//	private SequenceGeneratorService sequenceGenerator;
//
//	@Autowired
//	public CustomerModelListener(SequenceGeneratorService sequenceGenerator) {
//		this.sequenceGenerator = sequenceGenerator;
//	}
//
//	@Override
//	public void onBeforeConvert(BeforeConvertEvent<Customer> event) {
//		if (event.getSource().getId() < 1) {
//			event.getSource().setId(sequenceGenerator.generateSequence(Customer.SEQUENCE_NAME));
//		}
//	}

}