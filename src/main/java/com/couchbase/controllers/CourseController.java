package com.couchbase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.couchbase.dataaccess.couchbase.server.CouchbaseServerDataAccessImpl;

@RestController
@RequestMapping("/course")
public class CourseController
{
   @Autowired
   CouchbaseServerDataAccessImpl couchbaseServerDataAccessImpl;

   @RequestMapping(method = RequestMethod.POST)
   public String create(@RequestBody String course) throws Exception
   {
      return couchbaseServerDataAccessImpl.save(course);
   }

   @RequestMapping(method = RequestMethod.GET, value = "{id}")
   public String get(@PathVariable String id) throws Exception
   {
      return couchbaseServerDataAccessImpl.getFilteredResultsById(id);
   }

   @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
   public void delete(@PathVariable String id) throws Exception
   {
      couchbaseServerDataAccessImpl.delete(id);
   }
}
