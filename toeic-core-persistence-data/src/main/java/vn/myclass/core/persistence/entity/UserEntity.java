package vn.myclass.core.persistence.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name = "user")

public class UserEntity {
    @Id  //khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)         //tự động tăng
    private Integer userId;

    @Column(name ="name")
    private String name;

    @Column(name ="password")
    private String password;

    @Column(name ="fullname")
    private String fullname;

    @Column(name ="createddate")
    private Timestamp createdDate;

    @ManyToOne
    @JoinColumn(name = "roleid")
    private RoleEntity roleEntity;

   @OneToMany(mappedBy = "userEntity",fetch = FetchType.LAZY)
   private List<CommentEntity> commentEntityList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }
}

