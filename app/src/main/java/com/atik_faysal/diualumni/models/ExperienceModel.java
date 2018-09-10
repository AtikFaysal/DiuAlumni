package com.atik_faysal.diualumni.models;

public class ExperienceModel
{
     private String id,stdId,description,position,fromDate,toDate,company,city;

     //calling from AboutProfile:processJsonUserExperience()
     //id,stdId,company,position,description,from,to
     public ExperienceModel(String value1,String value2,String value3,String value4,String value5,String value6,String value7,String value8)
     {
          this.id = value1;
          this.stdId = value2;
          this.company = value3;
          this.position = value4;
          this.description = value5;
          this.fromDate = value6;
          this.toDate = value7;
          this.city = value8;
     }

     public String getCity() {
          return city;
     }

     public void setCity(String city) {
          this.city = city;
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getStdId() {
          return stdId;
     }

     public void setStdId(String stdId) {
          this.stdId = stdId;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public String getPosition() {
          return position;
     }

     public void setPosition(String position) {
          this.position = position;
     }

     public String getFromDate() {
          return fromDate;
     }

     public void setFromDate(String fromDate) {
          this.fromDate = fromDate;
     }

     public String getToDate() {
          return toDate;
     }

     public void setToDate(String toDate) {
          this.toDate = toDate;
     }

     public String getCompany() {
          return company;
     }

     public void setCompany(String company) {
          this.company = company;
     }
}
