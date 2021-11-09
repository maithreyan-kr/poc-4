package com.mighty.model;

public class Book {

  private String roomnumber;
  private String roomtype;
  private String persons;
  private String checkin;
  private String checkout;
 

  public String getroomnumber() {
    return roomnumber;
  }

  public void setroomnumber(String roomnumber) {
    System.out.println("roomnumber: " + roomnumber);
    this.roomnumber = roomnumber;
  }

  public String getroomtype() {
    return roomtype;
  }

  public void setroomtype(String roomtype) {
    this.roomtype = roomtype;
  }

  public String getpersons() {
    return persons;
  }

  public void setpersons(String persons) {
    System.out.println("persons: " + persons);
    this.persons = persons;
  }

  public String getcheckin() {
    return checkin;
  }

  public void setcheckin(String checkin) {
    System.out.println("checkin: " + checkin);
    this.checkin= checkin;
  }

  public String getcheckout() {
    return checkout;
  }

  public void setcheckout(String checkout) {
    this.checkout= checkout;
  }

 
}
