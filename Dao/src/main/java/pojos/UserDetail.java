package pojos;

import javax.persistence.*;

/**
 * Created by KIRILL on 11.05.2016.
 *
 * create one - to - one mapping (user) with (userDetail) tables
 */
@Entity                   //  annotation describe DB table how javaclass
@Table(name = "UserDetail")       //  table name
public class UserDetail{
    @Id
    @Column(name = "id")      //autoincrement identify explicitly column
    @GeneratedValue(strategy = GenerationType.AUTO)  // value autogenerate
    private String id;
    @Column(name = "userId")
    private int userId;
    @Column(name = "country")
    private String country;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "flat")
    private int flat;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
