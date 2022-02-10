package com.examples.scart.customer.util;

//import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
//import static org.springframework.data.mongodb.core.query.Criteria.where;
//import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

// Generates Mongo DB sequence starts from 1 and increments by 1
@Service
public class SequenceGeneratorService {
	
//	@Autowired
//	MongoTemplate mongoTemplate;
//	
//	public int generateSequence(String seqName) {
//	    DatabaseSequence counter = mongoTemplate.findAndModify(query(where("_id").is(seqName)),
//	      new Update().inc("seq",1), options().returnNew(true).upsert(true),
//	      DatabaseSequence.class);
//	    return !Objects.isNull(counter) ? (int) counter.getSeq() : 1;
//	}
}