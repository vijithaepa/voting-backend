package info.slnews.app.entity;

import info.slnews.app.enums.UserStatus;
import jakarta.persistence.*;

import java.time.Instant;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "other_names", length = 100)
    private String otherNames;

    @Column(name = "alies", length = 20, nullable = false)
    private String alies;

    @Column(name = "user_name", nullable = false, length = 20)
    private String userName;

    @Column(nullable = false, length = 50)
    private String password;

    @Basic
    private boolean active;

    private String roles = "";

    private String permissions = "";


    @Column(name = "address", length = 250)
    private String address;

    @Column(name = "dateOfBirth", nullable = false)
    private Instant dateOfBirth;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "phoneNo", length = 12)
    private String phoneNo;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "profession", length = 100)
    private String profession;

    @Column(name = "createdOn")
    private Instant createdOn;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    public User() {
    }

    public User(String firstName, String lastName, String otherNames, String alies, String userName, String password,
                boolean active, String roles, String permissions, String address, Instant dateOfBirth, String email,
                String phoneNo, String gender, String profession, Instant createdOn, UserStatus status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherNames = otherNames;
        this.alies = alies;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.roles = roles;
        this.permissions = permissions;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.profession = profession;
        this.createdOn = createdOn;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAlies() {
        return alies;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public String getRoles() {
        return roles;
    }

    public String getPermissions() {
        return permissions;
    }

    public String getAddress() {
        return address;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public String getProfession() {
        return profession;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public UserStatus getStatus() {
        return status;
    }
}
