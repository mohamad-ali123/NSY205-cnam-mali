
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Customer {
    
    private static HashMap<String, Customer> customers = new HashMap<>();
    
    private String _id;
    private String _firstname;
    private String _lastname;
    private String _telephone;
    private String _street1;
    private String _street2;
    private String _city;
    private String _state;
    private String _zipcode;
    private String _country;
    private String _mail;

    public Customer(String _id, String _firstname, String _lastname, String _telephone, String _street1, String _street2, String _city, String _state, String _zipcode, String _country, String _mail) {
        this._id = _id;
        this._firstname = _firstname;
        this._lastname = _lastname;
        this._telephone = _telephone;
        this._street1 = _street1;
        this._street2 = _street2;
        this._city = _city;
        this._state = _state;
        this._zipcode = _zipcode;
        this._country = _country;
        this._mail = _mail;
    }

    public Customer(String _id, String _firstname, String _lastname) {
        this._id = _id;
        this._firstname = _firstname;
        this._lastname = _lastname;
    }

    public static Customer find(String id){
        return customers.get(id);
    }
    
    public static boolean remove(String id){
        return customers.remove(id)!=null;
    }
    
    public static boolean insert(Customer cu){
        return customers.put(cu.getId(), cu)!=null;
    }
    
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getFirstname() {
        return _firstname;
    }

    public void setFirstname(String _firstname) {
        this._firstname = _firstname;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String _lastname) {
        this._lastname = _lastname;
    }

    public String getTelephone() {
        return _telephone;
    }

    public void setTelephone(String _telephone) {
        this._telephone = _telephone;
    }

    public String getStreet1() {
        return _street1;
    }

    public void setStreet1(String _street1) {
        this._street1 = _street1;
    }

    public String getStreet2() {
        return _street2;
    }

    public void setStreet2(String _street2) {
        this._street2 = _street2;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String _city) {
        this._city = _city;
    }

    public String getState() {
        return _state;
    }

    public void setState(String _state) {
        this._state = _state;
    }

    public String getZipcode() {
        return _zipcode;
    }

    public void setZipcode(String _zipcode) {
        this._zipcode = _zipcode;
    }

    public String getCountry() {
        return _country;
    }

    public void setCountry(String _country) {
        this._country = _country;
    }

    public String getMail() {
        return _mail;
    }

    public void setMail(String _mail) {
        this._mail = _mail;
    }
    
    public boolean checkData(){
        return (this._id!=null&& !this._id.equals(""))&&(this._firstname!=null&& !this._firstname.equals(""))
                &&(this._lastname!=null&& !this._lastname.equals(""))&&(this._telephone!=null&& !this._telephone.equals(""))
                &&(this._street1!=null&& !this._street1.equals(""))&&(this._street2!=null&& !this._street2.equals(""))
                &&(this._city!=null&& !this._city.equals(""))&&(this._state!=null&& !this._state.equals(""))
                &&(this._zipcode!=null&& !this._zipcode.equals(""))&&(this._country!=null&& !this._country.equals(""));
    }
    
    public String getCheckDataError(){
        String toReturn="";
        if(this._id==null||this._id.equals(""))
            toReturn+="Invalid id";
        else if(this._firstname==null||this._firstname.equals(""))
            toReturn+="Invalid first name";
        else if(this._lastname==null||this._lastname.equals(""))
            toReturn+="Invalid last name";
        else if(this._telephone==null||this._telephone.equals(""))
            toReturn+="Invalid telephone";
        else if(this._street1==null||this._street1.equals(""))
            toReturn+="Invalid street1";
        else if(this._street2==null||this._street2.equals(""))
            toReturn+="Invalid street2";
        else if(this._city==null||this._city.equals(""))
            toReturn+="Invalid city should ";
        else if(this._state==null||this._state.equals(""))
            toReturn+="Invalid state";
        else if(this._zipcode==null||this._zipcode.equals(""))
            toReturn+="Invalid zipcode";
        else if(this._country==null||this._country.equals(""))
            toReturn+="Invalid country ";
        
        return toReturn;
    }
    
    public boolean checkId(String id){
        return (this._id!=null&& !this._id.equals(""));
    }
    
    public boolean checkMail(){
        return _mail.matches("^([a-zA-Z0-9_\\-\\.]{4,20})@([a-zA-Z0-9_\\-\\.]{3,10})\\.([a-zA-Z]{2,5})$");
    }
    
}
