package org.but.feec.bds_project3.api;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonDetailView {

    private LongProperty id = new SimpleLongProperty();
    private StringProperty givenName = new SimpleStringProperty();
    private StringProperty familyName = new SimpleStringProperty();
    private StringProperty email = new SimpleStringProperty();
    private StringProperty courseName = new SimpleStringProperty();
    //private StringProperty courseName = new SimpleStringProperty();
    private StringProperty courseLocation = new SimpleStringProperty();
    private StringProperty status = new SimpleStringProperty();


    public Long getId() {
        return idProperty().get();
    }

    public void setId(Long id) {
        this.idProperty().setValue(id);
    }

    public String getGivenName() {
        return givenNameProperty().get();
    }

    public void setGivenName(String givenName) {
        this.givenNameProperty().setValue(givenName);
    }

    public String getFamilyName() {
        return familyNameProperty().get();
    }

    public void setFamilyName(String familyName) {
        this.familyNameProperty().setValue(familyName);
    }

    public String getEmail() {
        return emailProperty().get();
    }

    public void setEmail(String email) {
        this.emailProperty().setValue(email);
    }


    public String getStatus() {
        return statusProperty().get();
    }

    public void setStatus(String status) {
        this.statusProperty().setValue(status);
    }

    public String getCourseName() {
        return courseNameProperty();
    }

    public void setCourseName(String courseName) {
        this.courseNameProperty().setValue(courseName);
    }

    public String getCourseLocation() {
        return courseLocationProperty().get();
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocationProperty().setValue(courseLocation);
    }

    public LongProperty idProperty() {
        return id;
    }

    public StringProperty givenNameProperty() {
        return givenName;
    }

    public StringProperty familyNameProperty() {
        return familyName;
    }

    public StringProperty statusProperty() {
        return status;
    }

    public StringProperty courseName() {
        return courseName;
    }

    public StringProperty courseLocation() {
        return courseLocation;
    }

    public StringProperty emailProperty() {
        return email;
    }
}
